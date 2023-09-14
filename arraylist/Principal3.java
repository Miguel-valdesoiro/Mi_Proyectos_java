package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Principal3 {

    public static void main(String[] args) {
       List<Alumno> alumnos_al = new ArrayList<>();
       
       alumnos_al.add(new Alumno("A1","Luis",16,1.72));//0
       alumnos_al.add(new Alumno("A2","Miguel",21,1.70));//1
       alumnos_al.add(new Alumno("A3","Carlos",20,1.59));//2
       alumnos_al.add(new Alumno("A4","María",17,1.71));//3
    
       for(Alumno a: alumnos_al) {
           System.out.println(a);
       }
    }

}
