/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Cancion
 * Clase que representa una canción.
 * Una canción tiene un nombre, duración, autor y género.
 * 
 * @author Daniela Navas
 * Fecha de creación: 14/10/2024
 * Última modificación: 15/10/2024
 */
public class Cancion {
    // Atributos
    private String nombre; // Nombre de la canción.
    private double duracion; // Duración de la canción en minutos.
    private String autor; // Autor o intérprete de la canción.
    private String genero;  // Género musical de la canción.

    /**
     * Constructor que inicializa una canción con el nombre, duración, autor y género proporcionados.
     * 
     * @param nombre El nombre de la canción.
     * @param duracion La duración de la canción en minutos.
     * @param autor El autor o intérprete de la canción.
     * @param genero El género musical de la canción.
     */
    public Cancion(String nombre, double duracion, String autor, String genero) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.autor = autor;
        this.genero = genero;
    }

    /**
     * Obtiene el nombre de la canción.
     * 
     * @return El nombre de la canción.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la duración de la canción en minutos.
     * 
     * @return La duración de la canción en minutos.
     */
    public double getDuracion() {
        return duracion;
    }

    /**
     * Obtiene el autor o intérprete de la canción.
     * 
     * @return El autor o intérprete de la canción.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Obtiene el género musical de la canción.
     * 
     * @return El género musical de la canción.
     */
    public String getGenero() {
        return genero;
    }
}
