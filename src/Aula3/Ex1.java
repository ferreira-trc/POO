package Aula3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escreva as notas da P e da TP");

        System.out.print("Nota da P: ");
        double notaP = sc.nextDouble();

        while (notaP < 0 || notaP > 20) {

            System.out.println("Escreva uma nota entre 0 a 20");
            System.out.print("Nota da P: ");
            notaP = sc.nextDouble();
            
        }

        System.out.print("Nota da TP: ");
        double notaTP = sc.nextDouble();

        while (notaTP < 0 || notaTP > 20) {

            System.out.println("Escreva uma nota entre 0 a 20");
            System.out.print("Nota da TP: ");
            notaTP = sc.nextDouble();
            
        }

        sc.close();

        if (notaP < 7 || notaTP < 7) {

            System.out.print("66 - reprovado");
            
        } else {

            double notaFinal = 0.4*notaTP + 0.6*notaP;

            BigDecimal bg = new BigDecimal(notaFinal).setScale(2, RoundingMode.HALF_UP);

            System.out.println("nota final:"+ bg.doubleValue());
            
        }
    }
    
}
