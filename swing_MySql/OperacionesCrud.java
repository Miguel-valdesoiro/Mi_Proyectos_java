/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing_MySql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author pedro
 */
public class OperacionesCrud {

    private Connection conexion;

    public OperacionesCrud(String db) {

        String url = "jdbc:mysql://localhost:3306/" + db;
        String usuario = "root";
        String clave = "12345678";

        try {

            conexion = DriverManager.getConnection(url, usuario, clave);

        } catch (Exception e) {

        }
    }

    public List<String> getListaIdzoo() {

        List<String> idZoo_al = new ArrayList<>();

        String query = "SELECT idZoo FROM Zoologico";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                String idZoo = rs.getString(1);

                idZoo_al.add(idZoo);

            }

        } catch (Exception e) {

            idZoo_al = null;
        }

        return idZoo_al;
    }

    public Zoologico getObjetoZoologico(String idZoo) {
        Zoologico zoologico = null;// este va a guardar el objeto que va a retornar
        String query = "SELECT * FROM Zoologico WHERE idZoo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, idZoo);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                String idZoo1 = rs.getString(1);
                String descripcion = rs.getString(2);
                String ciudad = rs.getString(3);
                double superficie = rs.getDouble(4);
                double precio = rs.getDouble(5);
                String pais = rs.getString(6);

                zoologico = new Zoologico(idZoo1, descripcion, ciudad, superficie, precio, pais);
            }

        } catch (Exception e) {

        }

        return zoologico;
    }

    public boolean insertarRegistro(Zoologico zoologico) {

        // preparamos la query
        boolean bandera = true;

        String query = "INSERT INTO Zoologico VALUES(?,?,?,?,?,?);";

        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, zoologico.getIdZoo());
            ps.setString(2, zoologico.getDescripcion());
            ps.setString(3, zoologico.getCiudad());
            ps.setDouble(4, zoologico.getSuperficie());
            ps.setDouble(5, zoologico.getPrecio());
            ps.setString(6, zoologico.getPais());
            ps.executeUpdate();

        } catch (Exception e) {
            bandera = false;
        }

        return bandera;
    }

    public boolean eliminarZoologico(String idZooEliminar) {
        boolean bandera = true;
        System.out.println(idZooEliminar);
        String query1 = "DELETE FROM animal WHERE idZoo = ?";
        String query2 = "DELETE FROM zoologico WHERE idZoo = ?";
        PreparedStatement ps = null;
        try {
            // eliminamos los hijos foreign key
            ps = conexion.prepareStatement(query1);
            ps.setString(1, idZooEliminar);
            ps.executeUpdate();
            // eliminamos el padre primary key
            ps = conexion.prepareStatement(query2);
            ps.setString(1, idZooEliminar);
            ps.executeUpdate();

        } catch (Exception e) {
            bandera = false;
            System.out.println("ERROR");
        }

        return bandera;
    }

    public boolean actualizarZoologico(Zoologico zNuevo) {

        boolean bandera1 = true;
        String query = "UPDATE Zoologico SET descripcion =?,\n"
                + "		ciudad=?,superficie=?,\n"
                + "		presupuesto=?,pais=?\n"
                + "		WHERE idZoo =?;";

        try {

            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, zNuevo.getDescripcion());
            ps.setString(2, zNuevo.getCiudad());
            ps.setDouble(3, zNuevo.getSuperficie());
            ps.setDouble(4, zNuevo.getPrecio());
            ps.setString(5, zNuevo.getPais());
            ps.setString(6, zNuevo.getIdZoo());

            ps.executeUpdate();

        } catch (Exception e) {
            bandera1 = false;
            System.out.println("ERROR");
        }
        return bandera1;

    }
}
