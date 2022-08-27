package Aula7.Ex2;

public class DateND extends Date {
    
    private static final Date diaInicial = new DateYMD(1,1,2000);
    private int nDias;

    public DateND(int day, int month, int year){
        super(day, month, year);
        nDias = difDate(diaInicial, new DateND(day, month, year));         
    }

    public Date setData(int day, int month, int year) {

        Date d;

        if (Date.validData(day, month, year)) {

            d = new DateYMD(day, month, year);

            return d;

        } else {

            return null;
            
        }       
        
    } 

    public Date incrementDate(){
        return diaInicial.incrementDate();
    }

    public Date decrementDate() {
        return diaInicial.decrementDate();
    }    

    public int getNDay(){
        return nDias;       
    } 

    



}
