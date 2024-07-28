class Main{
    public static void main(String[] args){
        Vino vegaSicilia = new Vino("Vega Sicilia Unico", "2010", "Tinto", 5, 50, 37);
        System.out.println("CLASE VINO");
        System.out.println("Nombre: " + vegaSicilia.getNombre());
        System.out.println("Cosecha: " + vegaSicilia.getCosecha());
        System.out.println("Tipo: " + vegaSicilia.getTipo());
        System.out.println("Disponibiliad Minima: " + vegaSicilia.getDispMinima());
        System.out.println("Disponibiliad Maxima: " + vegaSicilia.getDispMaxima());
        System.out.println("Disponibiliad Real: " + vegaSicilia.getDispReal());
        System.out.println(" ");

        Suministrador laithwaites = new Suministrador("Laithwaites Wine", "Reino Unido", 5);
        System.out.println("CLASE SUMINISTRADOR");
        System.out.println("Nombre: " + laithwaites.getNombreSum());
        System.out.println("Pais: " + laithwaites.getPais());
        System.out.println("Tiempo de Entrega: " + laithwaites.getTiempo() + " días");
        System.out.println(" ");

        Venta venta01 = new Venta(450.0f, 3, 5, vegaSicilia);
        System.out.println("CLASE VENTA");
        System.out.println("Monto: " + venta01.getMonto());
        System.out.println("Cantidad: " + venta01.getCantidad());
        System.out.println("Año: " + venta01.getYear() + " días");
        System.out.println("Vino: " + venta01.getVino());
        System.out.println(" ");

    }
}