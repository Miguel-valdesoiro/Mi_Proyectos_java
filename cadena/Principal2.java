package cadena;

public class Principal2 {

    public static void main(String[] args) {
        System.out.println("METODO INSTANCIA DE LA CLASE STRING: CHARAT");
        System.out.println("-------------------------------------------");
        // INVERTIR UNA CADENA USANDO EL CHARAT. POR EJEMPLO HOLA = ALOH

        String s = "HOLA";
        for (int i = s.length() - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
        System.out.println();

    }

}
