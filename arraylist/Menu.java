package arraylist;

import libreria.Metodos;
import libreria.Metodos;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import libreria.MisMetodos;

public class Menu {

    //BASE DE DATOS
    static List<Alumno> alumnos_al = new ArrayList<>();

    public static void main(String[] args) {

        alumnos_al.add(new Alumno("A1", "Luis", 16, 1.72));//0
        alumnos_al.add(new Alumno("A2", "Miguel", 21, 1.70));//1
        alumnos_al.add(new Alumno("A3", "Carlos", 20, 1.59));//2
        alumnos_al.add(new Alumno("A4", "María", 17, 1.71));//3

        do {

            cls();
            System.out.println("MENU");
            System.out.println("----");
            System.out.println("1. Mostrar");
            System.out.println("2. Buscar por su id");
            System.out.println("3. Eliminar por su id");
            System.out.println("4. Actualizar");
            System.out.println("5. Mostrar todos los alumnos menores de edad");
            System.out.println("6. Eliminar todos los alumnos");
            System.out.println("7. Añadir nuevos alumnos");
            System.out.println("0. Salir");

            int opcion = Metodos.validarEntradaEntero("Ingrese opción? ");

            switch (opcion) {
                case 1:
                    mostrar();
                    break;
                case 2:
                    buscar();
                    break;
                case 3:
                    eliminar();
                    break;
                case 4:
                    actualizar();
                    break;
                case 5:
                    evaluarEdad();
                    break;
                case 6:
                    eliminarTodosAlumnos();
                    break;
                case 7:
                    anadirNuevosAlumnos();
                    break;
                case 0:
                    System.exit(0);
            }
        } while (true);

    }

    public static void mostrar() {
        cls();
        System.out.println("1. MOSTRAR");
        System.out.println("----------");
        Alumno.cabecera();
        for (Alumno a : alumnos_al) {
            a.cuerpo();
        }
        pause();
    }

    public static void buscar() {
        cls();
        System.out.println("2. BUSCAR");
        System.out.println("---------");
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        System.out.print("Ingrese Id Alumno? ");
        String id = sc.next();
        for (Alumno a : alumnos_al) {
            if (a.getIdAlumno().equalsIgnoreCase(id)) {
                Alumno.cabecera();
                a.cuerpo();
                bandera = true;
            }
        }
        if (!bandera) {
            System.out.println("\nNo existe Alumno con ese id");
        }
        pause();
    }

    public static void eliminar() {
        cls();
        System.out.println("3. ELIMINAR");
        System.out.println("-----------");
        Scanner sc = new Scanner(System.in);
        boolean bandera = false;
        System.out.print("Ingrese Id Alumno? ");
        String id = sc.next();
        for (int i = 0; i < alumnos_al.size(); i++) {
            Alumno a = alumnos_al.get(i);
            if (a.getIdAlumno().equalsIgnoreCase(id)) {
                alumnos_al.remove(i);
                System.out.println("\nAlumno eliminado");
                bandera = true;
            }
        }
        if (!bandera) {
            System.out.println("\nNo existe Alumno con ese id");
        }
        pause();
    }

    public static void actualizar() {
        cls();
        System.out.println("4. ACTUALIZAR");
        System.out.println("-------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese Id Alumno? ");
        String id = sc.next();
        for (int i = 0; i < alumnos_al.size(); i++) {
            Alumno a = alumnos_al.get(i);
            if (a.getIdAlumno().equalsIgnoreCase(id)) {
                Alumno.cabecera();
                a.cuerpo();

                String nombre = Metodos.validarEntradaNombre("Ingrese nuevo nombre? ");

                int edad = Metodos.validarEntradaEntero("Ingrese nueva edad? ");

                double estatura = Metodos.validarEntradaReal("Ingrese nueva estatura? ");

                a.setNombre(nombre);
                a.setEdad(edad);
                a.setEstatura(estatura);

                System.out.println("\nAlumno se actualizó");
            }
        }
        pause();
    }

    public static void evaluarEdad() {
        cls();
        System.out.println("5. ALUMNOS MENORES DE EDAD");
        System.out.println("--------------------------");
        Alumno.cabecera();
        for (int i = 0; i < alumnos_al.size(); i++) {
            Alumno a = alumnos_al.get(i);
            if (a.esMenorEdad()) {
                a.cuerpo();
            }
        }

        pause();
    }

    public static void eliminarTodosAlumnos() {
        cls();
        System.out.println("6. ELIMINAR TODOS LOS ALUMNOS");
        System.out.println("-----------------------------");
        alumnos_al.clear();
        pause();
    }

    public static void anadirNuevosAlumnos() {
        cls();
        System.out.println("7. AÑADIR NUEVOS ALUMNOS");
        System.out.println("------------------------");
        String idAlumno = Metodos.validarIdAlumno("Ingrese Id Alumno? ");
        String nombre = Metodos.validarEntradaNombre("Ingrse nombre? ");
        int edad = Metodos.validarEntradaEntero("Ingrese edad? ");
        double estatura = Metodos.validarEntradaReal("Ingrese estatura? ");
        Alumno a = new Alumno(idAlumno,nombre,edad,estatura);
        alumnos_al.add(a);
        
        System.out.println("Alumno fue ingresado correctamente");

        pause();
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
