/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import cl.pablo.lopezpabloexamenpyg.Cliente;
import cl.pablo.lopezpabloexamenpyg.Desktop;
import cl.pablo.lopezpabloexamenpyg.Equipo;
import cl.pablo.lopezpabloexamenpyg.Laptop;
import cl.pablo.lopezpabloexamenpyg.Venta;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pablo
 */
public final class ArraysDB {

    public ArrayList<Cliente> clientes = new ArrayList();
    public ArrayList<Desktop> desktop = new ArrayList();
    public ArrayList<Laptop> laptop = new ArrayList();
    public ArrayList<Equipo> equipos = new ArrayList();
    ;
    public ArrayList<Venta> ventas = new ArrayList();
    ;

    private static ArraysDB conexion;

    private ArraysDB() {
    }

    public static ArraysDB getConexion() {
        if (conexion == null) {
            conexion = new ArraysDB();
            Cliente cliente1 = new Cliente("5.456.342-2", "Roib", "roib@outlook.com", "+56965473251");
            Cliente cliente2 = new Cliente("15.345.784-k", "Juan", "juan.carlos34@gmail.com", "+56965432890");
            Laptop laptop1 = new Laptop("15 in", 2, "HP Laptop", "i5", "1Tb", "8GB", 700000, "Laptop");
            Laptop laptop2 = new Laptop("18 in", 1, "Huawei Laptop", "i3", "500GB", "8GB", 600000, "Laptop");
            Desktop desktop1 = new Desktop("600W", "ATX", "Acer", "i3", "1Tb", "16GB", 850000, "Desktop");
            Desktop desktop2 = new Desktop("600W", "ATX", "Dell", "i5", "2Tb", "32GB", 1100000, "Desktop");
            
            conexion.agregar_cliente(cliente1);
            conexion.agregar_cliente(cliente2);
            conexion.agregar_laptop(laptop1);
            conexion.agregar_laptop(laptop2);
            conexion.agregar_desktop(desktop1);
            conexion.agregar_desktop(desktop2);
            
            Venta venta1 = new Venta("15.345.784-k", "Acer", 850000, LocalDateTime.now());
            Venta venta2 = new Venta("5.456.342-2", "HP Laptop", 700000, LocalDateTime.now());
            
            conexion.agregar_venta(venta2);
            conexion.agregar_venta(venta1);
        }
        return conexion;
    }

    public void agregar_desktop(Desktop desktop) {
        this.desktop.add(desktop);
        equipos.add(desktop);
    }

    public void agregar_laptop(Laptop laptop) {
        this.laptop.add(laptop);
        equipos.add(laptop);
    }

    public void agregar_cliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void agregar_venta(Venta venta) {
        ventas.add(venta);
    }

    public List<Cliente> listar_clientes() {
        List<Cliente> listaCli = new ArrayList();
        clientes.forEach(cliente -> {
            Cliente dbCli = new Cliente();
            dbCli.setRut(cliente.getRut());
            dbCli.setNombre(cliente.getNombre());
            dbCli.setCorreo(cliente.getCorreo());
            dbCli.setTelefono(cliente.getTelefono());
            listaCli.add(cliente);
        });

        return listaCli;
    }

    public List<Venta> listar_ventas() {
        return this.ventas;
    }

    ;
    
    public List<Equipo> listar_equipos() {
        return this.equipos;
    }

    //Si encuentra un cliente por rut, lo devuelve. Si no lo encuentra devuelve uno vacío;
    public Cliente buscarCliente(String rutIngresado) {
        Cliente clienteSeleccionado = new Cliente();
        clientes.forEach(cliente -> {
            if (cliente.getRut().equals(rutIngresado)) {
                clienteSeleccionado.setRut(cliente.getRut());
                clienteSeleccionado.setNombre(cliente.getNombre());
                clienteSeleccionado.setCorreo(cliente.getCorreo());
                clienteSeleccionado.setTelefono(cliente.getTelefono());
            }
        });
        return clienteSeleccionado;
    }

    public List<ReporteODM> ObtenerDatosReporte() {
        List<ReporteODM> listaReporte = new ArrayList();
        ventas.forEach(venta -> {
            // por cada venta obtener  nombre, telefono, correo cliente, modelo y precio
            ReporteODM reporteODM = new ReporteODM();
            Cliente clienteReporte = buscarCliente(venta.getRutCliente());
            Equipo equipoReporte = buscarEquipo(venta.getModeloEquipo());
            // por cada venta añadir a List<ReporteODM> una instancia con los datos obtenidos de venta
            reporteODM.setCorreo(clienteReporte.getCorreo());
            reporteODM.setNombre(clienteReporte.getNombre());
            reporteODM.setTelefono(clienteReporte.getTelefono());
            reporteODM.setModelo(equipoReporte.getModelo());
            reporteODM.setPrecio(venta.getPrecio());

            listaReporte.add(reporteODM);

        });
        return listaReporte;
    };
    // Nuevo método para usarlo en la creación de informes con filtro de Desktop o Laptop
    public List<ReporteODM> ObtenerDatosReporteFiltrado(String filtro) {
        List<ReporteODM> listaReporte = new ArrayList();
        ventas.forEach(venta -> {
            // por cada venta obtener  nombre, telefono, correo cliente, modelo y precio
            ReporteODM reporteODM = new ReporteODM();
            Cliente clienteReporte = buscarCliente(venta.getRutCliente());
            Equipo equipoReporte = buscarEquipo(venta.getModeloEquipo());
            if (equipoReporte.getTipoEquipo().equals(filtro)){
                reporteODM.setCorreo(clienteReporte.getCorreo());
                reporteODM.setNombre(clienteReporte.getNombre());
                reporteODM.setTelefono(clienteReporte.getTelefono());
                reporteODM.setModelo(equipoReporte.getModelo());
                reporteODM.setPrecio(venta.getPrecio());

            listaReporte.add(reporteODM);
            }
        });
        return listaReporte;
    }
    
// metodo que sirve para el metodo ObtenerDatosReporte
    private Equipo buscarEquipo(String modelo) {
        Equipo equipoBuscado = new Equipo();
        equipos.forEach(equipo -> {
            if (equipo.getModelo().equals(modelo)) {
                equipoBuscado.setModelo(equipo.getModelo());
                equipoBuscado.setPrecio(equipo.getPrecio());
                equipoBuscado.setTipoEquipo(equipo.getTipoEquipo());
            }
        });
        return equipoBuscado;
    }
    
}
