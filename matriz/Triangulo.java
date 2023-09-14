package matriz;

public class Triangulo { // Triangulos rectángulos
    private double cateto1;
    private double cateto2;

    public Triangulo() {
    }

    public Triangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }

    @Override
    public String toString() {
        return "Triangulo{" + "cateto1=" + cateto1 + ", cateto2=" + cateto2 + '}';
    }
    
    public double getHipotenusa() {
        //return  Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
        return Math.sqrt(Math.pow(cateto1,2)+Math.pow(cateto2,2));
    }
    
    public static void cabecera() {
       System.out.printf("%9s  %7s  %7s  %10s\n","TRIANGULO","CATETO1","CATETO2","HIPOTENUSA");
       System.out.printf("%9s  %7s  %7s  %10s\n","---------","-------","-------","----------");
    }
}
