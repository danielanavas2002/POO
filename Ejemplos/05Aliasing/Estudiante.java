public class Estudiante {
    private String nombre, carrera;
    private int carnet;

    public Estudiante(String nombre, String carrera, int carnet){
        this.nombre = nombre;
        this.carrera = carrera;
        this.carnet = carnet;
    }

    public int getCarnet() {
        return carnet;
    }

    public String getCarrera() {
        return carrera;
    }

    public String getNombre() {
        return nombre;
    }

    
}
