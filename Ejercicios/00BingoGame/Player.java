class Player {
    private float saldo;

    public Player(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldoDolar() {
        return this.saldo / 7.74f; // Conversión a dólares
    }

    public void descontarSaldo(float monto) {
        this.saldo -= monto;
    }

    public void acumularPremio(float premio) {
        this.saldo += premio;
    }
}
