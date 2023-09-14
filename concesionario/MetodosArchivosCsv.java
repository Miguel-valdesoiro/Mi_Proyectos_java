package concesionario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import transacciones.Transaccion;

public class MetodosArchivosCsv {

    public static List<Coche> leer(String nra) {
        List<Coche> coches_al = new ArrayList<>();
        String fila = "";
        File f = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            f = new File(nra);
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            int i = 0;
            while ((fila = br.readLine()) != null) {
                if (i != 0) {
                    String[] campo = fila.split(";");
                    //System.out.println(Arrays.asList(campo));
                    Coche c = new Coche(Integer.parseInt(campo[0]),
                            campo[1],
                            campo[2],
                            Double.parseDouble(campo[3]));
                    coches_al.add(c);
                }
                i++;
            }
        } catch (IOException e) {
            System.out.println("ERROR DE LECTURA");
        }
        return coches_al;
    }



}

    //SELECT COUNT(*) FROM Coche WHERE color = 'verdefor (Coche c : coches_al) {for (Coche c : coches_al) {'
