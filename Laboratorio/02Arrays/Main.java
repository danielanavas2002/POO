/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Main Class 
 * 
 * Este programa cumple con el objetivo de gestionar un puerto de embarque y desembarque
 * con diferentes secciones que corresponden a un tipo específico de producto. El programa
 * permite el emarque y desembarque de contenedores tomando en consideración espacio y que
 * no se exceda capacidad máxima, Desplegar información de contenedores, mover contenedores 
 * dentro de la seccion y entre secciones y calcular el peso total por seccion.
 *
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024
 * Última modificación: 5/09/2024
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    /**
     * Método principal 
     *
     * @param args argumentos de la línea de comandos
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Variable para escaner
        int id = 1; // Variable para ID que es correlativo
        boolean salir = false; // Variable para manejo de ciclo While

        // Creacion de Puerto
        Puerto puerto = new Puerto(4);

        // Creacion de Secciones
        Seccion electronicos = new Seccion(10, 5, 200000);
        Seccion ropa = new Seccion(10, 5, 150000);
        Seccion alimentos = new Seccion(10, 5, 250000);
        Seccion maquinaria = new Seccion(10, 5, 300000);

        // Ingreso de Secciones a Puerto
        puerto.setSeccion(electronicos);
        puerto.setSeccion(ropa);
        puerto.setSeccion(alimentos);
        puerto.setSeccion(maquinaria);

        System.out.println("*******************************************************************");
        System.out.println("***                      SISTEMA DE PUERTO                      ***");
        System.out.println("*******************************************************************");
        System.out.println(" ");

        
        while (!salir) { // Ciclo while para manejo de Menú Principal
            // Despliegue del Menú
            System.out.println("*******************************************************************");
            System.out.println("**                              MENÚ                             **");
            System.out.println("* 1. Embarque de un nuevo Contenedor                              *");
            System.out.println("* 2. Mostrar Información de Contenedores                          *");
            System.out.println("* 3. Mover Contenedor dentro de Sección                           *");
            System.out.println("* 4. Mover Contenedor a otra Sección                              *");
            System.out.println("* 5. Desembarque de un Contenedor                                 *");
            System.out.println("* 6. Calcular Peso Total por Sección                              *");
            System.out.println("* 7. Salir                                                        *");
            System.out.println("*******************************************************************");

            try { // Usar try para tner programación defensiva en caso de ingreso de valores erroneos
                System.out.print("Seleccione una opción: "); // Ingresar la opcion
                int opcion = sc.nextInt(); // Leer la opcion
                sc.nextLine();

                switch (opcion) { // Switch case para manejo de menú principal
                    case 1: // Embarque de un nuevo Contenedor
                        System.out.println(" "); // DEspliegue de Secciones
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): ");
                        int seccionIngreso = sc.nextInt(); // Ingresar Seccion a Emabarcar
                        sc.nextLine(); 

                        // Llenar información del contenedor
                        System.out.println("Este es el ID de su contenedor: " + id);
                        System.out.print("Ingrese número del contenedor (A000): ");
                        String numero = sc.nextLine(); 
                        System.out.print("Ingrese nombre del producto: ");
                        String nombreProducto = sc.nextLine(); 
                        System.out.print("Ingrese destino: ");
                        String destino = sc.nextLine(); 
                        System.out.print("Ingrese peso (en kg): ");
                        int peso = sc.nextInt();
                        sc.nextLine(); 

                        Contenedor nuevoContenedor = new Contenedor(id, numero, nombreProducto, destino, peso);

                        switch (seccionIngreso) { // Switch Case para asignar el contenedor a la seccion deseada
                            case 1: // Productos Electrónicos
                                if (electronicos.setContenedor(nuevoContenedor)) { // Revisar si se puede ingresar contenedor
                                    System.out.println("=====================================");
                                    System.out.println("= Contenedor ingresado exitosamente =");
                                    System.out.println("=====================================");
                                    id++; // Aumentar ID
                                } else { // Si no se puede, mostrar mensaje que no se dio ingreso
                                    System.out.println("=====================================");
                                    System.out.println("= No se pudo ingresar el contenedor =");
                                    System.out.println("=====================================");
                                }
                                break;
                            // Se implementa la misma lógica para cada sección        
                            case 2: // Ropa
                                if (ropa.setContenedor(nuevoContenedor)) {
                                    System.out.println("=====================================");
                                    System.out.println("= Contenedor ingresado exitosamente =");
                                    System.out.println("=====================================");
                                    id++;
                                } else {
                                    System.out.println("=====================================");
                                    System.out.println("= No se pudo ingresar el contenedor =");
                                    System.out.println("=====================================");
                                }
                                break;

                            case 3: // Alimentos
                                if (alimentos.setContenedor(nuevoContenedor)) {
                                    System.out.println("=====================================");
                                    System.out.println("= Contenedor ingresado exitosamente =");
                                    System.out.println("=====================================");
                                    id++;
                                } else {
                                    System.out.println("=====================================");
                                    System.out.println("= No se pudo ingresar el contenedor =");
                                    System.out.println("=====================================");
                                }
                                break;

                            case 4: // Maquinaria
                                if (maquinaria.setContenedor(nuevoContenedor)) {
                                    System.out.println("=====================================");
                                    System.out.println("= Contenedor ingresado exitosamente =");
                                    System.out.println("=====================================");
                                    id++;
                                } else {
                                    System.out.println("=====================================");
                                    System.out.println("= No se pudo ingresar el contenedor =");
                                    System.out.println("=====================================");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }
                        break;

                    case 2: // Mostrar Información de Contenedores
                        // Utilizar función que despliega la información de cada contenedor en las secciones
                        System.out.println("=======================================");
                        System.out.println("SECCIÓN ELECTRÓNICOS");
                        System.out.println("-------------------------------");
                        System.out.println(electronicos.mostrarContenedores()); 
                
                        System.out.println("=======================================");
                        System.out.println(" SECCIÓN ROPA");
                        System.out.println("-------------------------------");
                        System.out.println(ropa.mostrarContenedores());
                
                        System.out.println("=======================================");
                        System.out.println("SECCIÓN ALIMENTOS");
                        System.out.println("-------------------------------");
                        System.out.println(alimentos.mostrarContenedores());
                
                        System.out.println("=======================================");
                        System.out.println("SECCIÓN MAQUINARIA");
                        System.out.println("-------------------------------");
                        System.out.println(maquinaria.mostrarContenedores());
                        break;

                    case 3: // Mover Contenedor dentro de Sección
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): "); // Seleccionar Sección
                        int mover = sc.nextInt();
                        sc.nextLine(); 

                        // Ingreso de nueva fila y columna
                        System.out.print("Ingrese la fila nueva (0-9): ");
                        int filaNueva = sc.nextInt();
                        sc.nextLine(); 
                        while(filaNueva > 9 || filaNueva < 0){ // Verificar que la fila este dentro del rango
                            System.out.print("La fila debe ser entre 0 y 9: ");
                            filaNueva = sc.nextInt();
                        }
                        System.out.print("Ingrese la columna nueva (0-4): ");
                        int columnaNueva = sc.nextInt();
                        sc.nextLine(); 
                        while(columnaNueva > 4 || columnaNueva < 0){ // Verificar que la columna este dentro del rango
                            System.out.print("La columna debe ser entre 0 y 4: ");
                            columnaNueva = sc.nextInt();
                        }
                        System.out.print("Ingrese el ID del contenedor a mover: "); // Ingreso de ID
                        int idMover = sc.nextInt();
                        sc.nextLine(); 
                        
                        switch (mover) { // Switch Case para mover el contenedor a la seccion deseada
                            case 1: // Productos Electronicos
                                if(electronicos.disponible(filaNueva, columnaNueva)){ // Revisar la disponibilidad del espacio
                                    int[] posicion = electronicos.posicionContenedor(idMover); // Se obtiene la posición actuar del contenedor
                                    if (posicion != null){ // Si esta disponible
                                        Contenedor contendorMover = electronicos.getContenedor(posicion[0], posicion[1]); // Se extrae informacion de contenedor
                                        electronicos.eliminarContenedor(posicion[0], posicion[1]); // Se eliminar del espacio anterior
                                        electronicos.moverContenedor(contendorMover, filaNueva, columnaNueva); // Se coloca en la nueva posición
                                        System.out.println("===================================="); // Mostrar mensaje de contenedor movido con éxito
                                        System.out.println("== Contenedor movido exitosamente ==");
                                        System.out.println("====================================");
                                    } else {
                                        System.out.println("ID incorrecto."); // Mostrar mensaje si ID no se encuentra.
                                    }
                                } else {
                                    System.out.println("La nueva posición no está disponible."); // Mostrar mensaje de posición no disponible
                                }
                                break;
                            // Se aplica la misma lógica en cada caso
                            case 2: // Ropa
                                if(ropa.disponible(filaNueva, columnaNueva)){
                                    int[] posicion = ropa.posicionContenedor(idMover);
                                    if (posicion != null){
                                        Contenedor contendorMover = ropa.getContenedor(posicion[0], posicion[1]);
                                        ropa.eliminarContenedor(posicion[0], posicion[1]);
                                        ropa.moverContenedor(contendorMover, filaNueva, columnaNueva);
                                        System.out.println("====================================");
                                        System.out.println("== Contenedor movido exitosamente ==");
                                        System.out.println("====================================");
                                    } else {
                                        System.out.println("ID incorrecto.");
                                    }
                                } else {
                                    System.out.println("La nueva posición no está disponible.");
                                }
                                break;

                            case 3: // Alimentos
                                if(alimentos.disponible(filaNueva, columnaNueva)){
                                    int[] posicion = alimentos.posicionContenedor(idMover);
                                    if (posicion != null){
                                        Contenedor contendorMover = alimentos.getContenedor(posicion[0], posicion[1]);
                                        alimentos.eliminarContenedor(posicion[0], posicion[1]);
                                        alimentos.moverContenedor(contendorMover, filaNueva, columnaNueva);
                                        System.out.println("====================================");
                                        System.out.println("== Contenedor movido exitosamente ==");
                                        System.out.println("====================================");
                                    } else {
                                        System.out.println("ID incorrecto.");
                                    }
                                } else {
                                    System.out.println("La nueva posición no está disponible.");
                                }
                                break;

                            case 4: // Maquinaria
                                if(maquinaria.disponible(filaNueva, columnaNueva)){
                                    int[] posicion = maquinaria.posicionContenedor(idMover);
                                    if (posicion != null){
                                        Contenedor contendorMover = maquinaria.getContenedor(posicion[0], posicion[1]);
                                        maquinaria.eliminarContenedor(posicion[0], posicion[1]);
                                        maquinaria.moverContenedor(contendorMover, filaNueva, columnaNueva);
                                        System.out.println("====================================");
                                        System.out.println("== Contenedor movido exitosamente ==");
                                        System.out.println("====================================");
                                    } else {
                                        System.out.println("ID incorrecto.");
                                    }
                                } else {
                                    System.out.println("La nueva posición no está disponible.");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida.");
                            break;
                        }
                        break;

                    case 4: // Mover Contenedor a otra Sección
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**             SECCIÓN DE DONDE SE MOVERÁ CONTENEDOR             **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): "); // Seleccionar sección de donde se mueve
                        int moverSeccion = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Ingrese el ID del contenedor a mover de Seccion: "); // Ingresar ID del contendor
                        int idMoverSeccion = sc.nextInt();
                        sc.nextLine(); 
                        
                        switch (moverSeccion) { // Switch Case para extraer el contenedor a la seccion anterior
                            case 1:
                                System.out.println(" "); // Seccion a donde se movera
                                System.out.println("*******************************************************************");                   
                                System.out.println("**                   SECCION A LA QUE SE MOVERA                  **");
                                System.out.println("* 2. Ropa                                                         *");
                                System.out.println("* 3. Alimentos                                                    *");
                                System.out.println("* 4. Maquinaria                                                   *");
                                System.out.println("*******************************************************************");
                                System.out.print("Seleccione la sección (2, 3 o 4): ");
                                int seccionNueva = sc.nextInt();
                                while(seccionNueva > 4 || seccionNueva < 1 || seccionNueva == 1){ // Verificar que este dentro de rangos adecuados
                                    System.out.print("La nueva seccion debe ser 2, 3 o 4: ");
                                    seccionNueva = sc.nextInt();
                                    sc.nextLine(); 
                                }
                                switch (seccionNueva) {// Switch Case para asignar el contenedor a la seccion deseada
                                    case 2: // Productos Elecctronicos a Ropa
                                        int[] posicion = electronicos.posicionContenedor(idMoverSeccion); // Extraer Posicion 
                                        if (posicion != null){ // Si esta vacio se ingresa
                                            Contenedor contendorMoverSeccion = electronicos.getContenedor(posicion[0], posicion[1]); // Extraer informacion del contenedor a mover
                                            if (ropa.setContenedor(contendorMoverSeccion)) { // Si se puede ingresar, se ingres
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                electronicos.eliminarContenedor(posicion[0], posicion[1]); // Se elimna del lugar anterior
                                                electronicos.setPesoTotal(-contendorMoverSeccion.getPeso()); // Se elimina el peso de la seccion anterior
                                            } else { // Mostrar mensaje si no se puede ingresar el contenedot a otra seccion
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto."); // Mostrar mensaje de ID incorrecto
                                        }
                                        break;
                                    // Se implementa la misma logica para cada caso
                                    case 3: // Productos Electronicos a Alimentos
                                        posicion = electronicos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = electronicos.getContenedor(posicion[0], posicion[1]);
                                            if (alimentos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                electronicos.eliminarContenedor(posicion[0], posicion[1]);
                                                electronicos.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 4: // Productos Electrónicos a Maquinaria
                                        posicion = electronicos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){ 
                                            Contenedor contendorMoverSeccion = electronicos.getContenedor(posicion[0], posicion[1]);
                                            if (maquinaria.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                electronicos.eliminarContenedor(posicion[0], posicion[1]);
                                                electronicos.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;
                                
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }
                                break;
                            // Repetir lógica para cada Seccion
                            case 2:
                                System.out.println(" ");
                                System.out.println("*******************************************************************");                   
                                System.out.println("**                   SECCION A LA QUE SE MOVERA                  **");
                                System.out.println("* 1. Productos Electrónicos                                       *");
                                System.out.println("* 3. Alimentos                                                    *");
                                System.out.println("* 4. Maquinaria                                                   *");
                                System.out.println("*******************************************************************");
                                System.out.print("Seleccione la sección (1, 3 o 4): ");
                                seccionNueva = sc.nextInt();
                                sc.nextLine(); 
                                while(seccionNueva > 4 || seccionNueva < 1 || seccionNueva == 2){
                                    System.out.print("La nueva seccion debe ser 1, 3 o 4: ");
                                    seccionNueva = sc.nextInt();
                                }
                                
                                switch (seccionNueva) {
                                    case 1: // Ropa a Productos Electronicos
                                        int[] posicion = ropa.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = ropa.getContenedor(posicion[0], posicion[1]);
                                            if (electronicos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                ropa.eliminarContenedor(posicion[0], posicion[1]);
                                                ropa.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 3: // Ropa a Alimentos
                                        posicion = ropa.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = ropa.getContenedor(posicion[0], posicion[1]);
                                            if (alimentos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                ropa.eliminarContenedor(posicion[0], posicion[1]);
                                                ropa.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 4: // Ropa a Maquinaria
                                        posicion = ropa.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = ropa.getContenedor(posicion[0], posicion[1]);
                                            if (maquinaria.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                ropa.eliminarContenedor(posicion[0], posicion[1]);
                                                ropa.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;
                                
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }
                                break;

                            case 3:
                                System.out.println(" ");
                                System.out.println("*******************************************************************");                   
                                System.out.println("**                   SECCION A LA QUE SE MOVERA                  **");
                                System.out.println("* 1. Productos Electrónicos                                       *");
                                System.out.println("* 2. Ropa                                                         *");
                                System.out.println("* 4. Maquinaria                                                   *");
                                System.out.println("*******************************************************************");
                                System.out.print("Seleccione la sección (1, 2 o 4): ");
                                seccionNueva = sc.nextInt();
                                while(seccionNueva > 4 || seccionNueva < 1 || seccionNueva == 3){
                                    System.out.print("La nueva seccion debe ser 1, 2 o 4: ");
                                    seccionNueva = sc.nextInt();
                                    sc.nextLine(); 
                                }
                                
                                switch (seccionNueva) {
                                    case 1: // Alimentos a Productos Electronicos
                                        int[] posicion = alimentos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = alimentos.getContenedor(posicion[0], posicion[1]);
                                            if (electronicos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                alimentos.eliminarContenedor(posicion[0], posicion[1]);
                                                alimentos.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 2: // Alimentos a Ropa
                                        posicion = alimentos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){ 
                                            Contenedor contendorMoverSeccion = alimentos.getContenedor(posicion[0], posicion[1]);
                                            if (ropa.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                alimentos.eliminarContenedor(posicion[0], posicion[1]);
                                                alimentos.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 4: // Alimentos a Maquinaria
                                        posicion = alimentos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = alimentos.getContenedor(posicion[0], posicion[1]);
                                            if (maquinaria.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                alimentos.eliminarContenedor(posicion[0], posicion[1]);
                                                alimentos.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;
                                
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }
                                break;

                            case 4: 
                                System.out.println(" ");
                                System.out.println("*******************************************************************");                   
                                System.out.println("**                   SECCION A LA QUE SE MOVERA                  **");
                                System.out.println("* 1. Productos Electrónicos                                       *");
                                System.out.println("* 2. Ropa                                                         *");
                                System.out.println("* 3. Alimentos                                                    *");
                                System.out.println("*******************************************************************");
                                System.out.print("Seleccione la sección (1, 2 o 3): ");
                                seccionNueva = sc.nextInt();
                                while(seccionNueva > 4 || seccionNueva < 1 || seccionNueva == 4){
                                    System.out.print("La nueva seccion debe ser 1, 2 o 3: ");
                                    seccionNueva = sc.nextInt();
                                    sc.nextLine(); 
                                }
                                
                                switch (seccionNueva) {
                                    case 1: // Maquinaria a Productos Electronicos
                                        int[] posicion = maquinaria.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = maquinaria.getContenedor(posicion[0], posicion[1]);
                                            if (electronicos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                maquinaria.eliminarContenedor(posicion[0], posicion[1]);
                                                maquinaria.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 2: // Maquinaria a Ropa
                                        posicion = maquinaria.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = maquinaria.getContenedor(posicion[0], posicion[1]);
                                            if (ropa.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                maquinaria.eliminarContenedor(posicion[0], posicion[1]);
                                                maquinaria.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;

                                    case 3: // Maquinaria a Alimentos
                                        posicion = maquinaria.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = maquinaria.getContenedor(posicion[0], posicion[1]);
                                            if (alimentos.setContenedor(contendorMoverSeccion)) {
                                                System.out.println("=====================================");
                                                System.out.println("= Contenedor ingresado exitosamente =");
                                                System.out.println("=====================================");
                                                maquinaria.eliminarContenedor(posicion[0], posicion[1]);
                                                maquinaria.setPesoTotal(-contendorMoverSeccion.getPeso());
                                            } else {
                                                System.out.println("=====================================");
                                                System.out.println("= No se pudo ingresar el contenedor =");
                                                System.out.println("=====================================");
                                            } 
                                        } else{
                                            System.out.println("ID incorrecto.");
                                        }
                                        break;
                                
                                    default:
                                        System.out.println("Opción no válida.");
                                        break;
                                }
                                break;
                        
                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }

                        break;

                    case 5: // Desembarque de un Contenedor
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): "); // Seleccionar Contenedor
                        int eliminar = sc.nextInt(); 
                        sc.nextLine(); 

                        System.out.print("Ingrese el ID del contenedor a desembarcar: "); // Seleccionar ID
                        int idEliminar = sc.nextInt();
                        sc.nextLine(); 

                        switch (eliminar) { // Switch Case para eliminar el contenedor a la seccion deseada
                            case 1: // Productos Electronicos
                                int[] posicion = electronicos.posicionContenedor(idEliminar); // Obtener posición del contenedor
                                if (posicion != null){ 
                                    Contenedor contendorEliminar = electronicos.getContenedor(posicion[0], posicion[1]); // Extrae informacion de ese contenedor
                                    electronicos.eliminarContenedor(posicion[0], posicion[1]); // Eliminar de esa posición
                                    electronicos.setPesoTotal(-contendorEliminar.getPeso()); // Eliminar peso de ese contenedor en esa seccion
                                    System.out.println("==========================================");
                                    System.out.println("== Contenedor desembarcado exitosamente ==");
                                    System.out.println("==========================================");
                                } else {
                                    System.out.println("ID incorrecto."); // Mostrar mensaje de ID incorrecto
                                }
                                break;
                            // Implementar misma lógica en cada caso
                            case 2: // Ropa
                                posicion = ropa.posicionContenedor(idEliminar);
                                if (posicion != null){
                                    Contenedor contendorEliminar = ropa.getContenedor(posicion[0], posicion[1]);
                                    ropa.eliminarContenedor(posicion[0], posicion[1]);
                                    ropa.setPesoTotal(-contendorEliminar.getPeso());
                                    System.out.println("=======================================");
                                    System.out.println("== Contenedor eliminado exitosamente ==");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("ID incorrecto.");
                                }
                                break;

                            case 3: // Alimentos
                                posicion = alimentos.posicionContenedor(idEliminar);
                                if (posicion != null){
                                    Contenedor contendorEliminar = alimentos.getContenedor(posicion[0], posicion[1]);
                                    alimentos.eliminarContenedor(posicion[0], posicion[1]);
                                    alimentos.setPesoTotal(-contendorEliminar.getPeso());
                                    System.out.println("=======================================");
                                    System.out.println("== Contenedor eliminado exitosamente ==");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("ID incorrecto.");
                                }
                                break;
                            
                            case 4: // Maquinaria
                                posicion = maquinaria.posicionContenedor(idEliminar);
                                if (posicion != null){
                                    Contenedor contendorEliminar = maquinaria.getContenedor(posicion[0], posicion[1]);
                                    maquinaria.eliminarContenedor(posicion[0], posicion[1]);
                                    maquinaria.setPesoTotal(-contendorEliminar.getPeso());
                                    System.out.println("=======================================");
                                    System.out.println("== Contenedor eliminado exitosamente ==");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("ID incorrecto.");
                                }
                                break;

                            default:
                                System.out.println("Opción no válida.");
                                break;
                        }

                        
                        break;

                    case 6: // Calcular Peso Total
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                      PESO POR SECCIONES                       **");
                        System.out.println("* Productos Electrónicos: " + electronicos.getPesoTotal() + " kg");      // Mostrar peso de Productos Electronicos
                        System.out.println("* Ropa: " + ropa.getPesoTotal() + " kg");                                // Mostrar peso de Ropa
                        System.out.println("* Alimentos: " + alimentos.getPesoTotal() + " kg");                      // Mostrar peso de Alimentos
                        System.out.println("* Maquinaria: " + maquinaria.getPesoTotal() + " kg");                    // Mostrar peso de Maquinaria
                        System.out.println("*******************************************************************");
                        break;

                    case 7: // Salir
                        salir = true; // Activar bandera
                        System.out.println("=================");
                        System.out.println("== SALIENDO... ==");
                        System.out.println("=================");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
            catch (InputMismatchException e) { // Catch para mostrar mensaje de Error de ingreso de tipo de dato invalido para su formato
                System.out.println("===================================");
                System.out.println("===           ¡ERROR!           ===");
                System.out.println("== Debe ingresar un valor válido ==");
                System.out.println("===================================");
                sc.nextLine(); 
            }    
        }
    sc.close();    // Cerrar escaner
    }
}