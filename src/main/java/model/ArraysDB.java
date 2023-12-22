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
            conexion.agregar_cliente(cliente1);
            conexion.agregar_cliente(cliente2);
        }
        return conexion;
    }
    
    
    
    public void agregar_desktop(Desktop desktop) {
        equipos.add(desktop);
    }

    public void agregar_laptop(Laptop laptop) {
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
    
//    public List<Equipo> listar_equipos (){
//        List<Equipo> listaEqui = new ArrayList();
//        equipos.forEach(equipo -> {
//            Equipo dbEqui = new Equipo();
//            dbEqui.setCpu(equipo.getCpu());
//            dbEqui.setDiscoDuro(equipo.getDiscoDuro());
//            dbEqui.setDiscoDuro(equipo.getDiscoDuro());
//            dbCli.setNombre(cliente.getNombre());
//            dbCli.setCorreo(cliente.getCorreo());
//            dbCli.setTelefono(cliente.getTelefono());
//            listaCli.add(cliente);
//        });
//        
//        return listaCli;
//    }

    
    
}
