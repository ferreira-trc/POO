package Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex2 {

    public static void main(String[] args) throws FileNotFoundException {
        
        File file = new File("movies.txt");
        Scanner scFile = new Scanner(file);
        TreeSet<Movie> colMovies = new TreeSet<>();
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



        //colMovies.sort((a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        System.out.println(colMovies);

        //printgenre(colMovies);
        
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
    
}
