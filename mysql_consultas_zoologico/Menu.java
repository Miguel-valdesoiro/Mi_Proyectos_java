package mysql_consultas_zoologico;

import java.io.IOException;
import libreria.Metodos;

public class Menu {

    static OperacionesCrud crud = new OperacionesCrud();

    public static void main(String[] args) {
        do {
            cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. LOS ANIMALES NACIDOS EN AÑO CUALQUIERA");
            System.out.println("2. LOS ANIMALES NACIDOS EN UN MES CUALQUIERA");
            System.out.println("3. LOS ANIMALES NACIDOS EN UN MES O AÑO CUALQUIERA");
            System.out.println("4. LOS ANIMALES NACIDOS EN UN MES O AÑO O NOAÑO");
            System.out.println("5. MOSTRAR LOS ZOOLOGICOS QUE INICIE CIUDAD CON UNA LETRA CUALQUIERA");
            System.out.println("6. MOSTRAR LA CANTIDAD DE ZOOLOGICOS");
            System.out.println("7. ACTUALIZAR TABLA ZOOLOGICO EL CAMPO DESCRIPCION");
            System.out.println("8. ELIMINAR UN REGISTRO DE LA TABLA ZOOLOGICO(PADRE)(ON DELETE CASCADE)");
            System.out.println("9. INSERTAR REGISTRO EN LA TABLA ZOOLOGICO");

            System.out.println("3. Mostrar todas las ciuadades distintas");
            System.out.println("4. Mostrar la zona con la mayor venta");
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
                case 0:
                    System.exit(0);
            }

        } while (true);

    }

    public static void opcion1() {
        System.out.println("OPCION 1");
        System.out.println("--------");
        crud.animalesNacidosAnio();

    }

    public static void opcion2() {
        System.out.println("OPCION 2");
        System.out.println("--------");
        crud.animalesNacidosMes();
    }

    public static void opcion3() {
        System.out.println("OPCION 3");
        System.out.println("--------");
        crud.animalesNacidosAnio_Mes(Metodos.validarEntradaNombre("Ingrese mes-anio? "));
    }

    public static void opcion4() {
        System.out.println("OPCION 4");
        System.out.println("--------");
        crud.animalesNacidosAnio_Mes_NoAnio(Metodos.validarEntradaOracion("Ingrese mes-anio-no anio? "));
    }

    public static void opcion5() {
        System.out.println("OPCION 5");
        System.out.println("--------");
        crud.getCidadInicienLetra(Metodos.validarEntradaNombre("Ingrese letra inicio ciudad? "));
    }

    public static void opcion6() {
        System.out.println("OPCION 6");
        System.out.println("--------");
        crud.getContarZoo();
    }

    public static void opcion7() {
        System.out.println("OPCION 7");
        System.out.println("--------");
        String idZooBuscar = Metodos.validarEntradaIdZoo("Ingrese idZoo? ");
        if (crud.encontroIdZoo(idZooBuscar)) {
            String descripcionNueva = Metodos.validarEntradaOracion("Ingrese nueva descripción? ");
            crud.actualizar(idZooBuscar, descripcionNueva);
        } else {
            System.out.println("ERROR: IDZOO NO EXISTE");
        }
    }

    public static void opcion8() {
        System.out.println("OPCION 8");
        System.out.println("--------");
        String ciudadEliminar = Metodos.validarEntradaNombre("Ingrese ciudad eliminar? ");
        crud.eliminar(ciudadEliminar);
    }

    public static void opcion9() {
        System.out.println("OPCION 9");
        System.out.println("--------");

        Object[] z08 = {"Z08", "Casma", "Trujillo", 40.0, 200000.0, "España"};
        Object[] z09 = {"Z09", "Huarmey", "Jaen", 30.0, 100000.0, "España"};
        Object[] z10 = {"Z10", "Tumbes", "Cadiz", 20.0, 300000.0, "España"};
        
        crud.insertar(z08);
        crud.insertar(z09);
        crud.insertar(z10);
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
