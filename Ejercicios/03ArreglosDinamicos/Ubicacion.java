import java.util.ArrayList;

public class Ubicacion {
    private String nombreUbicacion;
    private String direccion;
    private ArrayList<Proyecto> proyectos;

    public Ubicacion(String nombreUbicacion, String direccion) {
        this.nombreUbicacion = nombreUbicacion;
        this.direccion = direccion;
        this.proyectos = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public ArrayList<String> listarProyectos() {
        ArrayList<String> nombresProyectos = new ArrayList<>();
        for (Proyecto proyecto : proyectos) {
            nombresProyectos.add(proyecto.getNombre());
        }
        return nombresProyectos;
    }

    // Getters
    public String getNombreUbicacion() { return nombreUbicacion; }
    public String getDireccion() { return direccion; }
    public ArrayList<Proyecto> getProyectos() { return proyectos; }
}
