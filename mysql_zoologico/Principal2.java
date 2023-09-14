package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal2 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zoologico";  //protocolo-ip-puerto-bd
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                /*
                String query = "INSERT INTO Zoologico(idZoo,\n" +
"                      descripcion,\n" +
"                      ciudad,\n" +
"                      superficie,\n" +
"                      presupuesto,\n" +
"                      pais) VALUES\n" +
"('Z08','Faunia','Madrid',10,200000,'España')";
*/
                String query = "INSERT INTO Zoologico VALUES ('Z10','Faunia','Madrid',10,200000,'España')";
                
                PreparedStatement ps = conexion.prepareStatement(query);
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
