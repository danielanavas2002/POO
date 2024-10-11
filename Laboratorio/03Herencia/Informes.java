/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Informes
 * Clase que gestiona un conjunto de operaciones matemáticas, permitiendo
 * agregar, buscar y desplegar información sobre ellas.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */
import java.util.ArrayList;

public class Informes {
    /** 
     * Lista que almacena las operaciones matemáticas registradas.
     */
    private ArrayList<OperacionMatematica> operaciones;

    /**
     * Constructor que inicializa la lista de operaciones matemáticas.
     */
    public Informes() {
        this.operaciones = new ArrayList<>();
    }

    /**
     * Agrega una nueva operación matemática a la lista.
     *
     * @param operacion la operación matemática a agregar
     */
    public void agregarOperacion(OperacionMatematica operacion) {
        operaciones.add(operacion); // Agrega la operación a la lista
    }

    /**
     * Busca una operación matemática en la lista por su ID.
     *
     * @param id el ID de la operación a buscar
     * @return la operación matemática si se encuentra, null en caso contrario
     */
    public OperacionMatematica buscarPorID(int id) {
        for (OperacionMatematica operacion : operaciones) {
            if (operacion.getID() == id) {
                return operacion; // Retorna la operación si se encuentra
            } 
        }
        return null; // Retorna null si no se encuentra la operación
    }

    /**
     * Despliega la información de una operación matemática por su ID.
     *
     * @param id el ID de la operación a desplegar
     * @return la representación de la operación si se encuentra, un mensaje en caso contrario
     */
    public String desplegarPorID(int id) {
        for (OperacionMatematica operacion : operaciones) {
            if (operacion.getID() == id) {
                return operacion.toString(); // Retorna la representación de la operación si se encuentra
            } 
        }
        return "\n" + 
               "Operación no encontrada con ID: " + id + 
               "\n"; // Mensaje cuando no se encuentra el ID
    }

