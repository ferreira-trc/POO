package Aula5;

public class Date{

    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){

        this.day=day;
        assert(day>=1 && day<=31):"dia Invalido";

        this.month=month;
        assert(Date.validMonth(month)):"Mes invalido";

        this.year=year;
        assert(year>0):" ano invalido";
    }

    public int getDay() {
        return day;        
    }

    public int getMonth() {
        return month;        
    }

    public int getYear() {
        return year;        
    }

    
   
    static public boolean validMonth(int month) {

        boolean vMonth = month>=1 && month<=12;

        return vMonth;       
    }

    static public boolean isLeapYear(int year) {
        
        Boolean leapYear = (year%4 == 0) || (year%400 == 0);

        return leapYear;
    }

    static public int monthDays(int year, int month) {

        boolean leapYear = Date.isLeapYear(year);     
        int [] monthsD = {31,28,31,30,31,30,31,31,30,31,30,31};
    
        if (leapYear) {
            monthsD[1] +=1;            
        }

        month -=1;
    
        return monthsD[month];
    }

    static public boolean validData(int day, int month, int year) {
        
        boolean validYear = year>0;
        boolean vMonth = validMonth(month);
        boolean validDay = day>=1 && day<=monthDays(year, month);

        boolean valid = validDay && vMonth && validYear;

        return valid;        
    }

    public Date setData(int day, int month, int year) {

        Date d;

        if (Date.validData(day, month, year)) {

            d = new Date(day, month, year);

            return d;

        } else {

            return null;
            
        }       
        
    }  

    public String toString() {

        String yS = Integer.toString(year);
        String mS = Integer.toString(month);
        String dS = Integer.toString(day);

        if (dS.length() == 1) {
            dS = "0"+dS;            
        }

        if (mS.length() == 1) {
            mS = "0"+mS;
        }
        String dataS = yS +"/"+ mS +"/"+dS;

        return dataS;        
    }

    public Date incrementDate() {

        int d = day++;        
        int m = month;
        int y = year;
        Date data;

        if (Date.validData(d,m,y)){
                        
            data = new Date(d,m ,y );

        } else {

            boolean cond = d > Date.monthDays(y,m);
            boolean cond1 = m == 12;

            if (cond){

                d = 1;
                m++;

                } if (cond1){

                    m = 1;
                    y++;

                }

            data = new Date(d,m ,y );
                        
        }

        return data;
        
    }

    public Date decrementDate() {

        int d = day--;
        int m = month;
        int y = year;
        Date data;

        if (Date.validData(d,m,y)){
                        
            data = new Date(d,m ,y );

        } else {

            boolean cond = d < 1; 
            boolean cond1 = m == 1;

            if (cond1){
                m = 12;                
                d = 31;
                y--;                

            } if (cond && cond1 == false){    
                m--;
                d = Date.monthDays(y, m);           

            }

            data = new Date(d,m ,y );
                        
        }

        return data;
    }

    


}