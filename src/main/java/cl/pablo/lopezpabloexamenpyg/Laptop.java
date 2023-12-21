/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

/**
 *
 * @author pablo
 */
public class Laptop extends Equipo {
    private String tamañoPantalla;
    private int cantUsb;

    public Laptop() {
    }

    public Laptop(String tamañoPantalla, int cantUsb, String modelo, String cpu, String discoDuro, String ram, int precio) {
        super(modelo, cpu, discoDuro, ram, precio);
        this.tamañoPantalla = tamañoPantalla;
        this.cantUsb = cantUsb;
    }

    public String getTamañoPantalla() {
        return tamañoPantalla;
    }

    public void setTamañoPantalla(String tamañoPantalla) {
        this.tamañoPantalla = tamañoPantalla;
    }

    public int getCantUsb() {
        return cantUsb;
    }

    public void setCantUsb(int cantUsb) {
        this.cantUsb = cantUsb;
    }

    @Override
    public String toString() {
        return "Laptop{" + "tama\u00f1oPantalla=" + tamañoPantalla + ", cantUsb=" + cantUsb + '}';
    }
    
    
}
