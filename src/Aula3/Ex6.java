package Aula3;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String data = "";

        System.out.println("escreva uma data do tipo mm/aaaa");
        System.out.print("Data: ");
        data = sc.nextLine();

        int mes = Integer.parseInt(data.substring(0,2));
        int ano = Integer.parseInt(data.substring(3,7 ));


        Boolean cond = (mes<1 || mes>12) && ano > 0;

        while (cond) {

        System.out.println("escreva uma data do tipo mm/aaaa");
        System.out.print("Data: ");
        data = sc.nextLine();

        mes = Integer.parseInt(data.substring(0,1));
        ano = Integer.parseInt(data.substring(3,7 ));
            
        }

        sc.close();

        Boolean bisexto = (ano%4 == 0) || (ano%400 == 0);

        int [] diasDosMeses = {31,28,31,30,31,30,31,31,30,31,30,31};
        String [] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};

        if (bisexto) {
            diasDosMeses[1] +=1;            
        }

        mes -=1;

        System.out.printf("O mês %s tem %d dias",meses[mes],diasDosMeses[mes]);

    }
    
}
