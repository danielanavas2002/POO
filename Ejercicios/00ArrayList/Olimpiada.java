/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Olimpiada Class 
 * Gestiona los datos de los equipos participantes en una olimpiada 
 * específica, así como los resultados de medallas obtenidas en las últimas olimpiadas. Permite 
 * realizar consultas como el total de deportistas, el total de medallas obtenidas, el equipo 
 * colectivo con más medallas de oro, y comparar los resultados con el promedio de las últimas 5 
 * olimpiadas.
 *
 * @author Daniela Navas
 * Fecha de creación: 26/08/2024
 * Última modificación: 16/08/2024
 */

import java.util.ArrayList;

class Olimpiada {
    
    private ArrayList<Equipo> equipos;
    private ArrayList<Integer> medallasAnteriores;

    /**
     * Crea una nueva instancia de Olimpiada con los equipos participantes y los resultados 
     * de medallas obtenidas en olimpiadas anteriores.
     * 
     * @param equipos Lista de equipos que participan en la olimpiada.
     * @param medallasAnteriores Lista de resultados de medallas obtenidas en las últimas olimpiadas.
     */
    public Olimpiada(ArrayList<Equipo> equipos, ArrayList<Integer> medallasAnteriores) {
        this.equipos = equipos;
        this.medallasAnteriores = medallasAnteriores;
    }

    /**
     * Obtiene la lista de equipos participantes en la olimpiada.
     * 
     * @return Lista de equipos.
     */
    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    /**
     * Establece la lista de equipos participantes en la olimpiada.
     * 
     * @param equipos Lista de equipos a establecer.
     */
    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    /**
     * Obtiene la lista de resultados de medallas obtenidas en olimpiadas anteriores.
     * 
     * @return Lista de medallas anteriores.
     */
    public ArrayList<Integer> getMedallasAnteriores() {
        return medallasAnteriores;
    }

    /**
     * Establece la lista de resultados de medallas obtenidas en olimpiadas anteriores.
     * 
     * @param medallasAnteriores Lista de medallas anteriores a establecer.
     */
    public void setMedallasAnteriores(ArrayList<Integer> medallasAnteriores) {
        this.medallasAnteriores = medallasAnteriores;
    }

    /**
     * Calcula el total de deportistas en todos los equipos de la olimpiada.
     * 
     * @return El total de deportistas (hombres y mujeres) en la olimpiada.
     */
    public int totalDeportistas() {
        int total = 0;
        for (Equipo equipo : equipos) {
            total += equipo.getHombres() + equipo.getMujeres();
        }
        return total;
    }

    /**
     * Calcula el total de medallas obtenidas por todos los equipos de la olimpiada.
     * 
     * @return El total de medallas obtenidas en la olimpiada.
     */
    public int totalMedallas() {
        int total = 0;
        for (Equipo equipo : equipos) {
            total += equipo.totalMedallas();
        }
        return total;
    }

    /**
     * Determina el equipo colectivo con la mayor cantidad de medallas de oro.
     * 
     * @return El equipo colectivo con más medallas de oro, o i no hay equipos 
     *         colectivos con medallas de oro.
     */
    public Equipo oroColectivo() {
        Equipo mejorEquipo = null;
        int maxOro = 0;
        for (Equipo equipo : equipos) {
            if (equipo.getColectivo() && equipo.getOro() > maxOro) {
                maxOro = equipo.getOro();
                mejorEquipo = equipo;
            }
        }
        return mejorEquipo;
    }

    /**
     * Compara el total de medallas obtenidas en la olimpiada actual con el promedio de medallas 
     * obtenidas en las últimas 5 olimpiadas.
     * 
     * @return {true} si el total de medallas obtenidas en la olimpiada actual es mayor que 
     *         el promedio de las últimas 5 olimpiadas, {false} en caso contrario.
     */
    public boolean promedio() {
        int totalMedallasParis = totalMedallas();
        int sumaMedallasAnteriores = 0;
        
        for (int medallas : medallasAnteriores) {
            sumaMedallasAnteriores += medallas;
        }
        
        double promedio = (double) sumaMedallasAnteriores / medallasAnteriores.size(); 
        return totalMedallasParis > promedio;
    }

    /**
     * Obtiene el promedio de medallas obtenidas en las últimas 5 olimpiadas.
     * 
     * @return El promedio de medallas obtenidas en las últimas 5 olimpiadas.
     */
    public double getPromedio() {
        int sumaMedallasAnteriores = 0;
        
        for (int medallas : medallasAnteriores) {
            sumaMedallasAnteriores += medallas;
        }
        
        return (double) sumaMedallasAnteriores / medallasAnteriores.size(); 
    }

    /**
     * Devuelve una representación en cadena de Olimpiada.
     * 
     * @return Una cadena que describe la olimpiada.
     */
    public String toString() {
        return "Olimpiada con " + equipos.size() + " equipos.";
    }
}
