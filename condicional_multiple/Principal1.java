package condicional_multiple;

import libreria.Metodos;

public class Principal1 {

    public static void main(String[] args) {
        int dia = Metodos.validarEntradaEntero("Ingrese día? ");
        int mes = Metodos.validarEntradaEntero("Ingrese mes? ");
        int anio = Metodos.validarEntradaEntero("Ingrese año? ");
        int cdias = 0;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                cdias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                cdias = 30;
                break;
            case 2:
                if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))) {
                    cdias = 29;
                } else {
                    cdias = 28;
                }
                break;

        }
        if(dia <= cdias && mes > 0 && mes < 13) {
            System.out.println("FECHA CORRECTA");
        }else {
            System.out.println("FECHA INCORRECTA");
        }

    }

}
