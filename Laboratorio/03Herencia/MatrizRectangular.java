/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase MatrizRectangular
 * Clase que representa una matriz rectangular, hereda de la clase base Matriz.
 * Esta clase proporciona funcionalidades específicas para determinar si 
 * dos matrices pueden ser sumadas o multiplicadas y gestionar su estado.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

public class MatrizRectangular extends Matriz {
    /** 
     * Indica si la matriz puede ser sumada. 
     * Inicialmente se establece en true.
     */
    private boolean sumable;
    
    /** 
     * Indica si la matriz puede ser multiplicada. 
     * Inicialmente se establece en true.
     */
    private boolean multiplicable;

    /**
     * Constructor para crear una matriz rectangular.
     *
     * @param filas número de filas de la matriz
     * @param columnas número de columnas de la matriz
     * @param estado estado inicial de la matriz
     */
    public MatrizRectangular(int filas, int columnas, String estado){
        super(filas, columnas, estado); // Llama al constructor de la clase base Matriz
    }

    /**
     * Obtiene el valor de la propiedad sumable.
     *
     * @return true si la matriz es sumable, false en caso contrario
     */
    public boolean getSumable(){
        return this.sumable; // Retorna el estado de la propiedad sumable
    }

    /**
     * Obtiene el valor de la propiedad multiplicable.
     *
     * @return true si la matriz es multiplicable, false en caso contrario
     */
    public boolean getMultiplicable(){
        return this.multiplicable; // Retorna el estado de la propiedad multiplicable
    }

    /**
     * Establece el valor de la propiedad sumable.
     *
     * @param sumable nuevo valor para la propiedad sumable
     */
    public void setSumable(boolean sumable){
        this.sumable = sumable; // Asigna el nuevo valor a la propiedad sumable
    }

    /**
     * Establece el valor de la propiedad multiplicable.
     *
     * @param multiplicable nuevo valor para la propiedad multiplicable
     */
    public void setMultiplicable(boolean multiplicable){
        this.multiplicable = multiplicable; // Asigna el nuevo valor a la propiedad multiplicable
    }

    /**
     * Verifica si dos matrices pueden ser sumadas.
     *
     * @param matrizA primera matriz a verificar
     * @param matrizB segunda matriz a verificar
     * @return true si ambas matrices tienen las mismas dimensiones, false en caso contrario
     */
    public boolean puedeSumar(MatrizRectangular matrizA, MatrizRectangular matrizB){
        return matrizA.getFilas() == matrizB.getFilas() && matrizA.getColumnas() == matrizB.getColumnas(); 
        // Retorna true si ambas matrices tienen el mismo número de filas y columnas
    }

    /**
     * Verifica si dos matrices pueden ser multiplicadas.
     *
     * @param matrizA primera matriz a verificar
     * @param matrizB segunda matriz a verificar
     * @return true si las columnas de la primera matriz son iguales a las filas de la segunda, false en caso contrario
     */
    public boolean puedeMultiplicar(MatrizRectangular matrizA, MatrizRectangular matrizB){
        return matrizB.getColumnas() == matrizA.getFilas(); 
        // Retorna true si las columnas de matrizB son iguales a las filas de matrizA
    }

    /**
     * Cambia el estado de la matriz a "Resuelto" mientra se define que hacer con él.
     */
    @Override
    public void calcular(){
        this.estado = "Resuelto"; // Actualiza el estado de la matriz
    }

    /**
     * Devuelve una representación en cadena de la matriz rectangular.
     *
     * @return cadena con la información de la matriz
     */
    @Override
    public String toString() {
        return "------------------------------------------------------------------------------------------------------------------\n" +
               "Matriz Rectangular #" + this.getID() + ": \n" +
               "Filas: " + this.getFilas() + ", " +
               "Columnas: " + this.getColumnas() + ", " +
               "Estado: " + this.getEstado() + "\n" +
               "------------------------------------------------------------------------------------------------------------------\n";
        // Formatea la información de la matriz en una cadena legible
    }
}
