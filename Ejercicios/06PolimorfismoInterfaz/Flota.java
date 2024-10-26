/**
 * UNIVERSIDAD DEL VALLE DE GUATEMALA
 * SEGUNDO SEMESTRE 2024
 * PROGRAMACIÓN ORIENTADA A OBJETOS
 * 
 * Clase Flota
 * La clase Flota representa una colección de vehículos y clientes en un sistema de alquiler de vehículos.
 * Proporciona métodos para alquilar vehículos, generar reportes mensuales, 
 * guardar y cargar datos en archivos CSV.
 *
 *
 * @author Daniela Navas
 * Fecha de creación: 25/10/2024
 * Última modificación: 26/10/2024
 */

import java.util.ArrayList;
import java.io.*;

public class Flota {
    private ArrayList<Vehiculo> vehiculos;  // Lista de Vehiculos en la Flota
    private ArrayList<Cliente> clientes;    // Lista de Clientes Frecuentes

    /**
     * Constructor de la clase Flota.
     * Inicializa las listas de vehículos y clientes.
     */
    public Flota() {
        this.vehiculos = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    /**
     * Alquila un vehículo a un cliente específico.
     *
     * @param idVehiculo el ID del vehículo a alquilar
     * @param idCliente el ID del cliente que realiza el alquiler
     * @return true si el vehículo fue alquilado exitosamente, false en caso contrario
     */
    public boolean alquilarVehiculo(int idVehiculo, int idCliente) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getID() == idVehiculo && !vehiculo.getEnAlquiler()) {
                vehiculo.setEnAlquiler(true);
                return true;
            }
        }
        return false;
    }

    /**
     * Genera un reporte mensual de los ingresos por tipo de vehículo.
     *
     * @return un String que contiene el reporte de ingresos
     */
    public String generarReporteMensual() {
        float totalIngresosAutos = 0;
        float totalIngresosBicicletas = 0;
        float totalIngresosPatinetas = 0;
    
        // Recorre la lista de vehículos y acumula los ingresos por cada tipo
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo instanceof AutoElectrico) {
                totalIngresosAutos += vehiculo.getIngresoMensual();
            } else if (vehiculo instanceof BicicletaElectrica) {
                totalIngresosBicicletas += vehiculo.getIngresoMensual();
            } else if (vehiculo instanceof PatinetaElectrica) {
                totalIngresosPatinetas += vehiculo.getIngresoMensual();
            }
        }
    
        // Construye el reporte mensual
        StringBuilder reporte = new StringBuilder("");
        reporte.append("Autos Eléctricos: $").append(totalIngresosAutos).append("\n");
        reporte.append("Bicicletas Eléctricas: $").append(totalIngresosBicicletas).append("\n");
        reporte.append("Patinetas Eléctricas: $").append(totalIngresosPatinetas).append("\n");
    
        return reporte.toString();
    }

    /**
     * Guarda los datos de los vehículos y clientes en archivos CSV.
     *
     * @throws IOException si ocurre un error al escribir en el archivo
     */
    public void guardarEnCSV() throws IOException {
        // Guardado de vehículos en vehiculos.csv
        try (FileWriter writerVehiculos = new FileWriter("vehiculos.csv", false)) { 
        for (Vehiculo vehiculo : vehiculos) {
            String tipoVehiculo = "";

            if (vehiculo instanceof AutoElectrico) {
                tipoVehiculo = ((AutoElectrico) vehiculo).getTipoVehiculo();
            } else if (vehiculo instanceof BicicletaElectrica) {
                tipoVehiculo = ((BicicletaElectrica) vehiculo).getTipoVehiculo();
            } else if (vehiculo instanceof PatinetaElectrica) {
                tipoVehiculo = ((PatinetaElectrica) vehiculo).getTipoVehiculo();
            }

            writerVehiculos.write(vehiculo.getID() + "," +
                                  tipoVehiculo + "," +
                                  vehiculo.getTarifaBase() + "," +
                                  vehiculo.getEnAlquiler() + "," +
                                  vehiculo.getIngresoMensual() + "\n");
        }
    }
    
        // Guardado de clientes en clientes.csv
        try (FileWriter writerClientes = new FileWriter("clientes.csv", false)) { 
        for (Cliente cliente : clientes) {
            StringBuilder vehiculosIds = new StringBuilder();
            for (Vehiculo vehiculo : cliente.getVehiculos()) {
                vehiculosIds.append(vehiculo.getID()).append(" ");
            }
            writerClientes.write(cliente.getID() + "," +
                                 cliente.getHorasUsoMensual() + "," +
                                 vehiculosIds.toString().trim() + "\n");
        }
    }
    }
    
    /**
     * Carga los datos de los vehículos y clientes desde archivos CSV.
     *
     * @throws IOException si ocurre un error al leer el archivo
     */
    public void cargarCSV() throws IOException {
        // Cargar vehículos desde vehiculos.csv
        try (BufferedReader brVehiculos = new BufferedReader(new FileReader("vehiculos.csv"))) {
            String linea;
            // Saltar la primera línea (encabezado) si hay uno, si no lo hay puedes quitar esto
            // brVehiculos.readLine();
            
            while ((linea = brVehiculos.readLine()) != null) {
                String[] datos = linea.split(",");
                // Asegurarse de que los datos tienen la longitud correcta
                if (datos.length != 5) { // Debería ser 5 elementos
                    System.out.println("Línea ignorada (datos insuficientes): " + linea);
                    continue; // Saltar a la siguiente línea
                }
    
                try {
                    // Convertir cada dato del CSV
                    int id = Integer.parseInt(datos[0].trim()); // ID
                    String tipoVehiculo = datos[1].trim(); // Tipo
                    float tarifaBase = Float.parseFloat(datos[2].trim()); // Tarifa Base
                    boolean enAlquiler = Boolean.parseBoolean(datos[3].trim()); // En Alquiler
                    float ingresoMensual = Float.parseFloat(datos[4].trim()); // Ingreso Mensual
    
                    // Crear instancia de Vehiculo según el tipo
                    Vehiculo vehiculo;
                    switch (tipoVehiculo) {
                        case "Auto Eléctrico":
                            vehiculo = new AutoElectrico(id, tarifaBase, enAlquiler, ingresoMensual);
                            break;
                        case "Bicicleta Eléctrica":
                            vehiculo = new BicicletaElectrica(id, tarifaBase, enAlquiler, ingresoMensual);
                            break;
                        case "Patineta Eléctrica":
                            vehiculo = new PatinetaElectrica(id, tarifaBase, enAlquiler, ingresoMensual);
                            break;
                        default:
                            System.out.println("Tipo de vehículo desconocido: " + tipoVehiculo);
                            continue; // Ignorar la línea y continuar
                    }
    
                    // Agregar vehículo a la lista
                    vehiculos.add(vehiculo);
    
                    // Actualizar el contadorID de Vehiculo
                    if (id >= Vehiculo.getContadorID()) {
                        Vehiculo.setContadorID(id + 1);
                    }
                } catch (NumberFormatException e) {
                } catch (IllegalArgumentException e) {
                }
            }
        }
    
        // Cargar clientes desde clientes.csv
        try (BufferedReader brClientes = new BufferedReader(new FileReader("clientes.csv"))) {
            String linea;
            // Saltar la primera línea (encabezado) si hay uno
            // brClientes.readLine();
            
            while ((linea = brClientes.readLine()) != null) {
                String[] datos = linea.split(",");
                // Asegurarse de que los datos tienen la longitud correcta
                if (datos.length != 3) { // Debería ser 3 elementos
                    continue; // Saltar a la siguiente línea
                }
    
                try {
                    int id = Integer.parseInt(datos[0].trim());
                    int horasUsoMensual = Integer.parseInt(datos[1].trim());
                    String[] vehiculosCliente = datos[2].trim().split(" "); 
    
                    // Crear una instancia de Cliente y asignarle sus vehículos
                    Cliente cliente = new Cliente(id, horasUsoMensual);
                    for (String idVehiculo : vehiculosCliente) {
                        int idVehiculoInt = Integer.parseInt(idVehiculo.trim());
                        Vehiculo vehiculo = buscarVehiculoPorId(idVehiculoInt);
                        if (vehiculo != null) {
                            cliente.addVehiculo(vehiculo);
                        } else {
                        }
                    }
    
                    // Agregar cliente a la lista
                    clientes.add(cliente);
    
                    // Actualizar el contadorID de Cliente
                    if (id >= Cliente.getContadorID()) {
                        Cliente.setContadorID(id + 1);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
    }
    
    /**
     * Busca un vehículo por su ID.
     *
     * @param id el ID del vehículo a buscar
     * @return el vehículo correspondiente al ID, o null si no se encuentra
     */
    private Vehiculo buscarVehiculoPorId(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getID() == id) {
                return vehiculo;
            }
        }
        return null;
    }

    /**
     * Obtiene la lista de vehículos en la flota.
     *
     * @return la lista de vehículos
     */
    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }

    /**
     * Obtiene un vehículo específico por su ID.
     *
     * @param id el ID del vehículo a obtener
     * @return el vehículo correspondiente al ID, o null si no se encuentra
     */
    public Vehiculo getVehiculo(int id) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getID() == id) { // Compara el ID de cada vehiculo con el ID buscado
                return vehiculo; // Si se encuentra, devuelve el vehiculo
            }
        }
        return null; // Si no se encuentra, devuelve null
    }

    /**
     * Obtiene un cliente específico por su ID.
     *
     * @param id el ID del cliente a obtener
     * @return el cliente correspondiente al ID, o null si no se encuentra
     */
    public Cliente getCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getID() == id) {
                return cliente;
            }
        }
        return null; // Retorna null si no se encuentra
    }

    /**
     * Obtiene la lista de clientes en la flota.
     *
     * @return la lista de clientes
     */
    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    /**
     * Agrega un nuevo vehículo a la flota.
     *
     * @param vehiculo el vehículo a agregar
     */
    public void addVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    /**
     * Agrega un nuevo cliente a la flota.
     *
     * @param cliente el cliente a agregar
     */
    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }
}
