package hashmap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import libreria.Metodos;

public class Menu {

    static OperacionesCrud crud = new OperacionesCrud();
    static Map<String, Producto> productos_hm = new HashMap<>();

    public static void main(String[] args) {

        do {
            cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. CARGAR TABLA PRODCUTO EN UN HASHMAP");
            System.out.println("2. MOSTRAR CONTENIDO DEL HASHMAP");
            System.out.println("3. BUSCAR UN PRODUCTO POR SU CLAVE");
            System.out.println("4. ELIMINAR UN PRODUCTO POR SU CLAVE");
            System.out.println("5. AGREGAR UN PRODUCTO AL HASHMAP");
            System.out.println("6. ACTUALIZAR EL PRECIO DE UN PRODUCTO EN EL HASHMAP");
            System.out.println("7. CANTIDAD DE OBJETOS QUE GUARDA EL HASHMAP");
            System.out.println("8. MOSTRAR EL PRECIO MEDIO ENTRE TODOS LOS PRODUCTOS");
            System.out.println("9. MOSTRAR LOS PRODUCTOS DE UN PROVEEDOR");
            System.out.println("10. MOSTRAR TODOS LOS PRODUCTOS QUE INICIEN CON UNA LETRA DADA");
            System.out.println("11. ELIMINAR LOS PRODUCTOS DE UN PROVEEDOR DADO");
            System.out.println("12. OTRA FORMA DE LA 2");
            System.out.println("13. REMOVER TODOS LOS OBJETOS DEL HASHMAP");

            System.out.println("0. Salir");

            int opcion = Metodos.validarEntradaEntero("\nIngrese opcion? ");

            switch (opcion) {
                case 1:
                    cls();
                    opcion1();
                    pause();
                    break;
                case 2:
                    cls();
                    opcion2();
                    pause();
                    break;
                case 3:
                    cls();
                    opcion3();
                    pause();
                    break;
                case 4:
                    cls();
                    opcion4();
                    pause();
                    break;
                case 5:
                    cls();
                    opcion5();
                    pause();
                    break;
                case 6:
                    cls();
                    opcion6();
                    pause();
                    break;
                case 7:
                    cls();
                    opcion7();
                    pause();
                    break;
                case 8:
                    cls();
                    opcion8();
                    pause();
                    break;
                case 9:
                    cls();
                    opcion9();
                    pause();
                    break;
                case 10:
                    cls();
                    opcion10();
                    pause();
                    break;
                case 11:
                    cls();
                    opcion11();
                    pause();
                    break;
                case 12:
                    cls();
                    opcion12();
                    pause();
                    break;
                case 13:
                    cls();
                    opcion13();
                    pause();
                    break;
                case 0:
                    System.exit(0);
            }

        } while (true);

    }

    public static void opcion1() {
        System.out.println("1. CARGAR TABLA PRODCUTO EN UN HASHMAP");
        System.out.println("--------------------------------------");

        List<Producto> productos_al = crud.getArrayListProductos();

        for (Producto p : productos_al) {
            productos_hm.put(p.getIdProducto(), p);
        }

    }

    public static void opcion2() {
        System.out.println("2. MOSTRAR CONTENIDO DEL HASHMAP");
        System.out.println("--------------------------------");

        if (!productos_hm.isEmpty()) {
            Set<String> claves = productos_hm.keySet();
            for (String k : claves) {
                Producto p = productos_hm.get(k);
                System.out.println(p);
            }
        } else {
            System.out.println("HASH VACIO");
        }

    }

    public static void opcion3() {
        System.out.println("3. BUSCAR UN PRODUCTO POR SU CLAVE");
        System.out.println("----------------------------------");

        String clave = Metodos.validarEntradaNombre("Ingrese clave productor? ").toUpperCase();

        Producto p = productos_hm.get(clave);
        if (p != null) {
            System.out.println(p);
        } else {
            System.out.println("CLAVE DEL PRODUCTO NO EXISTE");
        }

    }

    public static void opcion4() {
        System.out.println("4. ELIMINAR UN PRODUCTO POR SU CLAVE");
        System.out.println("------------------------------------");

        String clave = Metodos.validarEntradaNombre("Ingrese clave productor? ").toUpperCase();

        if (productos_hm.containsKey(clave)) {
            productos_hm.remove(clave);
        } else {
            System.out.println("CLAVE PRODUCTO NO EXISTE");
        }

    }

    public static void opcion5() {
        System.out.println("5. AGREGAR UN PRODUCTO AL HASHMAP");
        System.out.println("---------------------------------");

        Object[] v = {"CR", "Clavos de Rosca Chapa", 10.5, "A31547649"};

        Producto p = new Producto((String) v[0], (String) v[1], (double) v[2], (String) v[3]);

        productos_hm.put(p.getIdProducto(), p);

        System.out.println("OK: AGREGAR PRODUCTO AL HASHMAP");

    }

