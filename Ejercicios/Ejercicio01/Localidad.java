public class Localidad {
    // Atributos
    private String nombre;
    private int capacidad;
    private int vendidos;
    private float precio;

    // Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setCapacidad(int capacidad)
    {
        this.capacidad = capacidad;
    }

    public void setVendidos(int vendidos)
    {
        this.vendidos = vendidos;
    }

    public void setPrecio(float precio)
    {
        this.precio = precio;
    }

    // Getters
    public String getNombre()
    {
        return this.nombre;
    }

    public int getCapacidad()
    {
        return this.capacidad;
    }

    public int getVendidos()
    {
        return this.vendidos;
    }

    public float getPrecio()
    {
        return this.precio;
    }

    // Constructor 
    public Localidad(String nombre, int capacidad, int vendidos, float precio)
    {
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.vendidos = vendidos;
        this.precio = precio;
    }

    // Adicionales
    public int disponibilidad() {
        return this.capacidad - this.vendidos;
    } 

    public int venderboletos(int cantidad) {
        int disp;
        disp = this.capacidad - this.vendidos;

        if(disp <= 0){
            System.out.println("Boletos Agotados");
        } 
        if (disp > 0){
            System.out.println("Boleto Vendido");
        }
        return this.capacidad - this.vendidos;
    } 
    
}
