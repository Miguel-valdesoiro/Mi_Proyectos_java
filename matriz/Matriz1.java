package matriz;

public class Matriz1 {

    public static void main(String[] args) {
       int[][] enteros = {{8,5},{2,9},{1,0}};// 3x2 FxC
       int nf = enteros.length;
       int nc = enteros[0].length;
       System.out.println("MOSTRAR MATRIZ");
       for(int i=0; i<nf; i++) {
           for(int j=0; j<nc; j++) {
               System.out.printf("%4d",enteros[i][j]);
           }
           System.out.println();
       }
    }

}
