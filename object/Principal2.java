package object;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Principal2 {

    public static void main(String[] args) {
       List<Integer> enteros_al = new ArrayList<>();
       
       enteros_al.add(1);
       enteros_al.add(2);
       enteros_al.add(3);
       
       List<Object> objetos_al = new ArrayList<>();
       
       objetos_al.add(1);
       objetos_al.add(1.72);
       objetos_al.add("Luis");
       objetos_al.add('A');
       objetos_al.add(true);
       objetos_al.add(new Alumno(1,"Luis"));
       
       Map<Integer,String> nombres_hm = new HashMap<>();
       nombres_hm.put(1,"Luis");
       nombres_hm.put(2,"Carlos");
       nombres_hm.put(3,"Silvia");
       
       Iterator claves = nombres_hm.entrySet().iterator();
       
       while(claves.hasNext()) {
           
       }
 
               
       
    }

}

/*CLAVE VALOR
   1    "Luis"
   2    "Carlos"
   3    "Silvia"



*/