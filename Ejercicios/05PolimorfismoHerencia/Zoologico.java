/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Zoologico 
 * La clase Zoologico representa un zoológico que contiene una lista de animales
 * y gestiona su mantenimiento, espacio y presupuesto.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

import java.util.ArrayList;

public class Zoologico {
    private int tamaño;                    // Tamaño del zoológico en metros cuadrados
    private int presupuestoAnual;          // Presupuesto anual del zoológico
    private int costoConstruccion;         // Costo de construcción del zoológico
    private ArrayList<Animal> animales;    // Lista de animales en el zoológico

    /**
     * Constructor de la clase Zoologico.
     *
     * @param tamaño Tamaño del zoológico en metros cuadrados
     * @param presupuestoAnual Presupuesto anual del zoológico
     * @param costoConstruccion Costo de construcción del zoológico
     */
    public Zoologico(int tamaño, int presupuestoAnual, int costoConstruccion){
        this.tamaño = tamaño; 
        this.presupuestoAnual = presupuestoAnual;
        this.costoConstruccion = costoConstruccion;
        this.animales = new ArrayList<>();
    }

    /**
     * Obtiene el tamaño del zoológico.
     *
     * @return Tamaño del zoológico en metros cuadrados
     */
    public int getTamaño() {
        return tamaño;
    }

    /**
     * Calcula el tamaño total usado por los animales en el zoológico.
     *
     * @return Tamaño usado en metros cuadrados
     */
    public float tamañoUsado() {
        float tamañoUsado = 0;
        for (Animal animal : animales) {
            tamañoUsado += animal.getAreaMinima(); 
        }
        return tamañoUsado; 
    }

    /**
     * Agrega un animal al zoológico.
     *
     * @param animal El animal a agregar
     */
    public void agregarAnimal(Animal animal) {
        animales.add(animal); // Añade el animal a la lista
    }

    /**
     * Elimina un animal del zoológico por su ID.
     *
     * @param id El ID del animal a eliminar
     * @return true si el animal fue eliminado, false si no se encontró
     */
    public boolean eliminarAnimal(int id) {
        Animal animalAEliminar = buscarAnimalPorID(id); // Busca el animal por ID
        if (animalAEliminar != null) {
            animales.remove(animalAEliminar); // Elimina el animal si lo encuentra
            return true; // Retorna true si se eliminó con éxito
        }
        return false; // Retorna false si no encontró el animal con ese ID
    }

    /**
     * Calcula el costo total de mantenimiento de todos los animales.
     *
     * @return Detalle del costo total de mantenimiento
     */
    public String costoTotalMantenimiento() {
        StringBuilder sb = new StringBuilder();
        float costoTotal = 0;
        // Calcula el costo total de mantenimiento sumando los costos individuales de cada animal
        for (Animal animal : animales) {
            costoTotal += animal.calcularCostoMantenimiento(); // Este método debe estar en Serpiente y ReptilAcuatico
        }

        // Construye la cadena de detalle
        sb.append("Costo Total Mensual: Q").append(costoTotal).append("\n")
          .append("-------------------------------------------------------").append("\n")
          .append("DETALLES: ").append("\n").append("ID").append("\n");
        for (Animal animal : animales) {
            sb.append(animal.getId()).append(". | Nombre Científico: ").append(animal.getNombreCientifico())
              .append(" | Costo Mensual: Q").append(animal.calcularCostoMantenimiento()).append("\n");
        }
        sb.append("-------------------------------------------------------").append("\n");
        return sb.toString(); 
    }

    /**
     * Muestra la cantidad total de comida máxima diaria requerida por todos los animales.
     *
     * @return Detalles sobre el consumo de comida
     */
    public String mostrarCantidadComida() {
        float totalComida = 0;
        StringBuilder detallesComida = new StringBuilder(); // Para almacenar los detalles
    
        for (Animal animal : animales) {
            totalComida += animal.calcularComidaDiaria(); // Suma la comida diaria de cada animal
            detallesComida.append("ID: ").append(animal.getId()).append("\n")
                          .append("Consumo: ").append(animal.desplegarComidaDiaria()).append(" gramos diarios.\n"); // Agrega el detalle de cada animal
        }
    
        // Crea la respuesta con el total y los detalles
        String resultado = "Cantidad total de comida máxima diaria: " + totalComida + " gramos\n\n";
        resultado += "-------------------------------------------------------\n";
        resultado += "DETALLES:\n";
        resultado += detallesComida.toString(); // Añade el detalle de cada animal
    
        return resultado;
    }

