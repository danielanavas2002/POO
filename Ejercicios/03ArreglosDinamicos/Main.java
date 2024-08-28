/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Main Class 
 * Clase principal para gestionar un sistema de información para una constructora.
 * Permite al usuario interactuar con el sistema a través de un menú, donde puede 
 * gestionar proyectos, contratistas y ubicaciones.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/08/2024
 * Última modificación: 28/08/2024
 */

import java.text.ParseException; // Importa la clase ParseException para manejar errores de análisis de fecha.
import java.text.SimpleDateFormat; // Importa la clase SimpleDateFormat para formatear y analizar fechas.
import java.util.Date; // Importa la clase Date para manejar fechas.
import java.util.ArrayList; 
import java.util.Scanner; 

public class Main 
{
    /**
     * Método principal que ejecuta el sistema de gestión.
     * 
     * @param args Los argumentos de la línea de comandos.
     */
    public static void main(String[] args) 
    {
        Constructora constructora = new Constructora(); // Crea una instancia de la clase Constructora que gestionará los proyectos y contratistas.
        Scanner sc = new Scanner(System.in); // Crea un objeto Scanner para leer la entrada del usuario desde la consola.
        boolean salir = false; // Variable de control para determinar cuándo salir del programa.
        
        
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy"); // Define el formato de fecha que se utilizará en el programa.
        
        // Imprime la cabecera del programa
        System.out.println("*********************************************************************************");
        System.out.println("***                          GESTIÓN DE CONSTRUCTORA                          ***");
        System.out.println("*********************************************************************************");
    
        // Bucle principal del menú.
        while (!salir) {
            // Imprime el menú principal.
            System.out.println("*********************************************************************************");
            System.out.println("***                              MENÚ PRINCIPAL                               ***");
            System.out.println("** 1. Nuevo Proyecto (Manual)                                                  **");
            System.out.println("** 2. Nuevo Proyecto (CSV) - Ideación                                          **");
            System.out.println("** 3. Agregar nuevas ubicaciones de proyectos                                  **");
            System.out.println("** 4. Ver listado de ubicaciones                                               **");
            System.out.println("** 5. Gasto total en cada proyecto                                             **");
            System.out.println("** 6. Contratistas más frecuentes                                              **");
            System.out.println("** 7. Presupuesto total utilizado en un periodo determinado                    **");
            System.out.println("** 8. Salir                                                                    **");
            System.out.println("*********************************************************************************");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt(); // Lee la opción seleccionada por el usuario.
            sc.nextLine(); // Limpiar

            // Switch Case para manejar las diferentes opciones del menú.
            switch (opcion) {
                case 1:
                    try { // Crear un nuevo proyecto manualmente
                        System.out.print("Ingrese el ID del proyecto: ");
                        String idProyecto = sc.nextLine();
                        System.out.print("Ingrese el nombre del proyecto: ");
                        String nombreProyecto = sc.nextLine();
                        System.out.print("Ingrese la fecha de inicio (dd/mm/yyyy): ");
                        String fechaInicioStr = sc.nextLine();
                        Date fechaInicio = formatoFecha.parse(fechaInicioStr); // Analiza la fecha de inicio desde la cadena ingresada.
                        System.out.print("Ingrese la fecha estimada de finalización (dd/mm/yyyy): ");
                        String fechaFinStr = sc.nextLine();
                        Date fechaFin = formatoFecha.parse(fechaFinStr); // Analiza la fecha de inicio desde la cadena ingresada.
                        System.out.print("Ingrese el presupuesto del proyecto: Q");
                        double presupuesto = sc.nextDouble();
                        sc.nextLine();
                        Proyecto proyecto = new Proyecto(idProyecto, nombreProyecto, fechaInicio, fechaFin, presupuesto); // Crea un nuevo objeto Proyecto con los datos ingresados.

                        ArrayList<Contratista> contratistas = new ArrayList<>(); // Lista para almacenar los contratistas asociados al proyecto.
                        boolean agregarMasContratistas = true;

                        // Bucle para agregar contratistas al proyecto.
                        while (agregarMasContratistas) 
                        {
                            System.out.print("¿Desea agregar un contratista? (Si/No): ");
                            String respuesta = sc.nextLine();
                            if (respuesta.equals("Si")) { // Si la respuesta es "Si", se solicita la información del contratista.
                                System.out.print("Ingrese el ID del contratista: ");
                                String idContratista = sc.nextLine();
                                System.out.print("Ingrese el nombre del contratista: ");
                                String nombreContratista = sc.nextLine();
                                System.out.print("Ingrese la especialidad del contratista: ");
                                String especialidad = sc.nextLine();
                                System.out.print("Ingrese el monto pagado al contratista: Q");
                                double montoPagado = sc.nextDouble();
                                sc.nextLine(); 
                                Contratista contratista = new Contratista(idContratista, nombreContratista, especialidad, montoPagado);  // Crea un nuevo objeto Contratista con los datos ingresados.
                                contratistas.add(contratista); // Agrega el contratista a la lista de contratistas.
                            } else { // Si la respuesta no es "Si", se termina el bucle.
                                agregarMasContratistas = false;
                            }
                        }
                        proyecto.setContratistas(contratistas); // Asocia la lista de contratistas al proyecto.
                        constructora.agregarProyecto(proyecto);  // Agrega el proyecto a la constructora.
                    } catch (ParseException e) { // Maneja errores de formato de fecha.
                        System.out.println("Formato de fecha incorrecto. Por favor, use el formato dd/mm/yyyy.");
                    }
                    break;
                case 2: // Opción para manejar la creación de proyectos desde un archivo CSV (en ideación).
                    System.out.println("Aún esta en Fase de Ideación");
                    System.out.println("Formato adecuado del archivo CSV:");
                    System.out.println("IDProyecto,NombreProyecto,FechaInicio,FechaFin,Presupuesto,IDContratista,NombreContratista,Especialidad,MontoPagado");
                    break;
                case 3: // Opción para agregar una nueva ubicación de proyecto.
                    System.out.print("Ingrese el nombre de la ubicación: ");
                    String nombreUbicacion = sc.nextLine();
                    System.out.print("Ingrese la dirección de la ubicación: ");
                    String direccion = sc.nextLine();
                    Ubicacion ubicacion = new Ubicacion(nombreUbicacion, direccion); // Crea un nuevo objeto Ubicacion con los datos ingresados.
                    constructora.agregarUbicacion(ubicacion); // Agrega la ubicación a la constructora.
                    break;
                case 4: // Opción para ver una lista de ubicaciones de proyecto.
                    System.out.println("--------------------------------");
                    System.out.println("* LISTADO DE UBICACIONES *");        
                    System.out.println("--------------------------------");
                    ArrayList<Ubicacion> ubicaciones = constructora.getUbicaciones(); // Obtiene la lista de ubicaciones de la constructora.
                    for (Ubicacion ubi : ubicaciones) { // Itera sobre cada ubicacion.
                        System.out.println("Nombre de la ubicación: " + ubi.getNombreUbicacion()); // Muestra la información de la ubicación.
                        System.out.println("Dirección de la ubicación: " + ubi.getDireccion());
                        System.out.println("--------------------------------");
                    }
                    break;
                case 5:  // Opción para mostrar el gasto total en cada proyecto.
                    System.out.println("--------------------------------");
                    System.out.println("* GASTO TOTAL EN CADA PROYECTO *");        
                    System.out.println("--------------------------------");
                    ArrayList<Proyecto> proyectos = constructora.getProyectos(); // Obtiene la lista de proyectos de la constructora.
                    for (Proyecto proyecto : proyectos) { // Itera sobre cada proyecto para calcular y mostrar su gasto total.
                        double gastoTotal = 0.0;
                        ArrayList<Contratista> contratistas = proyecto.getContratistas(); // Obtiene la lista de contratistas del proyecto.
                        
                        for (Contratista contratista : contratistas) { // Itera sobre cada contratista para calcular y mostrar su gasto total.
                            gastoTotal += contratista.getMontoPagado(); // Suma los montos pagados a todos los contratistas del proyecto.
                        }
            
                        System.out.println("ID Proyecto: " + proyecto.getIdProyecto()); // Muestra la información del proyecto y su gasto total.
                        System.out.println("Nombre: " + proyecto.getNombre());
                        System.out.println("Fecha de Inicio: " + proyecto.getFechaInicio());
                        System.out.println("Fecha Fin Estimada: " + proyecto.getFechaFinEstimada());
                        System.out.println("Presupuesto: Q" + proyecto.getPresupuesto());
                        System.out.println("Gasto Total: Q" + gastoTotal);
                        System.out.println("--------------------------------");
                    }
                    break;
                case 6: // Opción para mostrar los contratistas más frecuentes.
                    System.out.println("-------------------------------");
                    System.out.println("* CONTRATISTAS MÁS FRECUENTES *");        
                    System.out.println("-------------------------------");

                    // Listas para almacenar los IDs de contratistas, montos pagados y frecuencias de contratación.
                    ArrayList<String> contratistasIds = new ArrayList<>();
                    ArrayList<Double> contratistasGastos = new ArrayList<>();
                    ArrayList<Integer> contratistasFrecuencia = new ArrayList<>();
                
                    for (Proyecto proyecto : constructora.getProyectos()) { // Itera sobre cada proyecto para contar la frecuencia de contratación de cada contratista.
                        for (Contratista contratista : proyecto.getContratistas()) {
                            String id = contratista.getIdContratista();
                            double montoPagado = contratista.getMontoPagado();
                            
                            int index = contratistasIds.indexOf(id); // Si el contratista ya está en la lista, actualiza su frecuencia y gasto total.
                            if (index != -1) {
                                contratistasFrecuencia.set(index, contratistasFrecuencia.get(index) + 1);
                                contratistasGastos.set(index, contratistasGastos.get(index) + montoPagado);
                            } else {
                                // Si el contratista no está en la lista, lo agrega con frecuencia 1.
                                contratistasIds.add(id);
                                contratistasFrecuencia.add(1);
                                contratistasGastos.add(montoPagado);
                            }
                        }
                    }
    
                    for (int i = 0; i < contratistasIds.size(); i++) { // Muestra los contratistas ordenados por frecuencia de contratación.
                        System.out.println("ID Contratista: " + contratistasIds.get(i));
                        System.out.println("Gasto Total: " + contratistasGastos.get(i));
                        System.out.println("Veces Contratado: " + contratistasFrecuencia.get(i));
                        System.out.println("--------------------------------");
                    }
                    break;
                    
                case 7: // Opción para calcular el presupuesto utilizado en un periodo determinado
                    try {
                        System.out.println("--------------------------------------");
                        System.out.println("* PRESUPUESTO UTILIZADO POR PERIODO *");        
                        System.out.println("--------------------------------------");
                        
                        System.out.print("Ingrese la fecha de inicio (dd/mm/yyyy): "); // Lee la fecha de inicio del periodo.
                        String fechaInicioStr2 = sc.nextLine();
                        Date fechaInicioPeriodo = formatoFecha.parse(fechaInicioStr2);
                        
                        System.out.print("Ingrese la fecha de fin (dd/mm/yyyy): "); // Lee la fecha de fin del periodo.
                        String fechaFinStr2 = sc.nextLine();
                        Date fechaFinPeriodo = formatoFecha.parse(fechaFinStr2);
                        
                        double presupuestoTotalPeriodo = 0.0; // Calcula el presupuesto total utilizado en ese periodo.
                        for (Proyecto proyecto : constructora.getProyectos()) {
                            if (!proyecto.getFechaInicio().before(fechaInicioPeriodo) && !proyecto.getFechaInicio().after(fechaFinPeriodo)) {  // Verifica si el proyecto está dentro del periodo especificado.
                                presupuestoTotalPeriodo += proyecto.getPresupuesto(); // Sumar al Gasto Total
                            }
                        }
                        
                        // Muestra el presupuesto total utilizado.
                        System.out.println("Presupuesto total utilizado en el periodo: " + presupuestoTotalPeriodo);
                        System.out.println("--------------------------------");
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha incorrecto. Por favor, use el formato dd/mm/yyyy.");  // Maneja errores de formato de fecha.
                    }
                    break;
                case 8: // Opción para salir del programa.
                    salir = true;
                    break;
                default: // Opción por defecto para manejar entradas no válidas
                    System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 7.");
                    break;
            }
        }
        sc.close(); // Cierra el objeto Scanner.
    }
}