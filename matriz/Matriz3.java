package matriz;

public class Matriz3 {

    public static void main(String[] args) {
        int[][] enteros = {{8, 5}, {2, 9}, {1, 0}};// 3x2 FxC
        int nc = enteros.length; //3
        int nf = enteros[0].length; //2
        System.out.println("MOSTRAR MATRIZ");
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.printf("%4d", enteros[j][i]);
            }
            System.out.println();
        }
    }

}
