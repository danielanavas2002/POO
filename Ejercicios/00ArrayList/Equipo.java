/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Equipo Class 
 * Almacena datos sobre el nombre del equipo, si es colectivo, la 
 * cantidad de deportistas (hombres y mujeres) y las medallas obtenidas (oro, plata, bronce). 
 * Proporciona métodos para acceder y modificar esta información, así como para obtener el total 
 * de medallas.
 *
 * @author Daniela Navas
 * Fecha de creación: 26/08/2024
 * Última modificación: 16/08/2024
 */
class Equipo {
    
    private String equipo;
    private boolean colectivo;
    private int hombres;
    private int mujeres;
    private int oro;
    private int plata;
    private int bronce;

    /**
     * Crea una nueva instancia de Equipo con la información proporcionada.
     * 
     * @param equipo Nombre del equipo.
     * @param colectivo {true} si el equipo es colectivo, {false} en caso contrario.
     * @param hombres Cantidad de deportistas hombres en el equipo.
     * @param mujeres Cantidad de deportistas mujeres en el equipo.
     * @param oro Cantidad de medallas de oro obtenidas por el equipo.
     * @param plata Cantidad de medallas de plata obtenidas por el equipo.
     * @param bronce Cantidad de medallas de bronce obtenidas por el equipo.
     */
    public Equipo(String equipo, boolean colectivo, int hombres, int mujeres, int oro, int plata, int bronce) {
        this.equipo = equipo;
        this.colectivo = colectivo;
        this.hombres = hombres;
        this.mujeres = mujeres;
        this.oro = oro;
        this.plata = plata;
        this.bronce = bronce;
    }
  
    /**
     * Obtiene el nombre del equipo.
     * 
     * @return El nombre del equipo.
     */
    public String getEquipo() {
        return equipo;
    }

    /**
     * Obtiene si el equipo es colectivo.
     * 
     * @return {true} si el equipo es colectivo, {false} en caso contrario.
     */
    public boolean getColectivo() {
        return colectivo;
    }

    /**
     * Obtiene la cantidad de deportistas hombres en el equipo.
     * 
     * @return La cantidad de deportistas hombres.
     */
    public int getHombres() {
        return hombres;
    }

    /**
     * Obtiene la cantidad de deportistas mujeres en el equipo.
     * 
     * @return La cantidad de deportistas mujeres.
     */
    public int getMujeres() {
        return mujeres;
    }

    /**
     * Obtiene la cantidad de medallas de oro obtenidas por el equipo.
     * 
     * @return La cantidad de medallas de oro.
     */
    public int getOro() {
        return oro;
    }

    /**
     * Obtiene la cantidad de medallas de plata obtenidas por el equipo.
     * 
     * @return La cantidad de medallas de plata.
     */
    public int getPlata() {
        return plata;
    }

    /**
     * Obtiene la cantidad de medallas de bronce obtenidas por el equipo.
     * 
     * @return La cantidad de medallas de bronce.
     */
    public int getBronce() {
        return bronce;
    }

    /**
     * Establece el nombre del equipo.
     * 
     * @param equipo Nombre del equipo a establecer.
     */
    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    /**
     * Establece si el equipo es colectivo.
     * 
     * @param colectivo {@code true} si el equipo es colectivo, {@code false} en caso contrario.
     */
    public void setColectivo(boolean colectivo) {
        this.colectivo = colectivo;
    }

    /**
     * Establece la cantidad de deportistas hombres en el equipo.
     * 
     * @param hombres Cantidad de deportistas hombres a establecer.
     */
    public void setHombres(int hombres) {
        this.hombres = hombres;
    }

    /**
     * Establece la cantidad de deportistas mujeres en el equipo.
     * 
     * @param mujeres Cantidad de deportistas mujeres a establecer.
     */
    public void setMujeres(int mujeres) {
        this.mujeres = mujeres;
    }

    /**
     * Establece la cantidad de medallas de oro obtenidas por el equipo.
     * 
     * @param oro Cantidad de medallas de oro a establecer.
     */
    public void setOro(int oro) {
        this.oro = oro;
    }

    /**
     * Establece la cantidad de medallas de plata obtenidas por el equipo.
     * 
     * @param plata Cantidad de medallas de plata a establecer.
     */
    public void setPlata(int plata) {
        this.plata = plata;
    }

    /**
     * Establece la cantidad de medallas de bronce obtenidas por el equipo.
     * 
     * @param bronce Cantidad de medallas de bronce a establecer.
     */
    public void setBronce(int bronce) {
        this.bronce = bronce;
    }

    /**
     * Calcula el total de medallas obtenidas por el equipo, sumando las medallas de oro, plata y 
     * bronce.
     * 
     * @return El total de medallas obtenidas por el equipo.
     */
    public int totalMedallas() {
        return oro + plata + bronce;
    }

    /**
     * Devuelve una representación en cadena del Equipo.
     * 
     * @return Una cadena que describe el equipo, incluyendo el nombre, si es colectivo, el número 
     *         total de deportistas y el número de medallas obtenidas.
     */
    @Override
    public String toString() {
        return "Equipo: " + equipo + ", Colectivo: " + colectivo + ", Deportistas: " + (hombres + mujeres) 
               + ", Medallas: Oro-" + oro + ", Plata-" + plata + ", Bronce-" + bronce;
    }
}
