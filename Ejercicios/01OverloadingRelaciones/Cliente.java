/**
 * Universidad del Valle de Guatemala
 * CC2008 - Programación Orientada a Objetos
 * Sección 50
 * Fecha de Creacion: 27 de Julio de 2024
 * Ultima Modificacion: 28 de Julio de 2024
 * @author Daniela_Navas
 * 
 * Descripcion: Clase que permite generar y manipular diferentes clientes para
 * el concierto
 */

public class Cliente {
    // Atributos
    private String nombre; 
    private String email;
    private int cantidad;
    private float presupuesto;
    private Boleto boleto;
    private Localidad localidad;

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

    public void setBoleto(Boleto boleto)
    {
        this.boleto = boleto;
    }

    public void setLocalidad(Localidad localidad)
    {
        this.localidad = localidad;
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

    public Boleto getBoleto()
    {
        return this.boleto;
    }

    public Localidad getlocalidad()
    {
        return this.localidad;
    }

    // Constructor
    public Cliente(String nombre, String email, int cantidad, float presupuesto)
    {
        /* 
         * Constructor
         * @param nombre       Nombre del Cliente o Comprador
         * @param email        Email del Cliente o Comprador
         * @param cantidad     Cantidad de Boletos que Adquiere
         * @param presupuesto  Presupuesto maximo de compra 
         */
        this.nombre = nombre;
        this.email = email;
        this.cantidad = cantidad;
        this.presupuesto = presupuesto; 
    }
}
