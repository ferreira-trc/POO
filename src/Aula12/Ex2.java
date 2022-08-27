package Aula12;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex2 {

    public static void main(String[] args) throws IOException {
        
        File file = new File("movies.txt");
        Scanner scFile = new Scanner(file);
        ArrayList<Movie> colMovies = new ArrayList<>();
        scFile.nextLine();       

        while (scFile.hasNextLine()) {
            String line = scFile.nextLine();
            String [] s = line.split("\t");            

            String name = s[0];
            double score = Double.valueOf(s[1]);
            String rating = s[2];
            String genre = s[3];
            int runTime = Integer.valueOf(s[4]);
            
            colMovies.add(new Movie(name, score, rating, genre, runTime));
            
        }

        scFile.close();


        //b)
        colMovies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));
        System.out.println(colMovies);
        //c)
         //1)
        printScoreDesc(colMovies);
         //2)
        printRunTimeCres(colMovies);
        //d)
        printgenre(colMovies);
        //e)
        printSelection(colMovies);
        
    }

    public static void printScoreDesc(ArrayList<Movie> colMovies) {
        colMovies.sort((a, b) -> Double.compare(a.getScore(),b.getScore()));

        for (int index = 0; index < colMovies.size(); index++) {
            System.out.println(colMovies.get(colMovies.size()-1-index));
        }

        System.out.println();
    }

    public static void printRunTimeCres(ArrayList<Movie> colMovies) {
        colMovies.sort((a, b) -> Integer.compare(a.getRuntime(),b.getRuntime()));

        for (int index = 0; index < colMovies.size(); index++) {
            System.out.println(colMovies.get(index));
        }

        System.out.println();
    }
        
    public static void printgenre(ArrayList<Movie> colMovies) {
        TreeSet<String> t = new TreeSet<>();

        for (Movie m : colMovies) {
            t.add(m.getGenre());
        }

        for (String string : t) {
            System.out.println(string);
        }
    }

    public static void printSelection(ArrayList<Movie> colMovies) throws IOException {
        String nameFile = "myselection.txt";
        File file = new File(nameFile);
        FileWriter writer = new FileWriter(file);
            
        for (Movie movie : colMovies) {
            boolean cond = movie.getScore()>60 && movie.getGenre().equalsIgnoreCase("comedy");

            if (cond) {
                writer.write(movie.toString());
            }            
        }

        writer.close();     
       
    }

    
}
