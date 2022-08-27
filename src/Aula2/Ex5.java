package Aula2;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("velocidade media do 1º percurso: ");
        double v1 = sc.nextDouble();

        System.out.print("distancia media do 1º percurso: ");
        double d1 = sc.nextDouble();

        System.out.print("velocidade media do 2º percurso: ");
        double v2 = sc.nextDouble();

        System.out.print("distancia media do 2º percurso: ");
        double d2 = sc.nextDouble();

        sc.close();

        System.out.println();

        double media = (d1*v1 + d2*v2)/(d1+d2);

        System.out.printf("A media da velocidade foi: %.2f KM/H",media);


    }
    
}
