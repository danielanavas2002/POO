class Main
{
    public static void main(String[] args) 
    {
// ** SERIES ** --------------------------------------------------------------------------------------
        // Setters
        // Serie lucifer = new Serie( );
        // lucifer.setName("Lucifer");
        // lucifer.setEpisodes(93);
        // lucifer.setIMDb(8.1f);
        // lucifer.setPlatform("Netflix");
        // lucifer.setStatus("Watched");
        // lucifer.setWatched(93);

        // Getters
        // System.out.println(lucifer.getName());
        // System.out.println(lucifer.getEpisodes());
        // System.out.println(lucifer.getIMDb());
        // System.out.println(lucifer.getPlatform());
        // System.out.println(lucifer.getStatus());
        // System.out.println(lucifer.getWatched());

        // Constructor y Métodos
        Serie lucifer = new Serie("Lucifer", 93, 8.1f, "Netflix", "Watched", 93);
        System.out.println(lucifer.getInformation());
        System.out.println(lucifer.getName() + "'s Status: " + lucifer.getStatus());
        System.out.println(lucifer.Watched());
        System.out.println("******");

        Serie greys = new Serie("Grey's Anatomy", 428, 7.6f, "Disney+", "Watching", 420);
        System.out.println(greys.getInformation());
        System.out.println(greys.getName() + "'s Status: " + greys.getStatus());
        System.out.println(greys.Watched());
        System.out.println("******");

// ** MOVIES ** --------------------------------------------------------------------------------------        
       // public Movie(String name, float imdb, String platform, boolean watched, int viewerAge, String classification) 
        System.out.println("---------------------------------------------------------------------------------------");
        
        Movie draftday = new Movie("Draft Day", 6.8f, "Apple Tv", false, 10, "PG" );
        System.out.println(draftday.getInformationMovie());
        System.out.println(draftday.Ageclassification());
        System.out.println("******");

        Movie zootopia = new Movie("Zootopia", 8.0f, "Disney+", true, 5, "G" );
        System.out.println(zootopia.getInformationMovie());
        System.out.println(zootopia.Ageclassification());
        System.out.println("******");
    }
}