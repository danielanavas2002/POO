class Main
{
    public static void main(String[] args) 
    {
        Serie lucifer = new Serie("Lucifer", 93, 8.1f, "Netflix", "Watched");
        System.out.println(lucifer.getName());
        System.out.println(lucifer.getEpisodes());
        System.out.println(lucifer.getIMDb());
        System.out.println(lucifer.getPlatform());
        System.out.println(lucifer.getBookMark());
    }
}