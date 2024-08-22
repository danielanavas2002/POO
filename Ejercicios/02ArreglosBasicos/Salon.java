/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Salon 
 * Representa un salón en un centro de eventos.
 * Cada salón tiene un número único, capacidad máxima, costo por hora y tipo.
 * La clase permite verificar la disponibilidad del salón en una fecha específica,
 * agregar reservas y obtener información sobre el salón.
 *
 * @author Daniela Navas
 * Fecha de creación: 21/08/2024
 * Última modificación: 22/08/2024
 */

public class Salon {
    private int numeroUnico;
    private int capacidadMaxima;
    private double costoPorHora;
    private String tipo;
    private Evento[] reservas;

    /**
     * Crea un nuevo salón con el número único, capacidad máxima, costo por hora y tipo especificados.
     *
     * @param numeroUnico El número único del salón.
     * @param capacidadMaxima La capacidad máxima del salón.
     * @param costoPorHora El costo por hora de uso del salón.
     * @param tipo El tipo de salón (por ejemplo, Pequeño, Mediano, Grande).
     */
    public Salon(int numeroUnico, int capacidadMaxima, double costoPorHora, String tipo) {
        this.numeroUnico = numeroUnico;
        this.capacidadMaxima = capacidadMaxima;
        this.costoPorHora = costoPorHora;
        this.tipo = tipo;
        this.reservas = new Evento[10];
    }

    /**
     * Verifica si el salón está disponible en una fecha específica.
     *
     * @param fecha La fecha para verificar la disponibilidad en formato "dd-mm-aa".
     * @return {@code true} si el salón está disponible en la fecha especificada; {@code false} en caso contrario.
     */
    public boolean verificarDisponibilidad(String fecha) {
        for (Evento reserva : reservas) {
            if (reserva != null && reserva.getFecha().equals(fecha)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Agrega una reserva al salón.
     *
     * @param evento El evento a agregar como reserva.
     */
    public void agregarReserva(Evento evento) {
        for (int i = 0; i < reservas.length; i++) {
            if (reservas[i] == null) {
                reservas[i] = evento;
                break;
            }
        }
    }

    /**
     * Obtiene el número único del salón.
     *
     * @return El número único del salón.
     */
    public int getNumeroUnico() {
        return numeroUnico;
    }

    /**
     * Obtiene el tipo de salón.
     *
     * @return El tipo de salón.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene la capacidad máxima del salón.
     *
     * @return La capacidad máxima del salón.
     */
    public int getCapacidad() {
        return capacidadMaxima;
    }

    /**
     * Obtiene el costo por hora de uso del salón.
     *
     * @return El costo por hora del salón.
     */
    public double getCostoPorHora() {
        return costoPorHora;
    }
}
