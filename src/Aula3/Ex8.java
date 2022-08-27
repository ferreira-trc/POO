package Aula3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double [][] tabela = new double[16][3];
        
        System.out.println("Escreva as notas da P e da TP");                

        for (int linha = 0; linha < tabela.length; linha++) {

            System.out.println("Aluno["+linha+"]");
            System.out.print("Nota da P: ");
            double notaP = sc.nextDouble();


            while (notaP < 0 || notaP > 20) {

                System.out.println("Escreva uma nota entre 0 a 20");
                System.out.print("Nota da P: ");
                notaP = sc.nextDouble();
                tabela[linha][0] = notaP;
                
            }
    
            System.out.print("Nota da TP: ");
            double notaTP = sc.nextDouble();
    
            while (notaTP < 0 || notaTP > 20) {
    
                System.out.println("Escreva uma nota entre 0 a 20");
                System.out.print("Nota da TP: ");
                notaTP = sc.nextDouble();
                tabela[linha][1] = notaTP;
                
            }
    
            sc.close();
    
            if (notaP < 7 || notaTP < 7) {
    
                tabela[linha][2] = 66;
                
            } else {
    
                double notaFinal = 0.4*notaTP + 0.6*notaP;    
                BigDecimal bg = new BigDecimal(notaFinal).setScale(2, RoundingMode.HALF_UP);
                tabela[linha][2] = bg.doubleValue();  
                   
            }

            System.out.print("NotaT NotaP Pauta\n");

            for (int lin = 0; lin < tabela.length; lin++) {
               for (int coluna = 0; coluna < tabela[lin].length; coluna++) {
                   
                System.out.print(tabela[lin][coluna]+" ");

               } 
               System.out.println();
            }
            
        }

        
    }
}
