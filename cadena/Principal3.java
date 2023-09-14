package cadena;

public class Principal3 {

    public static void main(String[] args) {

        {
            String s = "En     un puerto    italiano    al pie   de la     montaña                vive";
            String patron = "[\\s]+";
            String s1 = s.replaceAll(patron, " ");
            System.out.println("Original  1: " + s);
            System.out.println("Resultado 1: " + s1);
        }

        {
            String s = "En     un puerto    italiano    al pie   de la     montaña                vive";
            String patron = "[\\s]+";
            String s1 = s.replaceAll(patron, "");
            System.out.println("Original  2: " + s);
            System.out.println("Resultado 2: " + s1);
        }

        {
            String s = "En124 un p123uerto    ita456liano    a5l pie   de la     montaña                vive";
            
            String patron1 = "[0-9]+";
            String patron2 = "[\\s]+";
            
            String s1 = s.replaceAll(patron1, "").replaceAll(patron2, " ");
           
            System.out.println("Original  3: " + s);
            System.out.println("Resultado 3: " + s1);
        }
    }

}
