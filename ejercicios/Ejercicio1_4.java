package ejercicios;

public class Ejercicio1_4 {

    public static void main(String[] args) {
        String[] codigo = {"A1","A2","A3","A4","A5"};
        int[] nota = {10,9,8,3,5};
        
        int s = 0;
        for(int x: nota) {
            s = s + x;
        }
        System.out.println("Promedio: " + s/nota.length);
    }

}
