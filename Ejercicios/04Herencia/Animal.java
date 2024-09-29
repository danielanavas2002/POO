/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Animal 
 * La clase Animal representa un animal genérico en un zoológico.
 * Proporciona información básica sobre el animal, como su nombre científico,
 * hábitad, esperanza de vida y un identificador único.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

public class Animal {
    private String nombreCientifico;  // Nombre científico del animal
    private String descripcionHabitat; // Descripción del hábitat del animal
    private int esperanzaVida;         // Esperanza de vida del animal en años
    private int id;                    // Identificador único del animal

    // Atributo estático para generar IDs únicos
    private static int contadorId = 1; // Contador para la generación de IDs

    /**
     * Constructor de la clase Animal.
     *
     * @param nombreCientifico nombre científico del animal
     * @param descripcionHabitat descripción del hábitat del animal
     * @param esperanzaVida esperanza de vida del animal en años
     */
    public Animal(String nombreCientifico, String descripcionHabitat, int esperanzaVida) {
        this.nombreCientifico = nombreCientifico;
        this.descripcionHabitat = descripcionHabitat;
        this.esperanzaVida = esperanzaVida;
        this.id = contadorId;  // Asignar el ID único
        contadorId++;          // Incrementar el contador para el próximo objeto
    }

    /**
     * Obtiene el nombre científico del animal.
     *
     * @return el nombre científico
     */
    public String getNombreCientifico() {
        return nombreCientifico; // Devuelve el nombre científico
    }

    /**
     * Obtiene la descripción del hábitat del animal.
     *
     * @return la descripción del hábitat
     */
    public String getDescripcionHabitat() {
        return descripcionHabitat; // Devuelve la descripción del hábitat
    }

    /**
     * Obtiene la esperanza de vida del animal.
     *
     * @return la esperanza de vida en años
     */
    public int getEsperanzaVida() {
        return esperanzaVida; // Devuelve la esperanza de vida
    }

    /**
     * Obtiene el identificador único del animal.
     *
     * @return el ID único del animal
     */
    public int getId() {
        return id; // Devuelve el ID
    }

    /**
     * Calcula el costo de mantenimiento del animal.
     * Este método puede ser sobrescrito por subclases para proporcionar
     * un cálculo específico.
     *
     * @return el costo de mantenimiento, por defecto es 0
     */
    public float calcularCostoMantenimiento() {
        return 0; // Valor predeterminado se sobreescribe
    }

    /**
     * Obtiene el área mínima requerida para el animal.
     * Este método puede ser sobrescrito por subclases para proporcionar
     * un valor específico.
     *
     * @return el área mínima, por defecto es 0
     */
    public float getAreaMinima() {
        return 0; // Valor predeterminado se sobreescribe
    }

    /**
     * Calcula la cantidad de comida diaria necesaria para el animal.
     * Este método puede ser sobrescrito por subclases para proporcionar
     * un cálculo específico.
     *
     * @return la cantidad de comida diaria, por defecto es un mensaje
     */
    public String calcularComidaDiaria() {
        return "No defino"; // Valor predeterminado se sobreescribe
    }
}
