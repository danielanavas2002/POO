/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase seccion 
 * Permite agregar, eliminar y buscar estudiantes en la sección.
 *
 * 
 * @author Daniela Navas
 * Fecha de creación: 12/08/2024
 * Última modificación: 13/08/2024
 */

class Seccion {
    private Estudiante[] estudiantes;    // Arreglo que contiene los estudiantes de la sección.
    private int capacidadMaxima;          // Capacidad máxima de la sección.
    private int numeroEstudiantes;         // Número actual de estudiantes registrados.

    /**
     * Constructor de la clase Seccion.
     * Inicializa el arreglo de estudiantes y establece la capacidad máxima.
     *
     * @param capacidadMaxima Capacidad máxima de estudiantes en la sección.
     */
    public Seccion(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
        this.estudiantes = new Estudiante[capacidadMaxima];
        this.numeroEstudiantes = 0;
    }

    /**
     * Agrega un estudiante a la sección.
     *
     * @param estudiante Estudiante a agregar.
     * @return true si el estudiante fue agregado exitosamente, false si no hay espacio.
     */
    public boolean agregarEstudiante(Estudiante estudiante) {
        if (numeroEstudiantes < capacidadMaxima) {
            estudiantes[numeroEstudiantes] = estudiante;
            numeroEstudiantes++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Elimina un estudiante de la sección utilizando su número de carnet.
     *
     * @param carnet Número de carnet del estudiante a eliminar.
     * @return true si el estudiante fue eliminado exitosamente, false si no se encontró.
     */
    public boolean eliminarEstudiante(String carnet) {
        for (int i = 0; i < numeroEstudiantes; i++) {
            if (estudiantes[i] != null && estudiantes[i].getCarnet().equals(carnet)) {
                estudiantes[i] = null; // Deja vacío el espacio
                numeroEstudiantes--;
                return true;
            }
        }
        return false;
    }

    /**
     * Busca un estudiante en la sección utilizando su número de carnet.
     *
     * @param carnet Número de carnet del estudiante a buscar.
     * @return El estudiante encontrado, o null si no se encuentra.
     */
    public Estudiante buscarEstudiante(String carnet) {
        for (Estudiante estudiante : estudiantes) {
            if (estudiante != null && estudiante.getCarnet().equals(carnet)) {
                return estudiante;
            }
        }
        return null;
    }
}
