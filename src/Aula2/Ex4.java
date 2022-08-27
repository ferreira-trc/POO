package Aula2;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Investimento inicial: ");
        double c0 = sc.nextDouble();

        System.out.print("Taxa de Juro Mensal em %: ");
        double tj = sc.nextDouble();

        sc.close();

        double cF = c0 * Math.pow(1+(tj/100) , 3);

        System.out.printf("capital final: %.3f ",cF);


    }
    
}
