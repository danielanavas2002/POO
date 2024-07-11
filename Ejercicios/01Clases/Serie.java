class Serie
{
    private String name;
    private int episodes;
    private float imdb;
    private String platform;
    private String bookmark;

    public Serie(String name, int episodes, float imdb, String platform, String bookmark)
    {
        this.name = name;
        this.episodes = episodes;
        this.imdb = imdb;
        this.platform = platform;
        this.bookmark = bookmark;
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

    public String getBookMark() 
    {
        return bookmark;
    }
}