public class Ubicacion {
    private String nombreUbicacion;
    private String direccion;

    public Ubicacion(String nombreUbicacion, String direccion) {
        this.nombreUbicacion = nombreUbicacion;
        this.direccion = direccion;
    }

    public String getNombreUbicacion() 
    { 
        return nombreUbicacion; 
    }

    public String getDireccion() 
    { 
        return direccion; 
    }
}
