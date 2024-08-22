/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Empleado
 * Representa un empleado en el sistema.
 * Un empleado tiene un nombre y una identificación.
 *
 * @author Daniela Navas
 * Fecha de creación: 21/08/2024
 * Última modificación: 22/08/2024
 */
public class Empleado {
    private String nombre;
    private String identificacion;

    /**
     * Crea un nuevo empleado con el nombre y la identificación especificados.
     *
     * @param nombre El nombre del empleado.
     * @param identificacion La identificación del empleado.
     */
    public Empleado(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }

    /**
     * Obtiene el nombre del empleado.
     *
     * @return El nombre del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la identificación del empleado.
     *
     * @return La identificación del empleado.
     */
    public String getIdentificacion() {
        return identificacion;
    }
}
