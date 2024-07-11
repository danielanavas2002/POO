class Main
{
    public static void main(String[] args) 
    {
        Serie lucifer = new Serie("Lucifer", 93, 8.1f, "Netflix", "Watched", 93);
        // System.out.println(lucifer.getName());
        // System.out.println(lucifer.getEpisodes());
        // System.out.println(lucifer.getIMDb());
        // System.out.println(lucifer.getPlatform());
        // System.out.println(lucifer.getStatus());
        System.out.println(lucifer.getInformation());
        System.out.println(lucifer.getName() + "'s Status: " + lucifer.getStatus());
        System.out.println(lucifer.getWatched());

        Serie greys = new Serie("Grey's Anatomy", 428, 7.6f, "Disney+", "Watching", 420);
        System.out.println(greys.getInformation());
        System.out.println(greys.getName() + "'s Status: " + greys.getStatus());
        System.out.println(greys.getWatched());

        Serie thisisus = new Serie("This Is Us", 106, 8.7f, "Amazon Prime Video", "Plan to Watch", 0);
        System.out.println(thisisus.getInformation());
        System.out.println(thisisus.getName() + "'s Status: " + thisisus.getStatus());
        System.out.println(thisisus.getWatched());
    }
}