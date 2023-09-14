/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing_MySql;





/**
 *
 * @author pedro
 */
public class Zoologico {
    
    private String idZoo;
    private String descripcion;
    private String ciudad;
    private double superficie;
    private double precio;
    private String pais;

    public Zoologico() {
    }

    public Zoologico(String idZoo, String descripcion, String ciudad, double superficie, double precio, String pais) {
        this.idZoo = idZoo;
        this.descripcion = descripcion;
        this.ciudad = ciudad;
        this.superficie = superficie;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "idZoo=" + idZoo + ", descripcion=" + descripcion + ", ciudad=" + ciudad + ", superficie=" + superficie + ", precio=" + precio + ", pais=" + pais + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
