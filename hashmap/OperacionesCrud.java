package hashmap;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


public class OperacionesCrud {

    private Connection conexion;

    public OperacionesCrud() {
        String url = "jdbc:mysql://127.0.0.1:3306/tienda"; //Protocolo-Ip-Puerto-DB
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

    public List<Producto> getArrayListProductos() {
        List<Producto> productos_al = new ArrayList<>();
        String query = "SELECT * FROM Producto";
        try {
            PreparedStatement ps = conexion.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String idProducto = rs.getString(1);
                String nombre = rs.getString(2);
                double precio = rs.getDouble(3);
                String cifProveedor = rs.getString(4);
                Producto p = new Producto(idProducto, nombre, precio, cifProveedor);
                productos_al.add(p);//0,1,2,3,4...
            }
        } catch (Exception e) {
            productos_al = null;
        }
        return productos_al;
    }

}
