/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Serpiente 
 *  Clase que representa a una serpiente, heredando de la clase Reptil.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public class Serpiente extends Reptil {
    private String especie;        // Especie de la serpiente.
    private String colorPiel;     // Color de piel de la serpiente.
    private boolean esVenenosa;   // Indica si la serpiente es venenosa.
    private String tipoVeneno;    // Tipo de veneno de la serpiente.

    /**
     * Constructor de la clase Serpiente.
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
        this.calcularAreaMinima();
    }

    /**
     * Método que retorna la especie de la serpiente.
     * 
     * @return especie de la serpiente.
     */
    public String getEspecie() {
        return especie;
    }

    /**
     * Método que retorna el color de piel de la serpiente.
     * 
     * @return color de piel de la serpiente.
     */
    public String getColorPiel() {
        return colorPiel;
    }

    /**
     * Método que indica si la serpiente es venenosa.
     * 
     * @return true si es venenosa, false en caso contrario.
     */
    public boolean getEsVenenosa() {
        return esVenenosa;
    }

    /**
     * Método que retorna el tipo de veneno de la serpiente.
     * 
     * @return tipo de veneno de la serpiente.
     */
    public String getTipoVeneno() {
        return tipoVeneno;
    }

    /**
     * Método que establece la especie de la serpiente.
     * 
     * @param especie Especie de la serpiente.
     */
    public void setEspecie(String especie) {
        this.especie = especie;
    }

    /**
     * Método que establece el color de piel de la serpiente.
     * 
     * @param colorPiel Color de piel de la serpiente.
     */
    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    /**
     * Método que establece si la serpiente es venenosa.
     * 
     * @param esVenenosa Indica si la serpiente es venenosa.
     */
    public void setEsVenenosa(boolean esVenenosa) {
        this.esVenenosa = esVenenosa;
    }

    /**
     * Método que establece el tipo de veneno de la serpiente.
     * 
     * @param tipoVeneno Tipo de veneno de la serpiente.
     */
    public void setTipoVeneno(String tipoVeneno) {
        this.tipoVeneno = tipoVeneno;
    }


    /**
     * Define el tamaño de la serpiente basado en su longitud.
     */
    @Override
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
     * Calcula el área mínima requerida para la serpiente según su longitud.
     */
    @Override
    public void calcularAreaMinima() {
        if (this.longitud < 1.0) { // Serpiente pequeña
            this.areaMinima = 1.0f; // Entre 1 y 2 metros cuadrados
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Serpiente mediana
            this.areaMinima = 2.0f; // Entre 2 y 4 metros cuadrados
        } else { // Serpiente grande
            this.areaMinima = 4.0f; // Entre 4 y 6 metros cuadrados
        }

    }

    /**
     * Calcula la cantidad de comida diaria necesaria para la serpiente.
     * 
     * @return Cantidad de comida diaria en kilogramos.
     */
    @Override
    public float calcularComidaDiaria() {
        if (this.longitud < 1.0) { // Serpiente pequeña
            return this.peso * 0.05f;
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Serpiente mediana
            return this.peso * 0.06f;
        } else { // Serpiente grande
            return this.peso * 0.08f;
        }
    }

    /**
     * Calcula el costo de mantenimiento mensual de la serpiente.
     * 
     * @return Costo de mantenimiento mensual en la moneda correspondiente.
     */
    @Override
    public float calcularCostoMantenimiento() { // Mensual
        float costo;
        if (this.longitud < 1.0) { // Serpiente pequeña
            costo = 50 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precio del alimento (Considerando un precio por gramo y 30 días al mes)

        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Serpiente mediana
            costo = 200 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precio del alimento (Considerando un precio por gramo y 30 días al mes)
        } else { // Serpiente grande
            costo = 500 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precio del alimento (Considerando un precio por gramo y 30 días al mes)
        }
        return costo; 
    }
    
    /**
     * Despliega el rango de comida diaria necesaria para la serpiente.
     * 
     * @return String que representa el rango de comida diaria.
     */
    @Override
    public String desplegarComidaDiaria() {
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
        return String.format("%.2f - %.2f", porcentajeMinimo * this.peso, porcentajeMaximo * this.peso);
    }

    /**
     * Despliega el espacio mínimo requerido para el recinto de la serpiente.
     * 
     * @return String que representa el espacio mínimo requerido.
     */
    @Override
    public String desplegarEspacioRecinto() {
        if (this.longitud < 1.0) { // Serpiente pequeña
            return "Entre 1 y 2 metros cuadrados";
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Serpiente mediana
            return "Entre 2 y 4 metros cuadrados";
        } else { // Serpiente grande
            return "Entre 4 y 6 metros cuadrados";
        }
    }

    /**
     * Representa la información de la serpiente como un String.
     * 
     * @return String con la información detallada de la serpiente.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------------------------------------------------------------").append("\n");
        sb.append("ID Único: ").append(this.id).append("\n");
        sb.append("Animal: Serpiente").append("\n");
        sb.append("Nombre Cientifico: ").append(this.nombreCientifico).append("\n");
        sb.append("Habitad: ").append(this.descripcionHabitat).append("\n");
        sb.append("Esperanza de Vida: ").append(this.esperanzaVida).append(" años\n");
        sb.append("Temperatura Corporal: ").append(this.temperaturaCorporal).append(" °C\n");
        sb.append("Promedio de Huevos: ").append(this.promedioHuevos).append("\n");
        sb.append("Peso: ").append(this.peso).append(" kg\n");
        sb.append("En Peligro de Extinción: ").append(this.enPeligroExtincion ? "Sí" : "No").append("\n");
        sb.append("Dieta: ").append(this.dieta).append("\n");
        sb.append("Longitud: ").append(this.longitud).append(" m\n");
        sb.append("Especie: ").append(this.especie).append("\n");
        sb.append("Color de Piel: ").append(this.colorPiel).append("\n");
        sb.append("Es Venenosa: ").append(this.esVenenosa ? "Sí" : "No").append("\n");
        sb.append("Tipo de Veneno: ").append(this.tipoVeneno).append("\n");
        sb.append("Tamaño: ").append(this.tamaño).append("\n");
        sb.append("Área Mínima: ").append(this.areaMinima).append(" m²\n");
        sb.append("Comida Diaria: ").append(this.calcularComidaDiaria()).append(" kg\n");
        sb.append("Costo de Mantenimiento: ").append(this.calcularCostoMantenimiento()).append(" (moneda)\n");
        sb.append("------------------------------------------------------------------------------------------------");

        return sb.toString();
    }
}
