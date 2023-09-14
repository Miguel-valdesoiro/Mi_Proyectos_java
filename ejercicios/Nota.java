package ejercicios;

public class Nota {

    private String idAsignatura;
    private String descripcion;
    private double nota;

    public Nota() {
    }

    public Nota(String idAsignatura, String descripcion, double nota) {
        this.idAsignatura = idAsignatura;
        this.descripcion = descripcion;
        this.nota = nota;
    }

    public String getIdAsignatura() {
        return idAsignatura;
    }

    public void setIdAsignatura(String idAsignatura) {
        this.idAsignatura = idAsignatura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "NOTAS{" + "idAsignatura=" + idAsignatura + ", descripcion=" + descripcion + ", nota=" + nota + '}';
    }

}
