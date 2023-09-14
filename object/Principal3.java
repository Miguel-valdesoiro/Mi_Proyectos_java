package object;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Principal3 {

    public static void main(String[] args) {
        Map<Integer, String> nombres_hm = new HashMap<>();

        nombres_hm.put(5, "Arturo");
        nombres_hm.put(1, "Luis");
        nombres_hm.put(2, "Carlos");
        nombres_hm.put(3, "Silvia");

        Set<Integer> claves = nombres_hm.keySet();

        for (Integer k : claves) {
            String s = nombres_hm.get(k);
            System.out.println(k + "   " + s);
        }
        
        

    }

}
