package Aula11.Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        File voosFile = new File("voos.txt");
        File companhiasFile = new File("companhias.txt");
        Hashtable<String,String> companhias = new Hashtable<>();
        Scanner reader;

        try {

            reader = new Scanner(companhiasFile);
            reader.nextLine();

            while (reader.hasNextLine()) {

                String[] line = reader.nextLine().split("\t");
                companhias.put(line[0], line[1]);
            }

            reader = new Scanner(voosFile);

            


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        


        
    }
    
}
