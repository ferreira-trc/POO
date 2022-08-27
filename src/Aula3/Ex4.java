package Aula3;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("escreva a quantidade de valores que vai introduzir\no 1º valor vai ser igual ao ultimo");
        System.out.print("quantidade: ");
        int size = sc.nextInt();
        System.out.println();
        
        double conj [] = new double[size];
        
        for (int index = 0; index < conj.length -1; index++) {
            System.out.print("numero_" + index + ": ");
            conj[index] = sc.nextDouble();            
        }
        
        sc.close();

        conj[size-1] = conj[0];

        double soma = 0;
        double max = 0;
        double min = 0;
        
        for (int index = 0; index < conj.length; index++) {
            System.out.print(conj[index]+ "-> "); 

            soma +=conj[index];

            if(conj[index] > max){
                max = conj[index];
            }

            if(conj[index]< min){
                min = conj[index];
            }
                    
        }

        double media = soma/size;

        System.out.printf("numero de leituras: %d \n media: %.2f \n max: %.2f  \n min: %.2f", size,media,max,min);


    }
    
}
