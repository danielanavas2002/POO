class Vino{
    private String nombre;
    private String cosecha;
    private String tipo;
    private int dispMinima;
    private int dispMaxima;
    private int dispReal;

    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setCosecha(String cosecha)
    {
        this.cosecha = cosecha;
    }
    
    public void setTipo(String tipo)
    {
        this.tipo = tipo;
    }

    public void setDispMinima(int dispMinima)
    {
        this.dispMinima = dispMinima;
    }
    
    public void setDispMaxima(int dispMaxima)
    {
        this.dispMaxima = dispMaxima;
    }

    public void setDispReal(int dispReal)
    {
        this.dispReal = dispReal;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getCosecha() 
    {
        return cosecha;
    }

    public String getTipo() 
    {
        return tipo;
    }

    public int getDispMinima() 
    {
        return dispMinima;
    }

    public int getDispMaxima() 
    {
        return dispMaxima;
    }

    public int getDispReal() 
    {
        return dispReal;
    }

    public Vino(String nombre, String cosecha, String tipo, int dispMinima, int dispMaxima, int dispReal)
    {
        this.nombre = nombre;
        this.cosecha = cosecha;
        this.tipo = tipo;
        this.dispMinima = dispMinima;
        this.dispMaxima = dispMaxima;
        this.dispReal = dispReal;
    } 
}