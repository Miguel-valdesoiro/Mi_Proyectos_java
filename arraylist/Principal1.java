package arraylist;

import java.util.ArrayList;
import java.util.List;

public class Principal1 {

    public static void main(String[] args) {
        // Creo un arraylist
        List<Integer> enteros_al = new ArrayList<Integer>();

        // Añadir los elementos al arraylist
        enteros_al.add(8); //0
        enteros_al.add(1); //1
        enteros_al.add(7); //2
        enteros_al.add(3); //3

        // Recorrer un arraylist por elemento
        for (Integer x : enteros_al) {
            System.out.println(x);
        }
        // Recorrer un arraylist por indice
        for (int i = 0; i < enteros_al.size(); i++) {//0,1,2,3
            int y = enteros_al.get(i);
            System.out.println(y);
        }

        System.out.println("Elemento: " + enteros_al.get(2));

        // Agregar mas elmentos
        enteros_al.add(10);

        for (int i = 0; i < enteros_al.size(); i++) {
            int y = enteros_al.get(i);
            System.out.println(y);
        }

        // Eliminar elemento
        enteros_al.remove(4);

        for (int i = 0; i < enteros_al.size(); i++) {
            int y = enteros_al.get(i);
            System.out.println(y);
        }

    }

}
