/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Abstracta Vehículo 
 * Contiene atributos y métodos comunes que son compartidos por todas las clases 
 * que extiendan de Vehículo.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

public abstract class Vehiculo {
    protected int id;                    // ID del Vehículo
    protected static int contadorID = 1; // Static para incrementar el ID de manera automática
    protected float tarifaBase;          // Tarifa Base en $
    protected boolean enAlquiler;        // Valor booleno que indica si esta en alquiler
    protected float ingresoMensual;      // Ingreso mensual que genera el vehículo

    /**
     * Constructor que inicializa un vehículo con la tarifa base, estado de alquiler 
     * e ingreso mensual.
     *
     * @param tarifaBase La tarifa base del vehículo.
     * @param enAlquiler Indica si el vehículo está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por el vehículo.
     */
    public Vehiculo(float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        this.id = contadorID++; // Asigna un ID único a cada vehículo
        this.tarifaBase = tarifaBase;
        this.enAlquiler = enAlquiler;
        this.ingresoMensual = ingresoMensual;
    }

    /**
     * Constructor que inicializa un vehículo con un ID específico, tarifa base, 
     * estado de alquiler e ingreso mensual. Se usa para la carga desde CSV
     *
     * @param id El ID único del vehículo.
     * @param tarifaBase La tarifa base del vehículo.
     * @param enAlquiler Indica si el vehículo está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por el vehículo.
     */
    public Vehiculo(int id, float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        this.id = id; 
        this.tarifaBase = tarifaBase;
        this.enAlquiler = enAlquiler;
        this.ingresoMensual = ingresoMensual;
    }

     /**
     * Obtiene el ID del vehículo.
     *
     * @return El ID único del vehículo.
     */
    public int getID() {
        return id;
    }

    /**
     * Obtiene el contador de ID actual.
     *
     * @return El valor actual del contador de ID.
     */
    public static int getContadorID() {
        return contadorID;
    }

    /**
     * Obtiene la tarifa base del vehículo.
     *
     * @return La tarifa base del vehículo.
     */
    public float getTarifaBase() {
        return tarifaBase;
    }

    /**
     * Verifica si el vehículo está en alquiler.
     *
     * @return true si el vehículo está en alquiler, false en caso contrario.
     */
    public boolean getEnAlquiler() {
        return enAlquiler;
    }

    /**
     * Obtiene el ingreso mensual del vehículo.
     *
     * @return El ingreso mensual generado por el vehículo.
     */
    public float getIngresoMensual() {
        return ingresoMensual;
    }
    
    /**
     * Establece el ID del vehículo.
     *
     * @param id El nuevo ID del vehículo.
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Establece la tarifa base del vehículo.
     *
     * @param tarifaBase La nueva tarifa base del vehículo.
     */
    public void setTarifaBase(float tarifaBase) {
        this.tarifaBase = tarifaBase;
    }

    /**
     * Establece el estado de alquiler del vehículo.
     *
     * @param enAlquiler true si el vehículo debe estar en alquiler, false en caso contrario.
     */
    public void setEnAlquiler(boolean enAlquiler) {
        this.enAlquiler = enAlquiler;
    }

    /**
     * Establece el ingreso mensual del vehículo.
     *
     * @param ingresoMensual El nuevo ingreso mensual generado por el vehículo.
     */
    public void setIngresoMensual(float ingresoMensual) {
        this.ingresoMensual = ingresoMensual;
    }

    /**
     * Establece un nuevo valor para el contador de ID.
     *
     * @param nuevoValor El nuevo valor para el contador de ID.
     */
    public static void setContadorID(int nuevoValor) {
        contadorID = nuevoValor;
    }

}

