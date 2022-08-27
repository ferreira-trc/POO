package MiniTeste;

public class Ticket implements Comparable<Ticket> {

    private DateYMD beginningDate;
    private DateYMD finalDate;
    private String name;
    private String local;
    
    public Ticket( DateYMD beginningDate, DateYMD finalDate, String name, String local){
        this.beginningDate = beginningDate;
        this.finalDate = finalDate;
        this.name = name;
        this.local = local;
    }

    public DateYMD getBeginningDate() {
        return beginningDate;
    }

    public DateYMD getFinalDate() {
        return finalDate;
    }

    public String getName() {
        return name;
    }

    public String getLocal() {
        return local;
    }

    public String toString() {
        String s = String.format("%s %d", name, finalDate.getYear());
        return s;
    }

    public int compareTo (Ticket t){
        return beginningDate.compareTo(t.beginningDate);
    }

    public boolean equals(Object o) {
        if (o.getClass() == Ticket.class) {
            return true;
        } else {
            return false;
        }
    }

}
