package Aula3;

import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva um numero inteiro para verificar se é primo");
        System.out.print("numero:");
        int n = sc.nextInt();

        while (n < 0) {
            System.out.println("o numero tem de ser positivo!");
            System.out.print("numero:");
            n = sc.nextInt();          
        }

        sc.close();

        int rest = -1;

        for (int index = 2; index < n-1 ; index++) {
            rest = n % index;              
        }

        if (rest == 0) {
            System.out.println(n+" não é primo");
            
        } else {
            System.out.println(n+" é primo");            
        }
    }
    
}
