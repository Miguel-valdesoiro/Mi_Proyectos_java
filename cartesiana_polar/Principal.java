package cartesiana_polar;

public class Principal {

    public static void main(String[] args) {
        //ENTRADA
        double x = -1;
        double y = 8;
        //PROCESO
        String polar = cartesianaToPolar(x, y);
        //SALIDA
        String[] parte = polar.split(",");
        System.out.println("Radio : " + parte[0]);
        System.out.println("Angulo: " + parte[1]);
    }

    public static String cartesianaToPolar(double x, double y) {
        double r = 0, a = 0;
        r = Math.sqrt(x * x + y * y);
        a = Math.atan2(y, x) * 180 / Math.PI; //Grados Sexagesimales.
        return redondear2decimales(r) + "," + redondear2decimales(a);
    }

    public static double redondear2decimales(double x) {
        double y = (int) Math.ceil(x * 100.0) / 100.0;
        return y;
    }

}
