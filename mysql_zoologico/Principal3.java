package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zoologico";  //protocolo-ip-puerto-bd
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {

                String query = "INSERT INTO Zoologico VALUES (?,?,?,?,?,?)";
                
                PreparedStatement ps = conexion.prepareStatement(query);
                ps.setString(1,"Z11");
                ps.setString(2,"Faunia 3");
                ps.setString(3,"Madrid");
                ps.setDouble(4, 1000);
                ps.setDouble(5, 30000);
                ps.setString(6, "España");
                
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
