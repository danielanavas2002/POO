class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante(String nombre, int age){
        this.nombre = nombre;
        this.edad = age;
    }

    public String getNombre() {
        return this.nombre;
    }

    
    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int age){
        this.edad = age;
    }
    
}
