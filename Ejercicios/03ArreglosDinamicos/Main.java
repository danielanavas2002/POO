import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Constructora constructora = new Constructora();
        Scanner sc = new Scanner(System.in);
        boolean salir = false;
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/mm/yyyy");

        while (!salir) {
            System.out.println("1. Nuevo Proyecto (Manual)");
            System.out.println("2. Nuevo Proyecto (CSV) - Ideación");
            System.out.println("3. Agregar nuevas ubicaciones de proyectos");
            System.out.println("4. Gasto total en cada proyecto");
            System.out.println("5. Contratistas más frecuentes");
            System.out.println("6. Presupuesto total utilizado en un periodo determinado");
            System.out.println("7. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    try {
                        System.out.print("Ingrese el ID del proyecto: ");
                        String idProyecto = sc.nextLine();
                        System.out.print("Ingrese el nombre del proyecto: ");
                        String nombreProyecto = sc.nextLine();
                        System.out.print("Ingrese la fecha de inicio (dd/mm/yyyy): ");
                        String fechaInicioStr = sc.nextLine();
                        Date fechaInicio = formatoFecha.parse(fechaInicioStr); 
                        System.out.print("Ingrese la fecha estimada de finalización (dd/mm/yyyy): ");
                        String fechaFinStr = sc.nextLine();
                        Date fechaFin = formatoFecha.parse(fechaFinStr); 
                        System.out.print("Ingrese el presupuesto del proyecto (0.0): ");
                        double presupuesto = sc.nextDouble();
                        sc.nextLine();
                        Proyecto proyecto = new Proyecto(idProyecto, nombreProyecto, fechaInicio, fechaFin, presupuesto);

                        ArrayList<Contratista> contratistas = new ArrayList<>();
                        boolean agregarMasContratistas = true;

                        while (agregarMasContratistas) {
                            System.out.println("¿Desea agregar un contratista? (Si/No): ");
                            String respuesta = sc.nextLine();
                            if (respuesta.equals("Si")) {
                                System.out.print("Ingrese el ID del contratista: ");
                                String idContratista = sc.nextLine();
                                System.out.print("Ingrese el nombre del contratista: ");
                                String nombreContratista = sc.nextLine();
                                System.out.print("Ingrese la especialidad del contratista: ");
                                String especialidad = sc.nextLine();
                                System.out.print("Ingrese el monto pagado al contratista (0.0): ");
                                double montoPagado = sc.nextDouble();
                                sc.nextLine(); 
                                Contratista contratista = new Contratista(idContratista, nombreContratista, especialidad, montoPagado);
                                contratistas.add(contratista);
                            } else {
                                agregarMasContratistas = false;
                            }
                        }
                        proyecto.setContratistas(contratistas); 
                        constructora.agregarProyecto(proyecto);
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha incorrecto. Por favor, use el formato dd/mm/yyyy.");
                    }
                    break;
                case 2:
                    System.out.println("Aún esta en Fase de Ideación");
                    System.out.println("Formato adecuado del archivo CSV:");
                    System.out.println("IDProyecto,NombreProyecto,FechaInicio,FechaFin,Presupuesto,IDContratista,NombreContratista,Especialidad,MontoPagado");
                    break;
                case 3:
                    System.out.print("Ingrese el nombre de la ubicación: ");
                    String nombreUbicacion = sc.nextLine();
                    System.out.print("Ingrese la dirección de la ubicación: ");
                    String direccion = sc.nextLine();
                    Ubicacion ubicacion = new Ubicacion(nombreUbicacion, direccion);
                    constructora.agregarUbicacion(ubicacion);
                    break;
                case 4:
                    ArrayList<Proyecto> proyectos = constructora.getProyectos();
                    for (Proyecto proyecto : proyectos) {
                        double gastoTotal = 0.0;
                        ArrayList<Contratista> contratistas = proyecto.getContratistas();
                        
                        for (Contratista contratista : contratistas) {
                            gastoTotal += contratista.getMontoPagado();
                        }
            
                        System.out.println("ID Proyecto: " + proyecto.getIdProyecto());
                        System.out.println("Nombre: " + proyecto.getNombre());
                        System.out.println("Fecha de Inicio: " + proyecto.getFechaInicio());
                        System.out.println("Fecha Fin Estimada: " + proyecto.getFechaFinEstimada());
                        System.out.println("Presupuesto: " + proyecto.getPresupuesto());
                        System.out.println("Gasto Total: " + gastoTotal);
                        System.out.println("-----------------------------");
                    }
                    break;
                case 5:
                    ArrayList<String> contratistasIds = new ArrayList<>();
                    ArrayList<Double> contratistasGastos = new ArrayList<>();
                    ArrayList<Integer> contratistasFrecuencia = new ArrayList<>();
                
                    for (Proyecto proyecto : constructora.getProyectos()) {
                        for (Contratista contratista : proyecto.getContratistas()) {
                            String id = contratista.getIdContratista();
                            double montoPagado = contratista.getMontoPagado();
                            
                            int index = contratistasIds.indexOf(id);
                            if (index != -1) {
                                contratistasFrecuencia.set(index, contratistasFrecuencia.get(index) + 1);
                                contratistasGastos.set(index, contratistasGastos.get(index) + montoPagado);
                            } else {
                                contratistasIds.add(id);
                                contratistasFrecuencia.add(1);
                                contratistasGastos.add(montoPagado);
                            }
                        }
                    }
    
                    for (int i = 0; i < 5; i++) {
                        int maxIndex = 0;
                        for (int j = 1; j < contratistasFrecuencia.size(); j++) {
                            if (contratistasFrecuencia.get(j) > contratistasFrecuencia.get(maxIndex)) {
                                maxIndex = j;
                            }
                        }
                
                        if (!contratistasIds.isEmpty()) {
                            System.out.println("ID Contratista: " + contratistasIds.get(maxIndex));
                            System.out.println("Veces contratado: " + contratistasFrecuencia.get(maxIndex));
                            System.out.println("Monto total pagado: " + contratistasGastos.get(maxIndex));
                            System.out.println("-----------------------------");
                
                            contratistasIds.remove(maxIndex);
                            contratistasFrecuencia.remove(maxIndex);
                            contratistasGastos.remove(maxIndex);
                        }
                    }
                    break;
                case 6:
                    try {
                        System.out.print("Ingrese la fecha de inicio (dd/MM/yyyy): ");
                        String fechaInicioStr = sc.nextLine();
                        Date fechaInicioFiltro = formatoFecha.parse(fechaInicioStr);
                        double gastoTotal = 0.0;
                        for (Proyecto proyecto : constructora.getProyectos()) {
                            if (proyecto.getFechaInicio().after(fechaInicioFiltro)) {
                                for (Contratista contratista : proyecto.getContratistas()) {
                                    gastoTotal += contratista.getMontoPagado();
                                }
                            }
                        }

                        System.out.println("Gasto Total después de " + fechaInicioFiltro + ": Q" + gastoTotal);
                    } catch (ParseException e) {
                        System.out.println("Formato de fecha incorrecto. Por favor, use el formato dd/MM/yyyy.");
                    }
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        sc.close();
    }
}
