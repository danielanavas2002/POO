/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Seccion 
 *
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024
 * Última modificación: 5/09/2024
 */

public class Seccion {
    private Contenedor[][] grid;
    private int rows, columns, capacidad, pesoTotal;

    public Seccion(int rows, int columns, int capacidad){
        this.rows = rows;
        this.columns = columns;
        this.capacidad = capacidad;
        this.pesoTotal = 0;
        this.grid = new Contenedor[rows][columns];
    }

    public int getCapacidad(){
        return this.capacidad;
    }

    public int getPesoTotal(){
        return this.pesoTotal;
    }

    public void setPesoTotal(int Peso){
        this.pesoTotal = this.pesoTotal + Peso;
    }

    public Contenedor getContenedor(int fila, int columna) {
        return grid[fila][columna];
    }

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

    public void moverContenedor(Contenedor contenedor, int row, int colum){
        grid[row][colum] = contenedor;
    }

    public void eliminarContenedor(int row, int column){
        grid[row][column] = null;
    }

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

    public boolean disponible(int row, int column){
        if(grid[row][column] == null){
            return true;
        }
        return false;
    }

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
