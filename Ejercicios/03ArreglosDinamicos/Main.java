import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Constructora constructora = new Constructora();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("1. Ingresar proyectos (Manual o CSV)");
            System.out.println("2. Ingresar contratistas (Manual o CSV)");
            System.out.println("3. Análisis Estadístico");
            System.out.println("4. Agregar nuevas ubicaciones de proyectos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el ID del proyecto: ");
                    String idProyecto = sc.nextLine();
                    System.out.println("Ingrese el nombre del proyecto: ");
                    String nombreProyecto = sc.nextLine();
                    System.out.println("Ingrese la fecha de inicio: ");
                    String fechaInicio = sc.nextLine();
                    System.out.println("Ingrese la fecha estimada de finalización: ");
                    String fechaFin = sc.nextLine();
                    System.out.println("Ingrese el presupuesto del proyecto: ");
                    double presupuesto = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea
                    Proyecto proyecto = new Proyecto(idProyecto, nombreProyecto, fechaInicio, fechaFin, presupuesto);
                    constructora.agregarProyecto(proyecto);
                    break;
                case 2:
                    System.out.println("Ingrese el ID del contratista: ");
                    String idContratista = sc.nextLine();
                    System.out.println("Ingrese el nombre del contratista: ");
                    String nombreContratista = sc.nextLine();
                    System.out.println("Ingrese la especialidad del contratista: ");
                    String especialidad = sc.nextLine();
                    System.out.println("Ingrese el monto pagado al contratista: ");
                    double montoPagado = sc.nextDouble();
                    sc.nextLine(); // Consumir el salto de línea
                    Contratista contratista = new Contratista(idContratista, nombreContratista, especialidad, montoPagado);
                    constructora.agregarContratista(contratista);
                    break;
                case 3:
                    System.out.println(constructora.analizarEstadisticas());
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la ubicación: ");
                    String nombreUbicacion = sc.nextLine();
                    System.out.println("Ingrese la dirección de la ubicación: ");
                    String direccion = sc.nextLine();
                    Ubicacion ubicacion = new Ubicacion(nombreUbicacion, direccion);
                    constructora.agregarUbicacion(ubicacion);
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        sc.close();
    }
}
