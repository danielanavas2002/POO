import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Constructora {
    private ArrayList<Proyecto> proyectos;
    private ArrayList<Contratista> contratistas;
    private ArrayList<Ubicacion> ubicaciones;

    public Constructora() {
        this.proyectos = new ArrayList<>();
        this.contratistas = new ArrayList<>();
        this.ubicaciones = new ArrayList<>();
    }

    public void cargarDatosDesdeCSV(String rutaArchivo, boolean esProyecto) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");

                if (esProyecto) {
                    // Se espera que el CSV tenga el formato: ID,Nombre,FechaInicio,FechaFin,Presupuesto
                    String idProyecto = datos[0];
                    String nombreProyecto = datos[1];
                    String fechaInicio = datos[2];
                    String fechaFinEstimada = datos[3];
                    double presupuesto = Double.parseDouble(datos[4]);

                    Proyecto proyecto = new Proyecto(idProyecto, nombreProyecto, fechaInicio, fechaFinEstimada, presupuesto);
                    agregarProyecto(proyecto);
                } else {
                    // Se espera que el CSV tenga el formato: ID,Nombre,Especialidad,MontoPagado
                    String idContratista = datos[0];
                    String nombreContratista = datos[1];
                    String especialidad = datos[2];
                    double montoPagado = Double.parseDouble(datos[3]);

                    Contratista contratista = new Contratista(idContratista, nombreContratista, especialidad, montoPagado);
                    agregarContratista(contratista);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Otros métodos y getters/setters de la clase Constructora
    public void agregarProyecto(Proyecto proyecto) {
        proyectos.add(proyecto);
    }

    public void agregarContratista(Contratista contratista) {
        contratistas.add(contratista);
    }

    // Getters para las listas
    public ArrayList<Proyecto> getProyectos() { return proyectos; }
    public ArrayList<Contratista> getContratistas() { return contratistas; }
    public ArrayList<Ubicacion> getUbicaciones() { return ubicaciones; }
}
