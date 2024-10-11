/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main 
 * La clase Main es el punto de entrada de la aplicación, 
 * que gestiona la creación y almacenamiento de las operaciones
 * matematicas, asi como el despliegue de información.
 *
 * @author Daniela Navas
 * Fecha de creación: 10/10/2024
 * Última modificación: 11/10/2024
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    /**
     * El método main es el punto de entrada de la aplicación. 
     * Inicializa el escáner para la entrada del usuario, 
     * establece variables para las matrices y sistemas de ecuaciones, así
     * como el control del menú y opciones
     *
     * @param args argumentos de línea de comandos pasados a la aplicación.
     */
    public static void main(String[] args) {
        Informes operaciones = new Informes();  // Objeto para Informes
        Scanner sc = new Scanner(System.in);    // Iniciar el escaner

        // Cargar Archivos con la función. 
        cargarDatosCSV("matrices.csv", operaciones);
        cargarDatosCSV("sistemas.csv", operaciones);

        // Despues de cargar, hacer un despliegue de informacion
        System.out.println("*******************************************************");
        System.out.println("**              OPERACIONES MATEMATICAS              **");
        System.out.println("*******************************************************");
        System.out.println("");
        System.out.println("======================================");
        System.out.println("=   CONTEO DE OPERACIONES CARGADAS   =");
        System.out.println("======================================");
        System.out.print(operaciones.desplegarConteoGeneral()); // Conteo de datos ingresados
        System.out.println("");

        System.out.println("=============================================");
        System.out.println("= LISTADO DE MATRICES Y SISTEMAS POR ESTADO =");
        System.out.println("=============================================");
        System.out.println("MATRICES CUADRADAS:"); // Detalle por Estado
        System.out.print(operaciones.desplegarMatricesCuadradasEstado());
        System.out.println("-----------------------------------------------");
        System.out.println("MATRICES RECTANGULARES: ");
        System.out.print(operaciones.desplegarMatricesRectangularesEstado());
        System.out.println("-----------------------------------------------");
        System.out.println("SISTEMAS DE ECUACIONES: ");
        System.out.print(operaciones.desplegarSistemasEstado());
        System.out.println("-----------------------------------------------");
        System.out.println("");


        // Menú de opciones usando switch-case
        boolean salir = false;
        while (!salir) {
            System.out.println("*******************************************************");
            System.out.println("***                       MENÚ                      ***");
            System.out.println("* 1. Detalles de Matrices Cuadradas                   *");
            System.out.println("* 2. Detalles de Matrices Rectangulares               *");
            System.out.println("* 3. Detalles de Sistemas de Ecuaciones               *");
            System.out.println("* 4. Listado Matrices Cuadradas por Estado            *");
            System.out.println("* 5. Listado Matrices Rectangulares por Estado        *");
            System.out.println("* 6. Listado Sistemas de Ecuaciones por Estado        *");
            System.out.println("* 7. Informe General                                  *");
            System.out.println("* 8. Conteo General                                   *");
            System.out.println("* 9. Buscar Operación por ID                          *");
            System.out.println("* 10. Revisar si dos matrices rectangulares           *");
            System.out.println("*     se pueden sumar y multiplicar                   *");
            System.out.println("* 11. Salir                                           *");
            System.out.println("*******************************************************");

            try { // Maejo de errores
                System.out.print("Seleccione una opción: ");

                int opcion = sc.nextInt(); 
                sc.nextLine();  // Consumir la nueva línea

                switch (opcion) {
                    case 1: // Mostrar matrices cuadradas
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===           MATRICES CUADRADAS          ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarMatricesCuadradas());
                        break;
                    case 2: // Mostrar matrices Rectangulares
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===         MATRICES RECTANGULARES        ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarMatricesRectangulares());
                        break;
                    case 3: // Mostrar Sistemas de Ecuaciones
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===         SISTEMAS DE ECUACIONES        ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarSistemasdeEcuaciones());
                        break;
                    case 4: // Mostrar matrices cuadradas por Estado
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===     MATRICES CUADRADAS POR ESTADO     ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarMatricesCuadradasEstado());
                        break;
                    case 5: // Mostrar matrices rectangualares por Estado
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===   MATRICES RECTANGULARES POR ESTADO   ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarMatricesRectangularesEstado());
                        break;
                    case 6: // Mostrar Sistemas de Ecuaciones por Estado
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===   SISTEMAS DE ECUACIONES POR ESTADO   ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarSistemasEstado());
                        break;
                    case 7: // Mostrar Informe General
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===            INFORME GENERAL            ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarInformeGeneral());
                        break;
                    case 8: // Mostrar conteo general
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===             CONTEO GENERAL            ===");
                        System.out.println("=============================================");
                        System.out.println(operaciones.desplegarConteoGeneral());
                        break;
                    case 9: // Mostrar matrices por ID
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===      OPERACION MATEMATICA POR ID      ===");
                        System.out.println("=============================================");
                        System.out.print("Ingrese el ID de la operación: ");
                        int id = sc.nextInt(); // Solicitar ID
                        System.out.println(operaciones.desplegarPorID(id)); // Desplegar info de esa operación
                        break;
                    case 10: // Mostrar si son multiplicables o sumables
                        System.out.println("");
                        System.out.println("============================================");
                        System.out.println("===  MATRICES SUMABLES Y MULTIPLICABLES  ===");
                        System.out.println("============================================");
                        System.out.print("Ingrese el ID de la Matriz A: "); // Solicitar Matriz A
                        int idA = sc.nextInt();
                        System.out.print("Ingrese el ID de la Matriz B: "); // Solicitar Matriz B
                        int idB = sc.nextInt();

                        OperacionMatematica operacionA = operaciones.buscarPorID(idA); // Extraer matrices del Array
                        OperacionMatematica operacionB = operaciones.buscarPorID(idB);

                        if (operacionA instanceof MatrizRectangular && operacionB instanceof MatrizRectangular) { // Revisar que sean Rectangualares
                            MatrizRectangular matrizA = (MatrizRectangular) operacionA; 
                            MatrizRectangular matrizB = (MatrizRectangular) operacionB;
                
                            // Verificar suma y multiplicación
                            boolean sumables = matrizA.puedeSumar(matrizA, matrizB);
                            boolean multiplicables = matrizB.puedeMultiplicar(matrizA, matrizB);
                
                            // Imprimir resultados
                            if (sumables) {
                                System.out.println(" ");
                                System.out.println("=================================");
                                System.out.println("==    ES POSIBLE HACER A + B   ==");
                            } else {
                                System.out.println(" ");
                                System.out.println("=================================");
                                System.out.println("==  NO ES POSIBLE HACER A + B  ==");
                            }
                
                            if (multiplicables) {
                                System.out.println("==   ES POSIBLE HACER A x B    ==");
                                System.out.println("=================================");
                                System.out.println(" ");
                            } else {
                                System.out.println("==  NO ES POSIBLE HACER A x B  ==");
                                System.out.println("=================================");
                                System.out.println(" ");
                            }
                        } else { // Error si se escoge una matriz que no aplica
                            System.out.println("");
                            System.out.println("=================================");
                            System.out.println("===           ERROR           ===");
                            System.out.println("== Una o ambas operaciones NO  ==");
                            System.out.println("== son matrices rectangulares. ==");
                            System.out.println("=================================");
                            System.out.println("");
                        }
                        break;
                    case 11: // Salir
                        System.out.println("");
                        System.out.println("=============================================");
                        System.out.println("===              SALIENDO....             ===");
                        System.out.println("=============================================");
                        salir = true;
                        break;
                    default: // Opcion no valida
                        System.out.println("");
                        System.out.println("=================================");
                        System.out.println("===     OPCIÓN NO VALIDA      ===");
                        System.out.println("=================================");
                        System.out.println("");
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

        sc.close();
    }

    /**
     * Carga datos desde un archivo CSV y los agrega a un objeto de tipo {@link Informes}.
     *
     * Este método lee cada línea del archivo CSV, identifica el tipo de operación
     * (matriz cuadrada, matriz rectangular o sistema de ecuaciones) y crea
     * el objeto correspondiente. Los objetos se agregan a la lista de operaciones
     * del objeto {@link Informes} proporcionado.
     *
     * El formato esperado del archivo CSV es el siguiente:
     * Para matrices: id, filas, columnas, estado, tipo, [invertible]
     * 
     * Para sistemas de ecuaciones: id, numeroEcuaciones, numeroIncognitas, estado, metodoResolucion
     *
     * @param archivo El nombre del archivo CSV desde el cual se cargarán los datos.
     * @param operaciones El objeto {@link Informes} donde se agregarán las operaciones cargadas.
     *
     * @throws IOException Si ocurre un error al intentar leer el archivo.
     */
    public static void cargarDatosCSV(String archivo, Informes operaciones) {
        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) { // Manejo de errores
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(","); // Separar por comas

                // Identificar si es una matriz o un sistema de ecuaciones por la cantidad de columnas
                if (datos.length == 6) {  // Es una matriz
                    int filas = Integer.parseInt(datos[1]);
                    int columnas = Integer.parseInt(datos[2]);
                    String estado = datos[3];
                    String tipo = datos[4];
                    
                    if (tipo.equals("Cuadrada")) {
                        boolean invertible = Boolean.parseBoolean(datos[5]);
                        MatrizCuadrada matrizCuadrada = new MatrizCuadrada(filas, columnas, estado, invertible);
                        operaciones.agregarOperacion(matrizCuadrada);
                    } else if (tipo.equals("Rectangular")) {
                        MatrizRectangular matrizRectangular = new MatrizRectangular(filas, columnas, estado);
                        operaciones.agregarOperacion(matrizRectangular);
    
                    }
                } else if (datos.length == 5) {  // Es un sistema de ecuaciones
                    int numeroEcuaciones = Integer.parseInt(datos[1]);
                    int numeroIncognitas = Integer.parseInt(datos[2]);
                    String estado = datos[3];
                    String metodoResolucion = datos[4];
                    
                    // Crear el objeto de Sistema de ecuaciones aquí (suponiendo que hay una clase para ello)
                    SistemaEcuaciones sistema = new SistemaEcuaciones(numeroEcuaciones, numeroIncognitas, estado, metodoResolucion);
                    operaciones.agregarOperacion(sistema);
                    
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
