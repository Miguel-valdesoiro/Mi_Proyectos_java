package ejercicios;

public class Principal {

    public static void main(String[] args) {
        String[] codigo = {"A1", "A2", "A3", "A4", "A5"};
        String[] descripcion = {"Matemática", "Religión", "Química", "Filosofía", "Física"};
        int[] nota = {10, 9, 8, 3, 5};
        
        Nota[] n = new Nota[5];
        double s = 0;
        for(int i=0; i<codigo.length; i++) {
            n[i] = new Nota(codigo[i],descripcion[i],nota[i]);
            s = s + n[i].getNota();
            //s = s + nota[i];
        }
        System.out.println("Promedio: " + s/codigo.length);
    }

}
