package mysql_zoologico;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Principal6 {

    public static void main(String[] args) {
        String url1 = "jdbc:mysql://localhost:3306/zoologico";      //protocolo-ip-puerto-bd
        String url2 = "jdbc:mysql://localhost:3306/tiendarabanal";  //protocolo-ip-puerto-bd

        String usuario = "root";
        String clave = "12345678";

        List<String> tablas_al = new ArrayList<String>();
        String query1 = "SHOW TABLES";
        String query2 = "SHOW COLUMNS FROM";
        PreparedStatement ps = null;

        try {
            Connection conexion1 = DriverManager.getConnection(url1, usuario, clave);
            Connection conexion2 = DriverManager.getConnection(url2, usuario, clave);

            if (conexion1 != null && conexion2 != null) {
                //1. MOSTRAR TODAS LAS TABLAS DE LA BASE DE DATOS ZOOLOGICO

                try {
                    ps = conexion1.prepareStatement(query1);
                    ResultSet rs = ps.executeQuery();
                    while (rs.next()) {
                        String tabla = rs.getString("Tables_in_zoologico");//String tabla = rs.getString(1);
                        tablas_al.add(tabla);
                    }
                    //System.out.println(Arrays.asList(tablas_al));
                    for(String s: tablas_al) {
                        String s1 = query2 + " " + s;
                        ps = conexion1.prepareStatement(s1);
                        ResultSet rs2 = ps.executeQuery();
                        while(rs2.next()) {
                           String columna = rs2.getString(1);
                           System.out.println(columna);
                        }
                        s1 = "";
                    }
                } catch (Exception e) {

                }

                System.out.println("OK: CONEXION " + conexion1.getCatalog() + "  " + conexion2.getCatalog());

                conexion1.close();
                conexion2.close();

            } else {
                System.out.println("ERROR: CONEXION");
            }
        } catch (Exception e) {
            System.out.println("ERROR: " + e);
        }
    }
}
