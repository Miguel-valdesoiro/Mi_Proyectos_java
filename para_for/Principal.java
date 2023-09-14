package para_for;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Principal {

    public static void main(String[] args) {
        ejemplo8();
    }

    //MOSTRAR LA SERIE PAR 0 2 4 6 8 10 USANDO EL FOR
    public static void ejemplo1() {
        for (int i = 0; i < 11; i = i + 2) { // inicio, fin, incremento/decremento, 
            System.out.println(i);
        }

    }
    // i = i + 2  ---> i+=2

    //MOSTRAR LA SERIE: 10 9 8 7 6   i=10  i>5  i--
    //                   5 6 7 8 9   j=5   j<10 j++
    public static void ejemplo2() {
        for (int i = 10, j = 5; i > 5; i--, j++) {
            System.out.println(i + "  " + j);
        }
    }

    //GENERAR UNA SERIE ALEATORIA DE 10 NÚMEROS EN EL RANGO [1,6]
    public static void ejemplo3() {
        for (int i = 0; i < 10; i++) {
            int x = (int) (Math.random() * 6 + 1);          //0 ... 1
            System.out.println(x);
        }
    }

    //OBTENER UNA VOCAL ALEATORIA
    public static void ejemplo4() {
        char[] vocal = {'a', 'e', 'i', 'o', 'u'}; //0 1 2 3 4 = [0,4]
        for (int i = 1; i < 100; i++) {
            int x = (int) (Math.random() * 5); //3
            char letra = vocal[x]; //vocal[3] = o
            System.out.println(letra);
        }
    }

    //GENERAR LISTA DEL CODIGO ASCII. LETRAS MAYUSCULAS ACOMPAÑADAS DEL CODIGO DECIMAL
    public static void ejemplo5() {
        for (int i = 65; i <= 90; i++) {
            System.out.println(i + "\t" + (char) i);
        }

    }

    //CONSTRUIR LA TABLA ASCII
    public static void ejemplo6() {
        for (int i = 0; i <= 255; i++) {
            System.out.println(i + "\t" + (char) i);
        }

    }

    //CARACTERES UNICODE
    public static void ejemplo7() {

        System.out.println("\u2210    \u03C0"); //042f
    }

    public static void ejemplo8() {
        String codes = "0411";
        int codei = Integer.parseInt(codes, 16);
        System.out.printf("%6h", codei);

        System.out.println();

        int code = 0x0411;
        //System.out.println((char)code);
        for (int i = 0X410, j = 0X0430; i < 0x042F; i++, j++) {
            System.out.printf("%2C  %5h  %2C  %5h\n", (char) i, i, (char) j, j);

        }

    }

}
