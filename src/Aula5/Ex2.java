package Aula5;
import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("inicialize o seu 1º calendario");
        System.out.println("Escolha o 1º dia do ano e o ano.");
        System.out.print("escolha dia da semana em que começa o ano (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)\ndia: ");
        int  fristDY = sc.nextInt();                    
        System.out.print("Ano: ");
        int year = sc.nextInt();
            
        boolean cond = fristDY<1 || fristDY>7;        
            
        while (cond == true ) {
                        
        System.out.println("Dados Invalida!");
        System.out.println("Escolha uma data");
        System.out.print("Dia: ");
        fristDY = sc.nextInt();                        
        System.out.print("Ano: ");
        year = sc.nextInt();
                                
        }

        Calendar calendar = new Calendar(fristDY, year);           
        boolean exit = true;


        
        while (exit) {            

            System.out.print("Calendar operations:\n1 - create new calendar\n2 - print calendar month\n3 - print calendar\n0 - exit\n");
            
            System.out.print("Opção: ");        
            int key = sc.nextInt();
            boolean c = key != 1 && key != 2 && key != 3 && key != 4 && key != 0;

            while(c){

                System.out.println("Só pode escolher uma das opções do menu");
                System.out.print("Opção: ");
                key = sc.nextInt();

            }

            switch (key) {
                case 1:
                    System.out.println("Escolha o 1º dia do ano e o ano.");
                    System.out.print("escolha dia da semana em que começa o ano (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)\ndia: ");
                    fristDY = sc.nextInt();                    
                    System.out.print("Ano: ");
                    year = sc.nextInt();
            
                    cond = fristDY<1 || fristDY>7;        
            
                    while (cond == true ) {
                        
                        System.out.println("Dados Invalida!");
                        System.out.println("Escolha uma data");
                        System.out.print("Dia: ");
                        fristDY = sc.nextInt();                        
                        System.out.print("Ano: ");
                        year = sc.nextInt();
                                
                    }

                    calendar = new Calendar(fristDY, year);
                    break;                    
                    
                case 2:
                    System.out.print("Escolha um mes!\nMes: ");
                    int month = sc.nextInt();
                    
                    while (Date.validMonth(month) == false) {

                        System.out.print("Escolha um mes!\nMes: ");
                        month = sc.nextInt();
                        
                    }

                    calendar.printMonth(month);  
                    break;           
                                  
                case 3:
                    String calendarYaer = calendar.toString();
                    System.out.print(calendarYaer);
                    break;    

                                     
                    
                case 0:
                    System.out.print("progrma fechado");    
                    exit = false;
                    break;    
    
            }
            
                               
        }
        
        sc.close();    
    }
    
}
