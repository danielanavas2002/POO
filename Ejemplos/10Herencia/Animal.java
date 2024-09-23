public class Animal {
    protected String nombre_cientifico;

    public Animal(String nombre_cientifico){
        this.nombre_cientifico = nombre_cientifico;
    }

    protected String hablar(){
        return "El animal está hablando";
    }
    
}
