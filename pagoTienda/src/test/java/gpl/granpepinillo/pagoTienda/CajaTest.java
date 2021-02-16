package gpl.granpepinillo.pagoTienda;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;

import java.util.List;

import gpl.granpepinillo.pagoTienda.productos.Producto;
import gpl.granpepinillo.pagoTienda.trabajadores.Empleado;
import gpl.granpepinillo.pagoTienda.pagar.Caja;

public class CajaTest {

    @Test
    public void añadirProductoTest() {
        List<Producto> productos = new ArrayList<>();
        Empleado empleado = new Empleado("vbnmjhuy", "Robin", "Walton Butowski", "123456789A", 795.4f, "Caja");
        Caja caja = new Caja(empleado);
        Producto producto = new Producto("Plátano", "uiyfghbjki");
        productos.add(producto);
        caja.añadirProducto(producto);
        assertEquals(productos, caja.getProductos());
    }

    @Test
    public void eliminarProductoTest() {
        //doble
        List<Producto> productos = new ArrayList<>();
        Caja caja = new Caja();
        String codigo1 = "uiyfghbjki";
        String codigo2 = "jkuytrdfvg";
        Producto producto1 = new Producto("Plátano", codigo1);
        Producto producto2 = new Producto("Naranja", codigo2);
        productos.add(producto1);
        productos.add(producto1);
        productos.add(producto1);
        productos.add(producto2);
        caja.añadirProducto(producto1);
        caja.añadirProducto(producto1);
        caja.añadirProducto(producto1);
        caja.añadirProducto(producto2);
        caja.eliminarProducto(codigo1, 2);
        productos.remove(producto1);
        productos.remove(producto1);
        assertEquals(productos, caja.getProductos());

        productos = new ArrayList<>();
        caja = new Caja();
        codigo1 = "ugbhytttrfgbh";
        codigo2 = "yukimrnebrthsjnet7i6";
        producto1 = new Producto("Pera", codigo1);
        producto2 = new Producto("Mango", codigo2);
        productos.add(producto1);
        productos.add(producto2);
        caja.añadirProducto(producto1);
        caja.añadirProducto(producto2);
        caja.eliminarProducto(codigo1);
        productos.remove(producto1);
        assertEquals(productos, caja.getProductos());
    }

    @Test
    public void quitarEmpleadoTest() {
        List<Producto> productos = new ArrayList<>();
        Empleado empleado = new Empleado("vbnmjhuy", "Robin", "Walton Butowski", "123456789A", 795.4f, "Caja");
        Caja caja = new Caja(empleado);
        caja.quitarEmpleado();
        assertEquals(null, caja.getEmpleado());
    }

    @Test
    public void numProductoTest() {
        //doble
        List<Producto> productos = new ArrayList<>();
        Caja caja = new Caja();
        Producto producto = new Producto("Mango", "jgyutfyghjbkuhiygu");
        int suma = 4;
        for(int i = 0; i < suma; i++) {
            caja.añadirProducto(producto);
            productos.add(producto);
        }
        assertEquals(suma, caja.numProducto(producto));
    }

    @Test
    public void productoRepetidoTest() {
        
    }
/*
    public void subtotalTest() {
        
    }
*/
}