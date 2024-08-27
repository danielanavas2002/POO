import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Crear los equipos
        ArrayList<Equipo> equipos = new ArrayList<>();
        equipos.add(new Equipo("Fútbol", true, 15, 15, 3, 2, 1));
        equipos.add(new Equipo("Baloncesto", true, 1, 2, 1, 0, 0));
        equipos.add(new Equipo("Voleibol", true, 6, 6, 0, 0, 0));
        equipos.add(new Equipo("Hockey sobre césped", true, 0, 5, 0, 2, 0));
        equipos.add(new Equipo("Rugby 7", true, 10, 0, 0, 0, 0));
        equipos.add(new Equipo("Natación", false, 4, 2, 1, 0, 1));
        equipos.add(new Equipo("Atletismo", false, 10, 5, 3, 0, 5));
        equipos.add(new Equipo("Tenis", false, 5, 0, 0, 0, 1));
        equipos.add(new Equipo("Gimnasia artística", false, 8, 3, 0, 2, 5));
        equipos.add(new Equipo("Esgrima", false, 10, 3, 3, 0, 0));
        equipos.add(new Equipo("Balonmano", true, 1, 12, 3, 2, 0));
        equipos.add(new Equipo("Tiro con arco", false, 2, 7, 3, 4, 0));

        // Resultados de las últimas 5 olimpiadas
        ArrayList<Integer> medallasAnteriores = new ArrayList<>();
        medallasAnteriores.add(50); // Tokio2020
        medallasAnteriores.add(20); // Rio2016
        medallasAnteriores.add(30); // Londres2012
        medallasAnteriores.add(32); // Beijing2008
        medallasAnteriores.add(15); // Atenas2004

        // Crear la olimpiada Paris2024
        Olimpiada paris2024 = new Olimpiada(equipos, medallasAnteriores);

        boolean menu = true;

        System.out.println(" ");
        System.out.println("****************************************************************************");
        System.out.println("****                 OLIMPIADAS - DELEGACIÓN GUATEMALA                  ****");
        System.out.println("****************************************************************************");

        while (menu) {
            System.out.println(" ");
            System.out.println("****************************************************************************");
            System.out.println("****                                MENU                                ****");
            System.out.println("** 1. Cantidad total de deportistas                                       **");
            System.out.println("** 2. Total de medallas obtenidas por un equipo                           **");
            System.out.println("** 3. Total de medallas obtenidas en la Olimpiada                         **");
            System.out.println("** 4. Equipo colectivo con más medallas de oro                            **");
            System.out.println("** 5. Comparar medallas obtenidas con el promedio de últimas 5 olimpiadas **");
            System.out.println("** 6. Salir                                                               **");
            System.out.println("****************************************************************************");
            System.out.print("Seleccione una opción: ");

            try {
                int opcion = Integer.parseInt(sc.nextLine()); // Escanear número y convertir a entero para facilitar uso de menú

                switch (opcion) {
                    case 1:
                        System.out.println("Delegación PARIS 2024 - Guatemala");
                        System.out.println("Total de deportistas: " + paris2024.totalDeportistas());
                        break;

                    case 2:
                        System.out.println("Lista de equipo:");
                        for (int i = 0; i < equipos.size(); i++) {
                            System.out.println((i + 1) + ". " + equipos.get(i).getEquipo());
                        }

                        try {
                            System.out.print("Seleccione un Equipo (Número): ");
                            int equipoSeleccionado = Integer.parseInt(sc.nextLine()) - 1;
                            if (equipoSeleccionado >= 0 && equipoSeleccionado < equipos.size()) {
                                Equipo equipo = equipos.get(equipoSeleccionado);
                                System.out.println("Total de Medallas de Equipo de " + equipo.getEquipo() + ": " + equipo.totalMedallas());
                            } else {
                                System.out.println("Equipo no válido. Intente de nuevo.");
                            }
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada no válida. Intente de nuevo.");
                        }
                        break;

                    case 3:
                        System.out.println("Delegación PARIS 2024 - Guatemala");
                        System.out.println("Total de Medallas Obtenidas: " + paris2024.totalMedallas());
                        System.out.println("Total de Medallas Obtenidas: " + paris2024.totalMedallas());
                        break;

                    case 4:
                        Equipo mejorEquipo = paris2024.oroColectivo();
                        if (mejorEquipo != null) {
                            System.out.println("El equipo colectivo con más medallas de oro es: " + mejorEquipo.getEquipo());
                            System.out.println("Con " + mejorEquipo.totalMedallas() + " medallas.");
                        } else {
                            System.out.println("No se encontraron equipos colectivos con medallas de oro.");
                        }
                        break;

                    case 5:
                        boolean esMejor = paris2024.promedio();
                        System.out.println((esMejor ? "Se obtuvieron más medallas que el promedio de las últimas 5 olimpiadas" : "No se obtuvieron más medallas que el promedio de las últimas 5 olimpiadas"));
                        System.out.println("Promedio Últimas 5 Olimpiadas: " + paris2024.getPromedio());
                        System.out.println("Medallas Obtenidas en PARIS 2024: " + paris2024.totalMedallas());
                        break;

                    case 6:
                        menu = false;
                        System.out.println("GRACIAS POR USAR EL PROGRAMA :)");
                        break;

                    default:
                        System.out.println("Opción no válida. Por favor, seleccione una opción del 1 al 6.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }

        sc.close();
    }
}
