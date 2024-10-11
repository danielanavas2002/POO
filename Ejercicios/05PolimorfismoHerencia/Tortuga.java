/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Tortuga 
 * Clase que representa a una Tortuga, que extiende la clase ReptilAcuatico.
 * Esta clase contiene atributos y métodos específicos para el comportamiento
 * y características de las tortugas.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public class Tortuga extends ReptilAcuatico {

    /**
     * Constructor para crear una instancia de Tortuga.
     *
     * @param nombreCientifico Nombre científico de la tortuga.
     * @param descripcionHabitat Descripción del hábitat de la tortuga.
     * @param esperanzaVida Esperanza de vida de la tortuga en años.
     * @param temperaturaCorporal Temperatura corporal de la tortuga en grados Celsius.
     * @param promedioHuevos Promedio de huevos que pone la tortuga.
     * @param peso Peso de la tortuga en kilogramos.
     * @param enPeligroExtincion Indica si la tortuga está en peligro de extinción.
     * @param dieta Dieta de la tortuga.
     * @param longitud Longitud de la tortuga en metros.
     * @param especie Especie de la tortuga.
     * @param tipoAgua Tipo de agua en el que vive (dulce o salada).
     * @param velocidadNado Velocidad de nado de la tortuga en metros por segundo.
     * @param duracionBuceo Duración del buceo de la tortuga en minutos.
     */
    public Tortuga(String nombreCientifico, String descripcionHabitat, int esperanzaVida, float temperaturaCorporal, 
                   int promedioHuevos, float peso, boolean enPeligroExtincion, String dieta, float longitud, 
                   String especie, String tipoAgua, float velocidadNado, float duracionBuceo) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, 
              peso, enPeligroExtincion, dieta, longitud, especie, tipoAgua, velocidadNado, duracionBuceo);
        this.definirTamaño();
        this.calcularAreaMinima();
    }

    /**
     * Define el tamaño de la tortuga basado en su longitud.
     */
    @Override
    public void definirTamaño() {
        if (this.longitud < 0.20) {
            this.setTamaño("Pequeña");
        } else if (this.longitud >= 0.20 && longitud <= 0.40) {
            this.setTamaño("Mediana");
        } else {
            this.setTamaño("Grande");
        }
    }

    /**
     * Calcula el área mínima necesaria para la tortuga, según su tamaño.
     */
    @Override
    public void calcularAreaMinima() {
        if (this.longitud < 0.20) { // Tortuga Pequeña
            this.areaMinima = 0.5f; // Entre 0.5 y 1 metros cuadrados
        } else if (this.longitud >= 0.20 && longitud <= 0.40) { // Tortuga Mediana
            this.areaMinima = 1.0f; // Entre 1 y 2 metros cuadrados
        } else { // Tortuga Grande
            this.areaMinima = 2.0f; // Entre 2 y 4 metros cuadrados
        }
    }

    /**
     * Calcula la cantidad de comida diaria que necesita la tortuga.
     *
     * @return Cantidad de comida diaria en kilogramos.
     */
    @Override
    public float calcularComidaDiaria() {
        if (this.longitud < 0.20) { // Tortuga Pequeña
            return this.peso * 0.10f; // 5-10% de su peso corporal por día
        } else if (this.longitud >= 0.20 && longitud <= 0.40) { // Tortuga Mediana
            return this.peso * 0.15f; // 8-15% de su peso corporal por día
        } else { // Tortuga Grande
            return this.peso * 0.20f; // 10-20% de su peso corporal por día
        }
    }

    /**
     * Calcula el costo de mantenimiento mensual de la tortuga.
     *
     * @return Costo de mantenimiento en la moneda local.
     */
    @Override
    public float calcularCostoMantenimiento() { // Mensual
        float costo;
        if (this.longitud < 0.20) { // Tortuga Pequeña
            costo = 50 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio por Gramo y 30 días al Mes)
        } else if (this.longitud >= 0.20 && longitud <= 0.40) { // Tortuga Mediana
            costo = 200 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio por Gramo y 30 días al Mes)
        } else { // Tortuga Grande
            costo = 500 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Se calcula con el precio base, más el precioso del alimento (Considerando un precio por Gramo y 30 días al Mes)
        }
        return costo; 
    }

    /**
     * Despliega el rango de comida diaria que necesita la tortuga.
     *
     * @return Rango de comida diaria en kilogramos como un String.
     */
    @Override
    public String desplegarComidaDiaria() {
        float porcentajeMinimo, porcentajeMaximo;
    
        if (this.longitud < 0.20) { // Tortuga Pequeña
            porcentajeMinimo = 0.05f; // 5%
            porcentajeMaximo = 0.10f; // 10%
        } else if (this.longitud >= 0.20 && longitud <= 0.40) { // Tortuga Mediana
            porcentajeMinimo = 0.08f; // 8%
            porcentajeMaximo = 0.15f; // 15%
        } else { // Tortuga Grande
            porcentajeMinimo = 0.10f; // 10%
            porcentajeMaximo = 0.20f; // 20%
        }
    
        // Formatear el String para mostrar el rango de porcentajes
        return String.format("%.2f - %.2f", porcentajeMinimo * this.peso, porcentajeMaximo * this.peso);
    }

    /**
     * Despliega el espacio mínimo requerido para el recinto de la tortuga.
     *
     * @return Espacio requerido como un String.
     */
    @Override
    public String desplegarEspacioRecinto() {
        if (this.longitud < 0.20) { // Tortuga Pequeña
            return "Entre 0.5 y 1 metros cuadrados";
        } else if (this.longitud >= 0.20 && longitud <= 0.40) { // Tortuga Mediana
            return "Entre 1 y 2 metros cuadrados";
        } else { // Tortuga Grande
            return "Entre 2 y 4 metros cuadrados";
        }
    }

    /**
     * Devuelve una representación en forma de String de los atributos de la tortuga.
     *
     * @return Representación de la tortuga como un String.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------------------------------------------------------------").append("\n");
        sb.append("ID Único: ").append(this.id).append("\n");
        sb.append("Animal: Tortuga").append("\n");
        sb.append("Nombre Cientifico: ").append(this.nombreCientifico).append("\n");
        sb.append("Habitad: ").append(this.descripcionHabitat).append("\n");
        sb.append("Esperanza de Vida: ").append(this.esperanzaVida).append(" años\n");
        sb.append("Temperatura Corporal: ").append(this.temperaturaCorporal).append(" °C\n");
        sb.append("Promedio de Huevos: ").append(this.promedioHuevos).append("\n");
        sb.append("Peso: ").append(this.peso).append(" kg\n");
        sb.append("En Peligro de Extinción: ").append(this.enPeligroExtincion ? "Si" : "No").append("\n");
        sb.append("Dieta: ").append(this.dieta).append("\n");
        sb.append("Longitud: ").append(this.longitud).append(" m\n");
        sb.append("Tamaño: ").append(this.tamaño).append(" \n");
        sb.append("Especie: ").append(this.especie).append("\n");
        sb.append("Tipo de Agua: ").append(this.tipoAgua).append("\n");
        sb.append("Velocidad de Nado: ").append(this.velocidadNado).append(" m/s\n");
        sb.append("Duración de Buceo: ").append(this.duracionBuceo).append(" minutos\n");
        sb.append("------------------------------------------------------------------------------------------------").append("\n");
        return sb.toString();
    }
}
