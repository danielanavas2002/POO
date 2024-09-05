/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA 
 * SEGUNDO SEMESTRE 2024 
 * PROGRAMACIÓN ORIENTADA A OBJETOS 
 * 
 * Clase Contenedor
 * 
 * Esta clase representa un contenedor que se almacena en el puerto. Cada contenedor 
 * tiene un identificador único, un número de referencia, un nombre de producto, un destino y un peso.
 * 
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024 
 * Última modificación: 5/09/2024
 */
public class Contenedor {

    /** 
     * Identificador único del contenedor.
     */
    private int id;

    /** 
     * Peso del contenedor en kilogramos.
     */
    private int peso;

    /** 
     * Número de referencia del contenedor.
     */
    private String numero;

    /** 
     * Nombre del producto almacenado en el contenedor.
     */
    private String nombreProducto;

    /** 
     * Destino final del contenedor.
     */
    private String destino;

    /**
     * Constructor de la clase Contenedor. Inicializa un contenedor con los atributos 
     * proporcionados como identificador, número de referencia, nombre del producto, destino y peso.
     * 
     * @param id Identificador único del contenedor.
     * @param numero Número de referencia del contenedor.
     * @param nombreProducto Nombre del producto almacenado en el contenedor.
     * @param destino Destino final del contenedor.
     * @param peso Peso del contenedor.
     */
    public Contenedor(int id, String numero, String nombreProducto, String destino, int peso){
        this.id = id;
        this.numero = numero;
        this.nombreProducto = nombreProducto;
        this.destino = destino;
        this.peso = peso;
    }

    /**
     * Obtiene el identificador único del contenedor.
     * 
     * @return El ID del contenedor.
     */
    public int getID(){
        return this.id;
    }

    /**
     * Obtiene el número de referencia del contenedor.
     * 
     * @return El número del contenedor.
     */
    public String getNumero(){
        return this.numero;
    }

    /**
     * Obtiene el nombre del producto almacenado en el contenedor.
     * 
     * @return El nombre del producto.
     */
    public String getNombreProducto(){
        return this.nombreProducto;
    }

    /**
     * Obtiene el destino final del contenedor.
     * 
     * @return El destino del contenedor.
     */
    public String getDestino(){
        return this.destino;
    }

    /**
     * Obtiene el peso del contenedor.
     * 
     * @return El peso del contenedor en kilogramos.
     */
    public int getPeso(){
        return this.peso;
    }   
}
