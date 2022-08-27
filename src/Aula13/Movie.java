package Aula13;

public class Movie implements Comparable<Movie> {
    
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
        String movie = String.format(" Filme: %s\nAvaliação: %f\tGenero: %s\tTempo: %d\n", name, score, genre, runTime);
        return movie;
    }

    public boolean equals(Object o) {
        
        if (o.getClass() == Movie.class) {
            return true;
        } else {
            return false;
        }          
        
    }

    public int compareTo(Movie m) {
        return name.compareToIgnoreCase(m.name);
    }
}
