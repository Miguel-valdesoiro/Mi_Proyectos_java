package cadena;

public class Principal1 {

    public static void main(String[] args) {

        System.out.println("METODO INSTANCIA DE LA CLASE STRING: SUBSTRING");
        System.out.println("----------------------------------------------");
        // MOSTRAR LA SUBCADENA ITALIANO Y MOSTRARLA EN MAYUSCULA
        {
            String s1 = "En un puerto italiano al pie de la montaña";
            String s2 = s1.substring(13, 21).toUpperCase();
            System.out.println("Subcadena 1: " + s2);
        }
        // MOSTRAR LA SUBCADENA AL PIE Y MOSTRARLA EN MAYUSCULA
        {
            String s1 = "En un puerto italiano al pie de la montaña";
            String s2 = s1.substring(22, 28).toUpperCase();
            System.out.println("Subcadena 2: " + s2);
        }
        // DADA LA SIGUIENTE CADENA "WHITE - BLACK - " SE PIDE QUITAR LO ULTIMO ESPACIO GUION ESPACIO
        {
            String s1 = "WHITE - BLACK - ";
            String s2 = s1.substring(0, 13);
            System.out.println("Cadena     : " + s1);
            System.out.println("Subcadena 3: " + s2);
        }
        // SUPONGAMOS DEL EJEMPLO ANTERIOR NO CONOZCO LA LONGITU DE LA CADENA
        {
            String s1 = "WHITE - BLACK - ";
            String s2 = s1.substring(0, s1.length() - 3);
            System.out.println("Cadena     : " + s1);
            System.out.println("Subcadena 4: " + s2);
        }
        // DADA LA CADENA: SEBASTIAN SE PIDE IMPRIMIR DE LA SIGUIENTE MANERA
        /*
        S
        SE
        SEB
        SEBA
        SEBAS
        SEBAST
        SEBASTI
        SEBASTIA
        SEBASTIAN
         */
        {
            String s = "SEBASTIAN SAGASTEGUI";
            for (int i = 1; i <= s.length(); i++) {
                System.out.println(s.substring(0, i));

            }

        }



        System.out.println("METODO CLASE DE LA CLASE STRING: VALUEOF");
        System.out.println("----------------------------------------");
        // CONVERTIR EL NUMERO 5 EN UNA CADENA "5"
        {
            int x = 5;
            int x1 = x + x;
            String y = String.valueOf(x);
            System.out.println("Entero: " + x);
            System.out.println("Cadena: " + y);
        }
        System.out.println("METODO CLASE DE LA CLASE INTEGER: PARSEINT");
        System.out.println("------------------------------------------");
        {
            String x = "5";
            int y = Integer.parseInt(x);
            System.out.println("Cadena: " + x);
            System.out.println("Entero: " + y);
        }

    }

}
