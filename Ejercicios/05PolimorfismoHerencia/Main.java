/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main 
 * La clase Main es el punto de entrada de la aplicación, 
 * que gestiona la creación y almacenamiento 
 * para diferentes especies de animales en el zoologico.
 *
 * @author Daniela Navas
 * Fecha de creación: 03/10/2024
 * Última modificación: 04/10/2024
 */

import java.util.Scanner;

public class Main {
    /**
     * El método main es el punto de entrada de la aplicación. 
     * Inicializa el escáner para la entrada del usuario, 
     * establece variables relacionadas con el presupuesto y 
     * el costo de construcción, y crea una lista del zoologico. 
     *
     * @param args argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        // Iniciar Zoologico
        Zoologico laAurora = new Zoologico(10000, 200000, 500000);
        
        // Iniciar objetos para animales
        Serpiente nuevaSerpiente;
        Tortuga nuevaTortuga;
        Caiman nuevaCaiman;
        
        // Iniciar Escaner
        Scanner sc = new Scanner(System.in);
        
        // Banderas para manejo de errores en ingreso de datos
        boolean continuar = true;     
        boolean banderaPeligro = true;
        boolean banderaVenenosoa = true;
        boolean banderaIngreso = true;

        // Variables para almacenar temporalmente los datos de los animales
        String nombreCientifico;
        String descripcionHabitat;
        int esperanzaVida;
        float temperaturaCorporal;
        int promedioHuevos;
        boolean enPeligroExtincion = false;
        boolean esVenenosa = false;
        float peso;
        String dieta;
        float longitud;
        String especie;
        String colorPiel;
        String tipoVeneno;
        String tipoAgua;
        float velocidadNado;
        float duracionBuceo;
        int id;


        System.out.println("************************************************************");
        System.out.println("**                   ZOOLÓGICO NACIONAL                   **");
        System.out.println("**                        LA AURORA                       **");
        System.out.println("************************************************************");
        System.out.println(" ");

        while (continuar) { // Menú Principal
            System.out.println("************************************************************");
            System.out.println("**                     MENÚ PRINCIPAL                     **");
            System.out.println("* 1. Recibir Serpiente                                     *");
            System.out.println("* 2. Recibir Tortuga                                       *");
            System.out.println("* 3. Recibir Caiman o Cocodrilo                            *");
            System.out.println("* 4. Eliminar Animal                                       *");
            System.out.println("* 5. Modificar detalles de un Animal                       *");
            System.out.println("* 6. Ver todos los Animales                                *");
            System.out.println("* 7. Ver Animal Especifico                                 *");
            System.out.println("* 8. Consultar Costo Total de Mantenimiento (Mensual)      *");
            System.out.println("* 9. Consultar Costo de Mantenimiento por Animal (Mensual) *");
            System.out.println("* 10. Consultar Cantidad Total de Comida (Diario)          *");
            System.out.println("* 11. Consultar Cantidad de Comida por Animal (Diario)     *");
            System.out.println("* 12. Consultar Área Total Usada                           *");
            System.out.println("* 13. Consultar Área por Animal                            *");
            System.out.println("* 14. Consultar Datos del Zoológico                        *");
            System.out.println("* 15. Salir                                                *");
            System.out.println("************************************************************");

            try { // Sistema de Manejo de Errores
                System.out.print("Seleccione una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1: // Ingresar Serpiente
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("***                  INGRESAR SERPIENTE                  ***");
                        System.out.println("************************************************************");
                        System.out.print("Nombre Científico: "); // Ingresar datos de las Serpientes
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
                        dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        especie = sc.nextLine();
                        System.out.print("Color de Piel: ");
                        colorPiel = sc.nextLine();

                        banderaVenenosoa = true;
                        tipoVeneno = " ";
                        esVenenosa = false;
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
                        nuevaSerpiente = new Serpiente(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, colorPiel, esVenenosa, tipoVeneno);
                        // Ver si el tamaño necesario esta disponible
                        if(laAurora.tamañoUsado() + nuevaSerpiente.getAreaMinima() > laAurora.getTamaño()){
                            System.out.println(" ");
                            System.out.println("************************************************************");
                            System.out.println("****             NO HAY SUFICIENTE ESPACIO              ****");
                            System.out.println("************************************************************");
                            System.out.println(" "); // Mostrar mensaje si no.
                           
                        } else {
                            System.out.println(" "); // Seguir con el ingreso si si.
                            System.out.println("------------------------------------------------");
                            System.out.println("* La Serpiente requiere: ");
                            System.out.println("* Área Mínima: " + nuevaSerpiente.getAreaMinima() + " metros cuadrados.");
                            System.out.println("* Comida Diaria: " + nuevaSerpiente.desplegarComidaDiaria() + " gramos.");
                            System.out.println("* Costo Mensual de Mantenimiento: Q" + nuevaSerpiente.calcularCostoMantenimiento());
                            System.out.println("------------------------------------------------");
                            System.out.println(" ");
                        
                            banderaIngreso = true;
                            while (banderaIngreso) { // Ingresar si se quiere aceptar
                                System.out.print("¿Desea aceptar a la Serpiente? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) { // Si si, Aceptar
                                    laAurora.agregarAnimal(nuevaSerpiente);
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*            Se Recibio Exitosamente a la Serpiente        *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) { // Si no, no Aceptar
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*               No se Recibio a la Serpiente               *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No': ");
                                }
                            }
                        }
                        break;
                    case 2:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("***                   INGRESAR TORTUGA                   ***");
                        System.out.println("************************************************************");
                        System.out.print("Nombre Científico: "); // Ingresar datos de las Tortugas
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
                        dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        especie = sc.nextLine();
                        System.out.print("Tipo de Agua (Dulce o Salada): ");
                        tipoAgua = sc.nextLine();
                        System.out.print("Velocidad de Nado (m/s): ");
                        velocidadNado = Float.parseFloat(sc.nextLine());
                        System.out.print("Duración de Buceo (Minutos): ");
                        duracionBuceo = Float.parseFloat(sc.nextLine());
                        
                        // Crear la Tortuga
                        nuevaTortuga = new Tortuga(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, tipoAgua, velocidadNado, duracionBuceo);
                        // Ver si el tamaño necesario esta disponible
                        if(laAurora.tamañoUsado() + nuevaTortuga.getAreaMinima() > laAurora.getTamaño()){
                            System.out.println(" ");
                            System.out.println("************************************************************");
                            System.out.println("****             NO HAY SUFICIENTE ESPACIO              ****");
                            System.out.println("************************************************************");
                            System.out.println(" ");
                        
                        } else {
                            System.out.println(" ");
                            System.out.println("------------------------------------------------");
                            System.out.println("* La Tortuga requiere: ");
                            System.out.println("* Área Mínima: " + nuevaTortuga.getAreaMinima() + " metros cuadrados.");
                            System.out.println("* Comida Diaria: " + nuevaTortuga.desplegarComidaDiaria() + " gramos.");
                            System.out.println("* Costo Mensual de Mantenimiento: Q" + nuevaTortuga.calcularCostoMantenimiento());
                            System.out.println("------------------------------------------------");
                            System.out.println(" ");
                        
                            banderaIngreso = true;
                            while (banderaIngreso) { // Ingresar si se quiere aceptar
                                System.out.print("¿Desea aceptar a la Tortuga? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) { // Si si, Aceptar
                                    laAurora.agregarAnimal(nuevaTortuga);
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*             Se Recibio Exitosamente a la Tortuga         *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) { // Si no, no Aceptar
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*                No se Recibio a la Tortuga                *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No': ");
                                }
                            }
                        }
                        break;
                    case 3:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("***             INGRESAR CAIMAN O COCODRILO              ***");
                        System.out.println("************************************************************");
                        System.out.print("Nombre Científico: "); // Ingresar datos de los cocodrilos
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
                        dieta = sc.nextLine();
                        System.out.print("Longitud (m): ");
                        longitud = Float.parseFloat(sc.nextLine());
                        System.out.print("Especie: ");
                        especie = sc.nextLine();
                        System.out.print("Tipo de Agua (Dulce o Salada): ");
                        tipoAgua = sc.nextLine();
                        System.out.print("Velocidad de Nado (m/s): ");
                        velocidadNado = Float.parseFloat(sc.nextLine());
                        System.out.print("Duración de Buceo (Minutos): ");
                        duracionBuceo = Float.parseFloat(sc.nextLine());
                        
                        // Crear la Caiman
                        nuevaCaiman = new Caiman(nombreCientifico, descripcionHabitat, esperanzaVida, temperaturaCorporal, promedioHuevos, peso, enPeligroExtincion, dieta, longitud, especie, tipoAgua, velocidadNado, duracionBuceo);
                        // Ver si el tamaño necesario esta disponible
                        if(laAurora.tamañoUsado() + nuevaCaiman.getAreaMinima() > laAurora.getTamaño()){
                            System.out.println(" ");
                            System.out.println("************************************************************");
                            System.out.println("****             NO HAY SUFICIENTE ESPACIO              ****");
                            System.out.println("************************************************************");
                            System.out.println(" ");
                        
                        } else {
                            System.out.println(" ");
                            System.out.println("------------------------------------------------");
                            System.out.println("* El Caiman o Cocodrilo requiere: ");
                            System.out.println("* Área Mínima: " + nuevaCaiman.getAreaMinima() + " metros cuadrados.");
                            System.out.println("* Comida Diaria: " + nuevaCaiman.desplegarComidaDiaria() + " gramos.");
                            System.out.println("* Costo Mensual de Mantenimiento: Q" + nuevaCaiman.calcularCostoMantenimiento());
                            System.out.println("------------------------------------------------");
                            System.out.println(" ");
                        
                            banderaIngreso = true;
                            while (banderaIngreso) { // Ingresar si se quiere aceptar
                                System.out.print("¿Desea aceptar al Caiman o Cocodrilo? (Si/No): ");;
                                String respuesta = sc.nextLine().trim().toLowerCase();
                            
                                if (respuesta.equals("si")) { // Si si, Aceptar
                                    laAurora.agregarAnimal(nuevaCaiman);
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*       Se Recibio Exitosamente al Caiman o Cocodrilo      *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else if (respuesta.equals("no")) { // Si no, no Aceptar
                                    System.out.println(" ");
                                    System.out.println("************************************************************");
                                    System.out.println("*            No se Recibio al Caiman o Cocodrilo           *");
                                    System.out.println("************************************************************");
                                    System.out.println(" ");
                                    banderaIngreso = false; 
                                } else {
                                    System.out.print("Por favor, ingresa 'Si' o 'No': ");
                                }
                            }
                        }
                        break;
                    case 4:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                  ELIMINAR ANIMAL                   ****");
                        System.out.println("************************************************************");
                        System.out.print("Ingrese ID del animal: "); // Ingresar ID de Animal
                        id = sc.nextInt();
                        boolean eliminado = laAurora.eliminarAnimal(id); // Eliminar
                        if (eliminado) {
                            System.out.println(" "); // Mostrar mensaje de correcto
                            System.out.println("************************************************************");
                            System.out.println("****           ANIMAL ELIMINADO CORRECTAMENTE           ****");
                            System.out.println("************************************************************");
                            System.out.println(" ");
                        } else {
                            System.out.println(" "); // Mostrar mensaje de error, si no se encuentra ID
                            System.out.println("************************************************************");
                            System.out.println("****                        ERROR                       ****");
                            System.out.println("****         NO SE ENCONTRO UN ANIMAL CON ESE ID        ****");
                            System.out.println("************************************************************");
                            System.out.println(" ");
                        }
                        break;
                    case 5:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                 MODIFICAR ANIMAL                   ****");
                        System.out.println("************************************************************");

                        System.out.print("Ingrese el ID del animal que desea modificar: ");
                        id = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer

                        Animal animalModificar = laAurora.buscarAnimalPorID(id);
                            if (animalModificar == null) {
                                System.out.println("No se encontró un animal con ese ID.");
                                return; // Salir si no se encuentra el animal
                            }

                        int opcionModificar; // Manejo de Case para modificar
                        
                        System.out.println("-------------------------------------------------------"); // Mostrar que opciones hay para modificar
                        System.out.println("* PÁRAMETROS QUE SE PUEDEN MODIFICAR:");
                        System.out.println("* 1. Nombre Científico");
                        System.out.println("* 2. Descripción del Hábitat");
                        System.out.println("* 3. Esperanza de Vida");
                        System.out.println("* 4. Temperatura Corporal");
                        System.out.println("* 5. Promedio de Huevos");
                        System.out.println("* 6. Peso");
                        System.out.println("* 7. En Peligro de Extinción");
                        System.out.println("* 8. Dieta");
                        System.out.println("* 9. Longitud");
                        System.out.println("* 10. Especie (solo Serpiente)");
                        System.out.println("* 11. Color de Piel (solo Serpiente)");
                        System.out.println("* 12. Es Venenosa (solo Serpiente)");
                        System.out.println("* 13. Tipo de Veneno (solo Serpiente)");
                        System.out.println("* 14. Tipo de Agua (solo Tortuga y Caiman)");
                        System.out.println("* 15. Velocidad de Nado (solo Tortuga y Caiman)");
                        System.out.println("* 16. Duración de Buceo (solo Tortuga y Caiman)");
                        System.out.println("* 17. Regresar");
                        System.out.print("Selecciona el parámetro a modificar: ");

                        opcionModificar = sc.nextInt();
                        sc.nextLine(); // Limpiar el buffer

                        // Variables tipo String y null (útil en el método de zoologico para no modificar datos vacios)
                        String nombreCientificoMod = null;
                        String descripcionHabitatMod = null;
                        String esperanzaVidaMod = null;
                        String temperaturaCorporalMod = null;
                        String promedioHuevosMod = null;
                        String pesoMod = null;
                        String peligroExtinsionMod = null;
                        String dietaMod = null;
                        String longitudMod = null;
                        String especieMod = null;
                        String colorPielMod = null;
                        String esVenenosaMod = null;
                        String tipoVenenoMod = null;
                        String tipoAguaMod = null;
                        String velocidadNadoMod = null;
                        String duracionBuceoMod = null;

                        switch (opcionModificar) { // Majeno de casos dependiedo de las opciones y solicitar nuevos datos
                            case 1:
                                System.out.print("Ingrese el nuevo nombre científico: ");
                                nombreCientificoMod = sc.nextLine();
                                break;
                            case 2:
                                System.out.print("Ingrese la nueva descripción del hábitat: ");
                                descripcionHabitatMod = sc.nextLine();
                                break;
                            case 3:
                                System.out.print("Ingrese la nueva esperanza de vida: ");
                                esperanzaVidaMod = sc.nextLine();
                                break;
                            case 4:
                                System.out.print("Ingrese la nueva temperatura corporal: ");
                                temperaturaCorporalMod = sc.nextLine();
                                break;
                            case 5:
                                System.out.print("Ingrese el nuevo promedio de huevos: ");
                                promedioHuevosMod = sc.nextLine();
                                sc.nextLine(); // Limpiar el buffer
                                break;
                            case 6:
                                System.out.print("Ingrese el nuevo peso: ");
                                pesoMod = sc.nextLine(); // Limpiar el buffer
                                break;
                            case 7:
                                System.out.print("Ingrese si está en peligro de extinción (Si/No): ");
                                peligroExtinsionMod = sc.nextLine(); // Limpiar el buffer
                                break;
                            case 8:
                                System.out.print("Ingrese la nueva dieta: ");
                                dietaMod = sc.nextLine();
                                break;
                            case 9:
                                System.out.print("Ingrese la nueva longitud: ");
                                longitudMod = sc.nextLine(); // Limpiar el buffer
                                break;
                            case 10:
                                System.out.print("Ingrese la nueva especie: ");
                                especieMod =  sc.nextLine();
                                break;
                            case 11:
                                if (animalModificar instanceof Serpiente) {
                                    System.out.print("Ingrese el nuevo color de piel: ");
                                    colorPielMod = sc.nextLine();
                                } else {
                                    System.out.println("No se puede modificar el color de piel en este tipo de animal.");
                                }
                                break;
                            case 12:
                                if (animalModificar instanceof Serpiente) {
                                    System.out.print("Ingrese si es venenosa (Si/No): ");
                                    esVenenosaMod = sc.nextLine(); // Limpiar el buffer

                                } else {
                                    System.out.println("No se puede modificar si es venenosa en este tipo de animal.");
                                }
                                break;
                            case 13:
                                if (animalModificar instanceof Serpiente) {
                                    System.out.print("Ingrese el nuevo tipo de veneno: ");
                                    tipoVenenoMod = sc.nextLine();
                                } else {
                                    System.out.println("No se puede modificar el tipo de veneno en este tipo de animal.");
                                }
                                break;
                            case 14:
                                if (animalModificar instanceof Tortuga || animalModificar instanceof Caiman) {
                                    System.out.print("Ingrese el nuevo tipo de agua: ");
                                    tipoAguaMod = sc.nextLine();
                                } else {
                                    System.out.println("No se puede modificar el tipo de agua en este tipo de animal.");
                                }
                                break;
                            case 15:
                                if (animalModificar instanceof Tortuga || animalModificar instanceof Caiman) {
                                    System.out.print("Ingrese la nueva velocidad de nado: ");
                                    velocidadNadoMod = sc.nextLine(); // Limpiar el buffer
                                } else {
                                    System.out.println("No se puede modificar la velocidad de nado en este tipo de animal.");
                                }
                                break;
                            case 16:
                                if (animalModificar instanceof Tortuga || animalModificar instanceof Caiman) {
                                    System.out.print("Ingrese la nueva duración de buceo: ");
                                    duracionBuceoMod = sc.nextLine(); // Limpiar el buffer
                                } else {
                                    System.out.println("No se puede modificar la duración de buceo en este tipo de animal.");
                                }
                                break;
                            case 17:
                                System.out.println("Regresando...");
                                break;
                            default:
                                System.out.println("Opción no válida. Intenta de nuevo.");
                        }
                        // Realiza la modificación del animal con método de zoologico
                        String resultado = laAurora.modificarAnimal(id, nombreCientificoMod, descripcionHabitatMod, esperanzaVidaMod, temperaturaCorporalMod, promedioHuevosMod, pesoMod, peligroExtinsionMod, dietaMod, longitudMod, especieMod, colorPielMod, esVenenosaMod, tipoVenenoMod, tipoAguaMod, velocidadNadoMod, duracionBuceoMod);
                        System.out.println(resultado); // Mostrar que parametros fueron cambiados
                        break;
                    case 6:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****               LISTADO DE ANIMALES                  ****");
                        System.out.println("************************************************************");
                        System.out.println(" ");
                        System.out.println(laAurora.mostrarAnimales()); // Mostrar todos los animales
                        
                        break;
                    case 7:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****               VER DETALLES DE ANIMAL               ****");
                        System.out.println("************************************************************");
                        System.out.print("Ingrese ID del animal: ");
                        id = sc.nextInt();
                        System.out.println(laAurora.mostrarAnimal(id)); // Mostrar animal dando ID como parametro de entrada
                        break;
                    case 8:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****            COSTO TOTAL DE MANTENIMIENTO            ****");
                        System.out.println("************************************************************");
                        System.out.println(laAurora.costoTotalMantenimiento()); // Mostrar costo de mantenimiento total                      
                        break;
                    case 9:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****         COSTO DE MANTENIMIENTO POR ANIMAL          ****");
                        System.out.println("************************************************************");
                        System.out.print("Ingrese ID del animal: ");
                        System.out.println(" ");
                        id = sc.nextInt();
                        Animal costoAnimal = laAurora.buscarAnimalPorID(id); // Buscar por ID y dar informacion de ese animal
                        System.out.println("El Animal con ID " + id + " tiene un costo de Mensual de: Q" + costoAnimal.calcularCostoMantenimiento());
                        System.out.println(" ");
                        break;
                    case 10:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****          CANTIDAD TOTAL DE COMIDA DIARIA           ****");
                        System.out.println("************************************************************");
                        System.out.println(laAurora.mostrarCantidadComida()); // Mostrar comida diaria de todos
                        System.out.println(" "); 
                        break;
                    case 11:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****        CANTIDAD DE COMIDA DIARIA POR ANIMAL        ****");
                        System.out.println("************************************************************");
                        System.out.print("Ingrese ID del animal: ");
                        id = sc.nextInt();
                        Animal comidaAnimal = laAurora.buscarAnimalPorID(id); // Buscar por ID y mostrar comida diaria de ese animal
                        System.out.println(" ");
                        System.out.println("El Animal con ID " + id + " consume entre " + comidaAnimal.desplegarComidaDiaria() + " gramos diarios.");
                        System.out.println(" ");
                        break;
                    case 12:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                  ÁREA TOTAL USADA                 ****");
                        System.out.println("************************************************************");
                        System.out.println("Actualmente se tiene en uso: " + laAurora.tamañoUsado() + " metros cuadrados.");
                        System.out.println(" "); // Mostrar toda el área
                        break;
                    case 13:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                  ÁREA POR ANIMAL                   ****");
                        System.out.println("************************************************************");
                        System.out.print("Ingrese ID del animal: ");
                        id = sc.nextInt();
                        Animal areaAnimal = laAurora.buscarAnimalPorID(id); // Buscar ID y mostrar su área de recinto
                        System.out.println(" ");
                        System.out.println("El Animal con ID " + id + " utiliza una área de " + areaAnimal.getAreaMinima() + " metros cuadrados.");
                        System.out.println(" ");
                        break;
                    case 14:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                DATOS DEL ZOOLÓGICO                 ****");
                        System.out.println("************************************************************");
                        System.out.println(laAurora); // Imprimir datos del zoologico
                        break;
                    case 15:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                SALIENDO DEL SISTEMA                ****");
                        System.out.println("************************************************************");
                        continuar = false; // Cambiar bandera para salir del loop
                        break;
                    default:
                        System.out.println(" ");
                        System.out.println("************************************************************");
                        System.out.println("****                        ERROR                       ****");
                        System.out.println("****                  ÓPCION NO VALIDA                  ****");
                        System.out.println("************************************************************");
                        System.out.println(" ");
                }
            } catch (NumberFormatException e) { // Error de número
                System.out.println(" ");
                System.out.println("************************************************************");
                System.out.println("****                        ERROR                       ****");
                System.out.println("****         POR FAVOR INGRESE UN NÚMERO VALIDO         ****");
                System.out.println("************************************************************");
                System.out.println(" ");
            } catch (Exception e) { // Otro tipo de error
                System.out.println(" ");
                System.out.println("************************************************************");
                System.out.println("****                        ERROR                       ****");
                System.out.println("* Se produjo un error inesperado: " + e.getMessage());
                System.out.println("************************************************************");
                System.out.println(" ");
            }
        }

        sc.close(); // Cerrar escaner
    }
        
}
