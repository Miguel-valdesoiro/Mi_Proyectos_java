package arraylist;

public class Alumno {

    // VARIABLES DE INSTANCIAS (ATRIBUTOS)
    private String idAlumno;
    private String nombre;
    private int edad;
    private double estatura;

    // CONSTRUCTORES
    public Alumno() {
    }

    public Alumno(String idAlumno, String nombre, int edad, double estatura) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    // METODOS SET Y GET POR CADA ATRIBUTO
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    // TOSTRING
    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + ", edad=" + edad + ", estatura=" + estatura + '}';
    }

    //CABECERA
    public static void cabecera() {
        System.out.printf("%8s  %-6s  %4s  %8s\n", "IDALUMNO", "NOMBRE", "EDAD", "ESTATURA");
        System.out.printf("%8s  %-6s  %4s  %8s\n", "--------", "------", "----", "--------");
    }

    public void cuerpo() {
        System.out.printf("%8s  %-6s  %4d  %8.2f\n", idAlumno, nombre, edad, estatura);
    }

    public boolean esMenorEdad() {
        if (edad < 18) {
            return true;
        } else {
            return false;
        }
    }
}


/*
IDALUMNO  NOMBRE   EDAD   ESTATURA
  A1      Luis     16     1.72
  A2      Miguel   21     1.70
  A3      Carlos   20     1.59
  A4      María    17     1.71
 */
