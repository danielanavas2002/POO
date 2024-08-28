/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Ubicacion 
 * La clase Ubicacion representa una ubicación física donde se desarrolla un proyecto de construcción.
 * Contiene información sobre el nombre de la ubicación y su dirección.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/08/2024
 * Última modificación: 28/08/2024
 */

public class Ubicacion {
    /**
     * Nombre de la ubicación.
     */
    private String nombreUbicacion;

    /**
     * Dirección de la ubicación.
     */
    private String direccion;

    /**
     * Constructor para crear una nueva instancia de Ubicacion con un nombre y una dirección específicos.
     *
     * @param nombreUbicacion El nombre de la ubicación.
     * @param direccion       La dirección de la ubicación.
     */
    public Ubicacion(String nombreUbicacion, String direccion) {
        this.nombreUbicacion = nombreUbicacion;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre de la ubicación.
     *
     * @return El nombre de la ubicación.
     */
    public String getNombreUbicacion() 
    { 
        return nombreUbicacion; 
    }

    /**
     * Obtiene la dirección de la ubicación.
     *
     * @return La dirección de la ubicación.
     */
    public String getDireccion() 
    { 
        return direccion; 
    }
}
