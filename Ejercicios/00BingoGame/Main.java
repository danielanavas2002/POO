import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        BingoGame bingo = new BingoGame(4.0f, 16.0f);
        Player player = bingo.getPlayer(); // Asigna el jugador del objeto BingoGame a esta variable
        int num1;
        int num2;
        int num3;
        
        Scanner sc = new Scanner(System.in); // Iniciar escaner
        int opcion = 1;
        
        System.out.println("*******************************************************************************");
        System.out.println("**                                INSTRUCCIONES                              **");
        System.out.println("* Se generan 3 números enteros y aleatorios entre el 100 y el 1000. Para ganar *");
        System.out.println("* los tres númerosdeben ser pares, cada uno Q4.00. El usuario ganador obtiene: *");
        System.out.println("* - 10% de la suma si ambos son mayores que 700                                *");
        System.out.println("* - 20% de la suma si ambos están entre 500 y 700                              *");
        System.out.println("* - 15% de la suma si solo uno de los dos es mayor que 500                     *");
        System.out.println("* - 25% de la suma si ambos números son menor que 500                          *");
        System.out.println("*******************************************************************************");

        while(opcion != 3){
            System.out.println("***************************************");
            System.out.println("**             BINGO GAME            **");
            System.out.println("* 1. Jugar                            *");
            System.out.println("* 2. Ver Saldo                        *");
            System.out.println("* 3. Salir                            *");
            System.out.println("***************************************");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    if (bingo.canPlay()) {
                        System.out.println("Sus tres números son: ");
                        num1 = bingo.RandomGenerator();
                        num2 = bingo.RandomGenerator();
                        num3 = bingo.RandomGenerator();
            
                        System.out.println("Número 1: " + num1);
                        System.out.println("Número 2: " + num2);
                        System.out.println("Número 3: " + num3);
            
                        player.descontarSaldo(3 * bingo.getPrecio()); // Descuenta el saldo del jugador
            
                        boolean esPar1 = bingo.esPar(num1);
                        boolean esPar2 = bingo.esPar(num2);
                        boolean esPar3 = bingo.esPar(num3);
            
                        // Verifica si al menos dos números son pares
                        int countPares = (esPar1 ? 1 : 0) + (esPar2 ? 1 : 0) + (esPar3 ? 1 : 0);
                        if (countPares == 2) {
            
                            // Calcula el premio
                            float premio = bingo.calcularPremio(num1, num2, num3, esPar1, esPar2, esPar3);
                            player.acumularPremio(premio);
            
                            System.out.println("¡Ganaste! :)");
                            System.out.printf("Premio: Q%.2f\n", premio);
                        } else {
                            System.out.println("¡Perdiste! :(");
                            System.out.println("No hay dos números pares");
                        }
            
            
                    } else {
                        System.out.println("No tienes saldo suficiente para jugar.");
                        opcion = 3;
                        System.out.println("***************************************");
                        System.out.println("**                SALDO              **");
                        System.out.println("* Dolares: Q" + String.format("%.2f", player.getSaldo()));
                        System.out.println("* Dolares: $" + String.format("%.2f", player.getSaldoDolar()));
                        System.out.println("***************************************");
                    }
                    break;
                case 2:
                    System.out.println("***************************************");
                    System.out.println("**                SALDO              **");
                    System.out.println("* Dolares: Q" + String.format("%.2f", player.getSaldo()));
                    System.out.println("* Dolares: $" + String.format("%.2f", player.getSaldoDolar()));
                    System.out.println("***************************************");
                    break;
                case 3:
                    System.out.println("Gracias por jugar.");
                    System.out.println("***************************************");
                    System.out.println("**          DINERO ACUMULADO         **");
                    System.out.println("* Dolares: Q" + String.format("%.2f", player.getSaldo()));
                    System.out.println("* Dolares: $" + String.format("%.2f", player.getSaldoDolar()));
                    System.out.println("***************************************");
                    opcion = 3;
                    return;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
            
        }
        sc.close(); // Cerrar Escaner
    }
}
