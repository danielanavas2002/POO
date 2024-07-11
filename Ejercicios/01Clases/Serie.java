class Serie
{
    private String name;
    private int episodes;
    private float imdb;
    private String platform;
    private String status;
    private int watched;

    public Serie(String name, int episodes, float imdb, String platform, String status, int watched)
    {
        this.name = name;
        this.episodes = episodes;
        this.imdb = imdb;
        this.platform = platform;
        this.status = status;
        this.watched = watched;
    } 

    public String getInformation()
    {
        String text = " ";
        text = this.name + " has " + this.episodes + " episodes, with a rating of " + this.imdb + " on IMDb and is available on " + this.platform + "."; 
        return text;
    }

    public String getWatched()
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
}