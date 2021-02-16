package gpl.granpepinillo.pagoTienda;

import org.junit.Test;
import gpl.granpepinillo.pagoTienda.productos.Producto;

public class ProductoTest {

    @Test
    public void getCodigoTest() {
        String codigo = "87JHK7892";
        Producto producto = new Producto("Manzana roja", codigo);
        assertEqual(codigo, producto.getCodigo());
    }

    @Test
    public void getNombreTest() {
		return this.nombre;
	}

	@Test
    public void setNombreTest(String nombre) {
		this.nombre = nombre;
	}

	@Test
    public void getPrecioTest() {
		return this.precio;
	}

	@Test
    public void setPrecioTest(Float precio) {
		this.precio = precio;
	}

	@Test
    public void getCategoriaTest() {
		return this.categoria;
	}

	@Test
    public void setCategoriaTest(String categoria) {
		this.categoria = categoria;
	}

    @Test
    public void getMarcaTest() {
		return this.marca;
	}

	@Test
    public void setMarcaTest(String marca) {
		this.marca = marca;
	}

    @Test
    public void aplicarDescuentoTest(float descuento) {
        this.precio -= this.precio * ( descuento / 100 );
    }

    @Test
    public void previsualizarDescuentoTest(float descuento) {
        float prev = this.precio * ( descuento / 100 );
        System.out.println(prev);
    }

}