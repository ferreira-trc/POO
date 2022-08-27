package Aula3;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int c0 = 0;
        float tJ = 0;

        System.out.print("\nEscolha o valor que pretende investir multiplo de 1000\n Escolha uma taxa de juro entre 0% e 5%\n\n ");

        
        System.out.print("Montante a investir: ");
        c0 = sc.nextInt();
            
        while (c0 % 1000 != 0){
            System.out.println("O montante tem de ser multiplo de 1000! por exemplo 2000 ou 10000");
            System.out.print("\nMontante a investir: ");
            c0 = sc.nextInt(); 
            } 
        
        System.out.print("\nTaxa de juro: ");
        tJ = sc.nextFloat();
                
        while (tJ < 0 || tJ > 5){
            System.out.println("A taxa de juro tem de estar entre 0% e 5%");
            System.out.print("Taxa de juro: ");
            c0 = sc.nextInt(); 
            }

        sc.close();
            
        double capital [] = new double[13];
        capital[0] = c0;

        for (int mes = 0; mes < capital.length-1; mes++) {

            capital[mes+1] =  capital[mes]*(1+tJ/100);
            System.out.printf("mes_%d: %.2f\n",mes+1,capital[mes+1]);
                
            }
            
    }
    
}