    /**
     * Muestra la información de todos los animales en el zoológico.
     *
     * @return Detalle de los animales
     */
    public String mostrarAnimales() {
        StringBuilder detalle = new StringBuilder();
        detalle.append("Total de animales: ").append(animales.size()).append("\n");
    
        for (Animal animal : animales) {
            detalle.append(animal.toString()).append("\n");
        }
    
        return detalle.toString();
    }

    /**
     * Busca un animal por su ID.
     *
     * @param id El ID del animal a buscar
     * @return El animal encontrado o null si no existe
     */
    public Animal buscarAnimalPorID(int id) {
        for (Animal animal : animales) {
            if (animal.getId() == id) { // Compara el ID de cada animal con el ID buscado
                return animal; // Si se encuentra, devuelve el animal
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

    /**
     * Muestra la información de un animal específico por su ID.
     *
     * @param id El ID del animal a mostrar
     * @return Detalle del animal encontrado o un mensaje de error si no existe
     */
    public String mostrarAnimal(int id) {
        for (Animal animal : animales) {
            if (animal.getId() == id) {
                return animal.toString(); // Devuelve el detalle del animal encontrado
            }
        }
        return "Animal no encontrado con el ID: " + id;
    }

    /**
     * Devuelve una representación en forma de cadena del zoológico.
     *
     * @return Información general sobre el zoológico
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tamaño: ").append(tamaño).append(" metros cuadrados\n");
        sb.append("Presupuesto Anual: Q").append(presupuestoAnual).append("\n");
        sb.append("Costo de Construcción: Q").append(costoConstruccion).append("\n");
        sb.append("Cantidad de Animales: ").append(animales.size()).append("\n");
        
        return sb.toString();
    }

    /**
     * Modifica la información de un animal específico por su ID.
     *
     * @param id El ID del animal a modificar
     * @param nombreCientifico El nuevo nombre científico (puede ser nulo)
     * @param descripcionHabitat La nueva descripción del hábitat (puede ser nulo)
     * @param esperanzaVida La nueva esperanza de vida (puede ser nulo)
     * @param temperaturaCorporal La nueva temperatura corporal (puede ser nulo)
     * @param promedioHuevos El nuevo promedio de huevos (puede ser nulo)
     * @param peso El nuevo peso (puede ser nulo)
     * @param enPeligroExtincion Estado de peligro de extinción (puede ser nulo)
     * @param dieta La nueva dieta (puede ser nulo)
     * @param longitud La nueva longitud (puede ser nulo)
     * @param especie La nueva especie (puede ser nulo)
     * @param colorPiel El nuevo color de piel (puede ser nulo)
     * @param esVenenosa Estado de veneno (puede ser nulo)
     * @param tipoVeneno El nuevo tipo de veneno (puede ser nulo)
     * @param tipoAgua El nuevo tipo de agua (puede ser nulo)
     * @param velocidadNado La nueva velocidad de nado (puede ser nulo)
     * @param duracionBuceo La nueva duración de buceo (puede ser nulo)
     * @return Mensaje con los cambios realizados
     */

    public String modificarAnimal(int id, String nombreCientifico, String descripcionHabitat, 
                                    String esperanzaVida, String temperaturaCorporal,
                                    String promedioHuevos, String peso, 
                                    String enPeligroExtincion, String dieta, 
                                    String longitud, String especie, String colorPiel, 
                                    String esVenenosa, String tipoVeneno, 
                                    String tipoAgua, String velocidadNado, 
                                    String duracionBuceo) {
    
        Animal animal = this.buscarAnimalPorID(id);
        StringBuilder mensaje = new StringBuilder();

        if (animal == null) {
            return "No se encontró el animal con ID " + id + "\n";
        }

        // Modificaciones solo si el valor no es nulo
        if (nombreCientifico != null) {
            animal.setNombreCientifico(nombreCientifico);
            mensaje.append("Nombre científico modificado a: ").append(nombreCientifico).append("\n");
        }

        if (descripcionHabitat != null) {
            animal.setDescripcionHabitat(descripcionHabitat);
            mensaje.append("Descripción del hábitat modificada a: ").append(descripcionHabitat).append("\n");
        }

        if (esperanzaVida != null) {
            animal.setEsperanzaVida(Integer.parseInt(esperanzaVida));
            mensaje.append("Esperanza de vida modificada a: ").append(esperanzaVida).append(" años\n");
        }

        if (temperaturaCorporal != null) {
            animal.setTemperaturaCorporal(Float.parseFloat(temperaturaCorporal));
            mensaje.append("Temperatura corporal modificada a: ").append(temperaturaCorporal).append(" °C\n");
        }

        if (promedioHuevos != null) {
            animal.setPromedioHuevos(Integer.parseInt(promedioHuevos));
            mensaje.append("Promedio de huevos modificado a: ").append(promedioHuevos).append("\n");
        }

        if (peso != null) {
            animal.setPeso(Float.parseFloat(peso));
            mensaje.append("Peso modificado a: ").append(peso).append(" kg.\n");
        }

        if (enPeligroExtincion != null) {
            boolean PeligroExtincion = false;
            if (enPeligroExtincion.equals("si")) {
                PeligroExtincion = true;
            } else {
                PeligroExtincion = false;
            } 
            animal.setEnPeligroExtincion(PeligroExtincion);
            mensaje.append("En peligro de extinción modificado a: ").append(enPeligroExtincion).append("\n");
        }

        if (dieta != null) {
            animal.setDieta(dieta);
            mensaje.append("Dieta modificada a: ").append(dieta).append("\n");
        }

        if (longitud != null) {
            animal.setLongitud(Float.parseFloat(longitud));
            mensaje.append("Longitud modificada a: ").append(longitud).append(" m.\n");
        }

        if (especie != null) {
            animal.setEspecie(especie);
            mensaje.append("Especie modificada a: ").append(especie).append("\n");
        }

        // Modificaciones específicas para Serpiente, Tortuga y Caiman
        if (animal instanceof Serpiente) {
            if (colorPiel != null) {
                ((Serpiente) animal).setColorPiel(colorPiel);
                mensaje.append("Color de piel modificado a: ").append(colorPiel).append("\n");
            }

            if (esVenenosa != null) {
                boolean venenosa = false;
                if (esVenenosa.equals("si")) {
                    venenosa = true;
                } else {
                    venenosa = false;
                } 

                ((Serpiente) animal).setEsVenenosa(venenosa);
                mensaje.append("Es venenosa modificado a: ").append(esVenenosa).append("\n");
            }

            if (tipoVeneno != null) {
                ((Serpiente) animal).setTipoVeneno(tipoVeneno);
                mensaje.append("Tipo de veneno modificado a: ").append(tipoVeneno).append("\n");
            }
        } else if (animal instanceof Tortuga || animal instanceof Caiman) {
            if (tipoAgua != null) {
                if (animal instanceof Tortuga) {
                    ((Tortuga) animal).setTipoAgua(tipoAgua);
                    mensaje.append("Tipo de agua modificado a: ").append(tipoAgua).append("\n");
                } else {
                    ((Caiman) animal).setTipoAgua(tipoAgua);
                    mensaje.append("Tipo de agua modificado a: ").append(tipoAgua).append("\n");
                }
            }

            if (velocidadNado != null) {
                if (animal instanceof Tortuga) {
                    ((Tortuga) animal).setVelocidadNado(Float.parseFloat(velocidadNado));
                    mensaje.append("Velocidad de nado modificada a: ").append(velocidadNado).append(" m/s.\n");
                } else {
                    ((Caiman) animal).setVelocidadNado(Float.parseFloat(velocidadNado));
                    mensaje.append("Velocidad de nado modificada a: ").append(velocidadNado).append(" m/s.\n");
                }
            }

            if (duracionBuceo != null) {
                if (animal instanceof Tortuga) {
                    ((Tortuga) animal).setDuracionBuceo(Float.parseFloat(duracionBuceo));
                    mensaje.append("Duración de buceo modificada a: ").append(duracionBuceo).append(" minutos.\n");
                } else {
                    ((Caiman) animal).setDuracionBuceo(Float.parseFloat(duracionBuceo));
                    mensaje.append("Duración de buceo modificada a: ").append(duracionBuceo).append(" minutos.\n");
                }
            }
        }
        return mensaje.toString();
    }
}