    public static void opcion6() {
        System.out.println("6. ACTUALIZAR EL PRECIO DE UN PRODUCTO EN EL HASHMAP");
        System.out.println("----------------------------------------------------");

        String clave = Metodos.validarEntradaNombre("Ingrese clave productor? ").toUpperCase();

        if (productos_hm.containsKey(clave)) {
            double precioNuevo = Metodos.validarEntradaReal("Ingrese precio nuevo? ");
            Producto producto = productos_hm.get(clave);
            producto.setPrecio(precioNuevo);
            System.out.println("OK: ACTUALIZAR PRECIO");
        } else {
            System.out.println("NO EXISTE CLAVE PRODUCTO");
        }
    }

    public static void opcion7() {
        System.out.println("7. CANTIDAD DE OBJETOS QUE GUARDA EL HASHMAP");
        System.out.println("--------------------------------------------");

        System.out.println("Cantidad objetos: " + productos_hm.size());
    }

    public static void opcion8() {
        System.out.println("8. MOSTRAR EL PRECIO MEDIO ENTRE TODOS LOS PRODUCTOS");
        System.out.println("----------------------------------------------------");

        double acumulador = 0;
        Set<String> claves = productos_hm.keySet();
        for (String k : claves) {
            Producto p = productos_hm.get(k);
            acumulador = acumulador + p.getPrecio();
        }
        double resultado = acumulador / productos_hm.size();
        System.out.println("La media de los precios de todos los articulos de la tabla es: " + resultado);
    }

    public static void opcion9() {
        System.out.println("9. MOSTRAR LOS PRODUCTOS DE UN PROVEEDOR");
        System.out.println("----------------------------------------");

        if (!productos_hm.isEmpty()) {
            String cifProveedorBuscar = Metodos.validarEntradaCifProveedor("Ingrese cifProveedor? ");

            double acumulador = 0;
            Set<String> claves = productos_hm.keySet();
            for (String k : claves) {
                Producto p = productos_hm.get(k);
                if (p.getCifProveedor().equalsIgnoreCase(cifProveedorBuscar)) {
                    System.out.println(p.getNombre());
                }
            }
        } else {
            System.out.println("HASHMAP VACIO");
        }
    }

    public static void opcion10() {
        System.out.println("10. MOSTRAR TODOS LOS PRODUCTOS QUE INICIEN CON UNA LETRA DADA");
        System.out.println("--------------------------------------------------------------");

        if (!productos_hm.isEmpty()) {
            String letraInicio = Metodos.validarEntradaNombre("Ingrese letra inicio? ");
            boolean encontrado = false;
            Set<String> claves = productos_hm.keySet();
            for (String k : claves) {
                Producto p = productos_hm.get(k);

                if ((p.getNombre().charAt(0) + "").equalsIgnoreCase(letraInicio)) {
                    System.out.println(p.getNombre());
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("NO EXISTE NINGUN PRODUCTO QUE INICIE CON ESA LETRA");
            }
        } else {
            System.out.println("HASHMAP VACIO");
        }
    }

    public static void opcion11() {
        System.out.println("11. ELIMINAR LOS PRODUCTOS DE UN PROVEEDOR DADO");
        System.out.println("-----------------------------------------------");

        if (!productos_hm.isEmpty()) {
            String cifProveedorBuscar = Metodos.validarEntradaCifProveedor("Ingrese cifProveedor? ").toUpperCase();

            Set<String> claves = productos_hm.keySet();

            List<String> idProducto_al = new ArrayList<>();

            for (String k : claves) {
                Producto p = productos_hm.get(k);

                if (p.getCifProveedor().equalsIgnoreCase(cifProveedorBuscar)) {
                    idProducto_al.add(p.getIdProducto());
                }
            }
            if (idProducto_al.size() > 0) {
                for (String k : idProducto_al) {
                    productos_hm.remove(k);
                }
            } else {
                System.out.println("NO EXISTE NINGUN PRODUCTO CON ESE CIFPROVEEDOR");
            }
        } else {
            System.out.println("HASHMAP VACIO");
        }
    }

    public static void opcion12() {
        System.out.println("12. OTRA FORMA DE LA 2");
        System.out.println("----------------------");

        Collection<Producto> coleccion = productos_hm.values();
        for (Producto p : coleccion) {
            System.out.println(p);
        }

    }

    public static void opcion13() {
        System.out.println("13. REMOVER TODOS LOS OBJETOS DEL HASHMAP");
        System.out.println("-----------------------------------------");

        productos_hm.clear();

    }

    public static void pause() {
        try {
            System.out.print("\nPresiona una tecla para continuar...");
            System.in.read();
        } catch (IOException e) {
        }
    }

    public static void cls() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

}
