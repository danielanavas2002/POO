/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Main
 * La clase Main es el punto de entrada de la aplicación que simula el funcionamiento de una radio.
 * Permite al usuario interactuar con el sistema de radio, encenderla, cambiar de modo y escuchar música
 * mientras se gestionan los pronósticos del clima y contactos almacenados.
 * 
 * @author Daniela Navas
 * Fecha de creación: 14/10/2024
 * Última modificación: 15/10/2024
 */

import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static Radio radio = new Radio();           // Instanciar Radio

    /**
     * Método principal que arranca la aplicación y controla el flujo de la misma.
     * Inicializa el sistema con canciones, contactos y pronósticos. Luego muestra el menú principal
     * y permite al usuario interactuar con la aplicación hasta que decida salir.
     *
     * @param args Los argumentos de línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        boolean salir = false;

        // Iniciar 3 listas de reproducción con 10 canciones cada una
        radio.addCancion(new Cancion("pa", 3.5, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("posta", 4.0, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("miedo", 2.8, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("ni de ti", 3.2, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("ángel", 4.3, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("buenos aires", 5.0, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("tinta 90", 3.7, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("ellas", 4.5, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("bien", 3.9, "TINI", "Alternative"), 1);
        radio.addCancion(new Cancion("me voy", 4.2, "TINI", "Alternative"), 1);

        radio.addCancion(new Cancion("Cupido", 3.5, "TINI", "Pop"), 2);
        radio.addCancion(new Cancion("Te Pido", 4.0, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("Muñecas", 2.8, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("El Último Beso", 3.2, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("Carne y Hueso", 4.3, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("La Loto", 5.0, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("Las Jordans", 3.7, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("Besos en las Rocas", 4.5, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("7 Veces", 3.9, "TINI", "Urban"), 2);
        radio.addCancion(new Cancion("Fantasi", 4.2, "TINI", "Urban"),2);

        radio.addCancion(new Cancion("Un Beso en Madrid", 3.5, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Fresa", 4.0, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Si Tú Supieras", 2.8, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Tuyo", 3.2, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Te Olvidaré", 4.3, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Acércate", 5.0, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Playa", 3.7, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Ella Dice", 4.5, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Duele", 3.9, "TINI", "Urban"), 3);
        radio.addCancion(new Cancion("Recuerdo", 4.2, "TINI", "Urban"), 3);

        // Iniciar lista de 10 contactos
        radio.addContacto(new Contacto("Alice", "123456789"));
        radio.addContacto(new Contacto("Bob", "987654321"));
        radio.addContacto(new Contacto("Charlie", "456789123"));
        radio.addContacto(new Contacto("Diana", "789123456"));
        radio.addContacto(new Contacto("Eve", "321654987"));
        radio.addContacto(new Contacto("Frank", "654987321"));
        radio.addContacto(new Contacto("Grace", "987321654"));
        radio.addContacto(new Contacto("Hank", "147258369"));
        radio.addContacto(new Contacto("Ivy", "369258147"));
        radio.addContacto(new Contacto("Jack", "753951456"));

        // Iniciar lista de 5 posibles pronísticos del clima
        radio.agregarPronostico("Soleado y cálido, 25°C.");
        radio.agregarPronostico("Lluvias ligeras por la tarde, 18°C.");
        radio.agregarPronostico("Cielo parcialmente nublado, 22°C.");
        radio.agregarPronostico("Tormentas eléctricas en la noche, 20°C.");
        radio.agregarPronostico("Frío con ráfagas de viento, 15°C.");
        
        while (!salir) {
            try {
                boolean volverAlMenu1 = menu1(); // Inicia en Menú 1
                
                if (!volverAlMenu1) { // Si no hay opción para continuar
                    salir = true;
                    System.out.println("");
                    System.out.println("==========================");
                    System.out.println("== Saliendo del Sistema ==");
                    System.out.println("==========================");
                    System.out.println("");
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
    }

    /**
     * Muestra el primer menú del sistema, donde el usuario puede encender la radio
     * o salir de la aplicación. Dependiendo de la opción seleccionada, se realiza
     * una acción correspondiente, como encender la radio o salir del sistema.
     *
     * @return true si el usuario desea regresar al menú, false si desea salir del sistema.
     */
    private static boolean menu1() {
        boolean regresar = true;
        while (regresar) {
            try {
                System.out.println("");
                System.out.println("***************************************");
                System.out.println("**               RADIO               **");
                System.out.println("***************************************");
                System.out.println("=======================================");
                System.out.println("|| 1. Encender Radio                 ||");
                System.out.println("|| 2. Salir del Sistema              ||");
                System.out.println("=======================================");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        radio.setEncendido(true); // Encender
                        radio.setModoRadio(true); // Entrar a Radio automáticamente
                        regresar = menuRadio(); 
                        break;
                    case 2:
                        regresar = false; // Salir por completo
                        break;
                    default:
                        System.out.println("");
                        System.out.println("=========================================");
                        System.out.println("==                ERROR                ==");
                        System.out.println("= Opción no válida. Intente nuevamente. =");
                        System.out.println("=========================================");
                        System.out.println("");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
        return regresar;
    }

    /**
     * Muestra el menú de la radio donde el usuario puede interactuar con las opciones disponibles
     * en el sistema. Dependiendo de la opción seleccionada, puede cambiar entre el modo radio o salir.
     * 
     * @return true si el usuario desea regresar al menú, false si desea salir del sistema.
     */
    private static boolean menuRadio() {
        boolean regresar = false;
        while (!regresar) {
            try {
                System.out.println(radio.displayInfo());
                System.out.println("========================================");
                System.out.println("||  1. Cambiar de FM a AM             ||");
                System.out.println("||  2. Subir Frecuencia               ||");
                System.out.println("||  3. Bajar Frecuencia               ||");
                System.out.println("||  4. Guardar Emisora                ||");
                System.out.println("||  5. Cargar Emisora                 ||");
                System.out.println("||                                    ||");
                System.out.println("||  6. Subir Volumen                  ||");
                System.out.println("||  7. Bajar Volumen                  ||");
                System.out.println("||  8. Cambiar a Modo Reproducción    ||");
                System.out.println("||  9. Cambiar a Modo Teléfono        ||");
                System.out.println("|| 10. Cambiar a Modo Productividad   ||");
                System.out.println("|| 11. Apagar Radio                   ||");
                System.out.println("========================================");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        radio.cambiarBanda(); // Cambiar Banda
                        break;
                    case 2:
                        radio.subirFrecuencia(); // Subir Frecuencia 
                        break;
                    case 3:
                        radio.bajarFrecuencia();  // Bajar Frecuencia
                        break;
                    case 4:
                        try { // Selecciona una de las 50 posiciones
                            System.out.print("Ingrese el número de la emisora (1 a 50): ");
                            int numeroEmisora = Integer.parseInt(sc.nextLine());
                            if (numeroEmisora < 1 || numeroEmisora > 50) {
                                System.out.println("");
                                System.out.println("=========================================");
                                System.out.println("==                ERROR                ==");
                                System.out.println("= Opción no válida. Intente nuevamente. =");
                                System.out.println("=========================================");
                                System.out.println("");
                            } else {
                                System.out.println();
                                radio.guardarEmisora(numeroEmisora);
                                System.out.println();
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("");
                            System.out.println("===================================");
                            System.out.println("==             ERROR             ==");
                            System.out.println("= Debe ingresar un número entero. =");
                            System.out.println("===================================");
                            System.out.println("");
                        }
                        break;
                    case 5:
                        try { // Selecciona una de las 50 posiciones
                            System.out.print("Ingrese el número de la emisora que desea cargar (1 a 50): ");
                            int cargarIndex = Integer.parseInt(sc.nextLine());
                            if (cargarIndex < 1 || cargarIndex > 50) {
                                System.out.println("");
                                System.out.println("=========================================");
                                System.out.println("==                ERROR                ==");
                                System.out.println("= Opción no válida. Intente nuevamente. =");
                                System.out.println("=========================================");
                                System.out.println("");
                            } else {
                                radio.cargarEmisora(cargarIndex);
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("");
                            System.out.println("===================================");
                            System.out.println("==             ERROR             ==");
                            System.out.println("= Debe ingresar un número entero. =");
                            System.out.println("===================================");
                            System.out.println("");
                        }
                        break;    
                    case 6:
                        radio.subirVolumen(); // Subir Volumen
                        break;
                    case 7:
                        radio.bajarVolumen(); // Bajar Volumen
                        break;
                    case 8:
                        radio.setModoReproduccion(true);
                        return menuReproduccion(); // Al seleccionar, ir a Menú Modo Reproduccion
                    case 9:
                        radio.setModoTelefono(true);
                        return menuTelefono(); // Al seleccionar, ir a Menú Menú Modo Telefono
                    case 10:
                        radio.setModoProductividad(true);
                        return menuProductividad(); // Al seleccionar, ir a Menú Modo Productividad
                    case 11:
                        radio.setEncendido(false);
                        return true; // Apaga la radio
                    default:
                        System.out.println("");
                        System.out.println("=========================================");
                        System.out.println("==                ERROR                ==");
                        System.out.println("= Opción no válida. Intente nuevamente. =");
                        System.out.println("=========================================");
                        System.out.println("");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
        return false;
    }

    /**
     * Muestra el menú del Modo Reproducción donde el usuario puede interactuar con opciones
     * como cambiar la lista de reproducción, pasar a la siguiente o anterior canción, ajustar
     * el volumen, o cambiar de modo a radio, teléfono o productividad.
     *
     * @return true si el usuario desea regresar al menú principal o apagar la radio, false si el programa debe continuar.
     */
    private static boolean menuReproduccion() {
        while (true) {
            try {
                System.out.println(radio.displayInfo());
                System.out.println("===========================================");
                System.out.println("||  1. Seleccionar Lista de Reproducción ||");
                System.out.println("||  2. Siguiente Canción                 ||");
                System.out.println("||  3. Canción Anterior                  ||");
                System.out.println("||  4. Escuchar / Detener Canción        ||");
                System.out.println("||                                       ||");
                System.out.println("||  5. Subir Volumen                     ||");
                System.out.println("||  6. Bajar Volumen                     ||");
                System.out.println("||  7. Cambiar a Modo Radio              ||");
                System.out.println("||  8. Cambiar a Modo Teléfono           ||");
                System.out.println("||  9. Cambiar a Modo Productividad      ||");
                System.out.println("|| 10. Apagar Radio                      ||");
                System.out.println("===========================================");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        try {  // Selecciona una de las 3 listas
                            System.out.print("Seleccione la lista (1, 2 o 3): ");
                            int lista = Integer.parseInt(sc.nextLine()); // Captura la lista y convierte la entrada a int
                            if (lista < 1 || lista > 3) {
                                System.out.println("");
                                System.out.println("=========================================");
                                System.out.println("==                ERROR                ==");
                                System.out.println("= Opción no válida. Intente nuevamente. =");
                                System.out.println("=========================================");
                                System.out.println("");
                            } else {
                                System.out.println(radio.cambiarLista(lista));
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("");
                            System.out.println("===================================");
                            System.out.println("==             ERROR             ==");
                            System.out.println("= Debe ingresar un número entero. =");
                            System.out.println("===================================");
                            System.out.println("");
                        }
                        break;
                    case 2:
                        System.out.println(radio.siguienteCancion()); // Siguiente cancion
                        break;
                    case 3:
                        System.out.println(radio.anteriorCancion()); // Cancion anterior
                        radio.bajarFrecuencia();
                        break;
                    case 4:
                        radio.cambiarEstadoReproduccion(); // Parar / Seguir reproduccion
                        break;    
                    case 5:
                        radio.subirVolumen(); // Subir volumen
                        break;
                    case 6:
                        radio.bajarVolumen(); // Bajar Volumen
                        break;
                    case 7:
                        radio.setModoRadio(true);
                        return menuRadio(); // Regresa al Menú Radio
                    case 8:
                        radio.setModoTelefono(true);
                        return menuTelefono(); // Regresa al Menú Telefono
                    case 9:
                        radio.setModoProductividad(true);
                        return menuProductividad(); // Regresa al Menú Productividad
                    case 10:
                        radio.setEncendido(false);
                        return true; // Apaga la radio
                    default:
                        System.out.println("");
                        System.out.println("=========================================");
                        System.out.println("==                ERROR                ==");
                        System.out.println("= Opción no válida. Intente nuevamente. =");
                        System.out.println("=========================================");
                        System.out.println("");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
    }

    /**
     * Muestra el menú del Modo Teléfono, donde el usuario puede gestionar las llamadas, conectar o desconectar
     * el teléfono, ver los contactos, hacer llamadas, y ajustar el volumen, además de poder cambiar de modo a radio,
     * reproducción o productividad.
     *
     * @return true si el usuario desea regresar al menú principal o apagar la radio, false si el programa debe continuar.
     */
    private static boolean menuTelefono() {
        while (true) {
            try {
                System.out.println(radio.displayInfo());
                System.out.println("===========================================");
                System.out.println("||  1. Conectar/Desconectar teléfono     ||");
                System.out.println("||  2. Mostrar contactos                 ||");
                System.out.println("||  3. Llamar a Contacto                 ||");
                System.out.println("||  4. Finalizar LLamada                 ||");
                System.out.println("||  5. Cambiar a Llamada en Espera       ||");
                System.out.println("||                                       ||");
                System.out.println("||  6. Subir Volumen                     ||");
                System.out.println("||  7. Bajar Volumen                     ||");
                System.out.println("||  8. Cambiar a Modo Radio              ||");
                System.out.println("||  9. Cambiar a Modo Reproducción       ||");
                System.out.println("|| 10. Cambiar a Modo Productividad      ||");
                System.out.println("|| 11. Apagar Radio                      ||");
                System.out.println("===========================================");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1: // Conectar o Desconectar Telefono
                        radio.conectarDesconectarTelefono();
                        break;
                    case 2: // Mostrar Contactos
                        System.out.println(radio.mostrarContactos());
                        break;
                    case 3:
                        try {  // Selecciona una de los 10 contactos
                            System.out.print("Seleccione un contacto (1-10): ");
                            int contactoIndex = Integer.parseInt(sc.nextLine());
                            if (contactoIndex < 1 || contactoIndex > 10) {
                                System.out.println("");
                                System.out.println("=========================================");
                                System.out.println("==                ERROR                ==");
                                System.out.println("= Opción no válida. Intente nuevamente. =");
                                System.out.println("=========================================");
                                System.out.println("");
                            } else {
                                System.out.println(radio.llamarAContacto(contactoIndex));
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("");
                            System.out.println("===================================");
                            System.out.println("==             ERROR             ==");
                            System.out.println("= Debe ingresar un número entero. =");
                            System.out.println("===================================");
                            System.out.println("");
                        }
                        break;
                    case 4:
                        System.out.println(radio.finalizarLlamada()); // Finalizar Llamada
                        break;    
                    case 5:
                        System.out.println(radio.cambiarLlamadaEnEspera()); // Poner en Espera
                        break;  
                    case 6:
                        radio.subirVolumen(); // Subir Volumen
                        break;
                    case 7:
                        radio.bajarVolumen(); // Bajar Volumen
                        break;
                    case 8:
                        radio.setModoRadio(true);
                        return menuRadio(); // Regresa al Menú de Modo Radio
                    case 9:
                        radio.setModoReproduccion(true);
                        return menuReproduccion(); // Regresa al Menú de Reproducción
                    case 10:
                        radio.setModoProductividad(true);  
                        return menuProductividad(); // Regresar al Menú de Productividad
                    case 11:
                        radio.setEncendido(false); // Apagar Radio 
                        return true;
                    default:
                        System.out.println("");
                        System.out.println("=========================================");
                        System.out.println("==                ERROR                ==");
                        System.out.println("= Opción no válida. Intente nuevamente. =");
                        System.out.println("=========================================");
                        System.out.println("");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
    }

    /**
     * Muestra el menú del Modo Productividad, donde el usuario puede consultar el pronóstico del tiempo, 
     * ajustar el volumen, y cambiar entre los diferentes modos de la radio, teléfono o reproducción.
     *
     * @return true si el usuario desea regresar al menú principal o apagar la radio, false si el programa debe continuar.
     */
    private static boolean menuProductividad() {
        while (true) {
            try {
                System.out.println(radio.displayInfo());
                System.out.println("==========================================");
                System.out.println("|| 1. Ver/Quitar Pronóstico del Tiempo  ||");
                System.out.println("||                                      ||");
                System.out.println("|| 2. Subir Volumen                     ||");
                System.out.println("|| 3. Bajar Volumen                     ||");
                System.out.println("|| 4. Cambiar a Modo Radio              ||");
                System.out.println("|| 5. Cambiar a Modo Reproducción       ||");
                System.out.println("|| 6. Cambiar a Modo Teléfono           ||");
                System.out.println("|| 7. Apagar Radio                      ||");
                System.out.println("==========================================");
                System.out.print("Seleccione una opción: ");
                int opcion = Integer.parseInt(sc.nextLine());

                switch (opcion) {
                    case 1:
                        radio.verPronostico(); // Activar y Desactivar Pronóstico
                        break;
                    case 2:
                        radio.subirVolumen(); // Subir Volumen 
                        break;
                    case 3:
                        radio.bajarVolumen(); // Bajar Volumen
                        break;
                    case 4:
                        radio.setModoRadio(true);
                        return menuRadio(); // Regresar a Radio
                    case 5:
                        radio.setModoReproduccion(true);
                        return menuReproduccion(); // Regresar a Reproduccion
                    case 6:
                        radio.setModoTelefono(true);
                        return menuTelefono(); // Regresar a Telefono 
                    case 7:
                        radio.setEncendido(false);
                        return true; // Apagar Radio 
                    default:
                        System.out.println("");
                        System.out.println("=========================================");
                        System.out.println("==                ERROR                ==");
                        System.out.println("= Opción no válida. Intente nuevamente. =");
                        System.out.println("=========================================");
                        System.out.println("");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("");
                System.out.println("===================================");
                System.out.println("==             ERROR             ==");
                System.out.println("= Debe ingresar un número entero. =");
                System.out.println("===================================");
                System.out.println("");
            }
        }
    }
}
