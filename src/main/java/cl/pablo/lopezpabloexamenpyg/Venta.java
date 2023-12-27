/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

import java.time.LocalDateTime;

/**
 *
 * @author pablo
 */
public class Venta {
    public String rutCliente;
    public String modeloEquipo;
    public int precio;
    public LocalDateTime fecha;

    public Venta() {
    }

    public Venta(String rutCliente, String modeloEquipo, int precio, LocalDateTime fecha) {
        this.rutCliente = rutCliente;
        this.modeloEquipo = modeloEquipo;
        this.precio = precio;
        this.fecha = fecha;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public String getModeloEquipo() {
        return modeloEquipo;
    }

    public void setModeloEquipo(String modeloEquipo) {
        this.modeloEquipo = modeloEquipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "rutCliente=" + rutCliente + ", modeloEquipo=" + modeloEquipo + ", precio=" + precio + ", fecha=" + fecha + '}';
    }

    
    
    
    
}
