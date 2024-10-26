/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase BicicletaElectrica
 * Esta clase hereda de la clase {@link Vehiculo} e implementa la interfaz {@link IVehiculo}.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

public class BicicletaElectrica extends Vehiculo implements IVehiculo {

    /**
     * Constructor que inicializa una bicicleta eléctrica con un ID específico, 
     * tarifa base, estado de alquiler e ingreso mensual. Se usa en la carga de CSV.
     *
     * @param id El ID único de la bicicleta eléctrica.
     * @param tarifaBase La tarifa base de la bicicleta eléctrica.
     * @param enAlquiler Indica si la bicicleta está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por la bicicleta eléctrica.
     */
    public BicicletaElectrica(int id, float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(id, tarifaBase, enAlquiler, ingresoMensual);
    }

    /**
     * Constructor que inicializa una bicicleta eléctrica con tarifa base, 
     * estado de alquiler e ingreso mensual. Asigna un ID único automáticamente.
     *
     * @param tarifaBase La tarifa base de la bicicleta eléctrica.
     * @param enAlquiler Indica si la bicicleta está actualmente en alquiler.
     * @param ingresoMensual El ingreso mensual generado por la bicicleta eléctrica.
     */
    public BicicletaElectrica(float tarifaBase, boolean enAlquiler, float ingresoMensual) {
        super(tarifaBase, enAlquiler, ingresoMensual);
    }

    /**
     * Calcula el costo de alquiler de la bicicleta eléctrica basado en la duración en horas 
     * y si se aplica una condición especial.
     *
     * @param horas La cantidad de horas por las que se está utilizando la bicicleta.
     * @param condicionEspecial Un valor booleano que indica si se aplica una condición especial, 
     *                         si es un día lluvioso se aplica 10%.
     * @return El costo total de alquiler de la bicicleta eléctrica.
     */
    @Override
    public float calcularCosto(int horas, boolean condicionEspecial) {
        float tarifaPorHora = 5; // Tarifa base por hora

        if (condicionEspecial) {
            return tarifaPorHora * horas * 0.95f; // 5% de descuento
        } else {
            return tarifaPorHora * horas; // Sin descuento
        }
    }

    /**
     * Obtiene el tipo de vehículo.
     *
     * @return Una cadena que representa el tipo de vehículo, en este caso "Bicicleta Eléctrica".
     */
    @Override
    public String getTipoVehiculo() {
        return "Bicicleta Eléctrica";
    }

    /**
     * Devuelve una representación en cadena de la bicicleta eléctrica, 
     * incluyendo su ID, tarifa base y estado de alquiler.
     *
     * @return Una cadena que representa el estado de la bicicleta eléctrica.
     */
    @Override
    public String toString() {
        return "Bicicleta Eléctrica [ID: " + getID() + ", Tarifa Base: " + getTarifaBase() + ", En Alquiler: " + getEnAlquiler() + "]";
    }
}
