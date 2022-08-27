package Aula2;
import java.util.Scanner;

public class Ex2 {
    
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        System.out.print("Cº:");

        double c = sc.nextDouble();

        sc.close();

        double f = 1.8*c + 32;

        System.out.printf("%0.2f Cº corespondem a %0.2f", c,f);


    }
    
}
