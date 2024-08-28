/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Proyecto 
 * La clase Proyecto representa un proyecto en una empresa de construcción, 
 * con detalles como identificador, nombre, fechas de inicio y fin estimada, 
 * presupuesto y contratistas asociados.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/08/2024
 * Última modificación: 28/08/2024
 */

import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
    /**
     * Identificador único del proyecto.
     */
    private String idProyecto;

    /**
     * Nombre del proyecto.
     */
    private String nombre;

    /**
     * Fecha de inicio del proyecto.
     */
    private Date fechaInicio;

    /**
     * Fecha estimada de finalización del proyecto.
     */
    private Date fechaFinEstimada;

    /**
     * Presupuesto asignado para el proyecto.
     */
    private double presupuesto;

    /**
     * Lista de contratistas asociados al proyecto.
     */
    private ArrayList<Contratista> contratistas;

    /**
     * Constructor para crear un nuevo proyecto con los detalles especificados.
     *
     * @param idProyecto       Identificador único del proyecto.
     * @param nombre           Nombre del proyecto.
     * @param fechaInicio      Fecha de inicio del proyecto.
     * @param fechaFinEstimada Fecha estimada de finalización del proyecto.
     * @param presupuesto      Presupuesto asignado para el proyecto.
     */
    public Proyecto(String idProyecto, String nombre, Date fechaInicio, Date fechaFinEstimada, double presupuesto) 
    {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.presupuesto = presupuesto;
    }

    /**
     * Establece la lista de contratistas asociados al proyecto.
     *
     * @param contratistas Lista de contratistas.
     */
    public void setContratistas(ArrayList<Contratista> contratistas) 
    { 
        this.contratistas = contratistas; 
    }

    /**
     * Obtiene el identificador único del proyecto.
     *
     * @return El identificador del proyecto.
     */
    public String getIdProyecto() 
    { 
        return idProyecto; 
    }
    
    /**
     * Obtiene el nombre del proyecto.
     *
     * @return El nombre del proyecto.
     */
    public String getNombre() 
    { 
        return nombre; 
    }

    /**
     * Obtiene la fecha de inicio del proyecto.
     *
     * @return La fecha de inicio del proyecto.
     */
    public Date getFechaInicio() 
    { 
        return fechaInicio; 
    }

    /**
     * Obtiene la fecha estimada de finalización del proyecto.
     *
     * @return La fecha estimada de finalización del proyecto.
     */
    public Date getFechaFinEstimada() 
    { 
        return fechaFinEstimada; 
    }
    
    /**
     * Obtiene el presupuesto asignado al proyecto.
     *
     * @return El presupuesto del proyecto.
     */
    public double getPresupuesto() 
    { 
        return presupuesto; 
    }

    /**
     * Obtiene la lista de contratistas asociados al proyecto.
     *
     * @return La lista de contratistas.
     */
    public ArrayList<Contratista> getContratistas() { 
        return contratistas; 
    }
}
