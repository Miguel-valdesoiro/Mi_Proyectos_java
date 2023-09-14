package matriz;

import static libreria.Metodos.mostrar;
import static libreria.Metodos.validarEntradaEntero;

public class Main5 {
    public static void main(String[] args) {
       int nf = validarEntradaEntero("Número de filas? ");
       int nc = validarEntradaEntero("Número de columnas? ");
       int[][] x = new int[nf][nc];
       for(int i=0; i<nf; i++) {
           for(int j=0; j<nc; j++) {
               x[i][j] = validarEntradaEntero("Ingrese número? "); 
           }
       }
       mostrar(x);
    }

}
