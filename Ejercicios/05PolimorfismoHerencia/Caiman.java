/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Caiman 
 * Clase que representa a un caimán, hereda de la clase ReptilAcuatico.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public class Caiman extends ReptilAcuatico {

    /**
     * Constructor para la clase Caiman.
     * 
     * @param nombreCientifico Nombre científico del caimán.
     * @param descripcionHabitat Descripción del hábitat.
     * @param esperanzaVida Esperanza de vida en años.
     * @param temperaturaCorporal Temperatura corporal en grados Celsius.
     * @param promedioHuevos Promedio de huevos que pone.
     * @param peso Peso del caimán en kilogramos.
     * @param enPeligroExtincion Indica si está en peligro de extinción.
     * @param dieta Dieta del caimán.
     * @param longitud Longitud en metros.
     * @param especie Especie del caimán.
     * @param tipoAgua Tipo de agua (dulce, salada, etc.).
     * @param velocidadNado Velocidad de nado en metros por segundo.
     * @param duracionBuceo Duración del buceo en minutos.
     */
    public Caiman(String nombreCientifico, String descripcionHabitat, int esperanzaVida, float temperaturaCorporal,
                  int promedioHuevos, float peso, boolean enPeligroExtincion, String dieta, float longitud,
                  String especie, String tipoAgua, float velocidadNado, float duracionBuceo) {
        super(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso,
              enPeligroExtincion, dieta, longitud, especie, tipoAgua, velocidadNado, duracionBuceo);
        this.definirTamaño();
        this.calcularAreaMinima();
    }

    /**
     * Define el tamaño del caimán basado en su longitud.
     * Se establece el tamaño como "Pequeño", "Mediano" o "Grande".
     */
    @Override
    public void definirTamaño() {
        if (this.longitud < 1.0) {
            this.setTamaño("Pequeño");
        } else if (this.longitud >= 1.0 && longitud <= 2.0) {
            this.setTamaño("Mediano");
        } else {
            this.setTamaño("Grande");
        }
    }

    /**
     * Calcula el área mínima del recinto del caimán basado en su longitud.
     * Se establece el área mínima en metros cuadrados.
     */
    @Override
    public void calcularAreaMinima() {
        if (this.longitud < 1.0) { // Caiman pequeño
            this.areaMinima = 2.0f; // Área mínima de 2 metros cuadrados
        } else if (this.longitud >= 1.0 && longitud <= 2.0) { // Caiman Mediano
            this.areaMinima = 4.0f; // Área mínima de 4 metros cuadrados
        } else { // Caiman grande
            this.areaMinima = 6.0f; // Área mínima de 6 metros cuadrados
        }
    }

    /**
     * Calcula la cantidad de comida diaria necesaria para el caimán,
     * basada en su longitud.
     * 
     * @return La cantidad de comida diaria en kilogramos.
     */
    @Override
    public float calcularComidaDiaria() {
        if (this.longitud < 1.0) { // Caiman pequeño
            return this.peso * 0.10f; // 10% de su peso corporal por día
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Caiman Mediano
            return this.peso * 0.15f; // 15% de su peso corporal por día
        } else { // Caiman grande
            return this.peso * 0.20f; // 20% de su peso corporal por día
        }
    }

    /**
     * Calcula el costo mensual de mantenimiento del caimán,
     * considerando su tamaño y costo de comida.
     * 
     * @return El costo mensual de mantenimiento en la moneda local.
     */
    @Override
    public float calcularCostoMantenimiento() {
        float costo;
        if (this.longitud < 1.0) { // Caiman pequeño
            costo = 50 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Costo base más costo de alimento
        } else if (this.longitud >= 1.0 && longitud <= 2.0) { // Caiman Mediano
            costo = 200 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Costo base más costo de alimento
        } else { // Caiman grande
            costo = 500 + (this.calcularComidaDiaria() * this.peso) * 2.0f * 30.0f; // Costo base más costo de alimento
        }
        return costo;
    }

    /**
     * Despliega el rango de comida diaria necesaria para el caimán,
     * basado en su tamaño.
     * 
     * @return Un String que representa el rango de comida diaria en kilogramos.
     */
    @Override
    public String desplegarComidaDiaria() {
        float porcentajeMinimo, porcentajeMaximo;
    
        if (this.longitud < 1.0) { // Caiman pequeño
            porcentajeMinimo = 0.05f; // 5%
            porcentajeMaximo = 0.10f; // 10%
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Caiman Mediano
            porcentajeMinimo = 0.08f; // 8%
            porcentajeMaximo = 0.15f; // 15%
        } else { // Caiman grande
            porcentajeMinimo = 0.10f; // 10%
            porcentajeMaximo = 0.20f; // 20%
        }
    
        // Formatear el String para mostrar el rango de porcentajes
        return String.format("%.2f - %.2f", porcentajeMinimo * this.peso, porcentajeMaximo * this.peso);
    }

    /**
     * Despliega el espacio mínimo necesario para el recinto del caimán,
     * basado en su tamaño.
     * 
     * @return Un String que describe el espacio mínimo en metros cuadrados.
     */
    @Override
    public String desplegarEspacioRecinto() {
        if (this.longitud < 1.0) { // Caiman pequeño
            return "Entre 2 y 4 metros cuadrados";
        } else if (this.longitud >= 1.0 && this.longitud <= 2.0) { // Caiman Mediano
            return "Entre 4 y 6 metros cuadrados";
        } else { // Caiman grande
            return "Entre 6 y 8 metros cuadrados";
        }
    }

    /**
     * Método para representar la información del caimán como un String.
     * 
     * @return Un String que describe el caimán.
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("------------------------------------------------------------------------------------------------").append("\n");
        sb.append("ID Único: ").append(this.id).append("\n");
        sb.append("Animal: Caiman o Cocodrilo").append("\n");
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
