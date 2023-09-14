package concesionario;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        String nra = "datos/concesionario.csv";

        List<Coche> coches_al = MetodosArchivosCsv.leer(nra);

        for (Coche c : coches_al) {
            //System.out.println(c);
        }

        // MOSTRAR SOLO LA COLUMNA MARCA
        for (Coche c : coches_al) {
            //System.out.println(c.getMarca());
        }

        // MOSTRAR EL COCHE QUE TENGA EL MAYOR KILOMETRAJE
        double maximo = -9999;
        for (Coche c : coches_al) {
            if (c.getKilometraje() > maximo) {
                maximo = c.getKilometraje();
            }
        }
        System.out.println("Maximo Kilometraje: " + maximo);
        for (Coche c : coches_al) {
            if (c.getKilometraje() == maximo) {
                System.out.println(c);
            }
        }

        // CUANTOS COCHES SON DE COLOR VERDE
        int i = 0;
        for (Coche c : coches_al) {
             if(c.getColor().equalsIgnoreCase("verde")) {
                 i++;
             }
        }
        System.out.println("Número coches color verde: " + i);
    }

}
