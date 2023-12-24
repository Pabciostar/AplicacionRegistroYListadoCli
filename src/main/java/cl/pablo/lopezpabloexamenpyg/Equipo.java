/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

/**
 *
 * @author pablo
 */
public class Equipo {
    private String modelo;
    private String cpu;
    private String discoDuro;
    private String ram;
    private int precio;
    private String tipoEquipo;

    public Equipo() {
    }

    public Equipo(String modelo, String cpu, String discoDuro, String ram, int precio, String tipoEquipo) {
        this.modelo = modelo;
        this.cpu = cpu;
        this.discoDuro = discoDuro;
        this.ram = ram;
        this.precio = precio;
        this.tipoEquipo = tipoEquipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDiscoDuro() {
        return discoDuro;
    }

    public void setDiscoDuro(String discoDuro) {
        this.discoDuro = discoDuro;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipoEquipo() {
        return tipoEquipo;
    }

    public void setTipoEquipo(String tipoEquipo) {
        this.tipoEquipo = tipoEquipo;
    }
    
    

    @Override
    public String toString() {
        return "Equipo{" + "modelo=" + modelo + ", cpu=" + cpu + ", discoDuro=" + discoDuro + ", ram=" + ram + ", precio=" + precio + '}';
    }
    
    
    
}
