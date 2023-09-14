package matriz;

import static libreria.Metodos.mostrar;



public class Matriz2 {

    public static void main(String[] args) {
        int[][] enteros = datos();
        mostrar(enteros);
    }

    public static int[][] datos() {
        int[][] enteros = {{8, 5}, {2, 9}, {1, 0}};// 3x2 FxC 
        return enteros;
    }

    /*
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
*/

}
