package concesionario;

public class Coche {
    // VARIABLES DE INSTANCIA
    private int idCoche;
    private String color;
    private String marca;
    private double kilometraje;
    
    // CONSTRUCTORES

    public Coche() {
    }

    public Coche(int idCoche, String color, String marca, double kilometraje) {
        this.idCoche = idCoche;
        this.color = color;
        this.marca = marca;
        this.kilometraje = kilometraje;
    }
    
    // METODOS GET Y SET

    public int getIdCoche() {
        return idCoche;
    }

    public void setIdCoche(int idCoche) {
        this.idCoche = idCoche;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Coche{" + "idCoche=" + idCoche + ", color=" + color + ", marca=" + marca + ", kilometraje=" + kilometraje + '}';
    }
    
}
