package Aula4;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args) {
        
        printMonth(readValue());
    }
    
    static public int [] readValue() {

        Scanner sc = new Scanner(System.in);

        System.out.print("escolha um ano: ");
        int year = sc.nextInt();

        while (year < 0) {
            System.out.println("ano invalido! escolha outro");
            System.out.print("escolha um ano: ");
            year = sc.nextInt();
        }

        System.out.print("escolha um mes: ");
        int month = sc.nextInt();

        while (month<1 || month>12) {
            System.out.println("mes invalido! escolha outro");
            System.out.print("escolha um mes: ");
            month = sc.nextInt();
        }

        System.out.print("escolha dia da semana em que começa esse mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)\ndia: ");
        int fristDW = sc.nextInt();

        while (fristDW<1 || fristDW>7) {
            System.out.println("dia invalido! escolha outro");
            System.out.print("escolha dia da semana em que começa esse mês (1 = Segunda, 2 = Terça, 3 = Quarta, 4 = Quinta, 5 = Sexta, 6 = Sábado, 7 = Domingo)\ndia: ");
            fristDW = sc.nextInt();
        }

        fristDW -= 1;

        sc.close();

        int data [] = {year,month,fristDW};

        return data;
        
    }

    static public int monthDays(int year, int month) {

        Boolean bisexto = (year%4 == 0) || (year%400 == 0);     
        int [] monthsD = {31,28,31,30,31,30,31,31,30,31,30,31};
    
        if (bisexto) {
            monthsD[1] +=1;            
        }

        month -=1;
    
        return monthsD[month];
    }

    static public void printMonth(int [] data) {

        int [][] table = new int[6][7];
        String [] month = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int lastDayMonth = monthDays(data[0], data[1]);
        int n = lastDayMonth-1;        

        for (int col = data[2]; col < table[0].length; col++) {

            table[0][col] = lastDayMonth-n;
            n--;           

        }

        for (int line = 1; line < table.length; line++) {
            
            for (int col = 0; col < table[0].length; col++) {

                if (lastDayMonth-n <= lastDayMonth){

                    table[line][col] = lastDayMonth-n;
                    n--; 

                } else {

                    table[line][col] = 0;

                }                
                
            }
        }

        System.out.println("\n\n       "+month[data[1]-1]);
        System.out.println("MU TU WE TH FR SA SU");

        for (int line = 0; line < table.length; line++) {

            for (int col = 0; col < table[0].length; col++) {

                                
                if (table[line][col] == 0) {

                    System.out.print("   ");
                    
                } else {

                    String day = Integer.toString(table[line][col]);

                    if (day.length() == 1) {

                        System.out.print(" "+table[line][col]+" ");
                        
                    } else {

                        System.out.print(table[line][col]+" ");
                        
                    }                    
                    
                }
            }
            
            System.out.println();
        }
        
    }
    
}
