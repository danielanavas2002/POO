/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase AutoElectrico
 * Esta clase hereda de la clase {@link Vehiculo} e implementa la interfaz {@link IVehiculo}.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

public class AutoElectrico extends Vehiculo implements IVehiculo {

    /**
     * Constructor que inicializa un automóvil eléctrico con un ID específico, 
     * tarifa base, estado de alquiler e ingreso mensual. Se usa para carga de CSV
     *
     * @param id El ID único del automóvil eléctrico.
     * @param tarifaBase La tarifa base del automóvil eléctrico.
     * @param enAlquiler Indica si el automóvil está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por el automóvil eléctrico.
     */
    public AutoElectrico(int id, float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(id, tarifaBase, enAlquiler, ingresoMensual);
    }

    /**
     * Constructor que inicializa un automóvil eléctrico con tarifa base, 
     * estado de alquiler e ingreso mensual. Asigna un ID único automáticamente.
     *
     * @param tarifaBase La tarifa base del automóvil eléctrico.
     * @param enAlquiler Indica si el automóvil está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por el automóvil eléctrico.
     */
    public AutoElectrico(float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(tarifaBase, enAlquiler, ingresoMensual);
    }
    
    /**
     * Calcula el costo de alquiler del automóvil eléctrico basado en la duración en horas 
     * y si se aplica una condición especial de acuerdo a las horas de uso mensual.
     *
     * @param horas La cantidad de horas por las que se está utilizando el automóvil.
     * @param condicionEspecial Un valor booleano que indica si se aplica una condición especial 
     *                         es decir, si el cliente tiene más de 50 horas de uso mensual.
     * @return El costo total de alquiler del automóvil eléctrico.
     */
    @Override
    public float calcularCosto(int horas, boolean condicionEspecial) {
        float tarifaPorHora = 15; // Tarifa base por hora

        if (condicionEspecial) {
            return tarifaPorHora * horas * 0.9f; // 10% de descuento
        } else {
            return tarifaPorHora * horas; // Sin descuento
        }
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Una cadena que representa el tipo de vehículo, en este caso "Auto Eléctrico".
     */
    @Override
    public String getTipoVehiculo() {
        return "Auto Eléctrico";
    }

    /**
     * Devuelve una representación en cadena del automóvil eléctrico, 
     * incluyendo su ID, tarifa base y estado de alquiler.
     *
     * @return Una cadena que representa el estado del automóvil eléctrico.
     */
    @Override
    public String toString() {
        return "AutoElectrico [ID: " + getID() + ", Tarifa Base: " + getTarifaBase() + ", En Alquiler: " + getEnAlquiler() + "]";
    }

   
}
