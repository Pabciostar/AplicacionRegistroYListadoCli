/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.pablo.lopezpabloexamenpyg;

/**
 *
 * @author pablo
 */
public class Venta {
    private Cliente cliente;
    private Equipo equipo;
    private String fecha;
    private String hora;

    public Venta() {
    }

    public Venta(Cliente cliente, Equipo equipo, String fecha, String hora) {
        this.cliente = cliente;
        this.equipo = equipo;
        this.fecha = fecha;
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Venta{" + "cliente=" + cliente + ", equipo=" + equipo + ", fecha=" + fecha + ", hora=" + hora + '}';
    }
    
    
}
