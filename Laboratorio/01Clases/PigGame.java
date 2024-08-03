import java.util.Random;

/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase PIG GAME
 * 
 * Esta clase maneja la lógica del juego PIG, incluyendo el lanzamiento de dados,
 * las reglas para ganar, y la gestión de puntos de las rondas.
 * 
 * @author Daniela Navas
 * Fecha de creación: 31/07/2024
 * Última modificación: 2/08/2024
 */
class PigGame {
    private int valor;
    private Random random = new Random();
    private Player player;

    /**
     * Método que simula el lanzamiento de un dado.
     *
     * @return el valor del dado lanzado, un número entre 1 y 6
     */
    public int dado() {
        valor = 1 + random.nextInt(6);
        return valor;
    }

    /**
     * Método que verifica si un jugador ha perdido sus puntos de la ronda.
     *
     * @param valor1 valor del primer dado
     * @param valor2 valor del segundo dado
     * @return true si ninguno de los dados muestra 1, false de lo contrario
     */
    public boolean ganar(int valor1, int valor2){
        if(valor1 == 1 || valor2 == 1){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Método que verifica si un jugador puede seguir acumulando puntos en la ronda.
     *
     * @param player el jugador actual
     * @return true si el jugador tiene 20 o menos puntos en la ronda, false de lo contrario
     */
    public boolean ronda(Player player){
        if(player.getPuntosRonda() <= 20){
            return true;
        } else {
            player.setPuntosRonda(0);
            return false;
        }
    }

    /**
     * Método que verifica si un jugador ha ganado el juego.
     *
     * @param player el jugador actual
     * @return true si el jugador tiene 100 o más puntos, false de lo contrario
     */
    public boolean win(Player player){
        if(player.getPuntos() >= 100){
            return true;
        } else{
            return false;
        }
    }
}
