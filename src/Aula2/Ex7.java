package Aula2;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("escreva as coordenadas do Ponto 1:");
        System.out.print("x1:");
        double x1 = sc.nextDouble();
        System.out.println();
        System.out.print("y1:");
        double y1 = sc.nextDouble();

        System.out.println("escreva as coordenadas do Ponto 2:");
        System.out.print("x2:");
        double x2 = sc.nextDouble();
        System.out.println();
        System.out.print("y2:");
        double y2 = sc.nextDouble();

        sc.close();

        double d = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));

        System.out.printf("A distancia entre o Ponto 1 e o Ponto 2 é %.2f unidades", d);
    }
    
}
