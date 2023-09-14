package ecuacion_cuadratica;

public class Principal {

    public static void main(String[] args) {
        //ENTRADA
        double a = 1;
        double b = -4;
        double c = 4;
        //PROCESO
        String x = ecuacionSegundoGrado(a, b, c);
        //SALIDA
        String[] parte = x.split(",");
        System.out.println("X1: " + parte[0]);
        System.out.println("X2: " + parte[1]);
    }

    public static String ecuacionSegundoGrado(double a, double b, double c) {
        double x1, x2, d;
        int z = 0;
        x1 = x2 = d = 0;
        if (a != 0) {
            d = Math.pow(b, 2) - 4 * a * c;
            if (d >= 0) {
                x1 = (-b + Math.sqrt(d)) / (2 * a);
                x2 = (-b - Math.sqrt(d)) / (2 * a);
            } else {
                System.out.println("NO TIENE SOLUCION REAL");
                z = -1;
            }
        } else {
            System.out.println("NO ES UNA ECUACION DE SEGUNDO GRADO");
            z = -2;
        }
        return x1 + "," + x2 + "," + z;
    }

    public String ecuaciónSegundoGrado1(double a, double b, double c) {
        double x1, x2, d;
        d = Math.pow(b, 2) - 4 * a * c;
        x1 = (-b + Math.sqrt(d)) / (2 * a);
        x2 = (-b - Math.sqrt(d)) / (2 * a);
        return x1 + "," + x2;
    }

}
