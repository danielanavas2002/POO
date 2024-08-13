/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Actividad 
 * Guarda informacion sobre el nombre de la actividad y la calificación obtenida.
 *
 * 
 * @author Daniela Navas
 * Fecha de creación: 12/08/2024
 * Última modificación: 13/08/2024
 */

public class Actividad {
    private String nombre;                  // Nombre de la actividad.
    private double calificacion;            // Calificación obtenida en la actividad.

    /**
     * Constructor de la clase Actividad.
     * Inicializa el nombre de la actividad y la calificación.
     *
     * @param nombre Nombre de la actividad.
     * @param calificacion Calificación obtenida en la actividad.
     */
    public Actividad(String nombre, double calificacion) {
        this.nombre = nombre;
        this.calificacion = calificacion;
    }

    /**
     * Devuelve el nombre de la actividad.
     *
     * @return Nombre de la actividad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve la calificación obtenida en la actividad.
     *
     * @return Calificación de la actividad.
     */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * Coloca el nombre de la actividad.
     *
     * @param nombre Nuevo nombre de la actividad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Coloca la calificación obtenida en la actividad.
     *
     * @param calificacion Nueva calificación de la actividad.
     */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
}
