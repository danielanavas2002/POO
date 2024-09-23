public class Main {
    public static void main(String[] args) {
        // Perro Fido = new Perro("Fido", "Pitbull", "Canis Familiaris");
        // Fido.hablar();

        // String nc = Fido.ciencia();
        // System.out.println(nc);

        PerroFaldero pf = new PerroFaldero("Clio", "Pomeranian", "Canis Familiaris", "Adrian");
        String habla = pf.hablar();

        System.out.println(habla);
    }   
}
