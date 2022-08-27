package Aula7.Ex2;

public class DateYMD extends Date{

        
    public DateYMD(int day, int month, int year){

        super(day, month, year);
        assert(day>=1 && day<=31):"dia Invalido";
        assert(DateYMD.validMonth(month)):"Mes invalido";
        assert(year>0):" ano invalido";
    }   
   

    public DateYMD setData(int day, int month, int year) {

        DateYMD d;

        if (DateYMD.validData(day, month, year)) {

            d = new DateYMD(day, month, year);

            return d;

        } else {

            return null;
            
        }       
        
    } 

    public DateYMD incrementDate() {

        int d = day++;        
        int m = month;
        int y = year;
        DateYMD data;

        if (DateYMD.validData(d,m,y)){
                        
            data = new DateYMD(d,m ,y );

        } else {

            boolean cond = d > DateYMD.monthDays(y,m);
            boolean cond1 = m == 12;

            if (cond){

                d = 1;
                m++;

                } if (cond1){

                    m = 1;
                    y++;

                }

            data = new DateYMD(d,m ,y );
                        
        }

        return data;
        
    }

    public DateYMD decrementDate() {

        int d = day--;
        int m = month;
        int y = year;
        DateYMD data;

        if (DateYMD.validData(d,m,y)){
                        
            data = new DateYMD(d,m ,y );

        } else {

            boolean cond = d < 1; 
            boolean cond1 = m == 1;

            if (cond1){
                m = 12;                
                d = 31;
                y--;                

            } if (cond && cond1 == false){    
                m--;
                d = DateYMD.monthDays(y, m);           

            }

            data = new DateYMD(d,m ,y );
                        
        }

        return data;
    }
    
}