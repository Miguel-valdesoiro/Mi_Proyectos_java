package object;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        int[] vector1 = {1, 2, 3, 4};

        Object[] vector2 = {1, 1.8, "Luis", 'A', true, new Alumno(1, "Silvia")};

        double s = (int) vector2[0] + (double) vector2[1];

        int b;
        double c;
        String d;
        char e;
        boolean f;
        Alumno a;
        
        //List<Integer> enteros = new ArrayList<>();

        for (Object x : vector2) {
            if (x instanceof Integer) {
                b = (int) x;
                System.out.println("Entero     : " + b);
                //enteros.add((int)x);
            }
            if (x instanceof Double) {
                c = (double) x;
                System.out.println("Double     : " + c);
            }
            if (x instanceof String) {
                d = (String) x;
                System.out.println("String     : " + d);
            }
            if (x instanceof Character) {
                e = (char) x;
                System.out.println("Character  : " + e);
            }
            if (x instanceof Boolean) {
                f = (boolean) x;
                System.out.println("Boolean    : " + f);
            }
            if (x instanceof Alumno) {
                a = (Alumno) x;
                System.out.println("Alumno     : " + a);
            }
        }

    }

}
