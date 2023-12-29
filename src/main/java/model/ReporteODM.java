/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author pablo
 */
public class ReporteODM {
//    1)-- Listado de equipos vendidos (modelo, nombre, telefono, correo cliente, precio.)
//            -- capa de datos: Crear metodo que retorne la clase ODM con los datos encontrados
    private String modelo;
    private String nombre;
    private String telefono;
    private String correo;
    private int precio;

    public ReporteODM() {
    }

    public ReporteODM(String modelo, String nombre, String telefono, String correo, int precio) {
        this.modelo = modelo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
}
