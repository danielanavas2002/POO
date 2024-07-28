/**
 * Universidad del Valle de Guatemala
 * CC2008 - Programación Orientada a Objetos
 * Sección 50
 * Fecha de Creacion: 27 de Julio de 2024
 * Ultima Modificacion: 28 de Julio de 2024
 * @author Daniela_Navas
 * 
 * Descripcion: Clase que permite generar y manipular diferentes localidades para
 * el concierto
 */
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
 
    public Localidad(String nombre, int capacidad, int vendidos, float precio)
    {
        /* 
         * Constructor
         * @param nombre      Nombre de la localidad
         * @param capacidad   Capacidad máxima por localidad
         * @param vendidos    Numero de asientos vendidos en esa localidad
         * @param precio      Precio de entradas para esa localidad
         */
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.vendidos = vendidos;
        this.precio = precio;
    }

    
    public int Disponibilidad()
    {
        /*
        * @return Devuelve la disponibilidad basado en la diferencia entre capacidad y vendidos  
        */
        return this.capacidad - this.vendidos;
    }
}
