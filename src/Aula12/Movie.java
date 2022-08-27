package Aula12;

public class Movie {
    
    private String name;
    private double score;
    private String rating;
    private String genre;
    private int runTime;

    public Movie(String name, double score, String rating, String genre, int runTime){
        this.name = name;
        this.score = score;
        this.rating = rating;
        this.genre = genre;
        this.runTime = runTime;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public String getRating() {
        return rating;
    }

    public String getGenre() {
        return genre;
    }

    public int getRuntime() {
        return runTime;
    }

    public String toString() {
        String movie = String.format(" Name: %5s\tScore: %.2f\tRating: %s\tGenero: %s\tTempo: %d\n", name, score, rating, genre, runTime);
        return movie;
    }

  
}
