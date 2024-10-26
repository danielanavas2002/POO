/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Interfaz IVehiculo 
 * Esta interfaz representa un vehículo y define los métodos necesarios para calcular
 * el costo del vehículo y obtener su tipo.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

public interface IVehiculo {
    /**
     * Calcula el costo del vehículo basado en la duración en horas y una condición especial.
     *
     * @param horas La cantidad de horas por las que se está utilizando el vehículo.
     * @param condicionEspecial Un valor booleano que indica si se aplica una condición especial 
     *                         es decir, si el descuento es aplicable o no.
     * @return El costo total del vehículo en base a las horas y la condición especial.
     */
    public float calcularCosto(int horas, boolean condicionEspecial);

    /**
    * Obtiene el tipo de vehículo.
    *
    * @return Una cadena que representa el tipo de vehículo: Auto Eléctrico, Bicicleta Eléctrica o Patineta Eléctrica.
    */
    public String getTipoVehiculo();
}
