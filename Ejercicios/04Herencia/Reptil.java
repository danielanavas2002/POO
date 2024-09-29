/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Reptil 
 * La clase Reptil representa un reptil en el zoológico.
 * Esta clase hereda de la clase Animal y agrega atributos y métodos específicos
 * relacionados con los reptiles.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

public class Reptil extends Animal {
    private float temperaturaCorporal; // Temperatura corporal del reptil
    private int promedioHuevos;         // Promedio de huevos que pone el reptil
    protected float peso;               // Peso del reptil
    private boolean enPeligroExtincion; // Indica si el reptil está en peligro de extinción
    private String dieta;               // Dieta del reptil
    protected String tamaño;            // Tamaño del reptil
    protected float longitud;           // Longitud del reptil
    protected float areaMinima;        // Área mínima requerida para el reptil

    /**
     * Constructor de la clase Reptil.
     *
     * @param nombreCientifico nombre científico del reptil
     * @param descripcionHabitat descripción del hábitat del reptil
     * @param esperanzaVida esperanza de vida del reptil en años
     * @param temperaturaCorporal temperatura corporal del reptil
     * @param promedioHuevos promedio de huevos que pone el reptil
     * @param peso peso del reptil
     * @param enPeligroExtincion indica si el reptil está en peligro de extinción
     * @param dieta dieta del reptil
     * @param longitud longitud del reptil
     */
    public Reptil(String nombreCientifico, String descripcionHabitat, int esperanzaVida, float temperaturaCorporal, int promedioHuevos, float peso, boolean enPeligroExtincion, String dieta, float longitud) {
        // Llamar al constructor de la clase padre Animal
        super(nombreCientifico, descripcionHabitat, esperanzaVida);

        // Inicializar atributos específicos de Reptil
        this.temperaturaCorporal = temperaturaCorporal;
        this.promedioHuevos = promedioHuevos;
        this.peso = peso;
        this.enPeligroExtincion = enPeligroExtincion;
        this.dieta = dieta;
        this.longitud = longitud;
    }

    // Getters y Setters para los atributos específicos de Reptil

    /**
     * Obtiene la temperatura corporal del reptil.
     *
     * @return la temperatura corporal
     */
    public float getTemperaturaCorporal() {
        return temperaturaCorporal; // Devuelve la temperatura corporal
    }

    /**
     * Establece la temperatura corporal del reptil.
     *
     * @param temperaturaCorporal la nueva temperatura corporal
     */
    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal; // Establece la temperatura corporal
    }

    /**
     * Obtiene el promedio de huevos que pone el reptil.
     *
     * @return el promedio de huevos
     */
    public int getPromedioHuevos() {
        return promedioHuevos; // Devuelve el promedio de huevos
    }

    /**
     * Establece el promedio de huevos que pone el reptil.
     *
     * @param promedioHuevos el nuevo promedio de huevos
     */
    public void setPromedioHuevos(int promedioHuevos) {
        this.promedioHuevos = promedioHuevos; // Establece el promedio de huevos
    }

    /**
     * Obtiene el peso del reptil.
     *
     * @return el peso
     */
    public float getPeso() {
        return peso; // Devuelve el peso
    }

    /**
     * Establece el peso del reptil.
     *
     * @param peso el nuevo peso
     */
    public void setPeso(float peso) {
        this.peso = peso; // Establece el peso
    }

    /**
     * Verifica si el reptil está en peligro de extinción.
     *
     * @return true si está en peligro de extinción, false de lo contrario
     */
    public boolean isEnPeligroExtincion() {
        return enPeligroExtincion; // Devuelve si el reptil está en peligro de extinción
    }

    /**
     * Establece el estado de peligro de extinción del reptil.
     *
     * @param enPeligroExtincion el nuevo estado de peligro de extinción
     */
    public void setEnPeligroExtincion(boolean enPeligroExtincion) {
        this.enPeligroExtincion = enPeligroExtincion; // Establece el estado de peligro de extinción
    }

    /**
     * Obtiene la dieta del reptil.
     *
     * @return la dieta
     */
    public String getDieta() {
        return dieta; // Devuelve la dieta
    }

    /**
     * Establece la dieta del reptil.
     *
     * @param dieta la nueva dieta
     */
    public void setDieta(String dieta) {
        this.dieta = dieta; // Establece la dieta
    }

    /**
     * Obtiene el tamaño del reptil.
     *
     * @return el tamaño
     */
    public String getTamaño() {
        return tamaño; // Devuelve el tamaño
    }

    /**
     * Establece el tamaño del reptil.
     *
     * @param tamaño el nuevo tamaño
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño; // Establece el tamaño
    }

    /**
     * Obtiene la longitud del reptil.
     *
     * @return la longitud
     */
    public float getLongitud() {
        return longitud; // Devuelve la longitud
    }

    /**
     * Establece la longitud del reptil.
     *
     * @param longitud la nueva longitud
     */
    public void setLongitud(float longitud) {
        this.longitud = longitud; // Establece la longitud
    }

    /**
     * Obtiene el área mínima requerida para el reptil.
     *
     * @return el área mínima
     */
    public float getAreaMinima() {
        return areaMinima; // Devuelve el área mínima
    }

    /**
     * Establece el área mínima requerida para el reptil.
     *
     * @param areaMinima la nueva área mínima
     */
    public void setAreaMinima(float areaMinima) {
        this.areaMinima = areaMinima; // Establece el área mínima
    }
}
