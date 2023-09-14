package libreria;

import java.io.IOException;
import java.util.Scanner;

public class Metodos {

    public static String validarIdAlumno(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "A[0-9]{1,2}";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }
        } while (!correcto);
        return n;
    }

    public static int validarEntradaEntero(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }
        } while (!correcto);
        return Integer.parseInt(n);
    }

    public static double validarEntradaReal(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[0-9]+\\.[0-9]{1,2}";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }
        } while (!correcto);
        return Double.parseDouble(n);
    }

    public static String validarEntradaNombre(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[a-zA-ZñÑáéíóú]+";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }

        } while (!correcto);
        return n;
    }

    public static String validarEntradaCifProveedor(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[AB][0-9]{8}";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }

        } while (!correcto);
        return n;
    }

    public static String validarEntradaIdZoo(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "Z[0-9]{2}";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.next();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }

        } while (!correcto);
        return n;
    }

    public static String validarEntradaOracion(String mensaje) {
        Scanner sc = new Scanner(System.in);
        String patron = "[a-zA-ZñÑáéíóú\\s]+";
        boolean correcto;
        String n;
        do {
            System.out.print(mensaje);
            n = sc.nextLine();
            correcto = n.matches(patron);
            if (!correcto) {
                System.out.println("Error: Entrada Incorrecta");
            }

        } while (!correcto);
        return n;
    }

    public static int[][] copiaMatriz(int[][] enteros) {
        int nf = enteros.length;
        int nc = enteros[0].length;
        int[][] copia = new int[nf][nc];
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                copia[i][j] = enteros[i][j];
            }
        }
        return copia;
    }

    public static void mostrar(int[][] enteros) {
        int nf = enteros.length;
        int nc = enteros[0].length;
        System.out.println("MOSTRAR MATRIZ");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.printf("%4d", enteros[i][j]);
            }
            System.out.println();
        }
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

    public static double redondear2decimales(double x) {
        double y = (int) Math.ceil(x * 100.0) / 100.0;
        return y;
    }

}
