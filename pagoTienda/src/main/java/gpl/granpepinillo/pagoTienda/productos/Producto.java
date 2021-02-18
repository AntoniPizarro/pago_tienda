package gpl.granpepinillo.pagoTienda.productos;

public class Producto {

    private String nombre;
    private Float precio;
    private String codigo;
    private String categoria;
    private String marca;

    public Producto(String nombre, String codigo, float precio, String categoria, String marca) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.categoria = categoria;
        this.marca = marca;
    }

    public Producto(String nombre, String codigo, float precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
    }
    
    public Producto(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }
    
    public String getCodigo() {
        return this.codigo;
    }

    public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getPrecio() {
		return this.precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

    public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

    public void aplicarDescuento(float descuento) {
        this.precio -= this.precio * ( descuento / 100 );
    }

    public void previsualizarDescuento(float descuento) {
        float prev = this.precio * ( descuento / 100 );
        System.out.println(prev);
    }

    @Override
    public String toString() {
        return " nombre='" + getNombre() + "'" + "\n" +
            ", precio='" + getPrecio() + "'" + "\n" +
            ", codigo='" + getCodigo() + "'" + "\n" +
            ", categoria='" + getCategoria() + "'" + "\n" +
            ", marca='" + getMarca() + "'";
    }

}