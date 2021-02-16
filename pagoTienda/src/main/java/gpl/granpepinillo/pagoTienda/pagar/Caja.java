package gpl.granpepinillo.pagoTienda.pagar;

import gpl.granpepinillo.pagoTienda.productos.Producto;
import gpl.granpepinillo.pagoTienda.trabajadores.Empleado;
import java.util.List;
import java.util.ArrayList;

public class Caja {

    private List<Producto> productos = new ArrayList<>();
    private Empleado empleado;

    public List<Producto> getProductos() {
        return this.productos;
    }

    public Empleado getEmpleado() {
        return this.empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public Caja() {

    }
    
    public Caja(Empleado empleado) {
        this.empleado = empleado;
    }

    public void añadirProducto(Producto nuevoProducto) {
        this.productos.add(nuevoProducto);
    }

    public void añadirProducto(Producto nuevoProducto, int cantidad) {
        for( int i = 0; i < cantidad; i++) {
            añadirProducto(nuevoProducto);
        }
    }

    public void eliminarProducto(String codigo) {
        for(Producto producto : productos) {
            if (producto.getCodigo().equals(codigo)) {
                productos.remove(producto);
                break;
            }
        }
    }

    public void eliminarProducto(String codigo, int Cantidad) {
        for ( int i = 0; i < Cantidad; i++) {
            eliminarProducto(codigo);
        }
    }

    public void infoEmpleado(){
        System.out.println(this.empleado.toString());
    }

    public void quitarEmpleado() {
        empleado = null;
    }
    
    public int numProducto(Producto producto) {
        int cantidad = 0;
        for (Producto prod : productos) {
            if(prod == producto) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public int numProducto(String codigo) {
        int cantidad = 0;
        for (Producto producto : productos) {
            if(producto.getCodigo() == codigo) {
                cantidad++;
            }
        }
        return cantidad;
    }

    public boolean productoRepetido(Producto producto) {
        for (Producto prod : productos) {
            if(prod.equals(producto)) {
                return true;
            }
        }
        return false;
    }

    public void subtotal() {//Falta completar
        float total = 0;
        int cantidad = 0;
        System.out.println("Producto" + "\t" + "Cantidad" + "\t" + "Precio");
        for(Producto producto : productos) {
            total += producto.getPrecio();
            cantidad = numProducto(producto);
            if(!productoRepetido(producto)) {
                System.out.println(producto.getNombre() + "\t" + numProducto(producto) + "\t" + producto.getPrecio() * numProducto(producto));
            }
        }
        System.out.println("Total\t\t" + String.format("%.02f", total));
        if(this.empleado != null) {
            System.out.println("");
            System.out.println("Le atendió " + this.empleado.getNombre());
        }
    }
}