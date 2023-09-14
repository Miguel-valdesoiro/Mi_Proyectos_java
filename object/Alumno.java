package object;

public class Alumno {

    private int idAlumno;
    private String nombre;

    public Alumno() {
    }

    public Alumno(int idAlumno, String nombre) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", nombre=" + nombre + '}';
    }

}
