/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA 
 * SEGUNDO SEMESTRE 2024 
 * PROGRAMACIÓN ORIENTADA A OBJETOS 
 * 
 * Clase Seccion
 * 
 * Esta clase representa una sección dentro de un puerto, donde los contenedores 
 * pueden ser almacenados, movidos o eliminados. Cada sección tiene una capacidad máxima 
 * de peso y una cuadrícula que organiza los contenedores por filas y columnas. 
 * 
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024 
 * Última modificación: 5/09/2024
 */
public class Seccion {

    /** 
     * Matriz bidimensional que representa la cuadrícula de contenedores en la sección.
     */
    private Contenedor[][] grid;

    /** 
     * Número de filas de la cuadrícula.
     */
    private int rows;

    /** 
     * Número de columnas de la cuadrícula.
     */
    private int columns;

    /** 
     * Capacidad máxima de peso que la sección puede soportar.
     */
    private int capacidad;

    /** 
     * Peso total de los contenedores almacenados en la sección.
     */
    private int pesoTotal;

    /**
     * Constructor de la clase Seccion. Inicializa una sección con un número específico 
     * de filas, columnas y una capacidad máxima de peso.
     * 
     * @param rows Número de filas en la sección.
     * @param columns Número de columnas en la sección.
     * @param capacidad Capacidad máxima de peso de la sección.
     */
    public Seccion(int rows, int columns, int capacidad){
        this.rows = rows;
        this.columns = columns;
        this.capacidad = capacidad;
        this.pesoTotal = 0;
        this.grid = new Contenedor[rows][columns];
    }

    /**
     * Obtiene la capacidad máxima de peso que la sección puede soportar.
     * 
     * @return La capacidad de la sección.
     */
    public int getCapacidad(){
        return this.capacidad;
    }

    /**
     * Obtiene el peso total de los contenedores almacenados en la sección.
     * 
     * @return El peso total de la sección.
     */
    public int getPesoTotal(){
        return this.pesoTotal;
    }

    /**
     * Actualiza el peso total de la sección sumando el peso de un nuevo contenedor.
     * 
     * @param peso El peso a agregar al peso total de la sección.
     */
    public void setPesoTotal(int peso){
        this.pesoTotal = this.pesoTotal + peso;
    }

    /**
     * Obtiene el contenedor en una posición específica dentro de la cuadrícula de la sección.
     * 
     * @param fila La fila donde se encuentra el contenedor.
     * @param columna La columna donde se encuentra el contenedor.
     * @return El contenedor en la posición dada, o null si no hay contenedor en esa posición.
     */
    public Contenedor getContenedor(int fila, int columna) {
        return grid[fila][columna];
    }

    /**
     * Agrega un contenedor a la primera posición vacía de la sección, siempre y cuando 
     * no exceda la capacidad de peso de la sección.
     * 
     * @param contenedor El contenedor a agregar.
     * @return true si el contenedor se agregó exitosamente, false si no se pudo agregar.
     */
    public boolean setContenedor(Contenedor contenedor){
        if(this.getPesoTotal() + contenedor.getPeso() <= this.getCapacidad() && this.contarLlenos() < this.rows * this.columns){
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] == null) {  
                        grid[i][j] = contenedor;  
                        this.setPesoTotal(contenedor.getPeso());  
                        return true; 
                    }
                }
            }
        }
        return false; 
    }

    /**
     * Encuentra la posición de un contenedor en la cuadrícula de la sección.
     * 
     * @param id El identificador del contenedor a buscar.
     * @return Un arreglo con la fila y columna donde se encuentra el contenedor, o null si no se encuentra.
     */
    public int[] posicionContenedor(int id) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null && grid[i][j].getID() == id) {
                    return new int[]{i, j};  
                }
            }
        }
        return null;  
    }

    /**
     * Mueve un contenedor a una nueva posición dentro de la cuadrícula de la sección.
     * 
     * @param contenedor El contenedor a mover.
     * @param row La fila de destino.
     * @param column La columna de destino.
     */
    public void moverContenedor(Contenedor contenedor, int row, int column){
        grid[row][column] = contenedor;
    }

    /**
     * Elimina un contenedor de una posición específica en la cuadrícula.
     * 
     * @param row La fila de la cual se eliminará el contenedor.
     * @param column La columna de la cual se eliminará el contenedor.
     */
    public void eliminarContenedor(int row, int column){
        grid[row][column] = null;
    }

    /**
     * Cuenta cuántas posiciones de la cuadrícula están ocupadas por contenedores.
     * 
     * @return El número de posiciones ocupadas.
     */
    private int contarLlenos() {
        int contador = 0; 
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null) {
                    contador++;
                }
            }
        }  
        return contador;
    }

    /**
     * Verifica si una posición específica en la cuadrícula está disponible.
     * 
     * @param row La fila a verificar.
     * @param column La columna a verificar.
     * @return true si la posición está disponible, false si ya está ocupada.
     */
    public boolean disponible(int row, int column){
        return grid[row][column] == null;
    }

    /**
     * Muestra la información de todos los contenedores almacenados en la sección.
     * 
     * @return Un String con los detalles de cada contenedor, incluyendo su ID, producto, peso y destino.
     */
    public String mostrarContenedores() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null) { 
                    Contenedor contenedor = grid[i][j];
                    sb.append("ID: ").append(contenedor.getID()).append("\n")
                      .append("Producto: ").append(contenedor.getNombreProducto()).append("\n")
                      .append("Peso: ").append(contenedor.getPeso()).append(" kg\n")
                      .append("Destino: ").append(contenedor.getDestino())
                      .append("\n")
                      .append("-------------------------------\n");
                }
            }
        }
        return sb.toString();
    }

}
