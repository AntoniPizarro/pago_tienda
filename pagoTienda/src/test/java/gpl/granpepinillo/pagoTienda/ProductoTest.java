package gpl.granpepinillo.pagoTienda;

import org.junit.Test;
import static org.junit.Assert.*;
import gpl.granpepinillo.pagoTienda.productos.Producto;

public class ProductoTest {

    @Test
    public void getCodigoTest() {
        String codigo = "87JHK7892";
        Producto producto = new Producto("Manzana roja", codigo);
        assertEquals(codigo, producto.getCodigo());
    }

    @Test
    public void getNombreTest() {
      String nombre = "Manzana roja";
      Producto producto = new Producto(nombre, "hjgki905896rui");
      assertEquals(nombre, producto.getNombre());
	}

	@Test
    public void setNombreTest() {
      String nombre = "Manzana roja";
      Producto producto = new Producto(nombre, "hjgki905896rui");
      nombre = "Plátano";
      producto.setNombre(nombre);
      assertEquals(nombre, producto.getNombre());
	}

	@Test
    public void getPrecioTest() {
      float precio = 0.31f;
      Producto producto = new Producto("Plátano", "bnju908y9ui", precio, "Fruta", "El Frutero");
      assertEquals(precio, producto.getPrecio(), 0.01f);
	}

	@Test
    public void setPrecioTest() {
		float precio = 0.67f;
    Producto producto = new Producto("Mango", "cxfvgbn");
    producto.setPrecio(precio);
    assertEquals(precio, producto.getPrecio(), 0.01f);
	}

	@Test
    public void getCategoriaTest() {
      String categoria = "Fruta";
      Producto producto = new Producto("Mango", "cxfvgbn");
      producto.setCategoria(categoria);
      assertEquals(categoria, producto.getCategoria());
	}

	@Test
  public void setCategoriaTest() {
      String categoria = "Fruta";
      Producto producto = new Producto("Mango", "cxfvgbn");
      producto.setCategoria(categoria);
      assertEquals(categoria, producto.getCategoria());
	}

    @Test
    public void getMarcaTest() {
      String marca = "El Frutero";
      Producto producto = new Producto("Mango", "cxfvgbn");
      producto.setMarca(marca);
      assertEquals(marca, producto.getMarca());
	}

	@Test
  public void setMarcaTest() {
      String marca = "El Frutero";
      Producto producto = new Producto("Mango", "cxfvgbn");
      producto.setMarca(marca);
      assertEquals(marca, producto.getMarca());
	}

  @Test
  public void aplicarDescuentoTest() {
    float precio = 0.67f;
    float descuento = 30f;
    float res = precio - precio * ( descuento / 100 );
    Producto producto = new Producto("Mango", "cxfvgbn");
    producto.setPrecio(precio);
    producto.aplicarDescuento(descuento);
    assertEquals(res, producto.getPrecio(), 0.01f);
  }

}