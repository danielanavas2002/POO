import java.util.ArrayList;

class Olimpiada {
    private ArrayList<Equipo> equipos;
    private ArrayList<Integer> medallasAnteriores;

    // Constructor
    public Olimpiada(ArrayList<Equipo> equipos, ArrayList<Integer> medallasAnteriores) {
        this.equipos = equipos;
        this.medallasAnteriores = medallasAnteriores;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public ArrayList<Integer> getMedallasAnteriores() {
        return medallasAnteriores;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public void setMedallasAnteriores(ArrayList<Integer> medallasAnteriores) {
        this.medallasAnteriores = medallasAnteriores;
    }

    public int totalDeportistas() {
        int total = 0;
        for (Equipo equipo : equipos) {
            total += equipo.getHombres() + equipo.getMujeres();
        }
        return total;
    }

    public int totalMedallas() {
        int total = 0;
        for (Equipo equipo : equipos) {
            total += equipo.totalMedallas();
        }
        return total;
    }

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


    public boolean promedio() {
        int totalMedallasParis = totalMedallas();
        int sumaMedallasAnteriores = 0;
        
        for (int medallas : medallasAnteriores) {
            sumaMedallasAnteriores += medallas;
        }
        
        double promedio = (double) sumaMedallasAnteriores / medallasAnteriores.size(); 
        return totalMedallasParis > promedio;
    }

    public double getPromedio() {
        int totalMedallasParis = totalMedallas();
        int sumaMedallasAnteriores = 0;
        
        for (int medallas : medallasAnteriores) {
            sumaMedallasAnteriores += medallas;
        }
        
        double promedio = (double) sumaMedallasAnteriores / medallasAnteriores.size(); 
        return promedio;
    }

    public String toString() {
        return "Olimpiada con " + equipos.size() + " equipos.";
    }
}
