/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Puerto 
 *
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024
 * Última modificación: 5/09/2024
 */

public class Puerto {
    private Seccion[] secciones;
    private int rows;

    public Puerto(int rows){
        this.rows = rows;
        this.secciones = new Seccion[rows];
    }

    public void setSeccion(Seccion seccion){
        for (int i = 0; i < secciones.length; i++) {
            if (secciones[i] == null) {  
                secciones[i] = seccion;  
            }
        }
    }

}
