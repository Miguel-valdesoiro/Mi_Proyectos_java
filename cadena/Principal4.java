package cadena;

import java.util.Arrays;

public class Principal4 {

    public static void main(String[] args) {
        {
            System.out.println("EJEMPLO 1");
            String s = "1;02/01/2012;JUAN ANTONIO LEON LUIS;Hombre;INDUCCION";
            String[] parte = s.split(";");
            System.out.println(Arrays.asList(parte));
            for (String x : parte) {
                System.out.println(x);
            }
        }

        {
            System.out.println("EJEMPLO 2");
            String s = "1,02/01/2012,,JUAN ANTONIO LEON LUIS,,,Hombre,,,,,,,INDUCCION";
            String[] parte = s.split("[,]+");
            System.out.println(Arrays.asList(parte));
            for (String x : parte) {
                System.out.println(x);
            }
        }

    }

}
