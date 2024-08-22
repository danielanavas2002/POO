/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Evento
 * Representa un evento en el centro de eventos.
 * Un evento tiene un nombre del encargado, nombre del evento, tipo de evento, fecha, horario,
 * un salón asignado, equipos seleccionados, y estado de pago y reserva.
 *
 * @author Daniela Navas
 * Fecha de creación: 21/08/2024
 * Última modificación: 22/08/2024
 */
public class Evento {
    private String nombreEncargado;
    private String nombreEvento;
    private String tipoEvento;
    private String fecha;
    private String horario;
    private Salon salonAsignado;
    private Equipo[] equiposSeleccionados;
    private boolean pagoRealizado;
    private boolean reservado;

    /**
     * Crea un nuevo evento con el nombre del encargado, nombre del evento, tipo de evento, fecha y horario especificados.
     *
     * @param nombreEncargado El nombre del encargado del evento.
     * @param nombreEvento El nombre del evento.
     * @param tipoEvento El tipo de evento (Regular o VIP).
     * @param fecha La fecha del evento en formato "dd-mm-aa".
     * @param horario El horario del evento en formato "00:00 a 00:00".
     */
    public Evento(String nombreEncargado, String nombreEvento, String tipoEvento, String fecha, String horario) {
        this.nombreEncargado = nombreEncargado;
        this.nombreEvento = nombreEvento;
        this.tipoEvento = tipoEvento;
        this.fecha = fecha;
        this.horario = horario;
        this.equiposSeleccionados = new Equipo[5]; 
        this.pagoRealizado = false;
        this.reservado = false;
    }

    /**
     * Agrega un equipo a la lista de equipos seleccionados para el evento.
     *
     * @param equipo El equipo a agregar.
     */
    public void agregarEquipo(Equipo equipo) {
        for (int i = 0; i < equiposSeleccionados.length; i++) {
            if (equiposSeleccionados[i] == null) {
                equiposSeleccionados[i] = equipo;
                break;
            }
        }
    }

    /**
     * Establece el estado del pago del evento.
     *
     * @param pago {@code true} si el pago ha sido realizado, {@code false} en caso contrario.
     */
    public void setPagoRealizado(boolean pago) {
        this.pagoRealizado = pago;
    }

    /**
     * Reserva un salón para el evento si está disponible en la fecha especificada.
     *
     * @param salon El salón a reservar.
     * @return {@code true} si la reserva del salón fue exitosa; {@code false} en caso contrario.
     */
    public boolean reservarSalon(Salon salon) {
        if (salon.verificarDisponibilidad(this.fecha)) {
            this.salonAsignado = salon;
            salon.agregarReserva(this);
            this.reservado = true;
            return true;
        }
        return false;
    }

    /**
     * Verifica si el evento ha sido reservado.
     *
     * @return {@code true} si el evento está reservado; {@code false} en caso contrario.
     */
    public boolean isReservado() {
        return reservado;
    }

    /**
     * Obtiene la fecha del evento.
     *
     * @return La fecha del evento en formato "dd-mm-aa".
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Obtiene el tipo de evento.
     *
     * @return El tipo de evento (Regular o VIP).
     */
    public String getTipo() {
        return tipoEvento;
    }

    /**
     * Obtiene el nombre del evento.
     *
     * @return El nombre del evento.
     */
    public String getNombreEvento() {
        return nombreEvento;
    }

    /**
     * Obtiene la lista de equipos seleccionados para el evento.
     *
     * @return Un arreglo de equipos seleccionados.
     */
    public Equipo[] getEquiposSeleccionados() {
        return equiposSeleccionados;
    }

    /**
     * Establece la lista de equipos seleccionados para el evento.
     *
     * @param equiposSeleccionados Un arreglo de equipos seleccionados.
     */
    public void setEquiposSeleccionados(Equipo[] equiposSeleccionados) {
        this.equiposSeleccionados = equiposSeleccionados;
    }
}
