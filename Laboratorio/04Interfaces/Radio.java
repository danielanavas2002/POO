/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Radio
 * Representa un radio con múltiples modos de operación, como modo radio, modo reproducción de música,
 * modo teléfono y modo productividad. Permite gestionar la frecuencia de radio, las canciones en reproducción, las llamadas telefónicas
 * y mostrar pronósticos en el modo de productividad.
 * 
 * @author Daniela Navas
 * Fecha de creación: 14/10/2024
 * Última modificación: 15/10/2024
 */

import java.util.ArrayList;
import java.util.List;

public class Radio implements IRadio {
// ATRIBUTOS ==============================================================================================================

// MANEJO PRINCIPAL -------------------------------------------------------------------------------------------------------    
private boolean encendido = false;
private boolean modoRadio = false;
private boolean modoReproduccion = false;
private boolean modoTelefono = false;
private boolean modoProductividad = false;
private int volumen = 50;
// -------------------------------------------------------------------------------------------------------------------------   

// RADIO -------------------------------------------------------------------------------------------------------------------  
private String banda = "FM";
private double frecuencia = 87.5;
private List<Double> frecuenciasGuardadas = new ArrayList<>();
// -------------------------------------------------------------------------------------------------------------------------  

// REPRODUCCIÓN ------------------------------------------------------------------------------------------------------------  
private ArrayList<Cancion> lista1;
private ArrayList<Cancion> lista2;
private ArrayList<Cancion> lista3;
private ArrayList<Cancion> listaActual;
private int cancionActualIndex;
private boolean enReproduccion = false;
// -------------------------------------------------------------------------------------------------------------------------  

// TELÉFONO ----------------------------------------------------------------------------------------------------------------  
private List<Contacto> contactos;
private boolean telefonoConectado;
private Contacto llamadaActual;
private boolean llamadaEnEspera = false;
// -------------------------------------------------------------------------------------------------------------------------  

// PRODUCTIVIDAD -----------------------------------------------------------------------------------------------------------  
private boolean pronosticoMostrado = true;
private ArrayList<String> pronosticos = new ArrayList<>();
// -------------------------------------------------------------------------------------------------------------------------  
// ==========================================================================================================================


// MÉTODOS PROPIOS ==========================================================================================================

// MANEJO PRINCIPAL -------------------------------------------------------------------------------------------------------
/**
 * Constructor de la clase {@code Radio}.
 * Inicializa las listas de reproducción y establece el modo y los valores predeterminados.
 */
public Radio() {
    // Inicializamos las listas de reproducción 
    lista1 = new ArrayList<>();
    lista2 = new ArrayList<>();
    lista3 = new ArrayList<>();
        
    // Comenzamos con la lista 1
    listaActual = lista1;
    cancionActualIndex = 0;
    enReproduccion = true;

    // Iniciar Contactos
    contactos = new ArrayList<>();
    telefonoConectado = false;
    llamadaActual = null;
    llamadaEnEspera = false;
}
// -------------------------------------------------------------------------------------------------------------------------

// REPRODUCCIÓN ------------------------------------------------------------------------------------------------------------ 
/**
 * Añade una canción a la lista de reproducción especificada.
 * 
 * @param cancion La canción que se añadirá a la lista.
 * @param lista El número de la lista (1, 2 o 3) a la que se añadirá la canción.
 */
public void addCancion(Cancion cancion, int lista){
    if (lista == 1){
        lista1.add(cancion);
    } else if (lista == 2){
        lista2.add(cancion);
    } else if (lista == 3){
        lista3.add(cancion);
    }
}   
// ------------------------------------------------------------------------------------------------------------------------- 

// TELÉFONO ---------------------------------------------------------------------------------------------------------------- 
/**
 * Añade un contacto a la lista de contactos disponibles.
 * 
 * @param contacto El contacto que se añadirá a la lista de contactos.
 */
public void addContacto(Contacto contacto){
    contactos.add(contacto);
}
// -------------------------------------------------------------------------------------------------------------------------  

// PRODUCTIVIDAD -----------------------------------------------------------------------------------------------------------  
/**
 * Añade un nuevo pronóstico a la lista de pronósticos disponibles.
 * 
 * @param pronostico El pronóstico que se añadirá a la lista.
 */
public void agregarPronostico(String pronostico) {
    pronosticos.add(pronostico);
}
// ==========================================================================================================================


// MÉTODOS IMPLEMENTADOS DE INTERFAZ ========================================================================================

// MANEJO PRINCIPAL -------------------------------------------------------------------------------------------------------
/**
 * Enciende o apaga el radio. Al encenderlo, se apagan todos los modos de operación activos.
 * 
 * @param encendido {@code true} para encender el radio, {@code false} para apagarlo.
 */

public void setEncendido(boolean encendido){
    this.encendido = encendido;
    this.modoRadio = false;
    this.modoReproduccion = false;
    this.modoTelefono = false;
    this.modoProductividad = false;
}

/**
 * Enciende la radio.
 */
public void encender(){
    this.encendido = true;
}

/**
 * Apaga la radio.
 */
public void apagar(){
    this.encendido = false;
}

/**
 * Cambia el volumen de la radio.
 * @param cambio Valor que representa el cambio en el volumen (positivo o negativo).
 */
public void cambiarVolumen(int cambio){
    this.volumen = volumen + cambio;
}

/**
 * Muestra el estado actual de la radio (encendida, apagada, volumen, etc.).
 * @return Una cadena que describe el estado actual de la radio.
 */
public String mostrarEstado(){
    if (this.encendido){
        return "Encendido";
    } else{
        return "Apagado";
    }
}

/**
 * Cambia el modo actual del radio a uno nuevo.
 * 
 * @param nuevoModo El nuevo modo que se desea establecer (Radio, Reproducción, Teléfono, etc.).
 */
public void cambiarModo(String nuevoModo){
    if(nuevoModo.equals("Radio")){
        this.modoRadio = true;
    } else if(nuevoModo.equals("Reproducción")){
        this.modoReproduccion = true;
    } else if(nuevoModo.equals("Teléfono")){
        this.modoTelefono = true;
    } else if(nuevoModo.equals("Productividad")){
        this.modoRadio = true;
    }
};

/**
 * Obtiene el estado actual del radio (encendido o apagado).
 * 
 * @return {@code true} si el radio está encendido, {@code false} si está apagado.
 */
public boolean getEncendido(){
    return this.encendido;
}

/**
 * Activa o desactiva el modo radio. Al activar el modo radio, todos los demás modos se desactivan.
 * 
 * @param modoRadio {@code true} para activar el modo radio, {@code false} para desactivarlo.
 */
public void setModoRadio(boolean modoRadio){
    this.modoRadio = modoRadio;
    this.modoReproduccion = false;
    this.modoTelefono = false;
    this.modoProductividad = false;
}

/**
 * Activa o desactiva el modo reproducción de música. Al activar el modo reproducción, todos los demás modos se desactivan.
 * 
 * @param modoReproduccion {@code true} para activar el modo reproducción, {@code false} para desactivarlo.
 */
public void setModoReproduccion(boolean modoReproduccion){
    this.modoRadio = false;
    this.modoReproduccion = modoReproduccion;
    this.modoTelefono = false;
    this.modoProductividad = false;
}

/**
 * Activa o desactiva el modo teléfono. Al activar el modo teléfono, todos los demás modos se desactivan.
 * 
 * @param modoTelefono {@code true} para activar el modo teléfono, {@code false} para desactivarlo.
 */
public void setModoTelefono(boolean modoTelefono){
    this.modoRadio = false;
    this.modoReproduccion = false;
    this.modoTelefono = modoTelefono;
    this.modoProductividad = false;
}

/**
 * Activa o desactiva el modo productividad. Al activar el modo productividad, todos los demás modos se desactivan.
 * 
 * @param modoProductividad {@code true} para activar el modo productividad, {@code false} para desactivarlo.
 */
public void setModoProductividad(boolean modoProductividad){
    this.modoRadio = false;
    this.modoReproduccion = false;
    this.modoTelefono = false;
    this.modoProductividad = modoProductividad;
}  

/**
 * Muestra la información actual de la radio dependiendo del modo activo.
 * 
 * @return un {@code String} con la información de la radio.
 */
public String displayInfo() {
    if (modoRadio) {
        // Verificar si la frecuencia actual está guardada
        String emisoraGuardada = "";  // Valor por defecto si no se encuentra la frecuencia

        for (int i = 0; i < frecuenciasGuardadas.size(); i++) {
            if (frecuenciasGuardadas.get(i) == this.frecuencia) {
                emisoraGuardada = "" + (i + 1); // El índice + 1 representa el número de la emisora
                break;
            }
        }
        return "\n-----------------------------------------\n" +
               "                           VOLUMEN - " + this.volumen + "\n" +
               "MODO RADIO                           " + this.banda + "\n" + 
               "\n" +
               this.frecuencia + "                               # " + emisoraGuardada + "\n" + 
               "-----------------------------------------\n";
    } else if (modoReproduccion) {
        return "\n-----------------------------------------\n" +
               "                           VOLUMEN - " + this.volumen + "\n" +
               "MODO REPRODUCCIÓN               LISTA #" + this.getListaActualIndex()+ 
               "\n                           " + this.estadoReproduccion() + "\n" +
               this.mostrarInfoCancion() + "\n" + 
               "-----------------------------------------\n";
    } else if (modoTelefono) {
        return "\n-----------------------------------------\n" +
               "                           VOLUMEN - " + this.volumen + "\n" +
               "MODO TELÉFONO        " + (telefonoConectado ? "CONECTADO" : "DESCONECTADO") + "\n" + 
               " \n" +
               "LLAMADA CON        " + (llamadaActual == null ? "(SIN LLAMADA)" : llamadaActual) + "\n" +
               (llamadaActual != null && llamadaEnEspera ? "                   (EN ESPERA)" : "") + "\n" +
               "-----------------------------------------";
    } else if (modoProductividad) {
        String text = "";
        if(this.pronosticoMostrado){
            text = this.obtenerPronosticoActual();
        }
        return "\n-----------------------------------------\n" +
               "                           VOLUMEN - " + this.volumen + "\n" +
               "MODO PRODUCTIVIDAD\n" + 
               " \n" +
               text + "\n" +
               "-----------------------------------------";
    } else {
        return "En Proceso";
    } 
}

/**
 * Aumenta el volumen del radio en 1 unidad, siempre que el volumen esté por debajo de 100.
 * Si el volumen ya está en 100, no se incrementa.
 * 
 * @see #bajarVolumen()
 */
public void subirVolumen(){
    if (this.volumen < 100) { // Verifica si el volumen está por debajo de 100
        this.volumen += 1; // Aumenta el volumen en 1
    }
}

/**
 * Disminuye el volumen del radio en 1 unidad, siempre que el volumen esté por encima de 0.
 * Si el volumen ya está en 0, no se reduce.
 * 
 * @see #subirVolumen()
 */
public void bajarVolumen(){
    if (this.volumen > 0) { // Verifica si el volumen está por encima de 0
        this.volumen -= 1; // Disminuye el volumen en 1
    }
}
// -------------------------------------------------------------------------------------------------------------------------

// RADIO -------------------------------------------------------------------------------------------------------------------  
/**
 * Cambia la banda de frecuencia entre "FM" y "AM".
 * Si la banda actual es "FM", se cambia a "AM". 
 * Si la banda actual es "AM", se cambia a "FM".
 */
public void cambiarBanda(){
    if(this.banda.equals("FM")){ 
        this.banda = "AM";
    } else if(this.banda.equals("AM")){ 
        this.banda = "FM";
    }
}

/**
 * Aumenta la frecuencia en 0.5, siempre que la frecuencia esté por debajo de 200.
 * Si la frecuencia ya es 200 o más, no se incrementa.
 * 
 * @see #bajarFrecuencia()
 */
public void subirFrecuencia(){
    if (this.frecuencia < 200) { // Verifica si la frecuencia está por debajo de 100
        this.frecuencia += 0.5; // Aumenta la frecuencia en 0.5
    }
}

/**
 * Disminuye la frecuencia en 0.5, siempre que la frecuencia esté por encima de 0.
 * Si la frecuencia ya es 0 o menos, no se reduce.
 * 
 * @see #subirFrecuencia()
 */
public void bajarFrecuencia(){
    if (this.frecuencia > 0) { // Verifica si la frecuencia está por encima de 0
        this.frecuencia -= 0.5; // Disminuye la frecuencia en 0.5
    }
}

/**
 * Guarda la frecuencia actual en la lista de emisoras guardadas en el índice especificado.
 * Si el índice es válido (entre 1 y 50), la frecuencia se guarda en la lista. 
 * Si la lista no tiene suficiente espacio, se llenan las posiciones vacías hasta el índice dado.
 * 
 * @param index El índice en el que se guardará la frecuencia, debe estar entre 1 y 50.
 * @see #cargarEmisora(int)
 */
public void guardarEmisora(int index) {
    if (index >= 1 && index <= 50) {
        // Aseguramos que la lista tiene suficiente espacio para almacenar 50 emisoras
        if (frecuenciasGuardadas.size() < 50) {
            // Si el índice es válido y la lista no está llena, podemos agregar la frecuencia en la posición correcta
            while (frecuenciasGuardadas.size() < index) {
                frecuenciasGuardadas.add(0.0);  // Aseguramos que haya espacio para las emisoras anteriores si es necesario
            }
        }
        // Guardar la frecuencia en el índice especificado
        frecuenciasGuardadas.set(index - 1, this.frecuencia);  // Restamos 1 para ajustar el índice (porque la lista comienza desde 0)
    } 
}

/**
 * Carga una frecuencia guardada desde la lista de emisoras en el índice especificado.
 * Si el índice es válido, la frecuencia correspondiente se asigna a la frecuencia actual.
 * 
 * @param index El índice de la emisora que se desea cargar. Debe estar entre 1 y el tamaño de la lista de emisoras guardadas.
 * @see #guardarEmisora(int)
 */
public void cargarEmisora(int index) {
    if (index >= 1 && index <= frecuenciasGuardadas.size()) {
        double frecuencia = frecuenciasGuardadas.get(index - 1);  // Obtener la frecuencia guardada
        this.frecuencia = frecuencia;  // Establecer la frecuencia actual
    } 
}
// -------------------------------------------------------------------------------------------------------------------------

// REPRODUCCIÓN ------------------------------------------------------------------------------------------------------------ 
/**
 * Cambia la lista de reproducción activa a la lista especificada.
 * Inicia la reproducción desde la primera canción de la nueva lista seleccionada.
 * 
 * @param numeroLista El número de la lista a la que se cambiará (1, 2 o 3).
 * @return Un mensaje que indica si la lista fue cambiada correctamente o si la opción no es válida.
 */
public String cambiarLista(int numeroLista) {
    switch (numeroLista) {
        case 1:
            listaActual = lista1;
            break;
        case 2:
            listaActual = lista2;
            break;
        case 3:
            listaActual = lista3;
            break;
        default:
            return "Opción no válida.";
    }
    cancionActualIndex = 0;  // Iniciar desde la primera canción de la nueva lista
    return "Lista cambiada a " + numeroLista;
}

/**
 * Reproduce la siguiente canción de la lista actual.
 * 
 * @return Un mensaje que indica la canción que se está reproduciendo o si se ha llegado al final de la lista.
 */
public String siguienteCancion() {
    if (cancionActualIndex < listaActual.size() - 1) {
        cancionActualIndex++;
        return "";
    } else {
        return "";
    }
}

/**
 * Reproduce la canción anterior de la lista actual.
 * 
 * @return Un mensaje que indica la canción que se está reproduciendo o si se ha llegado al principio de la lista.
 */
public String anteriorCancion() {
    if (cancionActualIndex > 0) {
        cancionActualIndex--;
        return " ";
    } else {
        return "";
    }
}

/**
 * Muestra la información de la canción actual en reproducción.
 * 
 * @return Un mensaje con el nombre, duración, autor y género de la canción actual.
 */
public String mostrarInfoCancion() {
    Cancion cancion = listaActual.get(cancionActualIndex);
    return "Nombre: " + cancion.getNombre() + "\nDuración: " + cancion.getDuracion() + " min\nAutor: " + cancion.getAutor() + "\nGénero: " + cancion.getGenero();
}

/**
 * Obtiene el estado actual de la reproducción (reproduciendo o en pausa).
 * 
 * @return Un mensaje que indica si la reproducción está "REPRODUCIENDO" o "EN PAUSA".
 */
public String estadoReproduccion() {
    return enReproduccion ? "REPRODUCIENDO" : "EN PAUSA";
}

/**
 * Cambia el estado de reproducción entre "reproduciendo" y "en pausa".
 */
public void cambiarEstadoReproduccion() {
    enReproduccion = !enReproduccion;
}

/**
 * Obtiene el índice de la lista actual de reproducción (1, 2 o 3).
 * 
 * @return El índice de la lista actual. Devuelve 0 si no se encuentra ninguna lista activa.
 */
public int getListaActualIndex() {
    if (listaActual == lista1) {
        return 1;
    } else if (listaActual == lista2) {
        return 2;
    } else if (listaActual == lista3) {
        return 3;
    }
    return 0; // Si no se encuentra ninguna lista, esto nunca debería ocurrir.
}
// -------------------------------------------------------------------------------------------------------------------------  

// TELÉFONO ---------------------------------------------------------------------------------------------------------------- 
/**
 * Conecta o desconecta el teléfono.
 * Si el teléfono se desconecta mientras hay una llamada activa, la llamada se finaliza.
 * Si el teléfono se conecta, no se realiza ninguna acción adicional.
 */
public void conectarDesconectarTelefono() {
    if (telefonoConectado) {
        // Si el teléfono se desconecta, finalizamos la llamada activa
        llamadaActual = null;
        llamadaEnEspera = false;
    }
    telefonoConectado = !telefonoConectado;
}

/**
 * Muestra la lista de contactos disponibles.
 * 
 * @return Una cadena con la lista de contactos disponibles en formato legible.
 */
public String mostrarContactos() {
    StringBuilder sb = new StringBuilder("\n ----- Contactos Disponibles -----\n");
    for (int i = 0; i < contactos.size(); i++) {
        sb.append((i + 1)).append(". ").append(contactos.get(i)).append("\n");
    }
    return sb.toString();
}

/**
 * Realiza una llamada a un contacto especificado por su índice en la lista de contactos.
 * 
 * @param index El índice del contacto a llamar (1-based).
 * @return Un mensaje indicando el resultado de la operación, o un error si el teléfono no está conectado o el índice es inválido.
 */
public String llamarAContacto(int index) {
    if (!telefonoConectado) {
        return "\n=================================\n" +
                 "==            ERROR            ==\n" +
                 "= El teléfono no está conectado =\n" +
                 "=================================\n";
    }

    if (index < 1 || index > contactos.size()) {
        return "\n=======================\n" +
                 "==       ERROR       ==\n" +
                 "= Contacto no Válido. =\n" +
                 "=======================\n";
    }

    llamadaActual = contactos.get(index - 1);
    return "";
}

/**
 * Cambia el estado de la llamada activa a "en espera" o retoma la llamada, dependiendo del estado actual.
 * 
 * @return Un mensaje indicando el resultado de la operación, o un error si el teléfono no está conectado o no hay una llamada activa.
 */
public String cambiarLlamadaEnEspera() {
    if (!telefonoConectado) {
        return "\n=================================\n" +
                 "==            ERROR            ==\n" +
                 "= El teléfono no está conectado =\n" +
                 "=================================\n";
    }

    if (llamadaActual == null) {
        return "\n===============================================\n" +
                 "==                   ERROR                   ==\n" +
                 "= No hay llamada activa para poner en espera. =\n" +
                 "===============================================\n";
    }
    llamadaEnEspera = !llamadaEnEspera;

    return "";
}

/**
 * Finaliza la llamada activa.
 * 
 * @return Un mensaje indicando el resultado de la operación, o un error si el teléfono no está conectado o no hay una llamada activa.
 */
public String finalizarLlamada() {
    if (!telefonoConectado) {
        return "\n=================================\n" +
                 "==            ERROR            ==\n" +
                 "= El teléfono no está conectado =\n" +
                 "=================================\n";
    }
    if (llamadaActual == null) {
        return "\n=========================================\n" +
                 "==                ERROR                ==\n" +
                 "= No hay llamada activa para Finalizar. =\n" +
                 "=========================================\n";
    }
    llamadaActual = null;
    return "";
}
// -------------------------------------------------------------------------------------------------------------------------  

// PRODUCTIVIDAD -----------------------------------------------------------------------------------------------------------  
/**
 * Cambia el estado de visibilidad del pronóstico mostrado.
 * Este método alterna entre mostrar o no mostrar el pronóstico actual.
 */
public void verPronostico() {
        pronosticoMostrado = !pronosticoMostrado;
}

/**
 * Obtiene un pronóstico aleatorio de la lista de pronósticos disponibles.
 * Si la lista está vacía, retorna un mensaje indicando que no hay pronósticos disponibles.
 * 
 * @return El pronóstico aleatorio seleccionado, o un mensaje indicando que no hay pronósticos disponibles.
 */
public String obtenerPronosticoActual() {
    if (pronosticos.isEmpty()) {
        return "No hay pronósticos disponibles.";
    }
    return pronosticos.get((int) (Math.random() * pronosticos.size()));
}  
// -------------------------------------------------------------------------------------------------------------------------  
// ==========================================================================================================================
}
