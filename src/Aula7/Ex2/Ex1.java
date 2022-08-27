package Aula7.Ex2;
import java.util.Scanner;


public class Ex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Date data = new DateYMD(1,1,1);                
        boolean exit = true;


        
        while (exit) {            

            System.out.print("Date operations:\n1 - create new date\n2 - show current date\n3 - increment date\n4 - decrement date\n0 - exit\n");
            
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
                    System.out.println("Escolha uma data");
                    System.out.print("Dia: ");
                    int  day = sc.nextInt();
                    System.out.print("Mes: ");
                    int month = sc.nextInt();
                    System.out.print("Ano: ");
                    int year = sc.nextInt();
            
                    boolean cond = Date.validData(day, month, year);        
            
                    while (cond == false ) {
                        
                        System.out.print("Data Invalida\n");
                        System.out.println("Escolha uma data");
                        System.out.print("Dia: ");
                        day = sc.nextInt();
                        System.out.print("Mes: ");
                        month = sc.nextInt();
                        System.out.print("Ano: ");
                        year = sc.nextInt();
                                
                    }

                    data.setData(day, month, year);
                    break;                    
                    
                case 2:                    
                    String arg = data.toString();
                    System.out.println(arg+"\n");   
                    break;           
                                  
                case 3:
                    data = data.incrementDate();
                    break;    

                case 4:
                    data = data.decrementDate();
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
            
            
        
       
        
   

    

