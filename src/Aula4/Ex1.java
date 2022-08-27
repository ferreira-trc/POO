package Aula4;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva uma frase\n");

        String texto = sc.nextLine();

        sc.close();

        String textoLower = texto.toLowerCase();
        System.out.println("\n"+textoLower);

        char ultimoChar = texto.charAt(texto.length()-1);
        System.out.printf("\nultimo caracter: %c\n", ultimoChar);

        String p3c = texto.substring(0,3);
        System.out.printf("\n 1º's 3 caracter: %s", p3c);






    }
    
}
