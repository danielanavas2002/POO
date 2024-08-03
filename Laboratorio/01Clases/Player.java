/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS 
 * 
 * Clase Player
 * 
 * Esta clase almacena el nombre del jugador y sus puntos acumulados tanto en total 
 * como en la ronda actual.
 * 
 * @author Daniela Navas
 * Fecha de creación: 31/07/2024
 * Última modificación: 2/08/2024
 */
class Player {
    private String name;
    private int puntos;
    private int puntosRonda;

    /**
     * Establece el nombre del jugador.
     *
     * @param name el nombre del jugador
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Obtiene el nombre del jugador.
     *
     * @return el nombre del jugador
     */
    public String getName(){
        return name;
    }

    /**
     * Establece los puntos totales del jugador.
     *
     * @param puntos los puntos totales del jugador
     */
    public void setPuntos(int puntos){
        this.puntos = puntos;
    }

    /**
     * Obtiene los puntos totales del jugador.
     *
     * @return los puntos totales del jugador
     */
    public int getPuntos(){
        return puntos;
    }

    /**
     * Establece los puntos de la ronda actual del jugador.
     *
     * @param puntosRonda los puntos de la ronda actual
     */
    public void setPuntosRonda(int puntosRonda){
        this.puntosRonda = puntosRonda;
    }

    /**
     * Obtiene los puntos de la ronda actual del jugador.
     *
     * @return los puntos de la ronda actual
     */
    public int getPuntosRonda(){
        return puntosRonda;
    }
}
