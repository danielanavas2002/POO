/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase SistemaEcuaciones
 * Clase que representa un sistema de ecuaciones, extendiendo la clase base OperacionMatematica.
 * Esta clase permite resolver un sistema de ecuaciones y almacenar información relacionada.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

public class SistemaEcuaciones extends OperacionMatematica {
    /** 
     * Número de incógnitas en el sistema de ecuaciones. 
     */
    private int incognitas;

    /** 
     * Método utilizado para resolver el sistema de ecuaciones. 
     */
    private String metodoResolucion;

    /**
     * Constructor para crear un sistema de ecuaciones.
     *
     * @param filas número de filas (incógnitas) del sistema
     * @param columnas número de columnas (ecuaciones) del sistema
     * @param estado estado inicial del sistema
     * @param metodoResolucion método que se utilizará para resolver el sistema
     */
    public SistemaEcuaciones(int filas, int columnas, String estado, String metodoResolucion) {
        super(filas, columnas, estado); // Llama al constructor de la clase base OperacionMatematica
        this.metodoResolucion = metodoResolucion; // Asigna el método de resolución
    }

    /**
     * Obtiene el número de incógnitas en el sistema de ecuaciones.
     *
     * @return número de incógnitas
     */
    public int getIncognitas() {
        return this.incognitas; // Retorna el número de incógnitas
    }

    /**
     * Obtiene el método de resolución del sistema de ecuaciones.
     *
     * @return el método de resolución
     */
    public String getMetodoResolucion() {
        return this.metodoResolucion; // Retorna el método de resolución
    }

    /**
     * Establece el número de incógnitas en el sistema de ecuaciones.
     *
     * @param incognitas nuevo número de incógnitas
     */
    public void setIncognitas(int incognitas) {
        this.incognitas = incognitas; // Asigna el nuevo número de incógnitas
    }

    /**
     * Establece el método de resolución del sistema de ecuaciones.
     *
     * @param metodoResolucion nuevo método de resolución
     */
    public void setMetodoResolucion(String metodoResolucion) {
        this.metodoResolucion = metodoResolucion; // Asigna el nuevo método de resolución
    }

    /**
     * Realiza el cálculo del sistema de ecuaciones.
     * Asigna el número de filas como el número de incógnitas y cambia el estado a "Resuelto".
     */
    @Override
    public void calcular() {
        this.incognitas = filas; // Asigna el número de incógnitas igual al número de filas
        this.estado = "Resuelto"; // Cambia el estado a "Resuelto"
    }

    /**
     * Devuelve una representación en cadena del sistema de ecuaciones.
     *
     * @return cadena con la información del sistema
     */
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------------------------------------\n" +
               "Sistema de Ecuaciones #" + this.getID() + ": \n" +
               "Numero de Incognitas: " + this.getFilas() + ", " +
               "Numero de Ecuaciones: " + this.getColumnas() + ", " +
               "Estado: " + this.getEstado() + ", " +
               "Metodo de Resolución: " + this.getMetodoResolucion() + " \n" +
               "------------------------------------------------------------------------------------------------------------------\n";
        // Formatea la información del sistema en una cadena legible
    }
}
