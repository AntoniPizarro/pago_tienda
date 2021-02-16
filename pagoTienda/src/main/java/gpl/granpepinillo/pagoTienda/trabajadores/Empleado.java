package gpl.granpepinillo.trabajadores;

public class Empleado {

    private String codigo;
    private String nombre;
    private String appellidos;
    private String dni;
    private float tiempoRealizado;
    private float sueldo;
    private String sector;

    public Empleado(String codigo, String nombre, String appellidos, String dni, float sueldo, String sector) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.appellidos = appellidos;
        this.dni = dni;
        this.tiempoRealizado = 0f;
        this.sueldo = sueldo;
        this.sector = sector;
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

    public String getAppellidos() {
        return this.appellidos;
    }

    public void setAppellidos(String appellidos) {
        this.appellidos = appellidos;
    }

    public String getDni() {
        return this.dni;
    }

    public float getTiempoRealizado() {
        return this.tiempoRealizado;
    }

    public void setTiempoRealizado(float tiempoRealizado) {
        this.tiempoRealizado = tiempoRealizado;
    }

    public float getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }

    public String getSector() {
        return this.sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }


    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            ", appellidos='" + getAppellidos() + "'" +
            ", dni='" + getDni() + "'" +
            ", tiempoRealizado='" + getTiempoRealizado() + "'" +
            ", sueldo='" + getSueldo() + "'" +
            ", sector='" + getSector() + "'" +
            "}";
    }
    

}