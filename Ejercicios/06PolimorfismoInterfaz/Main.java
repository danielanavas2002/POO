/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main 
 * La clase Main es el punto de entrada de la aplicación, 
 * que gestiona añadir vehículos eléctricos, gestiona alquiler
 * y regreso de los vehículos, así como los descuentos y reportes
 * mensuales para la flota de vehículos.
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

import java.io.IOException;
import java.util.Scanner;
import java.util.Calendar;

public class Main {
    /**
     * El método main es el punto de entrada de la aplicación. 
     * Inicializa el escáner para la entrada del usuario, instancia la Flota,
     * establece variables relacionadas con el manejo de la aplicación así 
     * como revisar si es inicio de mes para resetear los valores que 
     * deben de reiniciarce cada mes.
     *
     * @param args argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Abrir escaner
        Flota flota = new Flota();           // Instanciar Flota
        boolean continuar = true;            // Variable para manejo de menú

        // Carga de datos por medio de método en clase Flota
        try {
            flota.cargarCSV();
            System.out.println("");
            System.out.println("=========================================");
            System.out.println("===    DATOS CARGADOS ÉXITOSAMENTE    ===");
            System.out.println("=========================================");
            System.out.println("");
        } catch (IOException e) {
            System.out.println("=========================================");
            System.out.println("===     ERROR AL CARGAR LOS DATOS     ===");
            System.out.println("=== " + e.getMessage());
            System.out.println("=========================================");
            System.out.println("");
        } catch (IllegalArgumentException e) {
            System.out.println("==========================================");
            System.out.println("===  ERROR EN EL FORMATO DE LOS DATOS  ===");
            System.out.println("=== " + e.getMessage());
            System.out.println("==========================================");
            System.out.println(""); 
        } 
        
        // Verificar si es el primer día del mes
        Calendar calendario = Calendar.getInstance();
        int diaDelMes = calendario.get(Calendar.DAY_OF_MONTH);
        if (diaDelMes == 1) {
            // Si es el primer día del mes, setear ingresos y horas a cero
            for (Vehiculo vehiculo : flota.getVehiculos()) {
                vehiculo.setIngresoMensual(0); 
            }

            for (Cliente cliente : flota.getClientes()) {
                cliente.setHorasUsoMensual(0); 
            }

            System.out.println("===============================================");
            System.out.println("===             INICIO DE MESES             ===");
            System.out.println("=== Ingresos mensuales en $0.00             ===");
            System.out.println("=== Horas de Uso Mensual para Clientes en 0 ===");
            System.out.println("===============================================");
        }
        
        System.out.println("==================================================");
        System.out.println("===      ALQUILER DE VEHÍCULOS ELÉCTRICOS      ===");
        System.out.println("==================================================");

        while (continuar) { // Imprimir Menú Principal
            System.out.println("\n*******************************************************");
            System.out.println("***                  MENÚ PRINCIPAL                 ***");
            System.out.println("* 1. Registrar nuevo Vehículo en la flota             *");
            System.out.println("* 2. Alquiler de Vehículo                             *");
            System.out.println("* 3. Regreso de Vehículo                              *");
            System.out.println("* 4. Reporte mensual de ingresos por tipo de vehículo *");
            System.out.println("* 5. Reporte de Vehículos en Flota                    *");
            System.out.println("* 6. Salir                                            *");
            System.out.println("*******************************************************");
            System.out.print("Seleccione una opción: ");

            int opcion;
            try { // Verificar opción correcta
                opcion = sc.nextInt();
            } catch (Exception e) { // Mostrar error si no se puede
                System.out.println("");
                System.out.println("=======================================================");
                System.out.println("===                      ERROR                      ===");
                System.out.println("=== Entrada inválida. Por favor, ingrese un número. ===");
                System.out.println("=======================================================");
                System.out.println("");
                sc.nextLine();  // Limpiar el buffer de entrada
                continue;
            }

            switch (opcion) { // Estructura para manejar menú
                case 1: // Registro de un nuevo vehículo en la flota
                    System.out.println("");
                    System.out.println("=====================================");
                    System.out.println("===       INGRESAR VEHÍCULO       ===");
                    System.out.println("=====================================");
                    System.out.println("");
                    System.out.println("*************************************");
                    System.out.println("* 1. Auto Eléctrico                 *");
                    System.out.println("* 2. Bicicleta Eléctrica            *");
                    System.out.println("* 3. Patineta Eléctrica             *");
                    System.out.println("*************************************");
                    System.out.print("Seleccione el tipo de vehículo a registrar: " );
                    int tipoVehiculo;
                    try {
                        tipoVehiculo = sc.nextInt();
                        sc.nextLine();  // Limpiar el buffer
                    } catch (Exception e) {
                        System.out.println("");
                        System.out.println("=======================================================");
                        System.out.println("===                      ERROR                      ===");
                        System.out.println("=== Entrada inválida. Por favor, ingrese un número. ===");
                        System.out.println("=======================================================");
                        System.out.println("");
                        sc.nextLine();  // Limpiar el buffer
                        continue;
                    }

                    switch (tipoVehiculo) { // Definir tarifa base dependiendo de que tipo de vehículo es
                        case 1: // Ingreso de Auto Electrico
                            AutoElectrico autoIngreso = new AutoElectrico(15.0f, false, 0.0f);
                            flota.addVehiculo(autoIngreso);
                            System.out.println("");
                            System.out.println("====================================");
                            System.out.println("===   AUTO ELÉCTRICO INGRESADO   ===");
                            System.out.println("===  Tarifa de $ 15.00 por hora  ===");
                            System.out.println("=== ID: " + autoIngreso.getID());
                            System.out.println("====================================");
                            System.out.println("");
                            break;
                        case 2: // Ingreso Bicicleta Electrica
                            BicicletaElectrica bicicletaIngreso = new BicicletaElectrica(5.0f, false, 0.0f);
                            flota.addVehiculo(bicicletaIngreso);
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("=== BICICLETA ELÉCTRICA INGRESADA ===");
                            System.out.println("===   Tarifa de $ 5.00 por hora   ===");
                            System.out.println("=== ID: " + bicicletaIngreso.getID());
                            System.out.println("=====================================");
                            System.out.println("");
                            break;
                        case 3: // Ingreso de Patineta Electrica
                            PatinetaElectrica patinetaIngreso = new PatinetaElectrica(8.0f, false, 0.0f);
                            flota.addVehiculo(patinetaIngreso);
                            System.out.println("");
                            System.out.println("====================================");
                            System.out.println("=== PATINETA ELÉCTRICA INGRESADA ===");
                            System.out.println("===  Tarifa de $ 8.00 por hora   ===");
                            System.out.println("=== ID: " + patinetaIngreso.getID());
                            System.out.println("====================================");
                            System.out.println("");
                            break;
                        default: // Default de opcion no valida
                            System.out.println("");
                            System.out.println("=======================");
                            System.out.println("===      ERROR      ===");
                            System.out.println("=== Opción inválida ===");
                            System.out.println("=======================");
                            System.out.println("");
                    }
                    break;
                case 2: // Alquiler de Vehículo
                    try {
                        System.out.println("");
                        System.out.println("====================================");
                        System.out.println("===     ALQUILER DE VEHÍCULO     ===");
                        System.out.println("====================================");
                        System.out.println("");
                        Cliente cliente = null;
                        System.out.print("¿El cliente cuenta con ID? (Si/No): ");
                        String tieneID = sc.nextLine().trim(); // Eliminar espacios en blanco
                        tieneID = sc.nextLine().trim();              
                
                        if (tieneID.equalsIgnoreCase("si")) { // Si sí, buscar por ID
                            System.out.print("Ingrese el ID del cliente: ");
                            int clienteID = sc.nextInt();
                            sc.nextLine(); // Limpiar el buffer
                            cliente = flota.getCliente(clienteID);
                            if (cliente == null) {
                                System.out.println("");
                                System.out.println("=============================");
                                System.out.println("===         ERROR         ===");
                                System.out.println("=== Cliente no encontrado ===");
                                System.out.println("=============================");
                                System.out.println("");
                                break;
                            }
                        } else if (tieneID.equalsIgnoreCase("no")) { // Si no
                            cliente = new Cliente(0); // Crear nuevo cliente
                            flota.addCliente(cliente);
                            System.out.println("");
                            System.out.println("==============================");
                            System.out.println("=== CLIENTE NUEVO AGREGADO ===");
                            System.out.println("=== ID: " + cliente.getID());
                            System.out.println("==============================");
                        } else {
                            System.out.println("");
                            System.out.println("=======================");
                            System.out.println("===      ERROR      ===");
                            System.out.println("=== Opción inválida ===");
                            System.out.println("=======================");
                            System.out.println("");
                            break;
                        }

                        System.out.println(""); // Imprimir vehículos disponibles para alquiler
                        System.out.println("===========================================");
                        System.out.println("=== Vehículos Disponibles para Alquiler ===");
                        System.out.println("===========================================");
                        System.out.println("");

                        System.out.println("========================"); // Imprimir Autos Electricos
                        System.out.println("=== AUTOS ELÉCTRICOS ===");
                        System.out.println("===   $15 por Hora   ===");
                        System.out.println("========================");
                        for (Vehiculo vehiculo : flota.getVehiculos()) {
                            if (!vehiculo.getEnAlquiler() && vehiculo instanceof AutoElectrico) {
                                System.out.println("ID: " + vehiculo.getID());
                            }
                        }

                        System.out.println(""); // Imprimir Bicicletas
                        System.out.println("=============================");
                        System.out.println("=== BICICLETAS ELÉCTRICAS ===");
                        System.out.println("===      $5 por Hora      ===");
                        System.out.println("=============================");
                        for (Vehiculo vehiculo : flota.getVehiculos()) {
                            if (!vehiculo.getEnAlquiler() && vehiculo instanceof BicicletaElectrica) {
                                System.out.println("ID: " + vehiculo.getID());
                            }
                        }

                        System.out.println(""); // Imprimir Patinetas
                        System.out.println("============================");
                        System.out.println("=== PATINETAS ELÉCTRICAS ===");
                        System.out.println("===      $8 por Hora     ===");
                        System.out.println("============================");
                        for (Vehiculo vehiculo : flota.getVehiculos()) {
                            if (!vehiculo.getEnAlquiler() && vehiculo instanceof PatinetaElectrica) {
                                System.out.println("ID: " + vehiculo.getID());
                            }
                        }
                        System.out.println("");
                        System.out.print("Ingrese el ID del vehículo que desea alquilar: "); // Ingresar ID
                        int vehiculoID = sc.nextInt();
                        sc.nextLine();
                        Vehiculo vehiculoSeleccionado = flota.getVehiculo(vehiculoID);

                        if (vehiculoSeleccionado == null) { // Mostrar error si el vehiculo no existe 
                            System.out.println("");
                            System.out.println("=============================");
                            System.out.println("===          ERROR        ===");
                            System.out.println("=== Vehículo no existente ===");
                            System.out.println("=============================");
                            System.out.println("");
                            break;
                        } else if (vehiculoSeleccionado.getEnAlquiler()) { // Mostrar error si el vehiculo ya esta en alquiler
                            System.out.println("");
                            System.out.println("=============================");
                            System.out.println("===          ERROR        ===");
                            System.out.println("== Vehículo ya en Alquiler ==");
                            System.out.println("=============================");
                            System.out.println("");
                            break;
                        }

                        System.out.print("Ingrese el número de horas de alquiler: "); // Ingresar número de horas
                        int horas = sc.nextInt();
                        sc.nextLine();

                        float costoFinal = 0;

                        if (vehiculoSeleccionado instanceof IVehiculo) {
                            IVehiculo vehiculoInterfaz = (IVehiculo) vehiculoSeleccionado; // Castear para poder usar interfaz
                            if (vehiculoSeleccionado instanceof AutoElectrico) { // Buscar si aplica descuento de Auto Electrico
                                // Descuento por horas mensuales de uso
                                if (cliente.getHorasUsoMensual() >= 50) {
                                    costoFinal = vehiculoInterfaz.calcularCosto(horas, true);
                                    System.out.println("=====================================================");
                                    System.out.println("===                 $15 POR HORA                  ===");
                                    System.out.println("=== " + cliente.getHorasUsoMensual() + " horas de uso en el último mes.");
                                    System.out.println("===           10% DE DESCUENTO APLICABLE           ===");
                                    System.out.println("======================================================");
                                    System.out.println(" ");
                                    System.out.println("El costo total del alquiler es: $" + String.format("%.2f", costoFinal));

                                } else {
                                    costoFinal = vehiculoInterfaz.calcularCosto(horas, false);
                                    System.out.println("===============================================");
                                    System.out.println("===              $15 POR HORA               ===");
                                    System.out.println("=== " + cliente.getHorasUsoMensual() +" horas de uso en el último mes.");
                                    System.out.println("===         DESCUENTO NO APLICABLE          ===");
                                    System.out.println("===============================================");
                                    System.out.println(" ");
                                    System.out.println("El costo total del alquiler es: $" + String.format("%.2f", costoFinal));
                                    
                                }
                            } else if (vehiculoSeleccionado instanceof BicicletaElectrica) {
                                System.out.print("¿Es un día lluvioso? (Si/No): ");
                                String diaLluvioso = sc.nextLine().trim().toLowerCase();
                                if (diaLluvioso.equals("si")) {
                                    costoFinal = vehiculoInterfaz.calcularCosto(horas, true);
                                    System.out.println("====================================================");
                                    System.out.println("===                 $5 POR HORA                  ===");
                                    System.out.println("===          5% DE DESCUENTO POR LLUVIA          ===");
                                    System.out.println("====================================================");
                                    System.out.println("");
                                    System.out.println("El costo total del alquiler es: $" + String.format("%.2f", costoFinal));
                                    
                                } else if (diaLluvioso.equals("no")) {
                                    costoFinal = vehiculoInterfaz.calcularCosto(horas, false);
                                    System.out.println("==================================================");
                                    System.out.println("===           DESCUENTO NO APLICABLE           ===");
                                    System.out.println("===================================================");
                                    System.out.println("");
                                    System.out.println("El costo total del alquiler es: $" + String.format("%.2f", costoFinal));
                                }
                            } else if (vehiculoSeleccionado instanceof PatinetaElectrica) {
                                // Sin descuento para Patineta
                                costoFinal = vehiculoInterfaz.calcularCosto(horas, false);
                                System.out.println("===================================================");
                                System.out.println("=== DESCUENTO NO APLICABLE POR TIPO DE VEHÍCULO ===");
                                System.out.println("===================================================");
                                System.out.println("");
                                System.out.println("El costo total del alquiler es: $" + String.format("%.2f", costoFinal));
                            }
                        } else { // Por si hay un error en alguna parte
                            System.out.println("=======================================================");
                            System.out.println("===                      ERROR                      ===");
                            System.out.println("= El vehículo seleccionado no puede calcular el costo =");
                            System.out.println("=======================================================");
                            System.out.println("");
                            
                        }
                        
                        // Preguntar al usuario si desea proceder con el alquiler
                        System.out.print("¿Desea alquilar este vehículo? (Si/No): ");
                        String confirmacion = sc.nextLine().trim().toLowerCase();

                        if (confirmacion.equals("si")) {
                            // Si confirma, se procede con el alquiler
                            vehiculoSeleccionado.setEnAlquiler(true); // Marcar carro como alquilado
                            vehiculoSeleccionado.setIngresoMensual(vehiculoSeleccionado.getIngresoMensual() + costoFinal); // Marcar carro como alquilado
                            cliente.addVehiculo(vehiculoSeleccionado); // Agregar a la lista asociada al cliente
                            // Actualizar horas de uso mensual del cliente en Auto Electrico
                            if (vehiculoSeleccionado instanceof AutoElectrico) {
                                cliente.setHorasUsoMensual(cliente.getHorasUsoMensual() + horas);
                            }

                            System.out.println(""); 
                            System.out.println("=============================================");
                            System.out.println("===    Vehículo Alquilado Exitosamente    ===");
                            System.out.println("=============================================");
                            System.out.println("");
                        } else if (confirmacion.equals("no")) {
                            System.out.println(""); 
                            System.out.println("===========================================");
                            System.out.println("===    El Alquiler ha sido Cancelado    ===");
                            System.out.println("===========================================");
                        } else {
                            System.out.println(""); 
                            System.out.println("=====================================");
                            System.out.println("===              ERROR             ===");
                            System.out.println("=== Entrada no válida. El alquiler ===");
                            System.out.println("=== no se realizará.               ===");
                            System.out.println("======================================");
                            
                        }
                    } catch (Exception e) { // Catch de error
                        System.out.println("=====================================");
                        System.out.println("===              ERROR             ===");
                        System.out.println("=== Error en el proceso de alquiler: " + e.getMessage());
                        System.out.println("======================================");
                        sc.nextLine(); // Limpiar el buffer en caso de error
                    }
                    break;

                case 3:
                    System.out.println("");
                    System.out.println("=====================================");
                    System.out.println("===      REGRESO DE VEHÍCULO      ===");
                    System.out.println("======================================");

                    try {
                        System.out.print("Ingrese el ID del vehículo a devolver: ");
                        int vehiculoID = sc.nextInt();
                        sc.nextLine();
                        Vehiculo vehiculo = flota.getVehiculo(vehiculoID); // Buscar vehículo por ID
                
                        if (vehiculo == null) {
                            System.out.println("");
                            System.out.println("=============================");
                            System.out.println("===         ERROR         ===");
                            System.out.println("=== Vehículo no encontrado ===");
                            System.out.println("=============================");
                            System.out.println("");
                        } else if (!vehiculo.getEnAlquiler()) {
                            System.out.println("");
                            System.out.println("=====================================");
                            System.out.println("===             ERROR             ===");
                            System.out.println("=== Vehículo no está en alquiler  ===");
                            System.out.println("=====================================");
                            System.out.println("");
                        } else {
                            // Si el vehículo está en alquiler, se procede a cambiar su estado
                            vehiculo.setEnAlquiler(false);
                            System.out.println("");
                            System.out.println("=============================");
                            System.out.println("===   VEHÍCULO DEVUELTO   ===");
                            System.out.println("=== ID: " + vehiculo.getID());
                            System.out.println("=============================");
                            System.out.println("");
                        }
                    } catch (Exception e) {
                        System.out.println("=====================================");
                        System.out.println("===              ERROR             ===");
                        System.out.println("=== Se produjo un error: " + e.getMessage());
                        System.out.println("======================================");
                    }
                    break;
                   
                case 4: // Generar reporte mensual de ingresos por tipo de vehículo
                    System.out.println("===============================================");
                    System.out.println("===       REPORTE MENSUAL DE INGRESOS       ===");
                    System.out.println("===============================================");
                    System.out.println("");
                    System.out.println(flota.generarReporteMensual());
                    System.out.println("");
                    break;

                case 5: // Reporte de cuantos vehículos tiene la flota
                    // Variables para contar vehículos
                    int conteoAutos = 0;
                    int conteoBicicletas = 0;
                    int conteoPatinetas = 0;

                    // Recorre la lista de vehículos y contar
                    for (Vehiculo vehiculo : flota.getVehiculos()) {
                        if (vehiculo instanceof AutoElectrico) {
                            conteoAutos++;
                        } else if (vehiculo instanceof BicicletaElectrica) {
                            conteoBicicletas++;
                        } else if (vehiculo instanceof PatinetaElectrica) {
                            conteoPatinetas++;
                        }
                    }

                    System.out.println("==============================================");
                    System.out.println("===    REPORTE DE VEHÍCULOS EN LA FLOTA    ===");
                    System.out.println("==============================================");
                    System.out.println("");
                    System.out.println("Autos Eléctricos: " + conteoAutos);
                    System.out.println("Bicicletas Eléctricas: " + conteoBicicletas);
                    System.out.println("Patinetas Eléctricas: " + conteoPatinetas);
                    System.out.println("");
                    break;

                case 6:
                    // Llamada al método guardarEnCSV
                    try {
                        flota.guardarEnCSV();
                        System.out.println("");
                        System.out.println("==========================================");
                        System.out.println("===    DATOS GUARDADOS ÉXITOSAMENTE    ===");
                        System.out.println("==========================================");
                        System.out.println("");
                    } catch (IOException e) {
                        System.out.println("========================================");
                        System.out.println("===    ERROR AL GUARDAR LOS DATOS    ===");
                        System.out.println("=== " + e.getMessage());
                        System.out.println("========================================");
                        System.out.println("");
                        
                    }
                    System.out.println("==============================================");
                    System.out.println("===    FINALIZA EJECUCIÓN DEL PROGRAMA     ===");
                    System.out.println("==============================================");
                    continuar = false;
                    break;

                default:
                    System.out.println("");
                    System.out.println("=======================");
                    System.out.println("===      ERROR      ===");
                    System.out.println("=== Opción inválida ===");
                    System.out.println("=======================");
                    System.out.println("");
            }
        }
        sc.close(); // Cerrar Escaner
    }
}
