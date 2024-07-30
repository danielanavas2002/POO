import java.util.Random;

class BingoGame {
    private Player player;
    private float precio;
    private Random random = new Random();

    public BingoGame(float precio, float saldo) {
        this.precio = precio;
        this.player = new Player(saldo); // Inicializa Player con el saldo inicial
    }

    public float getPrecio() {
        return this.precio;
    }

    public int RandomGenerator() {
        return 100 + random.nextInt(901);
    }

    public boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public boolean canPlay() {
        return player.getSaldo() >= this.precio * 3; // Verifica si hay saldo suficiente para 3 números
    }

    public Player getPlayer() {
        return this.player;
    }

    public float calcularPremio(int num1, int num2, int num3, boolean esPar1, boolean esPar2, boolean esPar3) {
        int[] pares = new int[3]; // Array para numeros pares
        int index = 0;

        if (esPar1) pares[index++] = num1; // Si es par se agrega el número
        if (esPar2) pares[index++] = num2;
        if (esPar3) pares[index] = num3;

        int sum = 0;
        int count = 0;
        for (int par : pares) { // Sumar numeros y contar cuantos hay
            if (par != 0) {
                sum += par;
                count++;
            }
        }

        if (count < 2) return 0; // Si menos de 2 son pares. No hay premio

        if (pares[0] > 700 && pares[1] > 700) return sum * 0.10f; // 10% de la suma de sus números pares si ambos son mayores que 700
        if (pares[0] >= 500 && pares[0] <= 700 && pares[1] >= 500 && pares[1] <= 700) return sum * 0.20f; // 20% de la suma si ambos están entre 500 y 700
        if (pares[0] > 500 || pares[1] > 500) return sum * 0.15f; // 15% de ella si solo uno de los dos es mayor que 500
        return sum * 0.25f; // Ganará el 25% de la misma si ambos números son menor que 500
    }
}
