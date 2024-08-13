/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Estudiante
 * Guarda y setea información sobre el carnet, nombre y actividades del estudiante.
 *
 * 
 * @author Daniela Navas
 * Fecha de creación: 12/08/2024
 * Última modificación: 13/08/2024
 */
public class Estudiante {
    private String carnet;                  // Número de carnet del estudiante.
    private String nombre;                  // Nombre del estudiante.
    private Actividad[] actividades;        // Arreglo que contiene las actividades del estudiante.
    private int numeroActividades;          // Número actual de actividades registradas.

    /**
     * Constructor de la clase Estudiante.
     * Inicializa el carnet, nombre y el arreglo de actividades con la capacidad máxima.
     *
     * @param carnet Número de carnet del estudiante.
     * @param nombre Nombre del estudiante.
     * @param maxActividades Capacidad máxima de actividades que el estudiante puede registrar.
     */
    public Estudiante(String carnet, String nombre, int maxActividades) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.actividades = new Actividad[maxActividades];
        this.numeroActividades = 0;
    }

    /**
     * Devuelve el número de carnet del estudiante.
     *
     * @return Número de carnet del estudiante.
     */
    public String getCarnet() {
        return carnet;
    }

    /**
     * Devuelve el nombre del estudiante.
     *
     * @return Nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el arreglo de actividades del estudiante.
     *
     * @return Arreglo de actividades.
     */
    public Actividad[] getActividades() {
        return actividades;
    }

    /**
     * Coloca el número de carnet del estudiante.
     *
     * @param carnet Nuevo número de carnet del estudiante.
     */
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    /**
     * Coloca el nombre del estudiante.
     *
     * @param nombre Nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Agrega una nueva actividad al estudiante.
     *
     * @param nombreActividad Nombre de la actividad.
     * @param calificacion Calificación obtenida en la actividad.
     * @return true si la actividad fue agregada exitosamente, false si no hay espacio.
     */
    public boolean agregarActividad(String nombreActividad, double calificacion) {
        if (numeroActividades < actividades.length) {
            actividades[numeroActividades] = new Actividad(nombreActividad, calificacion);
            numeroActividades++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Calcula el promedio de calificaciones del estudiante.
     *
     * @return El promedio de calificaciones, o 0 si no hay actividades registradas, para evitar problemas al dividir entre 0.
     */
    public double calcularPromedio() {
        double suma = 0;
        for (int i = 0; i < numeroActividades; i++) {
            suma += actividades[i].getCalificacion();
        }
        return numeroActividades > 0 ? suma / numeroActividades : 0;
    }
}
