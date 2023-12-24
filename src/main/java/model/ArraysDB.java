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
    public ArrayList<Equipo> equipos = new ArrayList();;
    public ArrayList<Venta> ventas = new ArrayList();;

    private static ArraysDB conexion;
    
    private ArraysDB() {
    }
    
    public static ArraysDB getConexion() {
        if (conexion == null) {
            conexion = new ArraysDB();
            Cliente cliente1 = new Cliente("gg", "gg", "gg", "gg");
            Cliente cliente2 = new Cliente("ss", "ss", "ss", "ss");
            Laptop laptop1 = new Laptop("600", 2, "ghgh", "ghgh", "ghgh", "ghgh", 700000, "Laptop");
            Laptop laptop2 = new Laptop("500", 1, "ghgh", "ghgh", "ghgh", "ghgh", 850000, "Laptop");
            Desktop desktop1 = new Desktop("400", "400", "jdjd", "ksks", "jsjsj", "ksks", 600000, "Desktop");
            Desktop desktop2 = new Desktop("500", "600", "jdjd", "ksks", "jsjsj", "ksks", 550000, "Desktop");
            
            conexion.agregar_cliente(cliente1);
            conexion.agregar_cliente(cliente2);
            conexion.agregar_laptop(laptop1);
            conexion.agregar_laptop(laptop2);
            conexion.agregar_desktop(desktop2);
            conexion.agregar_desktop(desktop2);
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
    
    public List<Cliente> listar_clientes (){
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
    
    public List<Equipo> listar_equipos (){
        List<Desktop> listaDesktop = new ArrayList();
        List<Laptop> listaLaptop = new ArrayList();
        List<Equipo> listaEquip = new ArrayList();
        this.desktop.forEach(desktop -> {
            Desktop dbDesktop = new Desktop();
            dbDesktop.setCpu(desktop.getCpu());
            dbDesktop.setDiscoDuro(desktop.getDiscoDuro());
            dbDesktop.setModelo(desktop.getModelo());
            dbDesktop.setPrecio(desktop.getPrecio());
            dbDesktop.setRam(desktop.getRam());
            dbDesktop.setFactorForma(desktop.getFactorForma());
            dbDesktop.setFuentePoder(desktop.getFuentePoder());
            listaDesktop.add(desktop);
        });
        
        this.laptop.forEach(laptop -> {
            Laptop dbLaptop = new Laptop();
            dbLaptop.setCpu(laptop.getCpu());
            dbLaptop.setDiscoDuro(laptop.getDiscoDuro());
            dbLaptop.setModelo(laptop.getModelo());
            dbLaptop.setPrecio(laptop.getPrecio());
            dbLaptop.setRam(laptop.getRam());
            dbLaptop.setCantUsb(laptop.getCantUsb());
            dbLaptop.setTamañoPantalla(laptop.getTamañoPantalla());
            listaLaptop.add(laptop);
            });
        
        listaEquip.addAll(listaDesktop);
        listaEquip.addAll(listaLaptop);
        
        return listaEquip;
    }
    //Si encuentra un cliente por rut, lo devuelve. Si no lo encuentra devuelve uno vacío;
    public Cliente buscarCliente(String rutIngresado){
        Cliente clienteSeleccionado = new Cliente();
        clientes.forEach(cliente -> {
            if (cliente.getRut().equals(rutIngresado)){
                clienteSeleccionado.setRut(cliente.getRut());
                clienteSeleccionado.setNombre(cliente.getNombre());
                clienteSeleccionado.setCorreo(cliente.getCorreo());
                clienteSeleccionado.setTelefono(cliente.getTelefono());
            }
        });
        return clienteSeleccionado;
    }

    
    
}
