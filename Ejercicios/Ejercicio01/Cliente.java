public class Cliente {
    // Atributos
    private String nombre; 
    private String email;
    private int cantidad;
    private float presupuesto;

    // Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public void setPresupuesto(float presupuesto)
    {
        this.presupuesto = presupuesto;
    }

    // Getters
    public String getNombre()
    {
        return this.nombre;
    }

    public String getEmail()
    {
        return this.email;
    }

    public int getCantidad()
    {
        return this.cantidad;
    }

    public float getPresupuesto()
    {
        return this.presupuesto;
    }

    // Constructor
    public Cliente(String nombre, String email, int cantidad, float presupuesto){
        this.nombre = nombre;
        this.email = email;
        this.cantidad = cantidad;
        this.presupuesto = presupuesto; 
    }

    // Adicionales
    
}
