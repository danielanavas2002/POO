import java.util.ArrayList;
import java.util.Date;

public class Proyecto {
    private String idProyecto;
    private String nombre;
    private Date fechaInicio;
    private Date fechaFinEstimada;
    private double presupuesto;
    private ArrayList<Contratista> contratistas;

    public Proyecto(String idProyecto, String nombre, Date fechaInicio, Date fechaFinEstimada, double presupuesto) 
    {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechaFinEstimada = fechaFinEstimada;
        this.presupuesto = presupuesto;
    }

    public void setContratistas(ArrayList<Contratista> contratistas) 
    { 
        this.contratistas = contratistas; 
    }

    public String getIdProyecto() 
    { 
        return idProyecto; 
    }
    
    public String getNombre() 
    { 
        return nombre; 
    }

    public Date getFechaInicio() 
    { 
        return fechaInicio; 
    }

    public Date getFechaFinEstimada() 
    { 
        return fechaFinEstimada; 
    }
    
    public double getPresupuesto() 
    { 
        return presupuesto; 
    }

    public ArrayList<Contratista> getContratistas() { 
        return contratistas; 
    }
}