    /**
     * Despliega las operaciones que son matrices cuadradas (filas == columnas).
     *
     * @return un string con la representación de las matrices cuadradas o un mensaje si no hay
     */
    public String desplegarMatricesCuadradas() {
        StringBuilder detalle = new StringBuilder();
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof MatrizCuadrada) {
                detalle.append(operacion).append("\n"); // Añade la operación cuadrada al detalle
            }
        }
    
        if (detalle.length() == 0) {
            return "No hay matrices cuadradas registradas."; // Mensaje si no hay matrices cuadradas
        }
    
        return detalle.toString(); // Retorna el detalle de matrices cuadradas
    }

    /**
     * Despliega las operaciones que son matrices rectangulares (filas != columnas).
     *
     * @return un string con la representación de las matrices rectangulares o un mensaje si no hay
     */
    public String desplegarMatricesRectangulares() {
        StringBuilder detalle = new StringBuilder();
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof MatrizRectangular) {
                detalle.append(operacion).append("\n"); // Añade la operación rectangular al detalle
            }
        }
    
        if (detalle.length() == 0) {
            return "No hay matrices rectangulares registradas."; // Mensaje si no hay matrices rectangulares
        }
    
        return detalle.toString(); // Retorna el detalle de matrices rectangulares
    }

    /**
     * Despliega las operaciones que son sistemas de ecuaciones.
     *
     * @return un string con la representación de los sistemas de ecuaciones o un mensaje si no hay
     */
    public String desplegarSistemasdeEcuaciones() {
        StringBuilder detalle = new StringBuilder();
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof SistemaEcuaciones) {
                detalle.append(operacion).append("\n"); // Añade la operación de sistema de ecuaciones al detalle
            }
        }
    
        if (detalle.length() == 0) {
            return "No hay sistemas de ecuaciones registrados."; // Mensaje si no hay sistemas de ecuaciones
        }
    
        return detalle.toString(); // Retorna el detalle de sistemas de ecuaciones
    }

    /**
     * Despliega el conteo de matrices cuadradas por estado.
     *
     * @return un string que muestra la cantidad de matrices cuadradas en cálculo y resueltas
     */
    public String desplegarMatricesCuadradasEstado() {
        int enCalculo = 0;
        int resueltas = 0;
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof MatrizCuadrada) {
                if (operacion.getEstado().equalsIgnoreCase("En Calculo")) {
                    enCalculo++; // Cuenta las matrices cuadradas en cálculo
                } else if (operacion.getEstado().equalsIgnoreCase("Resuelto")) {
                    resueltas++; // Cuenta las matrices cuadradas resueltas
                }
            }
        }
    
        return "En Calculo: " + enCalculo + "\n" + 
               "Resueltas: " + resueltas + "\n"; // Retorna el conteo por estado
    }

    /**
     * Despliega el conteo de matrices rectangulares por estado.
     *
     * @return un string que muestra la cantidad de matrices rectangulares en cálculo y resueltas
     */
    public String desplegarMatricesRectangularesEstado() {
        int enCalculo = 0;
        int resueltas = 0;
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof MatrizRectangular) {
                if (operacion.getEstado().equalsIgnoreCase("En Calculo")) {
                    enCalculo++; // Cuenta las matrices rectangulares en cálculo
                } else if (operacion.getEstado().equalsIgnoreCase("Resuelto")) {
                    resueltas++; // Cuenta las matrices rectangulares resueltas
                }
            }
        }
    
        return "En Calculo: " + enCalculo + "\n" + 
               "Resueltas: " + resueltas + "\n"; // Retorna el conteo por estado
    }

    /**
     * Despliega el conteo de sistemas de ecuaciones por estado.
     *
     * @return un string que muestra la cantidad de sistemas de ecuaciones en cálculo y resueltos
     */
    public String desplegarSistemasEstado() {
        int enCalculo = 0;
        int resueltos = 0;
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof SistemaEcuaciones) {
                if (operacion.getEstado().equalsIgnoreCase("En Calculo")) {
                    enCalculo++; // Cuenta los sistemas de ecuaciones en cálculo
                } else if (operacion.getEstado().equalsIgnoreCase("Resuelto")) {
                    resueltos++; // Cuenta los sistemas de ecuaciones resueltos
                }
            }
        }
    
        return "En Calculo: " + enCalculo + "\n" + 
               "Resueltos: " + resueltos + "\n"; // Retorna el conteo por estado
    }

    /**
     * Despliega un informe general de todas las operaciones registradas.
     *
     * @return un string con la representación de todas las operaciones
     */
    public String desplegarInformeGeneral() {
        StringBuilder informe = new StringBuilder(); // Utilizamos StringBuilder para optimizar la concatenación
    
        for (OperacionMatematica operacion : operaciones) {
            informe.append(operacion).append("\n"); // Concatenamos cada operación con salto de línea
        }
    
        return informe.toString(); // Devolvemos el informe como un string
    }

    /**
     * Despliega un conteo general de las operaciones registradas.
     *
     * @return un string que muestra el conteo de matrices cuadradas, rectangulares y sistemas de ecuaciones
     */
    public String desplegarConteoGeneral() {
        int cuadradas = 0, rectangulares = 0, sistemas = 0;
    
        for (OperacionMatematica operacion : operaciones) {
            if (operacion instanceof MatrizCuadrada) {
                cuadradas++; // Cuenta las matrices cuadradas
            } else if (operacion instanceof MatrizRectangular) {
                rectangulares++; // Cuenta las matrices rectangulares
            } else if (operacion instanceof SistemaEcuaciones) {
                sistemas++; // Cuenta los sistemas de ecuaciones
            }
        }
    
        return "Matrices Cuadradas: " + cuadradas + "\n" +
               "Matrices Rectangulares: " + rectangulares + "\n" +
               "Sistemas de Ecuaciones: " + sistemas + "\n"; // Retorna el conteo general
    }
}
