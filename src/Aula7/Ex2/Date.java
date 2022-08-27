package Aula7.Ex2;

public abstract class Date {
    
    protected int day;
    protected int month;
    protected int year;

    public Date(int day, int month, int year) {
        this.day=day;
        assert(day>=1 && day<=31):"dia Invalido";

        this.month=month;
        assert(DateYMD.validMonth(month)):"Mes invalido";

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

        boolean leapYear = DateYMD.isLeapYear(year);     
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

    public abstract Date setData(int day, int month, int year);

    public abstract Date incrementDate();

    public abstract Date decrementDate();

    static public int difDate(Date diaInicial, Date diaFinal) {
        
        int difYear = (diaFinal.getYear()-diaInicial.getYear())*365;
        int difMonth = monthDays(diaFinal.getYear(), diaFinal.getMonth())-monthDays(diaInicial.getYear(), diaInicial.getMonth());
        int difDay = diaFinal.getDay()-diaInicial.getDay();

        return difYear+difMonth+difDay;        
    }

    
}
