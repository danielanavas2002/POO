/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Recinto 
 * La clase Recinto representa un recinto para reptiles en un zoológico.
 * Administra un conjunto de reptiles y proporciona métodos para agregar
 * reptiles y calcular costos asociados con su mantenimiento.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

import java.util.ArrayList;

public class Recinto {
    private int tamaño; // Tamaño del recinto
    private int presupuestoAnual; // Presupuesto anual para el recinto
    private int costoConstruccion; // Costo de construcción del recinto
    private ArrayList<Animal> reptiles; // Lista de reptiles en el recinto

    /**
     * Constructor de la clase Recinto.
     *
     * @param tamaño tamaño del recinto en metros cuadrados
     * @param presupuestoAnual presupuesto anual para el recinto
     * @param costoConstruccion costo de construcción del recinto
     */
    public Recinto(int tamaño, int presupuestoAnual, int costoConstruccion) {
        this.tamaño = tamaño; 
        this.presupuestoAnual = presupuestoAnual;
        this.costoConstruccion = costoConstruccion;
        this.reptiles = new ArrayList<>();  // Inicializa la lista de reptiles
    }

    /**
     * Agrega un reptil al recinto.
     *
     * @param reptil el reptil que se desea agregar
     */
    public void agregarReptil(Animal reptil) {
        reptiles.add(reptil); // Añade el reptil a la lista
    }

    /**
     * Obtiene el tamaño del recinto.
     *
     * @return tamaño del recinto
     */
    public int getTamaño() {
        return tamaño; // Devuelve el tamaño
    }

    /**
     * Obtiene el costo de construcción del recinto.
     *
     * @return costo de construcción
     */
    public int getCostoConstruccion() {
        return costoConstruccion; // Devuelve el costo de construcción
    }

    /**
     * Obtiene el presupuesto anual del recinto.
     *
     * @return presupuesto anual
     */
    public int getPresupuestoAnual() {
        return presupuestoAnual; // Devuelve el presupuesto anual
    }

    /**
     * Calcula el costo total de mantenimiento mensual de todos los reptiles en el recinto.
     *
     * @return una cadena que contiene el costo total de mantenimiento y detalles de cada reptil
     */
    public String calcularCostoTotalMantenimiento() {
        StringBuilder sb = new StringBuilder();
        float costoTotal = 0;
        // Calcula el costo total de mantenimiento sumando los costos individuales de cada reptil
        for (Animal reptil : reptiles) {
            costoTotal += reptil.calcularCostoMantenimiento(); // Este método debe estar en Serpiente y ReptilAcuatico
        }

        // Construye la cadena de detalle
        sb.append("--------------------------------------------").append("\n")
          .append(" Costo Total Mensual: Q").append(costoTotal).append("\n")
          .append("--------------------------------------------").append("\n")
          .append("DETALLE: ").append("\n").append("ID Reptil").append("\n");
        for (Animal reptil : reptiles) {
            sb.append(reptil.getId()).append(".          | Nombre Científico: ").append(reptil.getNombreCientifico())
              .append(" | Costo Mensual: Q").append(reptil.calcularCostoMantenimiento()).append("\n");
        }
        sb.append("--------------------------------------------").append("\n");
        return sb.toString(); 
    }

    /**
     * Calcula el tamaño utilizado por todos los reptiles en el recinto.
     *
     * @return tamaño utilizado en metros cuadrados
     */
    public float tamañoUsado() {
        float tamañoUsado = 0;
        // Suma el área mínima requerida por cada reptil
        for (Animal reptil : reptiles) {
            tamañoUsado += reptil.getAreaMinima(); // Este método debe estar en Serpiente y ReptilAcuatico
        }
        return tamañoUsado; // Devuelve el tamaño utilizado
    }

    /**
     * Muestra información sobre todos los reptiles en el recinto.
     *
     * @return una cadena con los detalles de cada reptil
     */
    public String mostrarReptiles() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------").append("\n")
          .append("ID Reptil").append("\n");
        for (Animal reptil : reptiles) {
            sb.append(reptil.getId()).append(". ").append(reptil.getNombreCientifico())
              .append(" | Hábitat: ").append(reptil.getDescripcionHabitat())
              .append(" | Esperanza de Vida: ").append(reptil.getEsperanzaVida()).append(" años").append("\n");
        }
        sb.append("--------------------------------------------").append("\n");
        return sb.toString(); 
    }

    /**
     * Muestra la cantidad diaria de comida necesaria para cada reptil en gramos.
     *
     * @return una cadena con la cantidad de comida diaria para cada reptil
     */
    public String mostrarCantidadComida() {
        StringBuilder sb = new StringBuilder();
        sb.append("--------------------------------------------").append("\n")
          .append("ID Reptil").append("\n");
        for (Animal reptil : reptiles) {
            sb.append(reptil.getId()).append(". ").append(reptil.getNombreCientifico())
              .append(": ").append(reptil.calcularComidaDiaria()).append(" gramos.").append("\n");
        }
        sb.append("--------------------------------------------").append("\n");
        return sb.toString(); 
    }
}
