import java.util.Scanner;

/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Main Class 
 * 
 * Este programa simula el juego PIG donde el objetivo es ser el primer jugador en alcanzar 
 * 100 puntos. Cada jugador toma turnos para lanzar dos dados y acumula puntos basados en 
 * los valores obtenidos. Si cualquiera de los dados muestra un valor de 1, el jugador pierde 
 * todos los puntos acumulados en esa ronda y el turno termina inmediatamente. Los jugadores 
 * pueden seguir lanzando los dados para acumular más puntos, pero si acumulan más de 20 puntos 
 * en una ronda, el turno termina automáticamente.
 * 
 * @author Daniela Navas
 * Fecha de creación: 31/07/2024
 * Última modificación: 2/08/2024
 */
class Main {
    /**
     * Método principal 
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        // Definir juego
        PigGame pigGame = new PigGame();
        // Definir jugadores
        Player player1 = new Player();
        Player player2 = new Player();
        // Definir variables de ejecución
        boolean turno = true;
        boolean terminar = false;
        // Definir escaner
        Scanner sc = new Scanner(System.in);
        // Instrucciones principales
        System.out.println("*********************************************");
        System.out.println("**                PIG GAME                **");
        System.out.println("* Instrucciones: El objetivo del juego PIG  *");
        System.out.println("* es ser el primer jugador en alcanzar 100  *");
        System.out.println("* puntos. Por turno, se deben lanzar dos    *");
        System.out.println("* dados y sumar los valores obtenidos en la *");
        System.out.println("* ronda. Si cualquiera de los dados muestra *");
        System.out.println("* un valor de 1 se pierden todos los puntos *");
        System.out.println("* y el turno terminará inmediatamente.      *");
        System.out.println("* Se puede seguir lanzando los dados para   *");
        System.out.println("* acumular más puntos, pero si se acumulan  *");
        System.out.println("* más de 20, se cambia de jugador.          *");
        System.out.println("*********************************************");
        System.out.println(" ");

        System.out.print("* Nombre Jugador 1: "); // Nombres de Jugadores
        String nombre1 = sc.nextLine();
        player1.setName(nombre1);
        
        System.out.print("* Nombre Jugador 2: ");
        String nombre2 = sc.nextLine();
        player2.setName(nombre2);
        System.out.println(" ");

        while (!terminar) {
            Player actual = turno ? player1 : player2;
            System.out.println("*********************************************");
            System.out.println("* Turno de " + actual.getName());
            System.out.println("* Puntos Actuales: " + actual.getPuntos());

            int puntosRonda = 0;
            boolean seguirJugando = true;

            while (seguirJugando) {
                int num1 = pigGame.dado();
                int num2 = pigGame.dado();
                System.out.println("* Dado 1: " + num1);
                System.out.println("* Dado 2: " + num2);

                if (!pigGame.ganar(num1, num2)) {
                    System.out.println("* Perdiste tus puntos :(");
                    actual.setPuntos(0);
                    seguirJugando = false; // Termina el turno del jugador actual
                } else {
                    puntosRonda += num1 + num2;
                    System.out.println("* Puntos de la ronda: " + puntosRonda);
                    
                    // Sumar puntos de la ronda a los puntos totales del jugador
                    actual.setPuntosRonda(puntosRonda);

                    if (!pigGame.ronda(actual)) {
                        System.out.println("* Has acumulado 20 o más puntos en la ronda. Termina tu turno.");
                        actual.setPuntos(actual.getPuntos() + puntosRonda);
                        seguirJugando = false; // Termina el turno del jugador actual
                    } else {
                        System.out.print("* ¿Quieres seguir lanzando los dados? (1: Si, 2: No): ");
                        int decision = sc.nextInt();
                        if (decision == 2) {
                            actual.setPuntos(actual.getPuntos() + puntosRonda);
                            seguirJugando = false; // Termina el turno del jugador actual
                        }
                    }
                }

                // Verificar si el jugador ha ganado
                if (pigGame.win(actual)) {
                    System.out.println("*********************************************");
                    System.out.println("* ¡" + actual.getName() + " ha ganado el juego con " + actual.getPuntos() + " puntos! *");
                    System.out.println("*********************************************");
                    terminar = true; // Cambia el estado del juego a terminado
                }
            }

            // Cambiar de turno
            turno = !turno; // Alterna el turno entre los dos jugadores
        }

        sc.close();
    }
}
