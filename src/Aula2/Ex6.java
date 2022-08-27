package Aula2;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Tempo em segundos:");
        int sec = sc.nextInt();

        sc.close();

        int h = sec/3600;

        sec %=3600;

        int min = sec/60;

        sec %=60;          

        System.out.printf("%2dh%2dm%2ds",h,min,sec);
    }
    
}
