/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Cliente
 * Clase que representa un cliente que alquila vehículos.
 * Esta clase almacena información sobre el cliente, incluyendo
 * su ID, horas de uso mensual y los vehículos que ha alquilado.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

import java.util.ArrayList;

public class Cliente {
    private int id;                           // ID del Cliente
    private static int contadorID = 1;        // Static para incrementar el ID de manera automática
    private int horasUsoMensual;              // En Carro
    private ArrayList<Vehiculo> vehiculos;    // Lista de vehiculos que ha alquilado

    /**
     * Constructor que inicializa un cliente con horas de uso mensual.
     * Asigna un ID único automáticamente.
     *
     * @param horasUsoMensual Las horas de uso mensual del cliente.
     */
    public Cliente(int horasUsoMensual) {
        this.id = contadorID++; // Asigna un ID único a cada vehículo
        this.horasUsoMensual = horasUsoMensual;
        this.vehiculos = new ArrayList<>();
    }

    /**
     * Constructor que inicializa un cliente con un ID específico y horas de uso mensual.
     * Usado en la carga de datos de CSV.
     *
     * @param id El ID único del cliente.
     * @param horasUsoMensual Las horas de uso mensual del cliente.
     */
    public Cliente(int id, int horasUsoMensual) {
        this.id = id; 
        this.horasUsoMensual = horasUsoMensual;
        this.vehiculos = new ArrayList<>();
    }

    /**
     * Obtiene el ID del cliente.
     *
     * @return El ID del cliente.
     */
    public int getID() {
        return id;
    }

    /**
     * Obtiene el contador de IDs para clientes.
     *
     * @return El valor actual del contador de IDs.
     */
    public static int getContadorID() {
        return contadorID;
    }

    /**
     * Obtiene un vehículo del cliente según su ID.
     *
     * @param id El ID del vehículo a buscar.
     * @return El vehículo correspondiente al ID, o null si no se encuentra.
     */
    public Vehiculo getVehiculo(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getID() == id) { // Compara el ID de cada vehiculo con el ID buscado
                return vehiculo; // Si se encuentra, devuelve el vehiculo
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

    /**
     * Obtiene las horas de uso mensual del cliente.
     *
     * @return Las horas de uso mensual del cliente.
     */
    public int getHorasUsoMensual() {
        return horasUsoMensual;
    }

    /**
     * Obtiene la lista de vehículos alquilados por el cliente.
     *
     * @return La lista de vehículos alquilados.
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Establece el ID del cliente.
     *
     * @param id El nuevo ID del cliente.
     */
    public void setID(int id) {
        this.id = id;
    }

    /**
     * Establece un nuevo valor para el contador de IDs de clientes.
     *
     * @param nuevoValor El nuevo valor del contador de IDs.
     */
    public static void setContadorID(int nuevoValor) {
        contadorID = nuevoValor;
    }

    /**
     * Establece las horas de uso mensual del cliente.
     *
     * @param horasUsoMensual Las nuevas horas de uso mensual del cliente.
     */
    public void setHorasUsoMensual(int horasUsoMensual) {
        this.horasUsoMensual = horasUsoMensual;
    }

    /**
     * Añade un vehículo a la lista de vehículos alquilados por el cliente.
     *
     * @param vehiculo El vehículo a añadir a la lista.
     */
    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo); // Añade el vehiculo a la lista
    }

}
