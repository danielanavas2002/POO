public class Proyecto {
    private String idProyecto;
    private String nombre;
    private String fechaInicio;
    private String fechaFinEstimada;
    private double presupuesto;
    private double gastoTotal;

    public Proyecto(String idProyecto, String nombre, String fechaInicio, String fechaFinEstimada, double presupuesto) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.presupuesto = presupuesto;
        this.gastoTotal = 0;
    }

    public void registrarContratista(Contratista contratista) {
        this.gastoTotal += contratista.getMontoPagado();
    }

    public double calcularGastoTotal() {
        return this.gastoTotal;
    }

    public void actualizarPresupuesto(double nuevoPresupuesto) {
        this.presupuesto = nuevoPresupuesto;
    }

    // Getters y setters
    public String getIdProyecto() { return idProyecto; }
    public String getNombre() { return nombre; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFinEstimada() { return fechaFinEstimada; }
    public double getPresupuesto() { return presupuesto; }
    public double getGastoTotal() { return gastoTotal; }
}
