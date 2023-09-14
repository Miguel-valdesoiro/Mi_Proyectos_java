package mysql_consultas_zoologico;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import libreria.Metodos;

public class OperacionesCrud {

    private Connection conexion;

    public OperacionesCrud() {
        String url = "jdbc:mysql://127.0.0.1:3306/zoologico"; //Protocolo-Ip-Puerto-DB
        String usuario = "root";
        String clave = "12345678";
        try {
            conexion = DriverManager.getConnection(url, usuario, clave);
        } catch (Exception e) {
            System.out.println("ERROR: CONEXION");
            conexion = null;
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void animalesNacidosAnio() {
        if (conexion != null) {
            int anio = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
            String query = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
            try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, anio);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public void animalesNacidosMes() {
        if (conexion != null) {
            int mes = Metodos.validarEntradaEntero("\nIngrese mes nacimiento animal? ");
            String query = "SELECT * FROM Animal WHERE MONTH(nacimiento) = ?";
            try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setInt(1, mes);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    //MES = mes
    public void animalesNacidosAnio_Mes(String opcion) { //anio,mes,noanio
        PreparedStatement ps = null;
        if (conexion != null) {
            String query1 = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
            String query2 = "SELECT * FROM Animal WHERE MONTH(nacimiento) = ?";
            try {

                switch (opcion) {
                    case "anio":
                        break;
                    case "mes":
                        break;
                    case "nonio":
                        break;
                }

                if (opcion.equalsIgnoreCase("anio")) {
                    int anio1 = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
                    ps = conexion.prepareStatement(query1);
                    ps.setInt(1, anio1);
                } else {
                    int mes1 = Metodos.validarEntradaEntero("\nIngrese mes nacimiento animal? ");
                    ps = conexion.prepareStatement(query2);
                    ps.setInt(1, mes1);
                }

                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public void animalesNacidosAnio_Mes_NoAnio(String opcion) { //anio,mes,noanio
        int anio1 = 0;
        PreparedStatement ps = null;
        if (conexion != null) {
            String query1 = "SELECT * FROM Animal WHERE YEAR(nacimiento) = ?";
            String query2 = "SELECT * FROM Animal WHERE MONTH(nacimiento) = ?";
            String query3 = "SELECT * FROM Animal WHERE NOT YEAR(nacimiento) = ?";
            try {

                switch (opcion) {
                    case "anio":
                        anio1 = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
                        ps = conexion.prepareStatement(query1);
                        ps.setInt(1, anio1);
                        break;
                    case "mes":
                        int mes1 = Metodos.validarEntradaEntero("\nIngrese mes nacimiento animal? ");
                        ps = conexion.prepareStatement(query2);
                        ps.setInt(1, mes1);
                        break;
                    case "no anio":
                        anio1 = Metodos.validarEntradaEntero("\nIngrese año nacimiento animal? ");
                        ps = conexion.prepareStatement(query3);
                        ps.setInt(1, anio1);
                        break;
                }

                if (opcion.equalsIgnoreCase("anio")) {

                } else {

                }

                ResultSet rs = ps.executeQuery();
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "IDANIMAL", "NACIMIENTO", "PAIS", "CONTINENTE", "SEXO", "IDZOO", "IDESPECIE");
                System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", "--------", "----------", "----", "----------", "----", "-----", "---------");
                while (rs.next()) {
                    String idAnimal = rs.getString(1);
                    Date nacimiento = rs.getDate(2);
                    String paisOrigen = rs.getString(3);
                    String continente = rs.getString(4);
                    String sexo = rs.getString(5);
                    String idZoo = rs.getString(6);
                    String idEspecie = rs.getString(7);
                    System.out.printf("%8s  %12s  %-10s  %-12s  %4s  %5s  %10s\n", idAnimal, nacimiento, paisOrigen, continente, sexo, idZoo, idEspecie);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }
        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public void getCidadInicienLetra(String letra) {
        if (conexion != null) {
            String query = "SELECT idZoo, descripcion, ciudad FROM Zoologico WHERE ciudad LIKE '" + letra + "%'";
            try {
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                System.out.printf("%5s  %-12s  %-7s\n", "IDZOO", "DESCRIPCION", "CIUDAD");
                while (rs.next()) {
                    String idZoo = rs.getString("idZoo");
                    String descripcion = rs.getString("descripcion");
                    String ciudad = rs.getString("ciudad");
                    System.out.printf("%5s  %-12s  %-7s\n", idZoo, descripcion, ciudad);
                }
            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }

        } else {
            System.out.println("ERROR: CONEXION");
        }
    }

    public void getContarZoo() {
        int contar = 0;
        if (conexion != null) {

            String query = "SELECT COUNT(*) AS NUMERO FROM zoologico;";
            try {

                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                System.out.printf("%8s\n", "Total");
                System.out.printf("%8s\n", "-----");

                while (rs.next()) {

                    //contar = rs.getInt(1);
                    contar = rs.getInt("NUMERO");

                    System.out.printf("%8d\n", contar);
                }

            } catch (Exception e) {
                System.out.println("ERROR: QUERY");
            }

        } else {
            System.out.println("ERROR: CONEXION");
        }

    }

    public boolean encontroIdZoo(String idZooBuscar) {
        boolean encontro = false;
        String query = "SELECT * FROM Zoologico WHERE idZoo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, idZooBuscar);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                encontro = true;
            }

        } catch (Exception e) {
            encontro = false;
        }
        return encontro;
    }

    public void actualizar(String idZooBuscar, String descripcionNueva) {
        String query = "UPDATE Zoologico SET descripcion = ? WHERE idZoo = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, descripcionNueva);
            ps.setString(2, idZooBuscar);
            ps.executeUpdate();
            System.out.println("OK: ACTUALIZAR");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY ACTUALIZAR");
        }
    }

    public void eliminar(String nombreEliminar) {
        String query = "DELETE FROM Zoologico WHERE ciudad = ?";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ps.setString(1, nombreEliminar);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("ERROR: QUERY ELIMINAR");
        }
    }

    public void insertar(Object[] z) {

        String query = "INSERT INTO Zoologico(idZoo,descripcion,ciudad,superficie,presupuesto,pais) VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);

            ps.setString(1, (String) z[0]);
            ps.setString(2, (String) z[1]);
            ps.setString(3, (String) z[2]);
            ps.setDouble(4, (double) z[3]);
            ps.setDouble(5, (double) z[4]);
            ps.setString(6, (String) z[5]);

            ps.executeUpdate();

            System.out.println("OK: QUERY INSERTAR");
        } catch (Exception e) {
            System.out.println("ERROR: QUERY INSERTAR");
        }

    }
}
