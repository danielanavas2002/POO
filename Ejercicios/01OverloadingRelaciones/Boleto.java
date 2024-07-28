/**
 * Universidad del Valle de Guatemala
 * CC2008 - Programación Orientada a Objetos
 * Sección 50
 * Fecha de Creacion: 27 de Julio de 2024
 * Ultima Modificacion: 28 de Julio de 2024
 * @author Daniela_Navas
 * 
 * Descripcion: Clase que permite generar y manipular diferentes boletos para
 * el concierto
 */

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

    public Boleto(String numero, float precio, Localidad localidad)
    {
        /* 
         * Constructor
         * @param numero      Numero generado de boleto con fecha y numero (AAAAmmdd#)
         * @param precio      Precio total del boleto
         * @param localidad   Localidad a la que pertenece el boleto
         */
        this.numero = numero;
        this.precio = precio;
        this.localidad = localidad;
    }
    
}
