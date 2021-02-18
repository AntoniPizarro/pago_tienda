package gpl.granpepinillo.pagoTienda;

import gpl.granpepinillo.pagoTienda.pagar.*;
import gpl.granpepinillo.pagoTienda.trabajadores.*;
import gpl.granpepinillo.pagoTienda.productos.*;

import java.util.List;
import java.util.ArrayList;

public class PagoTienda {
    
    public static void main(String[] args) {
        /*
        Montamos una tienda con una caja
        y le asignamos un empleado
        */
        Empleado empleado1 = new Empleado("ES00000001", "Roberto", "Llinàs Cairmay", "45186457j", 1600.03f, "Caja");
        Caja caja1 = new Caja(empleado1);

        /*
        Recibimos los productos de los proveedores y
        los guardamos en nuestro inventario
        */
        String codigoPlatano = "rxct877l";
        String codigoCajaLego = "0v45s81z";
        String codigoGel = "w1zcarw5";
        String codigoCuaderno = "jwjlsuzf";
        String codigoNaranja = "gitnfpvn";
        String codigoZumo = "izaafsex";
        String codigoPantalla = "fvc7ztgp";
        String codigoOrdenador = "pzmeh59c";
        String codigoPollo = "94su9fdo";
        List<Producto> inventario = new ArrayList<Producto>();
        inventario.add(new Producto("Gel de baño", codigoGel, 2.76f, "Higiene personal", "Garnier"));
        inventario.add(new Producto("Caja de lego", codigoCajaLego, 29.99f, "Juguetes", "Lego"));
        inventario.add(new Producto("Cuaderno escolar", codigoCuaderno, 1.75f, "Papelería", "Oxford"));
        inventario.add(new Producto("Plátano", codigoPlatano, 1.34f, "Fruta", "El Frutero"));
        inventario.add(new Producto("Zumo de melocotón", codigoZumo, 2.02f, "Bebida", "El Frutero"));
        inventario.add(new Producto("Pantalla 35'", codigoPantalla, 224.99f, "Electrónica", "Samsung"));
        inventario.add(new Producto("Ordenador de sobremesa", codigoOrdenador, 860f, "Electrónica", "HP"));
        inventario.add(new Producto("Pollo de granja", codigoPollo, 11.50f, "Carne", "Montés"));
        inventario.add(new Producto("Naranja", codigoNaranja, 1.34f, "Fruta", "El Frutero"));

        /*
        El cliente quiere comprar 17 productos:
            ·Gel de baño
            ·Caja de piezas de Lego
            ·Cuaderno escolar
            ·Plátano x2
            ·Zumo de melocotón x6
            ·Pantalla 35'
            ·Ordenador de sobremesa
            ·Pollo de granja
            ·Naranja x3
        */
        Producto gel1 = inventario.get(0);
        Producto lego1 = inventario.get(1);
        Producto cuaderno1 = inventario.get(2);
        Producto platano1 = inventario.get(3);
        Producto platano2 = inventario.get(3);
        Producto zumo1 = inventario.get(4);
        Producto zumo2 = inventario.get(4);
        Producto zumo3 = inventario.get(4);
        Producto zumo4 = inventario.get(4);
        Producto zumo5 = inventario.get(4);
        Producto zumo6 = inventario.get(4);
        Producto pantalla1 = inventario.get(5);
        Producto ordenador1 = inventario.get(6);
        Producto pollo1 = inventario.get(7);
        Producto naranja1 = inventario.get(8);
        Producto naranja2 = inventario.get(8);
        Producto naranja3 = inventario.get(8);
        caja1.añadirProducto(gel1);
        caja1.añadirProducto(lego1);
        caja1.añadirProducto(cuaderno1);
        caja1.añadirProducto(platano1);
        caja1.añadirProducto(platano2);
        caja1.añadirProducto(zumo1);
        caja1.añadirProducto(zumo2);
        caja1.añadirProducto(zumo3);
        caja1.añadirProducto(zumo4);
        caja1.añadirProducto(zumo5);
        caja1.añadirProducto(zumo6);
        caja1.añadirProducto(pantalla1);
        caja1.añadirProducto(ordenador1);
        caja1.añadirProducto(pollo1);
        caja1.añadirProducto(naranja1);
        caja1.añadirProducto(naranja2);
        caja1.añadirProducto(naranja3);

        /*
        El cliente decide no comprar el gel de baño
        */
        caja1.eliminarProducto(codigoGel);
        
        /*
        Los plátanos tienen un descuento del 20%
        */
        for (Producto producto : caja1.getProducto(codigoPlatano)) {
            producto.aplicarDescuento(20);
        }
        
        /*
        El cliente quiere realizar la compra
        */
        caja1.subtotal();
    }

}
