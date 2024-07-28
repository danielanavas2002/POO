import java.util.Scanner;
import java.util.Date;

public class Main{
    public static void main(String[] args){
        // Configurar elementos iniciales 
        // Localidades
        Localidad localidad1 = new Localidad("Localidad 1", 1000 , 0 , 100.0f);
        Localidad localidad5 = new Localidad("Localidad 5", 500 , 0 , 500.0f);
        Localidad localidad10 = new Localidad("Localidad 10", 200 , 0 , 1000.0f);

        // Fecha Actual
        Date fechaActual = new Date(); // Objeto de Fecha
        String diaActual, mesActual, anioActual;

        int diaActualint = fechaActual.getDate(); // Ajustar el valor si es entre 1 y 9, para agregar un cero antes y tener formato dd
        if (diaActualint < 10){
            diaActual = 0 + String.valueOf(fechaActual.getDate());
        } else {
            diaActual = String.valueOf(fechaActual.getDate());
        }

        int mesActualint = fechaActual.getMonth() + 1; // Ajustar el valor si es entre 1 y 9, para agregar un cero antes y tener formato mm
        if (mesActualint < 10){
            mesActual = 0 + String.valueOf(fechaActual.getMonth() + 1);
        } else {
            mesActual = String.valueOf(fechaActual.getMonth() + 1);
        }

        anioActual = String.valueOf(fechaActual.getYear() + 1900);
        
        // Iniciar escaner
        Scanner sc = new Scanner(System.in);
        int opcion = 1;

        // Ciclo While para menú principal
        while(opcion != 5){ // Hasta que se seleccione opcion Salir
            // Menu Principal
            System.out.println("*******************************");
            System.out.println("**     COMPRA DE BOLETOS     **");
            System.out.println("* 1. Iniciar Compra           *");
            System.out.println("* 2. Disponibilidad Total     *");
            System.out.println("* 3. Disponibilida Individual *");
            System.out.println("* 4. Reporte de Caja          *");
            System.out.println("* 5. Salir                    *");
            System.out.println("*******************************");

            System.out.println("Escoge una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    // Añadir un nuevo comprador
                    System.out.println("*****************************");
                    System.out.println("*      NUEVO COMPRADOR      *");
                    System.out.println("*****************************");
                    System.out.println("Nombre: ");
                    sc.nextLine();
                    String nombre = sc.nextLine();
                    
                    System.out.println("Email: ");
                    String email = sc.nextLine();

                    System.out.println("Presupuesto Maximo: ");
                    float presupuesto = sc.nextFloat();   

                    Cliente cliente = new Cliente(nombre, email, 0, presupuesto);

                    int opcionLocalidad = 1;

                    // Menu para seleccionar Localidades
                    while(opcionLocalidad != 5){
                        System.out.println("*******************************");
                        System.out.println("**         LOCALIDAD         **");
                        System.out.println("* 1. Localidad 1 ($100)       *");
                        System.out.println("* 2. Localidad 5 ($500)       *");
                        System.out.println("* 3. Localidad 10 ($1000)     *");
                        System.out.println("* 4. Regresar a Menu          *");
                        System.out.println("* 5. Salir                    *");
                        System.out.println("*******************************");

                        System.out.println("Seleccione opcion: ");
                        opcionLocalidad = sc.nextInt();
                        int cantidad;
                        
                        switch (opcionLocalidad) {
                            case 1:
                                System.out.println("LOCALIDAD 1");
                                sc.nextLine();
                                System.out.println("Cantidad: ");
                                cantidad = sc.nextInt();
                                
                                if (cantidad*localidad1.getPrecio() > cliente.getPresupuesto()){ // Validar Presupuesto (No se exceda)
                                    System.out.println("******************************");
                                    System.out.println("*  SE EXCEDE EL PRESUPUESTO  *");
                                    System.out.println("******************************");


                                } else if(localidad1.getCapacidad() == 0){ // Validar Espacio
                                    System.out.println("******************************");
                                    System.out.println("*      BOLETOS AGOTADOS      *");
                                    System.out.println("******************************");
                                }
                                
                                else if(localidad1.getCapacidad() - cantidad < 0){ // Validar Disponibilidad
                                    System.out.println("*****************************");
                                    System.out.println("*  SE EXCEDE DISPONIBLIDAD  *");
                                    System.out.println("*****************************");
                                    System.out.println("Se tienen Disponibles " + localidad1.getCapacidad() + " Boletos");
                                    cantidad = localidad1.getCapacidad();
                                    localidad1.setCapacidad(localidad1.getCapacidad() - cantidad);
                                    localidad1.setVendidos(localidad1.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 1");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), 100.0f, localidad1);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                else {
                                    System.out.println("*****************************");
                                    System.out.println("*      COMPRA EXISTOSA      *");
                                    System.out.println("*****************************");
                                    localidad1.setCapacidad(localidad1.getCapacidad() - cantidad);
                                    localidad1.setVendidos(localidad1.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 1");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), 100.0f, localidad1);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                opcionLocalidad = 5;
                                break;
                            case 2:
                                System.out.println("LOCALIDAD 5");
                                sc.nextLine();
                                System.out.println("Cantidad: ");
                                cantidad = sc.nextInt();
                                if (cantidad*localidad5.getPrecio() > cliente.getPresupuesto()){ // Validar Presupuesto (No se exceda)
                                    System.out.println("******************************");
                                    System.out.println("*  SE EXCEDE EL PRESUPUESTO  *");
                                    System.out.println("******************************");


                                } else if(localidad5.getCapacidad() == 0){ // Validar Espacio
                                    System.out.println("******************************");
                                    System.out.println("*      BOLETOS AGOTADOS      *");
                                    System.out.println("******************************");
                                }
                                
                                else if(localidad5.getCapacidad() - cantidad < 0){ // Validar Disponibilidad
                                    System.out.println("*****************************");
                                    System.out.println("*  SE EXCEDE DISPONIBLIDAD  *");
                                    System.out.println("*****************************");
                                    System.out.println("Se tienen Disponibles " + localidad5.getCapacidad() + " Boletos");
                                    cantidad = localidad5.getCapacidad();
                                    localidad5.setCapacidad(localidad5.getCapacidad() - cantidad);
                                    localidad5.setVendidos(localidad5.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 5");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), localidad1.getPrecio(), localidad5);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                else {
                                    System.out.println("*****************************");
                                    System.out.println("*      COMPRA EXISTOSA      *");
                                    System.out.println("*****************************");
                                    localidad5.setCapacidad(localidad5.getCapacidad() - cantidad);
                                    localidad5.setVendidos(localidad5.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 5");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), localidad5.getPrecio(), localidad5);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                opcionLocalidad = 5;
                                break;
                            case 3:
                                System.out.println("LOCALIDAD 10");
                                sc.nextLine();
                                System.out.println("Cantidad: ");
                                cantidad = sc.nextInt();
                                
                                if (cantidad*localidad10.getPrecio() > cliente.getPresupuesto()){ // Validar Presupuesto (No se exceda)
                                    System.out.println("******************************");
                                    System.out.println("*  SE EXCEDE EL PRESUPUESTO  *");
                                    System.out.println("******************************");


                                } else if(localidad10.getCapacidad() == 0){ // Validar Espacio
                                    System.out.println("******************************");
                                    System.out.println("*      BOLETOS AGOTADOS      *");
                                    System.out.println("******************************");
                                }
                                
                                else if(localidad10.getCapacidad() - cantidad < 0){ // Validar Disponibilidad
                                    System.out.println("*****************************");
                                    System.out.println("*  SE EXCEDE DISPONIBLIDAD  *");
                                    System.out.println("*****************************");
                                    System.out.println("Se tienen Disponibles " + localidad10.getCapacidad() + " Boletos");
                                    cantidad = localidad10.getCapacidad();
                                    localidad10.setCapacidad(localidad10.getCapacidad() - cantidad);
                                    localidad10.setVendidos(localidad10.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 10");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), localidad10.getPrecio(), localidad10);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                else {
                                    System.out.println("*****************************");
                                    System.out.println("*      COMPRA EXISTOSA      *");
                                    System.out.println("*****************************");
                                    localidad10.setCapacidad(localidad10.getCapacidad() - cantidad);
                                    localidad10.setVendidos(localidad10.getVendidos() + cantidad);
                                    cliente.setCantidad(cantidad);
                                    System.out.println("Cliente: " + cliente.getNombre());
                                    System.out.println("Email: " + cliente.getEmail());
                                    System.out.println("Cantidad: " + cliente.getCantidad());
                                    System.out.println("Localidad: Localidad 10");
                                    System.out.println("Numeros de Ticket: ");
                                    
                                    for (int i = 0; i < cantidad; i++){ // Generar numeros de tickets (AAAAmmDD#)
                                        Boleto boleto = new Boleto(anioActual + mesActual + diaActual + String.valueOf(localidad1.getVendidos() + localidad5.getVendidos() + localidad10.getVendidos() - cantidad + i + 1), localidad10.getPrecio(), localidad10);
                                        System.out.println(boleto.getNumero());
                                    }
                                }
                                opcionLocalidad = 5;
                                break;
                            case 4:
                                break;
                            case 5:
                                opcion = 5;
                                break;
                            default:
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("******************************");
                    System.out.println("*    DISPONIBILIDAD TOTAL    *");
                    System.out.println("******************************");
                    System.out.println("DISPONIBLES:");
                    System.out.println("Localidad 1: " + localidad1.getCapacidad() + " boletos.");
                    System.out.println("Localidad 5: " + localidad5.getCapacidad() + " boletos.");
                    System.out.println("Localidad 10: " + localidad10.getCapacidad() + " boletos.");
                    System.out.println("-------------------------------");
                    System.out.println("VENDIDOS:");
                    System.out.println("Localidad 1: " + localidad1.getVendidos() + " boletos.");
                    System.out.println("Localidad 5: " + localidad5.getVendidos() + " boletos.");
                    System.out.println("Localidad 10: " + localidad10.getVendidos() + " boletos.");
                    break;
                case 3:
                    System.out.println("******************************");
                    System.out.println("*  DISPONIBILIDA INDIVIDUAL  *");
                    System.out.println("******************************");
                    System.out.println("* 1. Localidad 1             *");
                    System.out.println("* 2. Localidad 5             *");
                    System.out.println("* 3. Localidad 10            *");
                    System.out.println("******************************");
                    System.out.println("Seleccione localidad: ");
                    sc.nextLine();
                    int loc = sc.nextInt();

                    switch (loc) {
                        case 1:
                            System.out.println("-------------------------------");
                            System.out.println("DISPONIBLES:");
                            System.out.println("Localidad 1: " + localidad1.getCapacidad() + " boletos.");
                            System.out.println("-------------------------------");
                            System.out.println("VENDIDOS:");
                            System.out.println("Localidad 1: " + localidad1.getVendidos() + " boletos.");
                            System.out.println("-------------------------------");
                            break;
                        case 2:
                            System.out.println("-------------------------------");
                            System.out.println("DISPONIBLES:");
                            System.out.println("Localidad 5: " + localidad5.getCapacidad() + " boletos.");
                            System.out.println("-------------------------------");
                            System.out.println("VENDIDOS:");
                            System.out.println("Localidad 5: " + localidad5.getVendidos() + " boletos.");
                            System.out.println("-------------------------------");
                            break;
                        case 3:
                            System.out.println("-------------------------------");
                            System.out.println("DISPONIBLES:");
                            System.out.println("Localidad 10: " + localidad10.getCapacidad() + " boletos.");
                            System.out.println("-------------------------------");
                            System.out.println("VENDIDOS:");
                            System.out.println("Localidad 10: " + localidad10.getVendidos() + " boletos.");
                            System.out.println("-------------------------------");
                            break;
                        default:
                            System.out.println("Opcion No Valida");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("******************************");
                    System.out.println("*       REPORTE DE CAJA      *");
                    System.out.println("******************************");
                    System.out.println("-------------------------------");
                    System.out.println("Dinero generado por localidad: ");
                    System.out.println("Localidad 1: $" + localidad1.getVendidos()*localidad1.getPrecio());
                    System.out.println("Localidad 5: $" + localidad5.getVendidos()*localidad5.getPrecio());
                    System.out.println("Localidad 10: $" + localidad10.getVendidos()*localidad10.getPrecio());
                    System.out.println("-------------------------------");
                    float total = (localidad1.getVendidos()*localidad1.getPrecio())+(localidad5.getVendidos()*localidad5.getPrecio())+(localidad10.getVendidos()*localidad10.getPrecio());
                    System.out.println("Dinero total Generado: $" + total);
                    System.out.println("-------------------------------");

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Seleccione una opción correcta");
                    break;
            }
        }

        System.out.println("GRACIAS POR USAR EL PROGRAMA"); // Terminar ejecución del Programa
        sc.close(); // Cerrar Escaner
    }
}