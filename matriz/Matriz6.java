package matriz;

public class Matriz6 {

    public static void main(String[] args) {
        int x = 5;
        Triangulo t1 = new Triangulo(5, 6);
        Triangulo t2 = new Triangulo(7, 9);
        Triangulo t3 = new Triangulo(2, 4);
        Triangulo t4 = new Triangulo(7, 8);

        Triangulo[][] matriz = new Triangulo[1][4];
        matriz[0][0] = t1;
        matriz[0][1] = t2;
        matriz[0][2] = t3;
        matriz[0][3] = t4;
        
        Triangulo.cabecera();
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++) {
                Triangulo t = matriz[i][j];
                System.out.printf("%9s  %7.2f  %7.2f  %10.2f\n", "T"+(j+1),t.getCateto1(),t.getCateto2(),t.getHipotenusa());
            }
        }
    }

}
