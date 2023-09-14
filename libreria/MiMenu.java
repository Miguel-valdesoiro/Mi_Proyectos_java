package libreria;

import java.io.IOException;

public class MiMenu {

    public static void main(String[] args) {

        do {
            Metodos.cls();
            System.out.println("1. Mostratr todas las transacciones");
            System.out.println("2. Mostrar la ciudad con el mayor monto acumulado");
            System.out.println("3. Mostrar todas las ciuadades distintas");
            System.out.println("4. Mostrar la zona con la mayor venta");
            System.out.println("0. Salir");

            int opcion = Metodos.validarEntradaEntero("Ingrese opcion? ");

            switch (opcion) {
                case 1:
                    cls();
                    opcion1();
                    Metodos.pause();
                    break;
                case 2:
                    Metodos.cls();
                    opcion2();
                    Metodos.pause();
                    break;
                case 3:
                    Metodos.cls();
                    opcion3();
                    Metodos.pause();
                    break;
                case 4:
                    Metodos.cls();
                    opcion4();
                    Metodos.pause();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void opcion1() {
        System.out.println("OPCION 1");
        System.out.println("--------");

    }

    public static void opcion2() {
        System.out.println("OPCION 2");
        System.out.println("--------");
    }

    public static void opcion3() {
        System.out.println("OPCION 3");
        System.out.println("--------");
    }

    public static void opcion4() {
        System.out.println("OPCION 4");
        System.out.println("--------");
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
