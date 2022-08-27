package Aula2;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o tamanho dos catetos do triangulo");
        System.out.print("c1:");
        double c1 = sc.nextDouble();
        System.out.print("c2:");
        double c2 = sc.nextDouble();

        sc.close();

        double h = Math.sqrt(Math.pow(c1, 2)+Math.pow(c2, 2));

        System.out.printf("A hipotenusa é: %.3f", h);
    }
    
}
