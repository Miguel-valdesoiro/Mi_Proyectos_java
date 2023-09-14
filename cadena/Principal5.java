package cadena;

public class Principal5 {

    public static void main(String[] args) {
       String s1 = "         HOLA               ";
       String s2 = "HOLA";
       boolean r1 = s1.equalsIgnoreCase(s2); // false
       boolean r2 = s1.trim().equalsIgnoreCase(s2); // true
       System.out.println("Resultado 1: " + r1);
       System.out.println("Resultado 2: " + r2);

    }

}
