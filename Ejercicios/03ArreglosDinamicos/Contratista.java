public class Contratista {
    private String idContratista;
    private String nombre;
    private String especialidad;
    private double montoPagado;

    public Contratista(String idContratista, String nombre, String especialidad, double montoPagado) {
        this.idContratista = idContratista;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.montoPagado = montoPagado;
    }

    // Getters y setters
    public String getIdContratista() { return idContratista; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public double getMontoPagado() { return montoPagado; }
}
