/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Equipo
 * Representa un equipo disponible para reserva en un centro de eventos.
 * Cada equipo tiene un nombre, un número de serie, una fecha de compra, 
 * un responsable y un registro de reservas.
 *
 * @author Daniela Navas
 * Fecha de creación: 21/08/2024
 * Última modificación: 22/08/2024
 */
public class Equipo {
    private String nombre;
    private String numeroSerie;
    private String fechaCompra;
    private boolean disponible;
    private Empleado responsable;
    private String[] reservas;

    /**
     * Crea un nuevo equipo con el nombre, número de serie, fecha de compra y responsable especificados.
     *
     * @param nombre El nombre del equipo.
     * @param numeroSerie El número de serie del equipo.
     * @param fechaCompra La fecha de compra del equipo.
     * @param responsable El empleado responsable del equipo.
     */
    public Equipo(String nombre, String numeroSerie, String fechaCompra, Empleado responsable) {
        this.nombre = nombre;
        this.numeroSerie = numeroSerie;
        this.fechaCompra = fechaCompra;
        this.responsable = responsable;
        this.reservas = new String[100]; // Capacidad ajustable
    }

    /**
     * Obtiene la información básica del equipo en un formato de cadena.
     *
     * @return La información del equipo incluyendo nombre, número de serie, y responsable.
     */
    public String obtenerInfo() {
        return "Equipo: " + nombre + ", No. Serie: " + numeroSerie + ", Responsable: " + responsable.getNombre() + " , No. Identificacion: " + responsable.getIdentificacion();
    }

    /**
     * Verifica si el equipo está disponible en una fecha específica.
     *
     * @param fecha La fecha para verificar la disponibilidad en formato "dd-mm-aa".
     * @return {@code true} si el equipo está disponible en la fecha especificada; {@code false} en caso contrario.
     */
    public boolean verificarDisponibilidad(String fecha) {
        for (String reserva : reservas) {
            if (reserva != null && reserva.equals(fecha)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Reserva el equipo para una fecha específica si está disponible.
     *
     * @param fecha La fecha para reservar el equipo en formato "dd-mm-aa".
     */
    public void reservarEquipo(String fecha) {
        if (verificarDisponibilidad(fecha)) {
            for (int i = 0; i < reservas.length; i++) {
                if (reservas[i] == null) {
                    reservas[i] = fecha;
                    this.disponible = false; // Marcar el equipo como no disponible
                    System.out.println("Equipo " + nombre + " (Serie: " + numeroSerie + ") reservado para la fecha: " + fecha);
                    break;
                }
            }
        } else {
            System.out.println("El equipo " + nombre + " (Serie: " + numeroSerie + ") no está disponible para la fecha: " + fecha);
        }
    }

    /**
     * Agrega una reserva para el equipo.
     *
     * @param fecha La fecha de la reserva en formato "dd-mm-aa".
     */
    public void agregarReserva(String fecha) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = fecha;
                break;
            }
        }
    }

    /**
     * Obtiene el nombre del equipo.
     *
     * @return El nombre del equipo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el número de serie del equipo.
     *
     * @return El número de serie del equipo.
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }
}
