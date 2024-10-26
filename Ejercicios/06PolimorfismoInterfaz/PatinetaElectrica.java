/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase PatinetaElectrica
 * Esta clase hereda de la clase {@link Vehiculo} e implementa la interfaz {@link IVehiculo}.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

public class PatinetaElectrica extends Vehiculo implements IVehiculo {

    /**
     * Constructor que inicializa una patineta eléctrica con un ID específico,
     * tarifa base, estado de alquiler e ingreso mensual. Se usa para la carga de CSV.
     *
     * @param id El ID único de la patineta eléctrica.
     * @param tarifaBase La tarifa base de la patineta eléctrica.
     * @param enAlquiler Indica si la patineta está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por la patineta eléctrica.
     */
    public PatinetaElectrica(int id, float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(id, tarifaBase, enAlquiler, ingresoMensual);
    }

    /**
     * Constructor que inicializa una patineta eléctrica con tarifa base,
     * estado de alquiler e ingreso mensual. Asigna un ID único automáticamente.
     *
     * @param tarifaBase La tarifa base de la patineta eléctrica.
     * @param enAlquiler Indica si la patineta está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por la patineta eléctrica.
     */
    public PatinetaElectrica(float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(tarifaBase, enAlquiler, ingresoMensual);
    }

    /**
     * Calcula el costo de alquiler de la patineta eléctrica basado en la duración en horas 
     * y si se aplica una condición especial.
     *
     * @param horas La cantidad de horas por las que se está utilizando la patineta.
     * @param condicionEspecial Un valor booleano que indica si se aplica una condición especial 
     *                         (por ejemplo, descuentos).
     * @return El costo total de alquiler de la patineta eléctrica.
     */
    @Override
    public float calcularCosto(int horas, boolean condicionEspecial) {
        float tarifaPorHora = 8; // Tarifa base por hora

        if (condicionEspecial) {
            return tarifaPorHora * horas; // No hay de descuento
        } else {
            return tarifaPorHora * horas; // Sin descuento
        }
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Una cadena que representa el tipo de vehículo, en este caso "Patineta Eléctrica".
     */
    @Override
    public String getTipoVehiculo() {
        return "Patineta Eléctrica";
    }

    /**
     * Devuelve una representación en cadena de la patineta eléctrica, 
     * incluyendo su ID, tarifa base y estado de alquiler.
     *
     * @return Una cadena que representa el estado de la patineta eléctrica.
     */
    @Override
    public String toString() {
        return "Patineta Eléctrica [ID: " + getID() + ", Tarifa Base: " + getTarifaBase() + ", En Alquiler: " + getEnAlquiler() + "]";
    }    
}
