package Aula4;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduza uma frase: ");

        String text = sc.nextLine();

        sc.close();

        System.out.println("\nAcrónimo: " + convertToAcronym(text));
        
    }

    static public String convertToAcronym( String text) {

        String [] frase = text.split(" ");
        String acronym = "";

        for (int index = 0; index < frase.length; index++) {
            
            if (frase[index].length() > 3) {

                frase[index] = frase[index].substring(0,1);
                
            } else {

                frase[index] = "";
                
            }

            acronym += frase[index];

        }

        acronym = acronym.toUpperCase();

        return acronym;
        
    }
    
}
