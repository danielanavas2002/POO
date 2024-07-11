class Movie
{
// Atributos ----------------------------------------------------------------------- 
    private String name;
    private float imdb;
    private String platform;
    private boolean watched;
    private int viewerAge;
    private String classification;
// ---------------------------------------------------------------------------------
//Setters --------------------------------------------------------------------------
    public void setNameMovie(String name)
    {
        this.name = name;
    }

    public void setIMDbMovie(float imdb)
    {
        this.imdb = imdb;
    }

    public void setPlatformMovie(String platform)
    {
        this.platform = platform;
    }

    public void setWatchedMovie(boolean watched)
    {
        this.watched = watched;
    }

    public void setViewerAgeMovie(int viewerAge)
    {
        this.viewerAge = viewerAge;
    }

    public void setClassificationMovie(String classification)
    {
        this.classification = classification;
    }
// ---------------------------------------------------------------------------------
//Getters --------------------------------------------------------------------------
    public String getNameMovie() 
    {
        return name;
    }

    public float getIMDbMovie() 
    {
        return imdb;
    }

    public String getPlatformMovie() 
    {
        return platform;
    }

    public boolean getWatchedMovie() 
    {
        return watched;
    }
    
    public int getViewerAgeMovie() 
    {
        return viewerAge;
    }

    public String getClassificationMovie() 
    {
        return classification;
    }
// ---------------------------------------------------------------------------------

// Constructor ---------------------------------------------------------------------
    public Movie(String name, float imdb, String platform, boolean watched, int viewerAge, String classification)
    {
        this.name = name;
        this.imdb = imdb;
        this.platform = platform;
        this.watched = watched;
        this.viewerAge = viewerAge;
        this.classification = classification;
    } 
// ---------------------------------------------------------------------------------
//**Metodos Adicionales**

// Información Completa ------------------------------------------------------------
    public String getInformationMovie()
    {
        String text = " ";
        if (this.watched == true){
            text = this.name + " has a rating of " + this.imdb + " on IMDb and is available on " + this.platform + ". The movie has been watched."; 
        } else if (this.watched == false){
            text = this.name + " has a rating of " + this.imdb + " on IMDb and is available on " + this.platform + ". The movie has not been watched."; 
        } else {
            text = "error";
        }
        
        return text;
    }
// ---------------------------------------------------------------------------------
// Age Classifications ----------------------------------------------------------------
    public String Ageclassification()
    {
        String text = "";
        if (this.classification == "G"){
            text = "All ages admitted.";
        }
        else if (this.classification == "PG"){
            text = "All ages admitted. Parental Guidance Suggested.";
        }
        else if (this.classification == "Parents Strongly Cautioned."){
            if (this.viewerAge >= 13){
                text = "For viewers above 13, no restrictions.";
            }
            else if (this.viewerAge < 13){
                text = "For viewers under 13, parental guidance is strongly cautioned.";
            }
            else {
                text = "Error";
            }
            
        }
        else if (this.classification == "R"){
            if (this.viewerAge >= 17){
                text = "For viewers above 17, no restrictions.";
            }
            else if (this.viewerAge < 17){
                text = "Restricted to viewers over 17 unless accompanied by a parent or adult guardian.";
            }
            else {
                text = "Error";
            }
        }
        else if (this.classification == "NC-17"){
            if (this.viewerAge >= 17){
                text = "For viewers above 17, no restrictions.";
            }
            else if (this.viewerAge < 17){
                text = "No one 17 and under admitted.";
            }
            else {
                text = "Error";
            }
        }
        else
            text = "Error"; 

        return text;
    }
// ---------------------------------------------------------------------------------
}
