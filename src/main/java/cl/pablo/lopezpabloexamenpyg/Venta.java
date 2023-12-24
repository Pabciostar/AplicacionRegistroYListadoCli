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
    private String nombreCliente;
    private String rutCliente;
    private LocalDateTime fecha;

    public Venta() {
    }

    public Venta(String nombreCliente, String rutCliente, LocalDateTime fecha) {
        this.nombreCliente = nombreCliente;
        this.rutCliente = rutCliente;
        this.fecha = fecha;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getRutCliente() {
        return rutCliente;
    }

    public void setRutCliente(String rutCliente) {
        this.rutCliente = rutCliente;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Venta{" + "nombreCliente=" + nombreCliente + ", rutCliente=" + rutCliente + ", fecha=" + fecha + '}';
    }
    
    
}
