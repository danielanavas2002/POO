/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Serpiente
 * La clase Serpiente representa a una serpiente en un zoológico, 
 * extendiendo la clase Reptil. Incluye atributos específicos 
 * como especie, color de piel y características sobre el veneno.
 * También proporciona métodos para definir el tamaño, calcular el 
 * espacio mínimo del recinto, el costo de mantenimiento y la 
 * cantidad de comida diaria necesaria.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

public class Serpiente extends Reptil {
    private String especie;        ///< Especie de la serpiente.
    private String colorPiel;     ///< Color de piel de la serpiente.
    private boolean esVenenosa;   ///< Indica si la serpiente es venenosa.
    private String tipoVeneno;    ///< Tipo de veneno de la serpiente.

    /**
     * Constructor para crear una instancia de Serpiente.
     *
     * @param nombreCientifico Nombre científico de la serpiente.
     * @param descripcionHabitat Descripción del hábitat de la serpiente.
     * @param esperanzaVida Esperanza de vida de la serpiente.
     * @param temperaturaCorporal Temperatura corporal de la serpiente.
     * @param promedioHuevos Promedio de huevos que pone la serpiente.
     * @param peso Peso de la serpiente.
     * @param enPeligroExtincion Indica si la serpiente está en peligro de extinción.
     * @param dieta Dieta de la serpiente.
     * @param longitud Longitud de la serpiente.
     * @param especie Especie de la serpiente.
     * @param colorPiel Color de piel de la serpiente.
     * @param esVenenosa Indica si la serpiente es venenosa.
     * @param tipoVeneno Tipo de veneno de la serpiente.
     */
    public Serpiente(String nombreCientifico, String descripcionHabitat, int esperanzaVida, float temperaturaCorporal, int promedioHuevos, float peso, boolean enPeligroExtincion, String dieta, float longitud, String especie, String colorPiel, boolean esVenenosa, String tipoVeneno) {
        // Llamar al constructor de la clase padre Reptil
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud);

        // Inicializar atributos específicos de Serpiente
        this.especie = especie;
        this.colorPiel = colorPiel;
        this.esVenenosa = esVenenosa;
        this.tipoVeneno = tipoVeneno;

        this.definirTamaño();
        this.calcularEspacioRecinto();
    }

    // Getters y Setters para los atributos específicos de Serpiente

    /**
     * Obtiene la especie de la serpiente.
     *
     * @return La especie de la serpiente.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Establece la especie de la serpiente.
     *
     * @param especie La nueva especie de la serpiente.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Obtiene el color de piel de la serpiente.
     *
     * @return El color de piel de la serpiente.
     */
    public String getColorPiel() {
        return colorPiel;
    }

    /**
     * Establece el color de piel de la serpiente.
     *
     * @param colorPiel El nuevo color de piel de la serpiente.
     */
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    /**
     * Indica si la serpiente es venenosa.
     *
     * @return true si la serpiente es venenosa, false en caso contrario.
     */
    public boolean isEsVenenosa() {
        return esVenenosa;
    }

    /**
     * Establece si la serpiente es venenosa.
     *
     * @param esVenenosa true si la serpiente es venenosa, false en caso contrario.
     */
    public void setEsVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    /**
     * Obtiene el tipo de veneno de la serpiente.
     *
     * @return El tipo de veneno de la serpiente.
     */
    public String getTipoVeneno() {
        return tipoVeneno;
    }

    /**
     * Establece el tipo de veneno de la serpiente.
     *
     * @param tipoVeneno El nuevo tipo de veneno de la serpiente.
     */
    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }

    /**
     * Define el tamaño de la serpiente según su longitud.
     * Establece la propiedad tamaño de la serpiente como "Pequeña", "Mediana" o "Grande".
     */
    public void definirTamaño() {
        if (this.longitud < 1.0) {
            this.setTamaño("Pequeña");
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) {
            this.setTamaño("Mediana");
        } else {
            this.setTamaño("Grande");
        }
    }

    /**
     * Calcula el espacio mínimo necesario en el recinto para la serpiente
     * según su tamaño.
     */
    public void calcularEspacioRecinto() {
        if (this.tamaño.equals("Pequeña")) { // Serpiente pequeña
            this.areaMinima = 2.0f; // Entre 1 y 2 metros cuadrados
        } else if (this.tamaño.equals("Mediana")) { // Serpiente mediana
            this.areaMinima = 4.0f; // Entre 2 y 4 metros cuadrados
        } else { // Serpiente grande
            this.areaMinima = 6.0f; // Entre 4 y 6 metros cuadrados
        }
    }
    
    /**
     * Calcula la cantidad de comida diaria necesaria para la serpiente
     * según su longitud.
     *
     * @return Un String con el rango de cantidades de comida diaria.
     */
    public String calcularComidaDiaria() {
        float porcentajeMinimo, porcentajeMaximo;
    
        if (this.longitud < 1.0) { // Serpiente pequeña
            porcentajeMinimo = 0.02f; // 2%
            porcentajeMaximo = 0.05f; // 5%
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Serpiente mediana
            porcentajeMinimo = 0.03f; // 3%
            porcentajeMaximo = 0.06f; // 6%
        } else { // Serpiente grande
            porcentajeMinimo = 0.04f; // 4%
            porcentajeMaximo = 0.08f; // 8%
        }
    
        // Formatear el String para mostrar el rango de porcentajes
        return String.format("%.2f - %.2f", porcentajeMinimo * this.peso , porcentajeMaximo * this.peso);
    }

    /**
     * Calcula el costo de mantenimiento mensual de la serpiente
     * según su tamaño y peso.
     *
     * @return El costo de mantenimiento mensual de la serpiente.
     */
    public float calcularCostoMantenimiento() {
        float costo;
        if (this.tamaño.equals("Pequeña")) { // Serpiente pequeña
            costo = 50 + (0.05f * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio de Q.2 por Gramo y 30 días al Mes)

        } else if (this.tamaño.equals("Mediana")) { // Serpiente mediana
            costo = 200 + (0.06f * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio de Q.2 por Gramo y 30 días al Mes)
        } else { // Serpiente grande
            costo = 500 + (0.08f * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio de Q.2 por Gramo y 30 días al Mes)
        }
        return costo; 
    }
}
