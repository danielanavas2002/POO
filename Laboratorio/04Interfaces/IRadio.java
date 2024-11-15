/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Interfaz IRadio
 * Interfaz que define las funcionalidades de un dispositivo multifuncional que incluye radio,
 * reproducción de música, teléfono y productividad.
 * 
 * @author Daniela Navas
 * Fecha de creación: 14/10/2024
 * Última modificación: 15/10/2024
 */

public interface IRadio {
// MANEJO PRINCIPAL -------------------------------------------------------------------------------------------------------
    /**
     * Enciende o apaga el dispositivo.
     * 
     * @param encendido El estado de encendido del dispositivo (true para encendido, false para apagado).
     */
    public void setEncendido(boolean encendido);

    /**
     * Obtiene el estado actual de encendido del dispositivo.
     * 
     * @return El estado de encendido (true si está encendido, false si está apagado).
     */
    public boolean getEncendido();

    /**
     * Establece el modo de radio del dispositivo.
     * 
     * @param modoRadio El estado del modo de radio (true si está activado, false si está desactivado).
     */
    public void setModoRadio(boolean modoRadio);

    /**
     * Establece el modo de reproducción de música en el dispositivo.
     * 
     * @param modoReproduccion El estado del modo de reproducción (true si está activado, false si está desactivado).
     */
    public void setModoReproduccion(boolean modoReproduccion);

    /**
     * Establece el modo de teléfono en el dispositivo.
     * 
     * @param modoTelefono El estado del modo de teléfono (true si está activado, false si está desactivado).
     */
    public void setModoTelefono(boolean modoTelefono);

    /**
     * Establece el modo de productividad en el dispositivo.
     * 
     * @param modoProductividad El estado del modo de productividad (true si está activado, false si está desactivado).
     */
    public void setModoProductividad(boolean modoProductividad);

    /**
     * Muestra la información general sobre el estado del dispositivo.
     * 
     * @return Una cadena con la información del dispositivo.
     */
    public String displayInfo();

    /**
     * Sube el volumen del dispositivo en 1.
     */
    public void subirVolumen();

    /**
     * Baja el volumen del dispositivo en 1.
     */
    public void bajarVolumen();
// ------------------------------------------------------------------------------------------------------------------------- 

// RADIO -------------------------------------------------------------------------------------------------------------------
    /**
     * Cambia la banda de frecuencia de la radio (de FM a AM o viceversa).
     */
    public void cambiarBanda();

    /**
     * Sube la frecuencia de la radio en 0.5 unidades.
     */
    public void subirFrecuencia();

    /**
     * Baja la frecuencia de la radio en 0.5 unidades.
     */
    public void bajarFrecuencia();

    /**
     * Guarda la emisora actual en el índice especificado.
     * 
     * @param index El índice donde se debe guardar la emisora (1-50).
     */
    public void guardarEmisora(int index);

    /**
     * Carga la emisora guardada en el índice especificado.
     * 
     * @param index El índice de la emisora a cargar (1-50).
     */
    public void cargarEmisora(int index);
// ------------------------------------------------------------------------------------------------------------------------- 

// REPRODUCCIÓN ------------------------------------------------------------------------------------------------------------ 
    /**
     * Cambia la lista de reproducción actual.
     * 
     * @param numeroLista El número de la lista a la que se debe cambiar (1, 2 o 3).
     * @return Un mensaje indicando el resultado de la operación.
     */
    public String cambiarLista(int numeroLista);

    /**
     * Reproduce la siguiente canción en la lista actual.
     * 
     * @return Un mensaje indicando la canción actual.
     */
    public String siguienteCancion();

    /**
     * Reproduce la canción anterior en la lista actual.
     * 
     * @return Un mensaje indicando la canción actual.
     */
    public String anteriorCancion();

    /**
     * Muestra la información de la canción actual.
     * 
     * @return Una cadena con la información de la canción actual.
     */
    public String mostrarInfoCancion();

    /**
     * Obtiene el estado actual de la reproducción (reproduciendo o en pausa).
     * 
     * @return El estado de la reproducción (REPRODUCIENDO o EN PAUSA).
     */
    public String estadoReproduccion();

    /**
     * Cambia el estado de la reproducción (reproduciendo o en pausa).
     */
    public void cambiarEstadoReproduccion();

    /**
     * Obtiene el índice de la lista de reproducción actual.
     * 
     * @return El número de la lista actual (1, 2 o 3).
     */
    public int getListaActualIndex();
// ------------------------------------------------------------------------------------------------------------------------- 

// TELÉFONO ---------------------------------------------------------------------------------------------------------------- 
    /**
     * Conecta o desconecta el teléfono.
     * Si se desconecta, finaliza la llamada activa y pone en espera cualquier llamada.
     */
    public void conectarDesconectarTelefono();

    /**
     * Muestra los contactos disponibles en el teléfono.
     * 
     * @return Una cadena con la lista de contactos.
     */
    public String mostrarContactos();

    /**
     * Realiza una llamada a un contacto específico.
     * 
     * @param index El índice del contacto al que se desea llamar.
     * @return Un mensaje indicando el resultado de la llamada.
     */
    public String llamarAContacto(int index);

    /**
     * Cambia el estado de la llamada en espera (pone o quita la llamada en espera).
     * 
     * @return Un mensaje indicando el resultado de la operación.
     */
    public String cambiarLlamadaEnEspera();

    /**
     * Finaliza la llamada activa.
     * 
     * @return Un mensaje indicando el resultado de la operación.
     */
    public String finalizarLlamada();
// ------------------------------------------------------------------------------------------------------------------------- 

// PRODUCTIVIDAD ----------------------------------------------------------------------------------------------------------- 
    /**
     * Cambia la visibilidad del pronóstico mostrado.
     */
    public void verPronostico();

    /**
     * Obtiene un pronóstico aleatorio disponible.
     * 
     * @return Un pronóstico aleatorio o un mensaje indicando que no hay pronósticos disponibles.
     */
    public String obtenerPronosticoActual();
}
