/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA 
 * SEGUNDO SEMESTRE 2024 
 * PROGRAMACIÓN ORIENTADA A OBJETOS 
 * 
 * Clase Puerto
 * 
 * Esta clase representa un puerto que contiene múltiples secciones donde 
 * se pueden almacenar o mover contenedores. Cada puerto está compuesto por un conjunto 
 * de secciones que son inicializadas al crear una instancia del puerto. 
 * 
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024 
 * Última modificación: 5/09/2024
 */
public class Puerto {

    /** 
     * Arreglo de secciones en el puerto. Cada sección representa un área de almacenamiento. 
     */
    private Seccion[] secciones;

    /** 
     * Cantidad de filas o número de secciones en el puerto. 
     */
    private int rows;

    /**
     * Constructor de la clase Puerto. Inicializa el puerto con un número específico de secciones.
     * 
     * @param rows Número de secciones que tendrá el puerto.
     */
    public Puerto(int rows){
        this.rows = rows;
        this.secciones = new Seccion[rows];
    }

    /**
     * Establece una sección en el puerto. El método recorre las secciones disponibles 
     * y agrega la nueva sección en la primera posición vacía.
     * 
     * @param seccion La sección a ser añadida al puerto.
     */
    public void setSeccion(Seccion seccion){
        for (int i = 0; i < secciones.length; i++) {
            if (secciones[i] == null) {  
                secciones[i] = seccion;  
                break; // Añadir break para evitar agregar la sección varias veces
            }
        }
    }
}
