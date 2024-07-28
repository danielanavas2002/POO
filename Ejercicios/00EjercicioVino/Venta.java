class Venta {
    private float monto;
    private int cantidad;
    private int year;
    private Vino vino;

    public void setMonto(float monto)
    {
        this.monto = monto;
    }

    public void setCantidad(int cantidad)
    {
        this.cantidad = cantidad;
    }

    public void setYear(int year)
    {
        this.year = year;
    }

    public void setVino(Vino vino)
    {
        this.vino = vino;
    }

    
    public float getMonto() 
    {
        return monto;
    }

    public int getCantidad() 
    {
        return cantidad;
    }

    public int getYear() 
    {
        return year;
    }

    public Vino getVino() 
    {
        return vino;
    }

    public Venta(float monto, int cantidad, int year, Vino vino)
    {
        this.monto = monto;
        this.cantidad = cantidad;
        this.year = year;
        this.vino = vino;
    } 
}