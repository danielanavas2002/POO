/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Animal 
 * Clase abstracta que representa un animal en el zoológico.
 * Contiene atributos y métodos que deben ser implementados por
 * las subclases que representen tipos específicos de animales.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

public abstract class Animal {
    protected String nombreCientifico;      // Nombre científico del animal
    protected String descripcionHabitat;     // Descripción del hábitat del animal
    protected int esperanzaVida;             // Esperanza de vida del animal
    protected int id;                        // Identificador único del animal

    private static int contadorid = 1;      // Contador estático para generar IDs únicos

    /**
     * Constructor de la clase Animal.
     *
     * @param nombreCientifico Nombre científico del animal
     * @param descripcionHabitat Descripción del hábitat del animal
     * @param esperanzaVida Esperanza de vida del animal
     */
    public Animal(String nombreCientifico, String descripcionHabitat, int esperanzaVida) {
        this.nombreCientifico = nombreCientifico;
        this.descripcionHabitat = descripcionHabitat;
        this.esperanzaVida = esperanzaVida;
        this.id = contadorid;  // Asignar el ID único
        contadorid++;          // Incrementar el contador para el próximo objeto
    }

    /**
     * Obtiene el nombre científico del animal.
     *
     * @return Nombre científico del animal
     */
    public String getNombreCientifico() {
        return nombreCientifico;
    }

    /**
     * Obtiene la descripción del hábitat del animal.
     *
     * @return Descripción del hábitat del animal
     */
    public String getDescripcionHabitat() {
        return descripcionHabitat;
    }

    /**
     * Obtiene la esperanza de vida del animal.
     *
     * @return Esperanza de vida del animal
     */
    public int getEsperanzaVida() {
        return esperanzaVida;
    }

    /**
     * Obtiene el identificador único del animal.
     *
     * @return ID único del animal
     */
    public int getId() {
        return id;
    }

    /**
     * Establece el nombre científico del animal.
     *
     * @param nombreCientifico Nuevo nombre científico del animal
     */
    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    /**
     * Establece la descripción del hábitat del animal.
     *
     * @param descripcionHabitat Nueva descripción del hábitat del animal
     */
    public void setDescripcionHabitat(String descripcionHabitat) {
        this.descripcionHabitat = descripcionHabitat;
    }

    /**
     * Establece la esperanza de vida del animal.
     *
     * @param esperanzaVida Nueva esperanza de vida del animal
     */
    public void setEsperanzaVida(int esperanzaVida) {
        this.esperanzaVida = esperanzaVida;
    }

    /**
     * Establece el identificador único del animal (no recomendado modificar).
     *
     * @param id Nuevo ID del animal
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Método abstracto que debe ser implementado para definir el tamaño del animal.
     */
    public abstract void definirTamaño();

    /**
     * Método abstracto que debe ser implementado para calcular el área mínima que
     * necesita el animal.
     */
    public abstract void calcularAreaMinima();

    /**
     * Método abstracto que debe ser implementado para calcular la cantidad de comida
     * diaria que requiere el animal.
     *
     * @return Cantidad de comida diaria en kg
     */
    public abstract float calcularComidaDiaria();

    /**
     * Método abstracto que debe ser implementado para calcular el costo de
     * mantenimiento del animal.
     *
     * @return Costo de mantenimiento en unidades monetarias
     */
    public abstract float calcularCostoMantenimiento();

    /**
     * Método abstracto que debe ser implementado para desplegar la cantidad de comida
     * diaria requerida por el animal.
     *
     * @return Descripción de la comida diaria
     */
    public abstract String desplegarComidaDiaria();

    /**
     * Método abstracto que debe ser implementado para desplegar el espacio mínimo
     * necesario en el recinto del animal.
     *
     * @return Descripción del espacio requerido
     */
    public abstract String desplegarEspacioRecinto();

    /**
     * Método abstracto que debe ser implementado para obtener la representación
     * en cadena de texto del animal.
     *
     * @return Cadena que representa al animal
     */
    public abstract String toString();

    /**
     * Método abstracto que debe ser implementado para obtener el área mínima que
     * necesita el animal.
     *
     * @return Área mínima en m²
     */
    public abstract float getAreaMinima();

    /**
     * Método abstracto que debe ser implementado para establecer la longitud del animal.
     *
     * @param longitud Nueva longitud del animal en metros
     */
    public abstract void setLongitud(float longitud);

    /**
     * Método abstracto que debe ser implementado para establecer la dieta del animal.
     *
     * @param dieta Nueva dieta del animal
     */
    public abstract void setDieta(String dieta);

    /**
     * Método abstracto que debe ser implementado para establecer si el animal
     * está en peligro de extinción.
     *
     * @param enPeligroExtincion Estado de peligro de extinción del animal
     */
    public abstract void setEnPeligroExtincion(boolean enPeligroExtincion);

    /**
     * Método abstracto que debe ser implementado para establecer el peso del animal.
     *
     * @param peso Nuevo peso del animal en kg
     */
    public abstract void setPeso(float peso);

    /**
     * Método abstracto que debe ser implementado para establecer el promedio de
     * huevos que pone el animal.
     *
     * @param promedioHuevos Nuevo promedio de huevos
     */
    public abstract void setPromedioHuevos(int promedioHuevos);

    /**
     * Método abstracto que debe ser implementado para establecer la especie del animal.
     *
     * @param Especie Nueva especie del animal
     */
    public abstract void setEspecie(String Especie);

    /**
     * Método abstracto que debe ser implementado para establecer la temperatura
     * corporal del animal.
     *
     * @param temperaturaCorporal Nueva temperatura corporal del animal
     */
    public abstract void setTemperaturaCorporal(float temperaturaCorporal);
}
