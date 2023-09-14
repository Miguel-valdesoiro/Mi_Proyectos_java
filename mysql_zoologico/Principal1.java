package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Principal1 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/zoologico";  //protocolo-ip-puerto-bd
        String usuario = "root";
        String clave = "12345678";
        try {
            Connection conexion = DriverManager.getConnection(url, usuario, clave);
            if (conexion != null) {
                String query = "SELECT * FROM Zoologico";
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();

                System.out.printf("%5s  %-26s  %-8s  %10s\n", "IDZOO", "DESCRIPCION", "CIUDAD", "SUPERFICIE");
                System.out.printf("%5s  %-26s  %-8s  %10s\n", "-----", "-----------", "------", "----------");

                while (rs.next()) {
                    String idZoo = rs.getString(1);
                    String descripcion = rs.getString(2);
                    String ciudad = rs.getString(3);
                    double superficie = rs.getDouble(4);
                    System.out.printf("%5s  %-26s  %-8s  %10.2f\n", idZoo, descripcion, ciudad, superficie);
                }
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
