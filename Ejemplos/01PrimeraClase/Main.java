class Main {
    public static void main(String[] args) 
    {
        // Sin Constructor
        // Perro scoobydoo = new Perro();
        // scoobydoo.setRaza("Labrador");
        // scoobydoo.setNombre("Scooby Doo");

        // System.out.println(scoobydoo.getRaza());
        // System.out.println(scoobydoo.getNombre());

        // scoobydoo.ladrar();

        // Con Constructor
        Perro scoobydoo = new Perro("Scooby Doo", "Great Dane");
        System.out.println(scoobydoo.getNombre());
        System.out.println(scoobydoo.getRaza());

        Perro firulais = new Perro("Firulais", "Callejero");
        System.out.println(firulais.getNombre());
        System.out.println(firulais.getRaza());
    }
}