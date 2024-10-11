/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Matriz
 * Clase abstracta que representa una matriz, extendiendo la clase base OperacionMatematica.
 * Esta clase sirve como base para matrices rectangulares y cuadradas.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

public abstract class Matriz extends OperacionMatematica {

    /**
     * Constructor para crear una matriz con el número de filas, columnas y estado.
     *
     * @param filas número de filas de la matriz
     * @param columnas número de columnas de la matriz
     * @param estado estado inicial de la matriz
     */
    public Matriz(int filas, int columnas, String estado) {
        super(filas, columnas, estado); // Llama al constructor de la clase base OperacionMatematica
    }
}
