package arraylist;

import java.util.Arrays;
import java.util.List;

public class Principal2 {

    public static void main(String[] args) {
       String[] nombres_v = {"Luis","Miguel","María","Carlos"};
       
       List<String> nombres_l = Arrays.asList(nombres_v);
       
       System.out.println("Vector Nombres   : " + nombres_v);
       System.out.println("ArrayList Nombres: " + nombres_l);
       
       for(String x: nombres_l) {// for each
           System.out.println(x);
       }
       
       System.out.println("MOSTRAR EL VECTOR");
       for(String s: nombres_v) {
           System.out.println(s);
       }
       
       nombres_l.add("Arturo");
       
    }

}
