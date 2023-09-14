package mysql_zoologico;

public class Zoologico {

    private String idZoo;
    private String descripcion;
    private String ciudad;
    private double superficie;
    private double presupuesto;
    private String pais;

    public Zoologico() {
    }

    public Zoologico(String idZoo, String descripcion, String ciudad, double superficie, double presupuesto, String pais) {
        this.idZoo = idZoo;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.superficie = superficie;
        this.presupuesto = presupuesto;
        this.pais = pais;
    }

    public String getIdZoo() {
        return idZoo;
    }

    public void setIdZoo(String idZoo) {
        this.idZoo = idZoo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(double superficie) {
        this.superficie = superficie;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "idZoo=" + idZoo + ", descripcion=" + descripcion + ", ciudad=" + ciudad + ", superficie=" + superficie + ", presupuesto=" + presupuesto + ", pais=" + pais + '}';
    }

}
