/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Constructora 
 * La clase Constructora representa una empresa de construcción que gestiona proyectos y ubicaciones.
 * Contiene listas de proyectos y ubicaciones asociados a la constructora.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/08/2024
 * Última modificación: 28/08/2024
 */

import java.util.ArrayList;

public class Constructora {
    /**
     * Lista de proyectos que la constructora está gestionando.
     */
    private ArrayList<Proyecto> proyectos;

    /**
     * Lista de ubicaciones donde se desarrollan los proyectos.
     */
    private ArrayList<Ubicacion> ubicaciones;

    /**
     * Constructor para crear una nueva instancia de Constructora. 
     * Inicializa las listas de proyectos y ubicaciones.
     */
    public Constructora() {
        this.proyectos = new ArrayList<>();
        this.ubicaciones = new ArrayList<>();
    }

    /**
     * Agrega un proyecto a la lista de proyectos de la constructora.
     *
     * @param proyecto El proyecto que se va a agregar.
     */
    public void agregarProyecto(Proyecto proyecto) 
    {
        proyectos.add(proyecto);
    }

    /**
     * Agrega una ubicación a la lista de ubicaciones de la constructora.
     *
     * @param ubicacion La ubicación que se va a agregar.
     */
    public void agregarUbicacion(Ubicacion ubicacion) {
        ubicaciones.add(ubicacion);
    }

    /**
     * Obtiene la lista de proyectos que la constructora está gestionando.
     *
     * @return La lista de proyectos.
     */
    public ArrayList<Proyecto> getProyectos() { 
        return proyectos; 
    }

    /**
     * Obtiene la lista de ubicaciones donde la constructora está desarrollando proyectos.
     *
     * @return La lista de ubicaciones.
     */
    public ArrayList<Ubicacion> getUbicaciones() { 
        return ubicaciones; 
    }
}
