/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Contratista 
 * La clase Contratista representa a un contratista involucrado en un proyecto de construcción,
 * incluyendo detalles como identificador, nombre, especialidad y monto pagado.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/08/2024
 * Última modificación: 28/08/2024
 */

public class Contratista 
{
    /**
     * Identificador único del contratista.
     */
    private String idContratista;

    /**
     * Nombre del contratista.
     */
    private String nombre;

    /**
     * Especialidad del contratista (e.g., electricidad, plomería).
     */
    private String especialidad;

    /**
     * Monto total pagado al contratista por sus servicios.
     */
    private double montoPagado;

    /**
     * Constructor para crear un nuevo contratista con los detalles especificados.
     *
     * @param idContratista Identificador único del contratista.
     * @param nombre        Nombre del contratista.
     * @param especialidad  Especialidad del contratista.
     * @param montoPagado   Monto total pagado al contratista.
     */
    public Contratista(String idContratista, String nombre, String especialidad, double montoPagado) 
    {
        this.idContratista = idContratista;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.montoPagado = montoPagado;
    }

    /**
     * Obtiene el identificador único del contratista.
     *
     * @return El identificador del contratista.
     */
    public String getIdContratista() 
    { 
        return idContratista; 
    }
    
    /**
     * Obtiene el nombre del contratista.
     *
     * @return El nombre del contratista.
     */
    public String getNombre() 
    { 
        return nombre; 
    }

    /**
     * Obtiene la especialidad del contratista.
     *
     * @return La especialidad del contratista.
     */
    public String getEspecialidad() 
    { 
        return especialidad;
    }
    
    /**
     * Obtiene el monto total pagado al contratista.
     *
     * @return El monto pagado al contratista.
     */
    public double getMontoPagado() 
    { 
        return montoPagado; 
    }
}
