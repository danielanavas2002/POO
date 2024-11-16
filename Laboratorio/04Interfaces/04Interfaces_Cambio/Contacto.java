/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Contacto
 * Clase que representa un contacto en una agenda telefónica.
 * Un contacto tiene un nombre y un número telefónico.
 * 
 * @author Daniela Navas
 * Fecha de creación: 14/10/2024
 * Última modificación: 15/10/2024
 */

public class Contacto {
    // Atributos
    private String nombre; //Nombre del contacto.
    private String numero; // Número telefónico del contacto.

    /**
     * Constructor que inicializa un contacto con el nombre y número proporcionados.
     * 
     * @param nombre El nombre del contacto.
     * @param numero El número telefónico del contacto.
     */
    public Contacto(String nombre, String numero) {
        this.nombre = nombre;
        this.numero = numero;
    }

    /**
     * Obtiene el nombre del contacto.
     * 
     * @return El nombre del contacto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número telefónico del contacto.
     * 
     * @return El número telefónico del contacto.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Representa el contacto como una cadena en formato "nombre - número".
     * 
     * @return Una cadena representando el contacto, en el formato "nombre - número".
     */
    @Override
    public String toString() {
        return nombre + " - " + numero;
    }
}
