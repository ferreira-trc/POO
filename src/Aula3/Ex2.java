package Aula3;

import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("escolha um numero: ");
        int n = sc.nextInt();

        sc.close();

        for (int index = 0; index <= n; index++) {
            System.out.println(n-index);
            
        }
    }
    
}
