/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Contenedor 
 *
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024
 * Última modificación: 5/09/2024
 */

public class Contenedor {
    private int id, peso;
    private String numero, nombreProducto, destino;

    public Contenedor(int id, String numero, String nombreProducto, String destino, int peso){
        this.id = id;
        this.numero = numero;
        this.nombreProducto = nombreProducto;
        this.destino = destino;
        this.peso = peso;
    }

    public int getID(){
        return this.id;
    }

    public String getNumero(){
        return this.numero;
    }

    public String getNombreProducto(){
        return this.nombreProducto;
    }

    public String getDestino(){
        return this.destino;
    }

    public int getPeso(){
        return this.peso;
    }   
}
