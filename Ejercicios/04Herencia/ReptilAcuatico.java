/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase ReptilAcuatico
 * La clase ReptilAcuatico representa un reptil que vive en el agua.
 * Administra atributos específicos de los reptiles acuáticos y proporciona 
 * métodos para calcular su tamaño, espacio necesario en el recinto y 
 * costos asociados con su mantenimiento.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

 public class ReptilAcuatico extends Reptil {
    // Atributos específicos de la clase ReptilAcuatico
    private String especie;
    private String tipoAgua; // Agua dulce o salada
    private float velocidadNado; // En metros por segundo
    private float duracionBuceo; // En minutos
    private boolean esCaiman;

    /**
     * Constructor para inicializar un objeto ReptilAcuatico.
     * 
     * @param nombreCientifico Nombre científico del reptil
     * @param descripcionHabitat Descripción del hábitat del reptil
     * @param esperanzaVida Esperanza de vida del reptil
     * @param temperaturaCorporal Temperatura corporal del reptil
     * @param promedioHuevos Promedio de huevos que pone
     * @param peso Peso del reptil
     * @param enPeligroExtincion Indica si el reptil está en peligro de extinción
     * @param dieta Tipo de dieta del reptil
     * @param longitud Longitud del reptil
     * @param especie Especie del reptil
     * @param tipoAgua Tipo de agua (dulce o salada)
     * @param velocidadNado Velocidad de nado del reptil
     * @param duracionBuceo Duración de buceo del reptil
     * @param esCaiman Indica si es un caimán
     */
    public ReptilAcuatico(String nombreCientifico, String descripcionHabitat, int esperanzaVida, 
                          float temperaturaCorporal, int promedioHuevos, float peso, 
                          boolean enPeligroExtincion, String dieta, float longitud, 
                          String especie, String tipoAgua, float velocidadNado, 
                          float duracionBuceo, boolean esCaiman) {
        // Llamar al constructor de la clase padre Reptil
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, 
              promedioHuevos, peso, enPeligroExtincion, dieta, longitud);

        // Inicializar atributos específicos de ReptilAcuatico
        this.especie = especie;
        this.tipoAgua = tipoAgua;
        this.velocidadNado = velocidadNado;
        this.duracionBuceo = duracionBuceo;
        this.esCaiman = esCaiman;

        this.definirTamaño(longitud, esCaiman);
        this.calcularEspacioRecinto();
    }

    /**
     * Obtiene la especie del animal.
     *
     * @return una cadena que representa la especie del animal.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie del animal.
     *
     * @param especie una cadena que representa la especie del animal.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene el tipo de agua en el que vive el animal.
     *
     * @return una cadena que representa el tipo de agua (dulce, salada, etc.) del hábitat del animal.
     */
    public String getTipoAgua() {
        return tipoAgua;
    }

    /**
     * Establece el tipo de agua en el que vive el animal.
     *
     * @param tipoAgua una cadena que representa el tipo de agua (dulce, salada, etc.) del hábitat del animal.
     */
    public void setTipoAgua(String tipoAgua) {
        this.tipoAgua = tipoAgua;
    }

    /**
     * Obtiene la velocidad de nado del animal.
     *
     * @return un valor flotante que representa la velocidad de nado del animal en metros por segundo.
     */
    public float getVelocidadNado() {
        return velocidadNado;
    }

    /**
     * Establece la velocidad de nado del animal.
     *
     * @param velocidadNado un valor flotante que representa la velocidad de nado del animal en metros por segundo.
     */
    public void setVelocidadNado(float velocidadNado) {
        this.velocidadNado = velocidadNado;
    }

    /**
     * Obtiene la duración del buceo del animal.
     *
     * @return un valor flotante que representa la duración del buceo del animal en segundos.
     */
    public float getDuracionBuceo() {
        return duracionBuceo;
    }

    /**
     * Establece la duración del buceo del animal.
     *
     * @param duracionBuceo un valor flotante que representa la duración del buceo del animal en segundos.
     */
    public void setDuracionBuceo(float duracionBuceo) {
        this.duracionBuceo = duracionBuceo;
    }

    /**
     * Verifica si el animal es un caimán.
     *
     * @return {@code true} si el animal es un caimán, de lo contrario {@code false}.
     */
    public boolean isEsCaiman() {
        return esCaiman;
    }

    /**
     * Establece si el animal es un caimán.
     *
     * @param esCaiman {@code true} si el animal es un caimán, de lo contrario {@code false}.
     */
    public void setEsCaiman(boolean esCaiman) {
        this.esCaiman = esCaiman;
    }


    /**
     * Define el tamaño del reptil basado en su longitud y si es un caimán.
     * 
     * @param longitud Longitud del reptil
     * @param esCaiman Indica si es un caimán
     */
    public void definirTamaño(float longitud, boolean esCaiman) {
        if (this.esCaiman) { // Si es un caimán o cocodrilo
            if (this.longitud < 1.0) {
                this.setTamaño("Pequeño");
            } else if (this.longitud >= 1.0 && longitud <= 2.0) {
                this.setTamaño("Mediano");
            } else {
                this.setTamaño("Grande");
            }
        } else { // Si es una tortuga
            if (this.longitud < 0.20) {
                this.setTamaño("Pequeña");
            } else if (this.longitud >= 0.20 && longitud <= 0.40) {
                this.setTamaño("Mediana");
            } else {
                this.setTamaño("Grande");
            }
        }
    }

    /**
     * Calcula el espacio mínimo necesario en el recinto según el tamaño del reptil.
     */
    public void calcularEspacioRecinto() {
        if (this.esCaiman) { // Si es un caimán o cocodrilo
            if (this.tamaño.equals("Pequeño")) {
                this.areaMinima = 1.0f; 
            } else if (this.tamaño.equals("Mediano")) {
                this.areaMinima = 2.0f; 
            } else {
                this.areaMinima = 4.0f; 
            }
        } else { // Si es una tortuga
            if (this.tamaño.equals("Pequeña")) {
                this.areaMinima = 4.0f;
            } else if (this.tamaño.equals("Mediana")) {
                this.areaMinima = 6.0f;
            } else {
                this.areaMinima = 8.0f;
            }
        }
    }
    
    /**
     * Calcula la cantidad de comida diaria necesaria para el reptil acuático.
     * 
     * @return String que representa el rango de cantidad de comida diaria
     */
    public String calcularComidaDiaria() {
        float porcentajeMinimo, porcentajeMaximo;
    
        if (this.longitud < 0.20) { // Reptil acuático pequeño
            porcentajeMinimo = 0.05f; // 5%
            porcentajeMaximo = 0.10f; // 10%
        } else if (this.longitud >= 0.20 && this.longitud <= 0.40) { // Reptil acuático mediano
            porcentajeMinimo = 0.08f; // 8%
            porcentajeMaximo = 0.15f; // 15%
        } else { // Reptil acuático grande
            porcentajeMinimo = 0.10f; // 10%
            porcentajeMaximo = 0.20f; // 20%
        }
    
        // Formatear el String para mostrar el rango de porcentajes
        return String.format("%.2f - %.2f", porcentajeMinimo * this.peso , porcentajeMaximo * this.peso);
    }

    /**
     * Calcula el costo de mantenimiento mensual del reptil acuático.
     * 
     * @return Costo de mantenimiento en formato float
     */
    public float calcularCostoMantenimiento() {
        float costo;

        if (this.longitud < 0.20) { // Reptil acuático pequeño
            costo = 50 + (0.10f * this.peso) * 2.0f * 30;
        } else if (this.longitud >= 0.20 && this.longitud <= 0.40) { // Reptil acuático mediano
            costo = 200 + (0.15f * this.peso) * 2.0f * 30;
        } else { // Reptil acuático grande
            costo = 500 + (0.20f * this.peso) * 2.0f * 30;
        }
        return costo; 
    }
}
