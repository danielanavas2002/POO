/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Main Class 
 * Gestiona la reserva de salones y equipos en un centro de eventos.
 * Permite crear eventos, ver la lista de espera, generar reportes de eventos y salir del programa.
 *
 * @author Daniela Navas
 * Fecha de creación: 21/08/2024
 * Última modificación: 22/08/2024
 */


import java.util.Scanner;

class Main {
    /**
     * Método principal que ejecuta el sistema de reservas.
     * Permite al usuario interactuar con el sistema a través de un menú de opciones.
     *
     * @param args Los argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ejecutar = true;
        Salon[] salones = new Salon[6];
        Equipo[] equipoAdicional = new Equipo[1000];
        Evento[] listaEspera = new Evento[200];
        Evento[] eventosReservados = new Evento[500];

        // Salones
        salones[0] = new Salon(01, 50, 100.0, "Pequeño");
        salones[1] = new Salon(02, 50, 100.0, "Pequeño");
        salones[2] = new Salon(03, 100, 200.0, "Mediano");
        salones[3] = new Salon(04, 100, 200.0, "Mediano");
        salones[4] = new Salon(05, 200, 400.0, "Grande");
        salones[5] = new Salon(06, 200, 400.0, "Grande");

        // Empleados
        Empleado fer53941 = new Empleado("Sofia Fernandez", "fer53941");
        Empleado lop27569 = new Empleado("Juan Lopez", "lop27569");
        Empleado jua73964 = new Empleado("Mariana Juarez", "jua73964");
        Empleado her98631 = new Empleado("Simon Heredia", "her98631");
        Empleado bra55301 = new Empleado("Josefina Bravo", "bra55301");

        // Equipo
        for (int i = 0; i < 10; i++) {
            equipoAdicional[i] = new Equipo("Cañonera", "C" + i, "20230216", fer53941);
            equipoAdicional[10 + i] = new Equipo("Pantalla", "P" + i, "20230216", fer53941);
            equipoAdicional[20 + i] = new Equipo("TV", "T" + i, "20240115", lop27569);
            equipoAdicional[30 + i] = new Equipo("Base de Pastel", "BP" + i, "20230518", lop27569);
            equipoAdicional[40 + i] = new Equipo("Arco para Globos", "AG" + i, "20230216", jua73964);
            if (i < 20) {
                equipoAdicional[50 + i] = new Equipo("Bocinas", "B" + i, "20230131", jua73964);
                equipoAdicional[70 + i] = new Equipo("Micrófonos", "M" + i, "20230316", her98631);
            }
            equipoAdicional[90 + i] = new Equipo("Marco de Fotos", "MF" + i, "20241206", her98631);
            equipoAdicional[100 + i] = new Equipo("Stand de Fotos", "SF" + i, "20230406", bra55301);
        }

        System.out.println("***************************************************************");
        System.out.println("**                    SISTEMA DE RESERVAS                    **");
        System.out.println("***************************************************************");

        while (ejecutar) {
            System.out.println("***************************************************************");
            System.out.println("**                      MENÚ PRINCIPAL                       **");
            System.out.println("** 1. Crear Evento                                           **");
            System.out.println("** 2. Ver Lista de Espera                                    **");
            System.out.println("** 3. Generar Reporte de Eventos                             **");
            System.out.println("** 4. Salir                                                  **");
            System.out.println("***************************************************************");
            System.out.print("Seleccionar Opción: ");
            int opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del encargado: ");
                    String nombreEncargado = sc.nextLine();
                    System.out.print("Nombre del evento: ");
                    String nombreEvento = sc.nextLine();
                    System.out.print("Tipo de evento (Regular o VIP): ");
                    String tipoEvento = sc.nextLine();
                    System.out.print("Fecha del evento (dd-mm-aa): ");
                    String fecha = sc.nextLine();
                    System.out.print("Horario (00:00 a 00:00): ");
                    String horario = sc.nextLine();

                    Evento nuevoEvento = new Evento(nombreEncargado, nombreEvento, tipoEvento, fecha, horario);

                    System.out.println("Salones disponibles para la fecha: " + fecha);
                    for (Salon salon : salones) {
                        if (salon.verificarDisponibilidad(fecha)) {
                            System.out.println("Número: " + salon.getNumeroUnico() + ", Tipo: " + salon.getTipo() + ", Capacidad Máxima: " + salon.getCapacidad() + ", Costo por Hora: Q" + salon.getCostoPorHora());
                        }
                    }

                    System.out.print("Seleccione el número único del salón: ");
                    int numeroSalon = sc.nextInt();
                    sc.nextLine();

                    Salon salonSeleccionado = null;
                    for (Salon salon : salones) {
                        if (salon.getNumeroUnico() == numeroSalon) {
                            salonSeleccionado = salon;
                            break;
                        }
                    }

                    if (salonSeleccionado != null && salonSeleccionado.verificarDisponibilidad(fecha)) {
                        // Validar tipo de evento y tipo de salón
                        if (salonSeleccionado.getTipo().equals("Grande") && !tipoEvento.equals("VIP")) {
                            System.out.println("Los salones grandes solo pueden ser reservados para eventos VIP.");
                        } else {
                            // Confirmación de pago
                            System.out.print("¿El pago de la reserva ha sido realizado? (Si/No): ");
                            String pagoRealizado = sc.nextLine();
                            if (!pagoRealizado.equals("Si")) {
                                System.out.println("El pago debe ser realizado antes de proceder con la reserva.");
                                break; // Salir del caso 1 y volver al menú principal
                            }
                            nuevoEvento.setPagoRealizado(true);

                            // Selección de equipos adicionales
                            Equipo[] equiposSeleccionados = new Equipo[5];
                            int count = 0;

                            System.out.println("Equipos disponibles para la fecha: " + fecha);
                            for (Equipo equipo : equipoAdicional) {
                                if (equipo != null && equipo.verificarDisponibilidad(fecha)) {
                                    System.out.println("** " + equipo.getNombre() + ", Serie: " + equipo.getNumeroSerie());
                                }
                            }

                            while (count < 5) {
                                System.out.print("¿Desea agregar un equipo? (Si/No): ");
                                String respuesta = sc.nextLine();
                                if (respuesta.equals("No")) {
                                    break;
                                }

                                System.out.print("Ingrese el número de serie: ");
                                String numeroSerie = sc.nextLine();

                                boolean equipoEncontrado = false;
                                for (Equipo equipo : equipoAdicional) {
                                    if (equipo != null && equipo.getNumeroSerie().equals(numeroSerie.trim()) && equipo.verificarDisponibilidad(fecha)) {
                                        equiposSeleccionados[count] = equipo;
                                        equipo.reservarEquipo(fecha);
                                        count++;
                                        equipoEncontrado = true;
                                        break;
                                    }
                                }

                                if (!equipoEncontrado) {
                                    System.out.println("Número de serie no válido o equipo no disponible.");
                                }

                                if (count == 5) {
                                    System.out.println("Se ha alcanzado el máximo de 5 equipos.");
                                    break;
                                }
                            }

                            nuevoEvento.setEquiposSeleccionados(equiposSeleccionados);

                            // Reservar salón
                            if (nuevoEvento.reservarSalon(salonSeleccionado)) {
                                for (int i = 0; i < eventosReservados.length; i++) {
                                    if (eventosReservados[i] == null) {
                                        eventosReservados[i] = nuevoEvento;
                                        break;
                                    }
                                }
                                System.out.println("Reserva completada exitosamente.");
                            } else {
                                System.out.println("No se pudo reservar el salón.");
                            }
                        }
                    } else {
                        System.out.println("Salón no disponible");
                        for (int i = 0; i < listaEspera.length; i++) {
                            if (listaEspera[i] == null) {
                                listaEspera[i] = nuevoEvento;
                                break;
                            }
                        }
                        System.out.println("Evento agregado a la lista de espera :)");
                    }
                    break;
                
                case 2:
                    System.out.println("Lista de Espera:");
                    for (Evento evento : listaEspera) {
                        if (evento != null) {
                            System.out.println("Evento: " + evento.getNombreEvento() + ", Fecha: " + evento.getFecha() + ", Tipo: " + evento.getTipo());
                        }
                    }
                    break;

                case 3:
                    System.out.println("Reporte de Eventos Reservados:");
                    for (Evento evento : eventosReservados) {
                        if (evento != null) {
                            // Imprimir información básica del evento
                            System.out.println("Evento: " + evento.getNombreEvento() + ", Fecha: " + evento.getFecha());
                
                            // Imprimir información de los equipos reservados para este evento
                            System.out.println("Equipos Reservados:");
                            Equipo[] equipos = evento.getEquiposSeleccionados();
                            for (Equipo equipo : equipos) {
                                if (equipo != null) {
                                    System.out.println("** " + equipo.obtenerInfo());
                                }
                            }
                            System.out.println(); 
                        }
                    }
                    break;

                case 4:
                    ejecutar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
