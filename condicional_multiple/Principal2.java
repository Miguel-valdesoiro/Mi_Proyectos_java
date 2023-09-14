package condicional_multiple;

import libreria.Metodos;

public class Principal2 {

    public static void main(String[] args) {
       int nota = Metodos.validarEntradaEntero("Ingrese nota? ");
       
       switch(nota) {
           case 0: case 1: case 2: case 3: case 4: System.out.println("Desaprobado"); break;
           case 5: case 6: case 7: System.out.println("Bien"); break;
           case 8: case 9: System.out.println("Notable"); break;
           case 10: System.out.println("Sobresaliente"); break;
           default:
               System.out.println("Nota No Valida");
       }
    }

}
