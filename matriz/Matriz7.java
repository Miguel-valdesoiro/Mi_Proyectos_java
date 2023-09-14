package matriz;

import static libreria.Metodos.mostrar;




public class Matriz7 {

    public static void main(String[] args) {
        int[][] primo = new int[17][10];

        int k = 1;
        int[] vector = new int[170];
        vector[0] = 2;
        for (int i = 3; i <= 1000; i++) {
            if (comprobarPrimo(i) == 1) {
                vector[k++] = i;
            }
        }
        vector[168] = vector[169] = 0;
        k = 0;
        for (int i = 0; i < primo.length; i++) {
            for (int j = 0; j < primo[0].length; j++) {
                primo[i][j] = vector[k++];
            }
        }
        System.out.println("MOSTRAR LA MATRIZ DE PRIMOS");
        mostrar(primo);
    }

    public static int comprobarPrimo(int num) {//Primo 1, No Primo 0
        int c = 0;
        for (int i = 2; i <= num; i++) {
            if ((num % i) == 0) {
                c++;
            }
        }
        if (c > 1) {
            return 0;
        } else {
            return 1;
        }
    }
    
    
    //PROBANDO
}
