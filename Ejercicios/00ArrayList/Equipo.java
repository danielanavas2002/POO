
class Equipo {
    private String equipo;
    private boolean colectivo;
    private int hombres;
    private int mujeres;
    private int oro;
    private int plata;
    private int bronce;

    // Constructor
    public Equipo(String equipo, boolean colectivo, int hombres, int mujeres, int oro, int plata, int bronce) {
        this.equipo = equipo;
        this.colectivo = colectivo;
        this.hombres = hombres;
        this.mujeres = mujeres;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }
  
    public String getEquipo() {
        return equipo;
    }

    public boolean getColectivo() {
        return colectivo;
    }

    public int getHombres() {
        return hombres;
    }

    public int getMujeres() {
        return mujeres;
    }

    public int getOro() {
        return oro;
    }

    public int getPlata() {
        return plata;
    }

    public int getBronce() {
        return bronce;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public void setColectivo(boolean colectivo) {
        this.colectivo = colectivo;
    }

    public void setHombres(int hombres) {
        this.hombres = hombres;
    }

    public void setMujeres(int mujeres) {
        this.mujeres = mujeres;
    }

    public void setOro(int oro) {
        this.oro = oro;
    }

    public void setPlata(int plata) {
        this.plata = plata;
    }

    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    public int totalMedallas() {
        return oro + plata + bronce ;
    }

    public String toString() {
        return "Equipo: " + equipo + ", Colectivo: " + colectivo + ", Deportistas: " + (hombres + mujeres) + ", Medallas: Oro-" + oro + ", Plata-" + plata + ", Bronce-" + bronce;
    }
}
