package gpl.granpepinillo.pagoTienda;

import gpl.granpepinillo.pagoTienda.pagar.*;
import gpl.granpepinillo.pagoTienda.trabajadores.*;
import gpl.granpepinillo.pagoTienda.productos.*;

public class PagoTienda {
    
    public static void main(String[] args) {
        /*
        Montamos una tienda con una caja
        y le asignamos un empleado
        */
        Empleado empleado1 = new Empleado("ES00000001", "Roberto", "Llinàs Cairmay", "45186457j", 1600.03f, "Caja");
        Caja caja1 = new Caja(empleado1);

        /*
        El cliente quiere comprar 3 productos:
        un gel de baño, una caja de piezas de lego
        y una bolsa de plátanos
        */
        Producto producto1 = new Producto("Gel de baño", "8934K65HJ", 2.76f, "Higiene personal", "Garnier");
        Producto producto2 = new Producto("Caja de lego", "ghjn4w56j", 29.99f, "Juguetes", "Lego");
        Producto producto3 = new Producto("Plátano", "6j7iqghj8", 1.34f, "Fruta", "El Frutero");
        Producto producto4 = new Producto("Plátano", "6j7iqghj8", 1.34f, "Fruta", "El Frutero");
        caja1.añadirProducto(producto1);
        caja1.añadirProducto(producto2);
        caja1.añadirProducto(producto3);
        caja1.añadirProducto(producto4);
        /*
        El cliente decide no comprar el gel de baño
        */
        caja1.eliminarProducto("8934K65HJ");
        /*
        Los plátanos tienen un descuento del 20%
        */
        
        /*
        El cliente quiere realizar la compra
        */
        caja1.subtotal();
    }

}
