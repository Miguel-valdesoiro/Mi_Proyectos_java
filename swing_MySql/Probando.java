package swing_MySql;

public class Probando {

    public static void main(String[] args) {
        String idZoo = "Z02";
        String descripcion = "Safari";
        String ciudad = "Madrid";
        double superficie = 30;
        double precio = 300000;
        String pais = "España";

        Zoologico z = new Zoologico(idZoo, descripcion, ciudad, superficie, precio, pais);

        actualizar(z);
    }

    public static void eliminar() {
        OperacionesCrud crud = new OperacionesCrud("Zoologico");

        if (crud.eliminarZoologico("Z01")) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

    public static void actualizar(Zoologico z) {
        OperacionesCrud crud = new OperacionesCrud("Zoologico");
        if (crud.actualizarZoologico(z)) {
            System.out.println("OK");
        } else {
            System.out.println("ERROR");
        }
    }

}
