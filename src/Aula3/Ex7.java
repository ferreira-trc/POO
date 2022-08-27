package Aula3;

import java.util.Random;
import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);

        int numeroDaSorte = gerador.nextInt(101);
        int contador = 1;

        System.out.println("Escolha um numero entre 0 a 100");
        System.out.print("numero: ");        
        int tentativa = sc.nextInt(); 

        while (tentativa != numeroDaSorte) {

            if (tentativa < numeroDaSorte) {

                System.out.printf("%dª tentativa\n\n",contador);
                System.out.println("Demasiado baixo");
                System.out.print("pretende continuar?\n [s]- sim\n carregue noutra tecla para sair\n");
                String resp = sc.next();            

                boolean cond = (resp.equalsIgnoreCase("s") || resp.equalsIgnoreCase("sim"));

                if (cond) {

                    System.out.print("numero: ");
                    tentativa = sc.nextInt();
                    contador++;

                } else {

                    System.out.print("obrigado por jogar!");
                    sc.close();
                    break;                    
                }
                
            } else {

                System.out.println("Demasiado alto");
                System.out.printf("%dª tentativa\n\n",contador);
                System.out.println("Demasiado baixo");
                System.out.print("pretende continuar?\n [s]- sim\n carregue noutra tecla para sair");
                String resp = sc.next();
                resp.toUpperCase();

                boolean cond = resp == "S" || resp == "SIM";

                if (cond) {

                    System.out.print("numero: ");
                    tentativa = sc.nextInt();
                    contador++;
                    
                } else {
                    System.out.print("obrigado por jogar!");
                    sc.close();
                    break;
                }
            }
            
        }

        sc.close();

        if (tentativa == numeroDaSorte) {
            
            System.out.print("acertou!");
        }
        

                
        
    }
}
