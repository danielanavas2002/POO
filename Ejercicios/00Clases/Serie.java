class Serie
{
// Atributos ----------------------------------------------------------------------- 
    private String name;
    private int episodes;
    private float imdb;
    private String platform;
    private String status;
    private int watched;
// ---------------------------------------------------------------------------------
//Setters --------------------------------------------------------------------------
    public void setName(String name)
    {
        this.name = name;
    }

    public void setEpisodes(int episodes)
    {
        this.episodes = episodes;
    }

    public void setIMDb(float imdb)
    {
        this.imdb = imdb;
    }

    public void setPlatform(String platform)
    {
        this.platform = platform;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public void setWatched(int watched)
    {
        this.watched = watched;
    }
// ---------------------------------------------------------------------------------
//Getters --------------------------------------------------------------------------
    public String getName() 
    {
        return name;
    }

    public int getEpisodes() 
    {
        return episodes;
    }

    public float getIMDb() 
    {
        return imdb;
    }

    public String getPlatform() 
    {
        return platform;
    }

    public String getStatus() 
    {
        return status;
    }

    public int getWatched() 
    {
        return watched;
    }
// ---------------------------------------------------------------------------------

// Constructor ---------------------------------------------------------------------
    public Serie(String name, int episodes, float imdb, String platform, String status, int watched)
    {
        this.name = name;
        this.episodes = episodes;
        this.imdb = imdb;
        this.platform = platform;
        this.status = status;
        this.watched = watched;
    } 
// ---------------------------------------------------------------------------------
//**Metodos Adicionales**

// Información Completa ------------------------------------------------------------
    public String getInformation()
    {
        String text = " ";
        text = this.name + " has " + this.episodes + " episodes, with a rating of " + this.imdb + " on IMDb and is available on " + this.platform + "."; 
        return text;
    }
// ---------------------------------------------------------------------------------
// Episodios Vistos ----------------------------------------------------------------
    public String Watched()
    {
        String text = "";
        int pending = this.episodes - this.watched;
        if (pending > 0){
            text = "Pending Episodes: " + pending;
        } 
        else if (pending == 0 ){
            text = "No Pending Episodes";
        } 
        else
            text = "Error"; 

        return text;
    }
// ---------------------------------------------------------------------------------
}