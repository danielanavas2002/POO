public class Boleto {
    // Atributos
    private String numero;
    private float precio;
    private Localidad localidad;

    // Setters
    public void setNombre(String numero)
    {
        this.numero = numero;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    public void setLocalidad(Localidad localidad)
    {
        this.localidad = localidad;
    }

    // Getters

    public String getNumero()
    {
        return this.numero;
    }

    public float getPrecio()
    {
        return this.precio;
    }

    public Localidad getLocalidad()
    {
        return this.localidad;
    }

    // Constructor
    public Boleto(String numero, float precio, Localidad localidad){
        this.numero = numero;
        this.precio = precio;
        this.localidad = localidad;

    }
    
}
