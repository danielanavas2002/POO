/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Main Class 
 * Contiene el menú de opciones para agregar, eliminar, calificar estudiantes y calcular la nota final.
 *
 * 
 * @author Daniela Navas
 * Fecha de creación: 12/08/2024
 * Última modificación: 13/08/2024
 */

import java.util.Scanner;
class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Seccion seccion;

    /**
     * Método principal que inicia la ejecución del programa.
     * Muestra un menú interactivo para la gestión de estudiantes.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        System.out.println("****************************************************************");
        System.out.println("**                   GESTIÓN DE ESTUDIANTES                   **");
        System.out.println("****************************************************************");
        System.out.println(" ");
        System.out.print("Ingrese la cantidad de estudiantes que desea registrar: ");
        int capacidad = sc.nextInt();
        sc.nextLine();

        seccion = new Seccion(capacidad);

        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarEstudiante();
                    break;
                case 2:
                    eliminarEstudiante();
                    break;
                case 3:
                    agregarCalificacion();
                    break;
                case 4:
                    calcularNotaFinal();
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("* Opción no válida. Intente nuevamente.");
            }
        }
        System.out.println("****************************************************************");
        System.out.println("**                    FINALIZAR EJECUCION                     **");
        System.out.println("****************************************************************");
    }

    /**
     * Muestra el menú de opciones del menú principal en consola.
     */
    private static void mostrarMenu() {
        System.out.println("\n****************************************************************");
        System.out.println("**                             MENÚ                           **");
        System.out.println("** 1. Agregar nuevo estudiante                                **");
        System.out.println("** 2. Eliminar estudiante                                     **");
        System.out.println("** 3. Agregar calificación a un estudiante                    **");
        System.out.println("** 4. Calcular la nota final de un estudiante                 **");
        System.out.println("** 5. Salir                                                   **");
        System.out.println("****************************************************************");
        System.out.print("Seleccione una opción: ");
    }

    /**
     * Permite agregar un nuevo estudiante a la sección.
     * Solicita el nombre, carnet y número máximo de actividades del estudiante.
     */
    private static void agregarEstudiante() {
        System.out.println("****************************************************************");
        System.out.println("**                      NUEVO ESTUDIANTE                      **");
        System.out.println("****************************************************************");
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el número de carnet del estudiante: ");
        String carnet = sc.nextLine();
        System.out.print("Ingrese el número máximo de actividades: ");
        int maxActividades = sc.nextInt();
        sc.nextLine();

        Estudiante nuevoEstudiante = new Estudiante(carnet, nombre, maxActividades);
        if (seccion.agregarEstudiante(nuevoEstudiante)) {
            System.out.println("Estudiante agregado exitosamente.");
        } else {
            System.out.println("No hay espacio disponible para agregar más estudiantes.");
        }
    }

    /**
     * Permite eliminar un estudiante de la sección.
     * Solicita el número de carnet del estudiante a eliminar.
     */
    private static void eliminarEstudiante() {
        System.out.println("****************************************************************");
        System.out.println("**                    ELIMINAR ESTUDIANTE                     **");
        System.out.println("****************************************************************");
        System.out.print("Ingrese el número de carnet del estudiante que desea eliminar: ");
        String carnet = sc.nextLine();

        if (seccion.eliminarEstudiante(carnet)) {
            System.out.println("Estudiante eliminado exitosamente.");
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    /**
     * Permite agregar una calificación a un estudiante.
     * Solicita el número de carnet del estudiante, el nombre de la actividad y la calificación obtenida.
     */
    private static void agregarCalificacion() {
        System.out.println("****************************************************************");
        System.out.println("**                     NUEVA CALIFICACIÓN                     **");
        System.out.println("****************************************************************");
        System.out.print("Ingrese el número de carnet del estudiante: ");
        String carnet = sc.nextLine();
        Estudiante estudiante = seccion.buscarEstudiante(carnet);

        if (estudiante != null) {
            System.out.print("Ingrese el nombre de la actividad: ");
            String nombreActividad = sc.nextLine();
            System.out.print("Ingrese la calificación obtenida: ");
            double calificacion = sc.nextDouble();
            sc.nextLine();

            if (estudiante.agregarActividad(nombreActividad, calificacion)) {
                System.out.println("Calificación agregada exitosamente.");
            } else {
                System.out.println("No se puede agregar más actividades a este estudiante.");
            }
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }

    /**
     * Calcula la nota final de un estudiante.
     * Solicita el número de carnet del estudiante y muestra el promedio de sus calificaciones.
     */
    private static void calcularNotaFinal() {
        System.out.println("****************************************************************");
        System.out.println("**                         NOTA FINAL                         **");
        System.out.println("****************************************************************");
        System.out.print("Ingrese el número de carnet del estudiante: ");
        String carnet = sc.nextLine();
        Estudiante estudiante = seccion.buscarEstudiante(carnet);

        if (estudiante != null) {
            double promedio = estudiante.calcularPromedio();
            System.out.println("La nota final del estudiante " + estudiante.getNombre() + " es: " + promedio);
        } else {
            System.out.println("Estudiante no encontrado.");
        }
    }
}
