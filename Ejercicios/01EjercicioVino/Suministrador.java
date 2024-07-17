class Suministrador {
    private String nombreSum;
    private String pais;
    private int tiempo;

    public void setNombreSum(String nombreSum)
    {
        this.nombreSum = nombreSum;
    }

    public void setPais(String pais)
    {
        this.pais = pais;
    }

    public void setTiempo(int tiempo)
    {
        this.tiempo = tiempo;
    }

    public String getNombreSum() 
    {
        return nombreSum;
    }

    public String getPais() 
    {
        return pais;
    }

    public int getTiempo() 
    {
        return tiempo;
    }

    public Suministrador(String nombreSum, String pais, int tiempo)
    {
        this.nombreSum = nombreSum;
        this.pais = pais;
        this.tiempo = tiempo;
    } 

}