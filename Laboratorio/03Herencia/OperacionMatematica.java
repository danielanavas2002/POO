/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase OperacionMatematica
 * Clase abstracta que representa una operación matemática general.
 * Esta clase proporciona los atributos y métodos básicos para las operaciones 
 * que se realizarán con matrices, incluyendo la gestión del estado y dimensiones.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

public abstract class OperacionMatematica {
    /** 
     * Identificador único para la operación matemática. 
     */
    protected int id;      

    /** 
     * Número de filas de la operación matemática. 
     */
    protected int filas;     

    /** 
     * Número de columnas de la operación matemática. 
     */
    protected int columnas;             

    /** 
     * Estado de la operación matemática (ej. "Resuelto", "Pendiente"). 
     */
    protected String estado;                        

    /** 
     * Contador estático para asignar IDs únicos a cada instancia de la clase. 
     */
    private static int contadorid = 1;      

    /**
     * Constructor para crear una operación matemática con filas, columnas y estado.
     *
     * @param filas número de filas de la operación
     * @param columnas número de columnas de la operación
     * @param estado estado inicial de la operación
     */
    public OperacionMatematica(int filas, int columnas, String estado) {
        this.id = contadorid; // Asigna el ID actual del contador
        contadorid++; // Incrementa el contador para la próxima instancia
        this.filas = filas; // Asigna el número de filas
        this.columnas = columnas; // Asigna el número de columnas
        this.estado = estado; // Asigna el estado inicial
    }

    /**
     * Obtiene el ID de la operación matemática.
     *
     * @return el ID de la operación
     */
    public int getID() {
        return this.id; // Retorna el ID
    }

    /**
     * Obtiene el número de filas de la operación matemática.
     *
     * @return el número de filas
     */
    public int getFilas() {
        return this.filas; // Retorna el número de filas
    }

    /**
     * Obtiene el número de columnas de la operación matemática.
     *
     * @return el número de columnas
     */
    public int getColumnas() {
        return this.columnas; // Retorna el número de columnas
    }

    /**
     * Obtiene el estado de la operación matemática.
     *
     * @return el estado de la operación
     */
    public String getEstado() {
        return this.estado; // Retorna el estado
    }

    /**
     * Establece el ID de la operación matemática.
     *
     * @param id nuevo ID de la operación
     */
    public void setID(int id) {
        this.id = contadorid++; // Asigna un nuevo ID usando el contador
    }

    /**
     * Establece el número de filas de la operación matemática.
     *
     * @param filas nuevo número de filas
     */
    public void setFilas(int filas) {
        this.filas = filas; // Asigna el nuevo número de filas
    }

    /**
     * Establece el número de columnas de la operación matemática.
     *
     * @param columnas nuevo número de columnas
     */
    public void setColumnas(int columnas) {
        this.columnas = columnas; // Asigna el nuevo número de columnas
    }

    /**
     * Establece el estado de la operación matemática.
     *
     * @param estado nuevo estado de la operación
     */
    public void setEstado(String estado) {
        this.estado = estado; // Asigna el nuevo estado
    }

    /**
     * Método abstracto que debe ser implementado por las subclases para realizar 
     * el cálculo correspondiente.
     */
    public abstract void calcular();
}
