/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase ReptilAcuatico 
 * Clase abstracta que representa a un reptil acuático, hereda de la clase Reptil.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public abstract class ReptilAcuatico extends Reptil {
    protected String especie;
    protected String tipoAgua; 
    protected float velocidadNado; 
    protected float duracionBuceo; 

    /**
     * Constructor para la clase ReptilAcuatico.
     * 
     * @param nombreCientifico Nombre científico del reptil.
     * @param descripcionHabitat Descripción del hábitat.
     * @param esperanzaVida Esperanza de vida en años.
     * @param temperaturaCorporal Temperatura corporal en grados Celsius.
     * @param promedioHuevos Promedio de huevos que pone.
     * @param peso Peso del reptil en kilogramos.
     * @param enPeligroExtincion Indica si está en peligro de extinción.
     * @param dieta Dieta del reptil.
     * @param longitud Longitud en metros.
     * @param especie Especie del reptil acuático.
     * @param tipoAgua Tipo de agua (dulce, salada, etc.).
     * @param velocidadNado Velocidad de nado en metros por segundo.
     * @param duracionBuceo Duración del buceo en segundos.
     */
    public ReptilAcuatico(String nombreCientifico, String descripcionHabitat, int esperanzaVida, float temperaturaCorporal, 
                          int promedioHuevos, float peso, boolean enPeligroExtincion, String dieta, float longitud, 
                          String especie, String tipoAgua, float velocidadNado, float duracionBuceo) {
        // Llamada al constructor de Reptil (clase padre)
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud);
        
        // Atributos de ReptilAcuatico
        this.especie = especie;
        this.tipoAgua = tipoAgua;
        this.velocidadNado = velocidadNado;
        this.duracionBuceo = duracionBuceo;
    }

    /**
     * Obtiene la especie del reptil acuático.
     * 
     * @return La especie del reptil acuático.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Obtiene el tipo de agua en el que vive el reptil acuático.
     * 
     * @return El tipo de agua (dulce, salada, etc.).
     */
    public String getTipoAgua() {
        return tipoAgua;
    }

    /**
     * Obtiene la velocidad de nado del reptil acuático.
     * 
     * @return La velocidad de nado en metros por segundo.
     */
    public float getVelocidadNado() {
        return velocidadNado;
    }

    /**
     * Obtiene la duración del buceo del reptil acuático.
     * 
     * @return La duración del buceo en segundos.
     */
    public float getDuracionBuceo() {
        return duracionBuceo;
    }

    /**
     * Establece la especie del reptil acuático.
     * 
     * @param especie La especie del reptil acuático.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Establece el tipo de agua en el que vive el reptil acuático.
     * 
     * @param tipoAgua El tipo de agua (dulce, salada, etc.).
     */
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    /**
     * Establece la velocidad de nado del reptil acuático.
     * 
     * @param velocidadNado La velocidad de nado en metros por segundo.
     */
    public void setVelocidadNado(float velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    /**
     * Establece la duración del buceo del reptil acuático.
     * 
     * @param duracionBuceo La duración del buceo en segundos.
     */
    public void setDuracionBuceo(float duracionBuceo) {
        this.duracionBuceo = duracionBuceo;
    }
}
