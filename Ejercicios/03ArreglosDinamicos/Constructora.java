import java.util.ArrayList;

public class Constructora {
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Ubicacion> ubicaciones;

    public Constructora() {
        this.proyectos = new ArrayList<>();
        this.ubicaciones = new ArrayList<>();
    }

    public void agregarProyecto(Proyecto proyecto) 
    {
        proyectos.add(proyecto);
    }

    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    public ArrayList<Proyecto> getProyectos() { 
        return proyectos; 
    }

    public ArrayList<Ubicacion> getUbicaciones() { 
        return ubicaciones; 
    }
}
