/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

/**
 *
 * @author pablo
 */
public abstract class Equipo {
    private String modelo;
    private String cpu;
    private String discoDuro;
    private String ram;
    private int precio;

    public Equipo() {
    }

    public Equipo(String modelo, String cpu, String discoDuro, String ram, int precio) {
        this.modelo = modelo;
        this.cpu = cpu;
        this.discoDuro = discoDuro;
        this.ram = ram;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "Equipo{" + "modelo=" + modelo + ", cpu=" + cpu + ", discoDuro=" + discoDuro + ", ram=" + ram + ", precio=" + precio + '}';
    }
    
    
    
}
