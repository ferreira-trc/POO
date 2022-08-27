package Aula4;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        sc.close();

        System.out.println("quantidade de numeros na frase: " + countDigit(text));
        System.out.println("quantidade de espaços na frase: " + countSpace(text));

        String resp1 = "";

        if (isLower(text)) {
            
            resp1 = "Sim";

        } else {

            resp1 = "Nao";
            
        }

        System.out.println("a frase so contem letras minusculas: "+ resp1);

        System.out.println(spaceUniform(text));

        String resp2 = "";
        String newText = spaceUniform(text);

        if (isPalindromo(newText)) {
            
            resp2 = "Sim";

        } else {

            resp2 = "Nao";
            
        }

        System.out.println("a frase é um Palindromo: "+ resp2);

    }

    static public int countDigit (String text){

        int count = 0;                

        for (int index = 0; index < text.length(); index++) {                     

            if (Character.isDigit(text.charAt(index))) {
                count++;
            }
                
                    
        }

        return count;
    }
    
    static public int countSpace (String text){
        
        int count = 0;                

        for (int index = 0; index < text.length(); index++) {                     

            if (Character.isSpaceChar(text.charAt(index))) {
                count++;
            }
                
        }

        return count;
    }

    static public boolean isLower (String text){

        int count = 0;

        for (int index = 0; index < text.length(); index++) {

            char c = text.charAt(index);

            if (Character.isLowerCase(c)) {
                count++;
            }            
        }

        if (count == text.length()) {
            
            return true;

        } else {

            return false;
            
        }
    }

    static public String spaceUniform (String text){
                
        while (text.contains("  ")) {
            
            text = text.replaceAll("  "," ");

        }        

        return text;
    }

    static public boolean isPalindromo (String text){

        char [] t = text.toCharArray();
        boolean conf = false;

        if (t.length%2 == 0) {

            for (int index = 0; index < t.length/2; index++) {

                conf = (t[index]==t[t.length -(1+index)]);  

            }

            return conf;
            
        } else {

            int newLength = (t.length-1)/2;
             
            for (int index = 0; index <= newLength; index++) {

                conf = (t[index]==t[t.length -(1+index)]);
                
            }

            return conf;
        }
        
    }

}

