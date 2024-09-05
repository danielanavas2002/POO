/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main 
 *
 * @author Daniela Navas
 * Fecha de creación: 4/09/2024
 * Última modificación: 5/09/2024
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id = 1;

        Puerto puerto = new Puerto(4);
        Seccion electronicos = new Seccion(10, 5, 200000);
        Seccion ropa = new Seccion(10, 5, 150000);
        Seccion alimentos = new Seccion(10, 5, 250000);
        Seccion maquinaria = new Seccion(10, 5, 300000);

        puerto.setSeccion(electronicos);
        puerto.setSeccion(ropa);
        puerto.setSeccion(alimentos);
        puerto.setSeccion(maquinaria);

        System.out.println("*******************************************************************");
        System.out.println("***                      SISTEMA DE PUERTO                      ***");
        System.out.println("*******************************************************************");
        System.out.println(" ");

        boolean salir = false;


        while (!salir) {
            System.out.println("*******************************************************************");
            System.out.println("**                              MENÚ                             **");
            System.out.println("* 1. Ingresar un nuevo Contenedor                                 *");
            System.out.println("* 2. Mostrar Información de Contenedores                          *");
            System.out.println("* 3. Mover Contenedor dentro de Sección                           *");
            System.out.println("* 4. Mover Contenedor a otra Sección                              *");
            System.out.println("* 5. Eliminar Contenedor                                          *");
            System.out.println("* 6. Calcular Peso Total                                          *");
            System.out.println("* 7. Salir                                                        *");
            System.out.println("*******************************************************************");

            try {
                System.out.print("Seleccione una opción: ");
                int opcion = sc.nextInt();
                sc.nextLine();

                switch (opcion) {
                    case 1:
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): ");
                        int seccionIngreso = sc.nextInt();
                        sc.nextLine(); 

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

                        switch (seccionIngreso) {
                            case 1:
                                if (electronicos.setContenedor(nuevoContenedor)) {
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

                            case 2:
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

                            case 3:
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

                            case 4:
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

                    case 2:
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

                    case 3:
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): ");
                        int mover = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Ingrese la fila nueva (1-10): ");
                        int filaNueva = sc.nextInt();
                        sc.nextLine(); 
                        filaNueva--;
                        while(filaNueva > 10 || filaNueva < 1){
                            System.out.print("La fila debe ser entre 1 y 10: ");
                            filaNueva = sc.nextInt();
                            filaNueva--;
                        }
                        System.out.print("Ingrese la columna nueva (1-5): ");
                        int columnaNueva = sc.nextInt();
                        sc.nextLine(); 
                        columnaNueva--;
                        while(columnaNueva > 5 || columnaNueva < 1){
                            System.out.print("La columna debe ser entre 1 y 5: ");
                            columnaNueva = sc.nextInt();
                            columnaNueva--;
                        }
                        System.out.print("Ingrese el ID del contenedor a mover: ");
                        int idMover = sc.nextInt();
                        sc.nextLine(); 
                        
                        switch (mover) {
                            case 1:
                                if(electronicos.disponible(filaNueva, columnaNueva)){
                                    int[] posicion = electronicos.posicionContenedor(idMover);
                                    if (posicion != null){
                                        Contenedor contendorMover = electronicos.getContenedor(posicion[0], posicion[1]);
                                        electronicos.eliminarContenedor(posicion[0], posicion[1]);
                                        electronicos.moverContenedor(contendorMover, filaNueva, columnaNueva);
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

                            case 2:
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

                            case 3:
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

                            case 4:
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

                    case 4:
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): ");
                        int moverSeccion = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Ingrese el ID del contenedor a mover de Seccion: ");
                        int idMoverSeccion = sc.nextInt();
                        sc.nextLine(); 
                        
                        switch (moverSeccion) {
                            case 1:
                                System.out.println(" ");
                                System.out.println("*******************************************************************");                   
                                System.out.println("**                   SECCION A LA QUE SE MOVERA                  **");
                                System.out.println("* 2. Ropa                                                         *");
                                System.out.println("* 3. Alimentos                                                    *");
                                System.out.println("* 4. Maquinaria                                                   *");
                                System.out.println("*******************************************************************");
                                System.out.print("Seleccione la sección (2, 3 o 4): ");
                                int seccionNueva = sc.nextInt();
                                while(seccionNueva > 4 || seccionNueva < 1 || seccionNueva == 1){
                                    System.out.print("La nueva seccion debe ser 2, 3 o 4: ");
                                    seccionNueva = sc.nextInt();
                                    sc.nextLine(); 
                                }
                                switch (seccionNueva) {
                                    case 2:
                                        int[] posicion = electronicos.posicionContenedor(idMoverSeccion);
                                        if (posicion != null){
                                            Contenedor contendorMoverSeccion = electronicos.getContenedor(posicion[0], posicion[1]);
                                            if (ropa.setContenedor(contendorMoverSeccion)) {
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

                                    case 3:
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

                                    case 4:
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
                                    case 1:
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

                                    case 3:
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

                                    case 4:
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
                                    case 1:
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

                                    case 2:
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

                                    case 4:
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
                                    case 1:
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

                                    case 2:
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

                                    case 3:
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

                    case 5:
                        System.out.println(" ");
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                           SECCIONES                           **");
                        System.out.println("* 1. Productos Electrónicos                                       *");
                        System.out.println("* 2. Ropa                                                         *");
                        System.out.println("* 3. Alimentos                                                    *");
                        System.out.println("* 4. Maquinaria                                                   *");
                        System.out.println("*******************************************************************");
                        System.out.print("Seleccione la sección (1-4): ");
                        int eliminar = sc.nextInt();
                        sc.nextLine(); 

                        System.out.print("Ingrese el ID del contenedor a eliminar: ");
                        int idEliminar = sc.nextInt();
                        sc.nextLine(); 

                        switch (eliminar) {
                            case 1:
                                int[] posicion = electronicos.posicionContenedor(idEliminar);
                                if (posicion != null){
                                    Contenedor contendorEliminar = electronicos.getContenedor(posicion[0], posicion[1]);
                                    electronicos.eliminarContenedor(posicion[0], posicion[1]);
                                    electronicos.setPesoTotal(-contendorEliminar.getPeso());
                                    System.out.println("=======================================");
                                    System.out.println("== Contenedor eliminado exitosamente ==");
                                    System.out.println("=======================================");
                                } else {
                                    System.out.println("ID incorrecto.");
                                }
                                break;

                            case 2:
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

                            case 3:
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
                            
                            case 4:
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

                    case 6:
                        System.out.println("*******************************************************************");                   
                        System.out.println("**                      PESO POR SECCIONES                       **");
                        System.out.println("* Productos Electrónicos: " + electronicos.getPesoTotal() + " kg");
                        System.out.println("* Ropa: " + ropa.getPesoTotal() + " kg");
                        System.out.println("* Alimentos: " + alimentos.getPesoTotal() + " kg");
                        System.out.println("* Maquinaria: " + maquinaria.getPesoTotal() + " kg");
                        System.out.println("*******************************************************************");
                        break;

                    case 7:
                        salir = true;
                        System.out.println("=================");
                        System.out.println("== SALIENDO... ==");
                        System.out.println("=================");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                        break;
                }
            }
            catch (InputMismatchException e) {
                System.out.println("============================================");
                System.out.println("== ERROR: Debe ingresar un número válido! ==");
                System.out.println("============================================");
                sc.nextLine(); 
            }    
        }
    sc.close();    
    }
}