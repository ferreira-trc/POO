package Aula2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("KM:");

        double km = sc.nextDouble();

        sc.close();

        double mi = km/1.609;

        System.out.printf("%.2f km correspodem a %.2f milhas", km,mi);
        
    }
    
}
