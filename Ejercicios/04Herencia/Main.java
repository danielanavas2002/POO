/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main 
 * La clase Main es el punto de entrada de la aplicación, 
 * que gestiona la creación y almacenamiento de recintos 
 * para diferentes especies de animales.
 *
 * @author Daniela Navas
 * Fecha de creación: 28/09/2024
 * Última modificación: 28/09/2024
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    /**
     * El método main es el punto de entrada de la aplicación. 
     * Inicializa el escáner para la entrada del usuario, 
     * establece variables relacionadas con el presupuesto y 
     * el costo de construcción, y crea una lista de recintos. 
     * También se encarga de la creación inicial de 
     * cinco serpientes, cinco caimanes y cinco tortugas.
     *
     * @param args argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);     // Escáner para la entrada de datos del usuario
        int presupuestoAnual = 0;                // Presupuesto anual asignado
        int costoConstruccion = 0;               // Costo de construcción del recinto
        int tamaño = 0;                          // Tamaño del recinto
        int i;                                   // Variable de iteración

        Recinto recinto = new Recinto(10000, 200000, 500000); // Creación de un nuevo recinto con valores específicos
        ArrayList<Recinto> recintos = new ArrayList<>();                                                // Lista para almacenar recintos
        recintos.add(recinto);                                                                          // Agrega el recinto a la lista

        // Para iniciar el código se crearán 5 Serpientes, 5 Caimanes y 5 Tortugas
        Serpiente serpiente = new Serpiente("Crotalus atrox", "Zonas áridas y semiáridas", 30, 28.0f, 20, 4.0f, false, "Carnívora", 2.5f, "Viperidae", "Marrón, amarillo", true, "Hemotóxico");
        recinto.agregarReptil(serpiente);

        serpiente = new Serpiente("Ophiophagus hannah", "Bosques tropicales y manglares", 20, 32.0f, 30, 7.0f, false, "Carnívora", 5f, "Elapidae", "Marrón, amarillo", true, "Neurotóxico");
        recinto.agregarReptil(serpiente);

        serpiente = new Serpiente("Eunectes murinus", "Pantanos, ríos y selvas", 30, 28.0f, 40, 250.0f, false, "Carnívora", 6.5f, "Boidae", "Marrón, amarillo", false, "No Aplica");
        recinto.agregarReptil(serpiente);

        serpiente = new Serpiente("Micrurus fulvius", "Zonas boscosas y áridas", 15, 32.0f, 14, 1.0f, true, "Carnívora", 1.5f, "Elapidae", "Roja, negra, amarilla", true, "Neurotóxico");
        recinto.agregarReptil(serpiente);

        serpiente = new Serpiente("Thamnophis sirtalis", "Humedales, praderas y jardines", 10, 28.0f, 20, 1.0f, false, "Carnívora", 1.2f, "Colubridae", "Verde, rayas amarillas", false, "No Aplica");
        recinto.agregarReptil(serpiente);

        ReptilAcuatico tortuga = new ReptilAcuatico("Eretmochelys imbricata", "Zonas costeras, arrecifes de coral", 50, 30.0f, 200, 80.0f, true, "Carnívora", 1.0f, "Testudines", "Salada", 35.0f, 30.f, false);
        recinto.agregarReptil(tortuga);

        tortuga = new ReptilAcuatico("Caretta caretta", "Playas, océanos y mares abiertos", 70, 30.0f, 120, 200.0f, false, "Carnívora", 1.2f, "Testudines", "Salada", 35.0f, 50.f, false);
        recinto.agregarReptil(tortuga);

        tortuga = new ReptilAcuatico("Chelonia mydas", "Costas, praderas de pastos marinos", 80, 30.0f, 150, 300.0f, false, "Carnívora", 1.5f, "Testudines", "Salada", 35.0f, 30.f, false);
        recinto.agregarReptil(tortuga);

        tortuga = new ReptilAcuatico("Dermochelys coriacea", "Océanos abiertos y aguas profundas", 70, 30.0f, 100, 700.0f, false, "Carnívora", 2.5f, "Testudines", "Salada", 35f, 20.f, false);
        recinto.agregarReptil(tortuga);

        tortuga = new ReptilAcuatico("Testudo graeca", "Zonas áridas y semiáridas", 100, 30.0f, 10, 5.0f, false, "Carnívora", 0.3f, "Testudines", "Terrestre", 2.0f, 5.f, false);
        recinto.agregarReptil(tortuga);

        ReptilAcuatico caiman = new ReptilAcuatico("Caiman crocodilus", "Ríos, lagos, y pantanos", 40, 30.0f, 30, 70.0f, false, "Carnívora", 3.0f, "Crocodylidae", "Dulce", 32.0f, 10.0f, true);
        recinto.agregarReptil(caiman);

        caiman = new ReptilAcuatico("Caiman latirostris", "Pantanos, ríos y lagos", 50, 30.0f, 50, 100.0f, false, "Carnívora", 4.0f, "Crocodylidae", "Dulce", 30.0f, 15.0f, true);
        recinto.agregarReptil(caiman);

        caiman = new ReptilAcuatico("Caiman niger", "Ríos y pantanos en selvas tropicales", 60, 30.0f, 40, 450.0f, true, "Carnívora", 5.0f, "Crocodylidae", "Dulce", 20.0f, 15.0f, true);
        recinto.agregarReptil(caiman);

        caiman = new ReptilAcuatico("Caiman yacare", "Ríos y lagunas de zonas tropicales", 35, 30.0f, 30, 40.0f, false, "Carnívora", 3.0f, "Crocodylidae", "Dulce", 25.0f, 12.0f, true);
        recinto.agregarReptil(caiman);

        caiman = new ReptilAcuatico("Caiman yacare", "Pantanos y ríos de Sudamérica", 30, 30.0f, 35, 70.0f, false, "Carnívora", 2.5f, "Crocodylidae", "Dulce", 25.0f, 10.0f, true);
        recinto.agregarReptil(caiman);

        Recinto ultimoRecinto = recintos.get(recintos.size() - 1); // Definir último recinto de la lista

        System.out.println("******************************************");
        System.out.println("**             LA AURORA                **");
        System.out.println("**        RECINTOS DE REPTILES          **");
        System.out.println("******************************************");

        int opcion;
        boolean continuar = true;
        while (continuar) { // Iniciar Menú Principal
            System.out.println("******************************************");
            System.out.println("**            MENÚ PRINCIPAL            **");
            System.out.println("* 1. Ingresar Serpiente                  *");
            System.out.println("* 2. Ingresar Tortuga                    *");
            System.out.println("* 3. Ingresar Caimán/Cocodrilo           *");
            System.out.println("* 4. Consultar Costo de Mantenimiento    *");
            System.out.println("* 5. Consultar Tamaño de Recintos        *");
            System.out.println("* 6. Consultar Cantidad de Comida        *");
            System.out.println("* 7. Ver Presupuesto Anual de Recintos   *");
            System.out.println("* 8. Ver Detalle de Reptiles             *");
            System.out.println("* 9. Salir                              *");
            System.out.println("******************************************");

            System.out.print("Seleccione una opción: ");
            try {
                opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        System.out.println("******************************************");
                        System.out.println("***         INGRESAR SERPIENTE         ***");
                        System.out.println("******************************************");
                        System.out.print("Nombre Científico: "); // Ingresar datos de las Serpientes
                        String nombreCientifico = sc.nextLine();
                        System.out.print("Descripción del Hábitat: ");
                        String descripcionHabitat = sc.nextLine();
                        System.out.print("Esperanza de Vida (en años): ");
                        int esperanzaVida = Integer.parseInt(sc.nextLine());
                        System.out.print("Temperatura Corporal (°C): ");
                        float temperaturaCorporal = Float.parseFloat(sc.nextLine());
                        System.out.print("Promedio de Huevos: ");
                        int promedioHuevos = Integer.parseInt(sc.nextLine());
                        System.out.print("Peso (kg): ");
                        float peso = Float.parseFloat(sc.nextLine());
                        
                        boolean banderaPeligro = true;
                        boolean enPeligroExtincion = false;
                        while (banderaPeligro) { // Bucle para aceptar solo respuestas correctas 
                            System.out.print("¿En Peligro de Extinción? (Si/No): ");;
                            String respuesta = sc.nextLine().trim().toLowerCase();
                        
                            if (respuesta.equals("si")) {
                                enPeligroExtincion = true;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else if (respuesta.equals("no")) {
                                enPeligroExtincion = false;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else {
                                System.out.println("Por favor, ingresa 'Si' o 'No'.");
                            }
                        }

                        System.out.print("Dieta: ");
                        String dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        float longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        String especie = sc.nextLine();
                        System.out.print("Color de Piel: ");
                        String colorPiel = sc.nextLine();

                        boolean banderaVenenosoa = true;
                        String tipoVeneno = " ";
                        boolean esVenenosa = false;
                        while (banderaVenenosoa) { // Bucle para aceptar solo respuestas correctas
                            System.out.print("¿Es Venenosa? (Si/No): ");
                            String respuesta = sc.nextLine().trim().toLowerCase();
                        
                            if (respuesta.equals("si")) {
                                esVenenosa = true;
                                System.out.print("Tipo de Veneno (Neurotóxico o Hemotóxico): ");
                                tipoVeneno = sc.nextLine();
                                banderaVenenosoa = false; // Salimos del bucle si la respuesta es válida
                            } else if (respuesta.equals("no")) {
                                esVenenosa = false;
                                tipoVeneno = "No Aplica";
                                banderaVenenosoa = false; // Salimos del bucle si la respuesta es válida
                            } else {
                                System.out.println("Por favor, ingresa 'Si' o 'No'.");
                            }
                        }
                        // Crear la Serpiente
                        serpiente = new Serpiente(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, colorPiel, esVenenosa, tipoVeneno);
                        // Ver si el tamaño necesario esta disponible
                        if(ultimoRecinto.tamañoUsado() + serpiente.getAreaMinima() > ultimoRecinto.getTamaño()){
                            System.out.println(" ");
                            System.out.println("*******************************************");
                            System.out.println("* NO HAY SUFICIENTE ESPACIO EN EL RECINTO *");
                            System.out.println("*******************************************");
                            System.out.println(" ");
                            boolean banderaConstruir = true;
                            while (banderaConstruir) { // Si no hay, preguntar si se quiere construir uno
                                System.out.print("¿Desea Construir un Recinto? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) { // Construir Recinto
                                    System.out.print("Ingrese Presupuesto Anual del Recinto (Q): ");  
                                    presupuestoAnual = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el Costo de Construcción de un Recinto (Q): ");
                                    costoConstruccion = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el tamaño del Recinto (m^2): ");
                                    tamaño = Integer.parseInt(sc.nextLine());
                                    recinto = new Recinto(tamaño, presupuestoAnual, costoConstruccion);
                                    recintos.add(recinto);
                                    
                                    ultimoRecinto = recintos.get(recintos.size() - 1);

                                    System.out.println("*******************************************");
                                    System.out.println("*         SE CONSTRUYO EL RECINTO         *");
                                    System.out.println("*******************************************");

                                    System.out.println("* El espacio que requiere es de: " + serpiente.getAreaMinima() + " m^2."); // Mostrar datos de serpientes
                                    System.out.println("* Cantidad de comida que necesita (Diario): " + serpiente.calcularComidaDiaria() + " gramos.");
                                    System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + serpiente.calcularCostoMantenimiento());
                                
                                    boolean banderaIngreso = true;
                                    while (banderaIngreso) { // Ingresar si se quiere aceptar Serpiente
                                        System.out.println("------------------------------------------------");
                                        System.out.print("¿Desea aceptar a la Serpiente? (Si/No): ");;
                                        respuesta = sc.nextLine().trim().toLowerCase();
                                    
                                        if (respuesta.equals("si")) { // Aceptar Serpiente
                                            ultimoRecinto.agregarReptil(serpiente);
                                            System.out.println("******************************************");
                                            System.out.println("* Se Ingreso Exitosamente a la Serpiente *");
                                            System.out.println("******************************************");
                                            banderaIngreso = false; 
                                        } else if (respuesta.equals("no")) { // No aceptar
                                            System.out.println("******************************************");
                                            System.out.println("*      No se Ingreso a la Serpiente      *");
                                            System.out.println("******************************************");
                                            banderaIngreso = false; 
                                        } else {
                                            System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                        }
                                    }
                                    banderaConstruir = false; 
                                } else if (respuesta.equals("no")) { // No aceptar
                                    System.out.println("******************************************");
                                    System.out.println("*      No se Ingreso a la Serpiente      *");
                                    System.out.println("******************************************");
                                    banderaConstruir = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        } else {
                            System.out.println(" ");
                            System.out.println("******************************************");
                            System.out.println("*  HAY SUFICIENTE ESPACIO EN EL RECINTO  *");
                            System.out.println("******************************************"); // Mostrar datos de Serpiente
                            System.out.println("* El espacio que requiere es de: " + serpiente.getAreaMinima() + " m^2.");
                            System.out.println("* Cantidad de comida que necesita (Diario): " + serpiente.calcularComidaDiaria() + " gramos.");
                            System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + serpiente.calcularCostoMantenimiento());
                        
                            boolean banderaIngreso = true;
                            while (banderaIngreso) { // Ingresar si se quiere aceptar
                                System.out.println("------------------------------------------------");
                                System.out.print("¿Desea aceptar a la Serpiente? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) { // Si si, Aceptar
                                    ultimoRecinto.agregarReptil(serpiente);
                                    System.out.println("******************************************");
                                    System.out.println("* Se Ingreso Exitosamente a la Serpiente *");
                                    System.out.println("******************************************");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) { // Si no, no Aceptar
                                    System.out.println("******************************************");
                                    System.out.println("*      No se Ingreso a la Serpiente      *");
                                    System.out.println("******************************************");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        }
                        break;
                    case 2: // Se repite la misma lógica que en Case 1 con Tortuga en Case 2
                        System.out.println("******************************************");
                        System.out.println("***          INGRESAR TORTUGA          ***");
                        System.out.println("******************************************");
                        System.out.print("Nombre Científico: ");
                        nombreCientifico = sc.nextLine();
                        System.out.print("Descripción del Hábitat: ");
                        descripcionHabitat = sc.nextLine();
                        System.out.print("Esperanza de Vida (en años): ");
                        esperanzaVida = Integer.parseInt(sc.nextLine());
                        System.out.print("Temperatura Corporal (°C): ");
                        temperaturaCorporal = Float.parseFloat(sc.nextLine());
                        System.out.print("Promedio de Huevos: ");
                        promedioHuevos = Integer.parseInt(sc.nextLine());
                        System.out.print("Peso (kg): ");
                        peso = Float.parseFloat(sc.nextLine());
                        
                        banderaPeligro = true;
                        enPeligroExtincion = false;
                        while (banderaPeligro) {
                            System.out.print("¿En Peligro de Extinción? (Si/No): ");;
                            String respuesta = sc.nextLine().trim().toLowerCase();
                        
                            if (respuesta.equals("si")) {
                                enPeligroExtincion = true;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else if (respuesta.equals("no")) {
                                enPeligroExtincion = false;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else {
                                System.out.println("Por favor, ingresa 'Si' o 'No'.");
                            }
                        }

                        System.out.print("Dieta: ");
                        dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        especie = sc.nextLine();
                        System.out.print("Tipo de Agua: ");
                        String tipodeAgua = sc.nextLine();
                        System.out.print("Velocidad de Nado (m/s): ");
                        float velocidad = Float.parseFloat(sc.nextLine());
                        System.out.print("Duracion Buceo (min): ");
                        float duracion = Float.parseFloat(sc.nextLine());
                        
                        tortuga = new ReptilAcuatico(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, tipodeAgua, velocidad, duracion, false);

                        if(ultimoRecinto.tamañoUsado() + tortuga.getAreaMinima() > ultimoRecinto.getTamaño()){
                            System.out.println(" ");
                            System.out.println("*******************************************");
                            System.out.println("* NO HAY SUFICIENTE ESPACIO EN EL RECINTO *");
                            System.out.println("*******************************************");
                            System.out.println(" ");
                            boolean banderaConstruir = true;
                            while (banderaConstruir) {
                                System.out.print("¿Desea Construir un Recinto? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) {
                                    System.out.print("Ingrese Presupuesto Anual del Recinto (Q): ");  
                                    presupuestoAnual = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el Costo de Construcción de un Recinto (Q): ");
                                    costoConstruccion = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el tamaño del Recinto (m^2): ");
                                    tamaño = Integer.parseInt(sc.nextLine());
                                    recinto = new Recinto(tamaño, presupuestoAnual, costoConstruccion);
                                    recintos.add(recinto);
                                    
                                    ultimoRecinto = recintos.get(recintos.size() - 1);

                                    System.out.println("*******************************************");
                                    System.out.println("*         SE CONSTRUYO EL RECINTO         *");
                                    System.out.println("*******************************************");

                                    System.out.println("* El espacio que requiere es de: " + tortuga.getAreaMinima() + " m^2.");
                                    System.out.println("* Cantidad de comida que necesita (Diario): " + tortuga.calcularComidaDiaria() + " gramos.");
                                    System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + tortuga.calcularCostoMantenimiento());
                                
                                    boolean banderaIngreso = true;
                                    while (banderaIngreso) {
                                        System.out.println("------------------------------------------------");
                                        System.out.print("¿Desea aceptar a la Tortuga? (Si/No): ");;
                                        respuesta = sc.nextLine().trim().toLowerCase();
                                    
                                        if (respuesta.equals("si")) {
                                            ultimoRecinto.agregarReptil(tortuga);
                                            System.out.println("******************************************");
                                            System.out.println("*  Se Ingreso Exitosamente a la Tortuga  *");
                                            System.out.println("******************************************");
                                            banderaIngreso = false; 
                                        } else if (respuesta.equals("no")) {
                                            System.out.println("******************************************");
                                            System.out.println("*      No se Ingreso a la Serpiente      *");
                                            System.out.println("******************************************");
                                            banderaIngreso = false; 
                                        } else {
                                            System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                        }
                                    }
                                    banderaConstruir = false; 
                                } else if (respuesta.equals("no")) {
                                    System.out.println("******************************************");
                                    System.out.println("*       No se Ingreso a la Tortuga       *");
                                    System.out.println("******************************************");
                                    banderaConstruir = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        } else {
                            System.out.println(" ");
                            System.out.println("******************************************");
                            System.out.println("*  HAY SUFICIENTE ESPACIO EN EL RECINTO  *");
                            System.out.println("******************************************");
                            System.out.println("* El espacio que requiere es de: " + tortuga.getAreaMinima() + " m^2.");
                            System.out.println("* Cantidad de comida que necesita (Diario): " + tortuga.calcularComidaDiaria() + " gramos.");
                            System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + tortuga.calcularCostoMantenimiento());
                        
                            boolean banderaIngreso = true;
                            while (banderaIngreso) {
                                System.out.println("------------------------------------------------");
                                System.out.print("¿Desea aceptar a la Tortuga? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) {
                                    ultimoRecinto.agregarReptil(tortuga);
                                    System.out.println("******************************************");
                                    System.out.println("*  Se Ingreso Exitosamente a la Tortuga  *");
                                    System.out.println("******************************************");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) {
                                    System.out.println("******************************************");
                                    System.out.println("*       No se Ingreso a la Tortuga       *");
                                    System.out.println("******************************************");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        }
                        break;
                    case 3: // Se repite la misma lógica que en Case 1 con Caiman/Cocodrilo en Case 3
                        System.out.println("******************************************");
                        System.out.println("***      INGRESAR CAIMÁN/COCODRILO     ***");
                        System.out.println("******************************************");
                        System.out.print("Nombre Científico: ");
                        nombreCientifico = sc.nextLine();
                        System.out.print("Descripción del Hábitat: ");
                        descripcionHabitat = sc.nextLine();
                        System.out.print("Esperanza de Vida (en años): ");
                        esperanzaVida = Integer.parseInt(sc.nextLine());
                        System.out.print("Temperatura Corporal (°C): ");
                        temperaturaCorporal = Float.parseFloat(sc.nextLine());
                        System.out.print("Promedio de Huevos: ");
                        promedioHuevos = Integer.parseInt(sc.nextLine());
                        System.out.print("Peso (kg): ");
                        peso = Float.parseFloat(sc.nextLine());
                        
                        banderaPeligro = true;
                        enPeligroExtincion = false;
                        while (banderaPeligro) {
                            System.out.print("¿En Peligro de Extinción? (Si/No): ");;
                            String respuesta = sc.nextLine().trim().toLowerCase();
                        
                            if (respuesta.equals("si")) {
                                enPeligroExtincion = true;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else if (respuesta.equals("no")) {
                                enPeligroExtincion = false;
                                banderaPeligro = false; // Salimos del bucle si la respuesta es válida
                            } else {
                                System.out.println("Por favor, ingresa 'Si' o 'No'.");
                            }
                        }

                        System.out.print("Dieta: ");
                        dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        especie = sc.nextLine();
                        System.out.print("Tipo de Agua: ");
                        tipodeAgua = sc.nextLine();
                        System.out.print("Velocidad de Nado (m/s): ");
                        velocidad = Float.parseFloat(sc.nextLine());
                        System.out.print("Duracion Buceo (min): ");
                        duracion = Float.parseFloat(sc.nextLine());
                        
                        caiman = new ReptilAcuatico(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, tipodeAgua, velocidad, duracion, true);

                        if(ultimoRecinto.tamañoUsado() + caiman.getAreaMinima() > ultimoRecinto.getTamaño()){
                            System.out.println(" ");
                            System.out.println("*******************************************");
                            System.out.println("* NO HAY SUFICIENTE ESPACIO EN EL RECINTO *");
                            System.out.println("*******************************************");
                            System.out.println(" ");
                            boolean banderaConstruir = true;
                            while (banderaConstruir) {
                                System.out.print("¿Desea Construir un Recinto? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) {
                                    System.out.print("Ingrese Presupuesto Anual del Recinto (Q): ");  
                                    presupuestoAnual = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el Costo de Construcción de un Recinto (Q): ");
                                    costoConstruccion = Integer.parseInt(sc.nextLine());
                                    System.out.print("Ingrese el tamaño del Recinto (m^2): ");
                                    tamaño = Integer.parseInt(sc.nextLine());
                                    recinto = new Recinto(tamaño, presupuestoAnual, costoConstruccion);
                                    recintos.add(recinto);
                                    
                                    ultimoRecinto = recintos.get(recintos.size() - 1);

                                    System.out.println("*******************************************");
                                    System.out.println("*         SE CONSTRUYO EL RECINTO         *");
                                    System.out.println("*******************************************");

                                    System.out.println("* El espacio que requiere es de: " + caiman.getAreaMinima() + " m^2.");
                                    System.out.println("* Cantidad de comida que necesita (Diario): " + caiman.calcularComidaDiaria() + " gramos.");
                                    System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + caiman.calcularCostoMantenimiento());
                                
                                    boolean banderaIngreso = true;
                                    while (banderaIngreso) {
                                        System.out.println("------------------------------------------------");
                                        System.out.print("¿Desea aceptar al Caimán/Cocodrilo? (Si/No): ");;
                                        respuesta = sc.nextLine().trim().toLowerCase();
                                    
                                        if (respuesta.equals("si")) {
                                            ultimoRecinto.agregarReptil(caiman);
                                            System.out.println("***********************************************");
                                            System.out.println("* Se Ingreso Exitosamente al Caimán/Cocodrilo *");
                                            System.out.println("***********************************************");
                                            banderaIngreso = false; 
                                        } else if (respuesta.equals("no")) {
                                            System.out.println("******************************************");
                                            System.out.println("*   No se Ingreso al Caimán/Cocodrilo    *");
                                            System.out.println("******************************************");
                                            banderaIngreso = false; 
                                        } else {
                                            System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                        }
                                    }
                                    banderaConstruir = false; 
                                } else if (respuesta.equals("no")) {
                                    System.out.println("******************************************");
                                    System.out.println("*      No se Ingreso a la Serpiente      *");
                                    System.out.println("******************************************");
                                    banderaConstruir = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        } else {
                            System.out.println(" ");
                            System.out.println("******************************************");
                            System.out.println("*  HAY SUFICIENTE ESPACIO EN EL RECINTO  *");
                            System.out.println("******************************************");
                            System.out.println("* El espacio que requiere es de: " + caiman.getAreaMinima() + " m^2.");
                            System.out.println("* Cantidad de comida que necesita (Diario): " + caiman.calcularComidaDiaria() + " gramos.");
                            System.out.println("* El costo Mensual de Mantener a la Serpiente es: Q" + caiman.calcularCostoMantenimiento());
                        
                            boolean banderaIngreso = true;
                            while (banderaIngreso) {
                                System.out.println("------------------------------------------------");
                                System.out.print("¿Desea aceptar al Caimán/Cocodrilo? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) {
                                    ultimoRecinto.agregarReptil(caiman);
                                    System.out.println("***********************************************");
                                    System.out.println("* Se Ingreso Exitosamente al Caimán/Cocodrilo *");
                                    System.out.println("***********************************************");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) {
                                    System.out.println("******************************************");
                                    System.out.println("*    No se Ingreso al Caimán/Cocodrilo   *");
                                    System.out.println("******************************************");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No'.");
                                }
                            }
                        }
                        break;
                    case 4: // Recorrer lista de Recintos para mostrar Costo de Mantenimiento
                        System.out.println("*****************************************");
                        System.out.println("***       COSTO DE MANTENIMIENTO      ***");
                        System.out.println("*****************************************");
                        i = 1;
                        for (Recinto Recinto : recintos) {
                            System.out.println(" ");
                            System.out.println("                  RECINTO " + i);
                            System.out.println(Recinto.calcularCostoTotalMantenimiento());
                            i++;
                        }
                        System.out.println(" ");
                        break;
                    case 5: // Recorrer lista de Recintos para mostrar Tamaño de Recintos de cada uno
                        System.out.println("******************************************");
                        System.out.println("***         TAMAÑO DE RECINTOS         ***");
                        System.out.println("******************************************");
                        i = 1;
                        for (Recinto Recinto : recintos) {
                            System.out.println(" ");
                            System.out.print(" RECINTO " + i + ": ");
                            System.out.println(Recinto.getTamaño() + " m^2 ");
                            i++;
                        }
                        System.out.println(" ");
                        break;
                    case 6: // Recorrer lista de Recintos para mostrar Cantidad de Comida de cada uno
                        System.out.println("******************************************");
                        System.out.println("***         CANTIDAD DE COMIDA         ***");
                        System.out.println("******************************************");
                        i = 1;
                        for (Recinto Recinto : recintos) {
                            System.out.println(" ");
                            System.out.println("                  RECINTO " + i);
                            System.out.println(Recinto.mostrarCantidadComida());
                            i++;
                        }
                        System.out.println(" ");
                    break;
                    case 7: // Recorrer lista de Recintos para mostrar Presupuesto Anual de cada uno
                        System.out.println("******************************************");
                        System.out.println("***         PRESUPUESTO ANUAL         ***");
                        System.out.println("******************************************");
                        i = 1;
                        for (Recinto Recinto : recintos) {
                            System.out.println(" ");
                            System.out.print(" RECINTO " + i + ": Q");
                            System.out.println(Recinto.getPresupuestoAnual());
                            i++;
                        }
                        System.out.println(" ");
                    break;
                    case 8: // Recorrer lista de Recintos para mostrar Detalles de Reptiles
                        System.out.println("******************************************");
                        System.out.println("***        DETALLES DE REPTILES        ***");
                        System.out.println("******************************************");
                        i = 1;
                        for (Recinto Recinto : recintos) {
                            System.out.println(" ");
                            System.out.println("                  RECINTO " + i);
                            System.out.println(Recinto.mostrarReptiles());
                            i++;
                        }
                        System.out.println(" ");
                    break;
                    case 9:
                        continuar = false; // Opcion de Salida
                        System.out.println("******************************************");
                        System.out.println("*        SALIENDO DEL SISTEMA :)         *");
                        System.out.println("******************************************"); 
                        break;
                    default: // Mensaje de Error para seleccionar opcion correcta
                        System.out.println("******************************************");
                        System.out.println("**                ERROR                 **");
                        System.out.println("* Opción no Válida. Seleccione un número *");
                        System.out.println("*  entre 1 y 9.                          *");
                        System.out.println("******************************************"); 
                }
            } catch (NumberFormatException e) { // Error de número
                System.out.println("******************************************");
                System.out.println("**                ERROR                 **");
                System.out.println("*   Por favor ingrese un número válido   *");
                System.out.println("******************************************");   
            } catch (Exception e) { // Otro tipo de error
                System.out.println("******************************************");
                System.out.println("**                ERROR                 **");
                System.out.println("* Se produjo un error inesperado: " + e.getMessage());
                System.out.println("******************************************");
            }
        }

        sc.close(); // Cerrar escaner
    }
}
