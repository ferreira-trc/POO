package Aula5;


public class Calendar {

    private int firstWeekdayOfYear;
    private int year;    

    public Calendar(int firstWeekdayOfYear, int year) {        
        this.firstWeekdayOfYear = firstWeekdayOfYear;
        this.year = year;
    }

    public int getFirstWeekdayOfYear() {
        return firstWeekdayOfYear;        
    }

    public int getYear() {
        return year;        
    }

    public String firstWeekdayOfMonth(int month) {

        int sumD = 0;
        String [] dayOfTheWeek = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};

        if (month == 1) {

            return dayOfTheWeek[firstWeekdayOfYear-1];
            
        } else {

           for (int index = 1; index < month; index++) {            
                sumD += Date.monthDays(year, index);
            } 

            int aux =sumD%7;
            int idx = (firstWeekdayOfYear-1+aux)%7;

            return dayOfTheWeek[idx];
        }
        
        
        
    }

    private String month(int month) {

        Date data = new Date(1, month, year);
        int [][] table = new int[6][7];
        String [] months = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        String [] dayOfTheWeek = {"Segunda","Terça","Quarta","Quinta","Sexta","Sabado","Domingo"};
        int lastDayMonth = Date.monthDays(year,month);
        int fristDW = -1;

        for (int index = 0; index < dayOfTheWeek.length; index++) {
            
            boolean conf = firstWeekdayOfMonth(month).equalsIgnoreCase(dayOfTheWeek[index]);

            if (conf) {
                fristDW = index;              
            } 

        }               

        for (int col = fristDW ; col < table[0].length; col++) {

            table[0][col] = data.getDay();
            data.incrementDate();           

        }

        for (int line = 1; line < table.length; line++) {
            
            for (int col = 0; col < table[0].length; col++) {

                if (data.getDay() <= lastDayMonth){

                    table[line][col] = data.getDay();
                    data.incrementDate(); 

                } else {

                    table[line][col] = 0;

                }                
                
            }
        }

        String monthTitle = "\n\n       "+months[month-1]+"\n";
        String daysTitle = "MU TU WE TH FR SA SU\n";
        String calendarM = monthTitle+daysTitle;                

        for (int line = 0; line < table.length; line++) {

            for (int col = 0; col < table[0].length; col++) {

                                
                if (table[line][col] == 0) {

                    calendarM+="   ";
                                        
                } else {

                    String day = Integer.toString(table[line][col]);

                    if (day.length() == 1) {

                        calendarM+=" "+day+" ";
                        
                    } else {

                        calendarM+=day+" ";
                        
                    }                    
                    
                }
            }
            
            calendarM+="\n";
        }

        return calendarM;
        
    }

    public void printMonth(int month) {
        System.out.print(month(month));
    }
    
    public String toString() {

        String calendar = "";

        for (int month = 1; month <= 12; month++) {
            calendar+= month(month);
        }

        return calendar;
    }

}
    





    

