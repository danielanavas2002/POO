/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Reptil 
 * Clase abstracta que representa un reptil, que hereda de la clase Animal.
 * Contiene atributos y métodos específicos para reptiles.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public abstract class Reptil extends Animal {
    protected float temperaturaCorporal;   // Temperatura corporal del reptil
    protected int promedioHuevos;           // Promedio de huevos que pone el reptil
    protected float peso;                   // Peso del reptil
    protected boolean enPeligroExtincion;   // Indica si el reptil está en peligro de extinción
    protected String dieta;                 // Dieta del reptil
    protected String tamaño;                // Tamaño del reptil
    protected float longitud;               // Longitud del reptil
    protected float areaMinima;             // Área mínima requerida para el reptil

    /**
     * Constructor de la clase Reptil.
     *
     * @param nombreCientifico Nombre científico del reptil
     * @param descripcionHabitat Descripción del hábitat del reptil
     * @param esperanzaVida Esperanza de vida del reptil
     * @param temperaturaCorporal Temperatura corporal del reptil
     * @param promedioHuevos Promedio de huevos que pone el reptil
     * @param peso Peso del reptil
     * @param enPeligroExtincion Indica si el reptil está en peligro de extinción
     * @param dieta Dieta del reptil
     * @param longitud Longitud del reptil
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

    /**
     * Obtiene la temperatura corporal del reptil.
     *
     * @return Temperatura corporal del reptil
     */
    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    /**
     * Obtiene el promedio de huevos que pone el reptil.
     *
     * @return Promedio de huevos que pone el reptil
     */
    public int getPromedioHuevos() {
        return promedioHuevos;
    }

    /**
     * Obtiene el peso del reptil.
     *
     * @return Peso del reptil en kg
     */
    public float getPeso() {
        return peso;
    }

    /**
     * Indica si el reptil está en peligro de extinción.
     *
     * @return Verdadero si el reptil está en peligro de extinción, falso en caso contrario
     */
    public boolean getEnPeligroExtincion() {
        return enPeligroExtincion;
    }

    /**
     * Obtiene la dieta del reptil.
     *
     * @return Dieta del reptil
     */
    public String getDieta() {
        return dieta;
    }

    /**
     * Obtiene el tamaño del reptil.
     *
     * @return Tamaño del reptil
     */
    public String getTamaño() {
        return tamaño;
    }

    /**
     * Obtiene la longitud del reptil.
     *
     * @return Longitud del reptil en metros
     */
    float getLongitud() {
        return longitud;
    }

    /**
     * Obtiene el área mínima requerida para el reptil.
     *
     * @return Área mínima en m²
     */
    public float getAreaMinima() {
        return areaMinima;
    }

    /**
     * Establece la temperatura corporal del reptil.
     *
     * @param temperaturaCorporal Nueva temperatura corporal del reptil
     */
    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    /**
     * Establece el promedio de huevos que pone el reptil.
     *
     * @param promedioHuevos Nuevo promedio de huevos que pone el reptil
     */
    public void setPromedioHuevos(int promedioHuevos) {
        this.promedioHuevos = promedioHuevos;
    }

    /**
     * Establece el peso del reptil.
     *
     * @param peso Nuevo peso del reptil en kg
     */
    public void setPeso(float peso) {
        this.peso = peso;
    }

    /**
     * Establece si el reptil está en peligro de extinción.
     *
     * @param enPeligroExtincion Estado de peligro de extinción del reptil
     */
    public void setEnPeligroExtincion(boolean enPeligroExtincion) {
        this.enPeligroExtincion = enPeligroExtincion;
    }

    /**
     * Establece la dieta del reptil.
     *
     * @param dieta Nueva dieta del reptil
     */
    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    /**
     * Establece el tamaño del reptil.
     *
     * @param tamaño Nuevo tamaño del reptil
     */
    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    /**
     * Establece la longitud del reptil.
     *
     * @param longitud Nueva longitud del reptil en metros
     */
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    /**
     * Establece el área mínima requerida para el reptil.
     *
     * @param areaMinima Nueva área mínima en m²
     */
    public void setAreaMinima(float areaMinima) {
        this.areaMinima = areaMinima;
    }
}
