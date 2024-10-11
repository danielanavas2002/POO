/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase MatrizCuadrada
 * Clase que representa una matriz cuadrada, hereda la clase base Matriz.
 * Esta clase proporciona funcionalidades para calcular el determinante 
 * de la matriz y verificar si es invertible.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

import java.util.Random;

public class MatrizCuadrada extends Matriz {
    /** 
     * Indica si la matriz es invertible. 
     */
    private boolean invertible;
    
    /** 
     * Almacena el valor del determinante de la matriz.
     */
    private int determinante;

    /**
     * Constructor para crear una matriz cuadrada.
     *
     * @param filas número de filas de la matriz
     * @param columnas número de columnas de la matriz
     * @param estado estado inicial de la matriz
     * @param invertible indica si la matriz es invertible
     */
    public MatrizCuadrada(int filas, int columnas, String estado, boolean invertible) {
        super(filas, columnas, estado); // Llama al constructor de la clase base Matriz
        this.invertible = invertible; // Asigna el valor de invertible
        this.calcular(); // Calcula el determinante y la invertibilidad de la matriz
    }

    /**
     * Obtiene el valor de la propiedad invertible.
     *
     * @return true si la matriz es invertible, false en caso contrario
     */
    public boolean getInvertible() {
        return this.invertible; // Retorna el estado de la propiedad invertible
    }

    /**
     * Obtiene el valor del determinante de la matriz.
     *
     * @return el valor del determinante
     */
    public int getDeterminante() {
        return this.determinante; // Retorna el valor del determinante
    }

    /**
     * Establece el valor de la propiedad invertible.
     *
     * @param invertible nuevo valor para la propiedad invertible
     */
    public void setInvertible(boolean invertible) {
        this.invertible = invertible; // Asigna el nuevo valor a la propiedad invertible
    }

    /**
     * Establece el valor del determinante.
     *
     * @param determinante nuevo valor para el determinante
     */
    public void setDeterminante(int determinante) {
        this.determinante = determinante; // Asigna el nuevo valor al determinante
    }

    /**
     * Calcula el determinante de la matriz de manera aleatoria
     * y determina si la matriz es invertible o no.
     */
    @Override
    public void calcular() {
        Random random = new Random(); // Crea una instancia de Random para generar números aleatorios
        int det = random.nextInt((100 - 0) + 1) + 0; // Genera un número aleatorio entre 0 y 100
        this.determinante = det; // Asigna el valor del determinante

        // Verifica si el determinante es cero
        if (det == 0) {
            this.invertible = false; // La matriz no es invertible
        } else {
            this.invertible = true; // La matriz es invertible
        }
    }

    /**
     * Devuelve una representación en cadena de la matriz cuadrada.
     *
     * @return cadena con la información de la matriz
     */
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------------------------------------\n" +
               "Matriz Cuadrada #" + this.getID() + ": \n" +
               "Filas: " + this.getFilas() + ", " +
               "Columnas: " + this.getColumnas() + ", " +
               "Estado: " + this.getEstado() + ", " +
               "Determinante: " + this.getDeterminante() + ", " +
               (invertible ? "Invertible" : "No Invertible") + "\n" +
               "------------------------------------------------------------------------------------------------------------------\n";
        // Formatea la información de la matriz en una cadena legible
    }
}
