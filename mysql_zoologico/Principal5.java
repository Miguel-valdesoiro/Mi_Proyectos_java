package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal5 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zoologico";  //protocolo-ip-puerto-bd
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {

                String query = "UPDATE Zoologico SET descripcion = ?, ciudad = ? WHERE idZoo = ?";
                
                PreparedStatement ps = conexion.prepareStatement(query);
                
                ps.setString(1,"Mansiche");
                ps.setString(2,"Trujillo");
                ps.setString(3,"Z07");
                

                
                ps.executeUpdate();
                conexion.close();
                System.out.println("OK: CONEXION");
            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}
