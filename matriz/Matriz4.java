package matriz;

import static libreria.Metodos.copiaMatriz;



public class Matriz4 {

    public static void main(String[] args) {
        int[][] enteros = {{8, 5}, {2, 9}, {1, 0}};// 3x2 FxC
        int[][] enteros_copia = copiaMatriz(enteros);
        int nf = enteros.length;
        int nc = enteros[0].length;
        System.out.println("MOSTRAR MATRIZ MOFICADA");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if (enteros[i][j] % 2 == 0) {
                    enteros[i][j] = 0;
                } else {
                    enteros[i][j] = 1;
                }
                System.out.printf("%4d", enteros[i][j]);
            }
            System.out.println();
        }
        System.out.println("MOSTRAR MATRIZ COPIA DE ORIGINAL");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.printf("%4d", enteros_copia[i][j]);
            }
            System.out.println();
        }
    }



}
