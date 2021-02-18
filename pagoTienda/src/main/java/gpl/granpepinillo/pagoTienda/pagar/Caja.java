package gpl.granpepinillo.pagoTienda.pagar;

import gpl.granpepinillo.pagoTienda.productos.Producto;
import gpl.granpepinillo.pagoTienda.trabajadores.Empleado;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

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

    public boolean productoRepetido(Producto producto, List<Producto> lista) {
        for (Producto prod : lista) {
            if(prod.getCodigo() == producto.getCodigo()) {
                return true;
            }
        }
        return false;
    }

    public List<String> nombreProductos(List<Producto> productos) {
        List<String> nombres = new ArrayList<String>();
        for (Producto producto : productos) {
            nombres.add(producto.getNombre());
        }
        return nombres;
    }

    public void subtotal() {//Falta completar
        List<Producto> listaTicket = new ArrayList<>();
        for (Producto producto : productos) {
            if (!productoRepetido(producto, listaTicket)) {
                listaTicket.add(producto);
            }
        }

        for (Producto producto : listaTicket) {
            System.out.println("Artículo: " + producto.getNombre() + " - Cantidad: " + numProducto(producto.getCodigo()) + " - Precio: " + numProducto(producto) * producto.getPrecio() + "€");
        }
        System.out.println("");
        System.out.println("");
        if(empleado != null) {
            System.out.println("Le atendió: " + empleado.getNombre());
        }
    }
}