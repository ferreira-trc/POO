package Aula2;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de agua em Kg:");
        double kgAgua = sc.nextDouble();

        System.out.print("Temperatura inicial da agua em Cº:");
        double tIAgua = sc.nextDouble();

        System.out.print("Temperatura final da agua em Cº:");
        double tFAgua = sc.nextDouble();

        sc.close();

        double q = kgAgua*(tFAgua-tIAgua)*4184;

        System.out.printf(" a energia necessária para aquecer a agua é %.2f Q", q);

    }
    
}
