/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

/**
 *
 * @author pablo
 */
public class Desktop extends Equipo {
    private String fuentePoder;
    private String factorForma;

    public Desktop() {
    }

    public Desktop(String fuentePoder, String factorForma, String modelo, String cpu, String discoDuro, String ram, int precio) {
        super(modelo, cpu, discoDuro, ram, precio);
        this.fuentePoder = fuentePoder;
        this.factorForma = factorForma;
    }

    public String getFuentePoder() {
        return fuentePoder;
    }

    public void setFuentePoder(String fuentePoder) {
        this.fuentePoder = fuentePoder;
    }

    public String getFactorForma() {
        return factorForma;
    }

    public void setFactorForma(String factorForma) {
        this.factorForma = factorForma;
    }

    @Override
    public String toString() {
        return "Desktop{" + "fuentePoder=" + fuentePoder + ", factorForma=" + factorForma + '}';
    }
    
    
}
