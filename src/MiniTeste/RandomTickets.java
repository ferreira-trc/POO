package MiniTeste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class RandomTickets {
    
    private HashMap<Ticket,Integer> mapT;
    private HashMap<Person,ArrayList<Ticket>> mapP;
    private ArrayList<String> festivais;
    

    public RandomTickets () throws FileNotFoundException{
        
        File file = new File("Lista_festivais.txt");
        Scanner scFile = new Scanner(file);
        mapP = new HashMap<>();
        mapT = new HashMap<>();
        festivais = new ArrayList<>();
        

        scFile.nextLine();

        while (scFile.hasNextLine()) {
            String[] s = scFile.nextLine().split("\t");

            DateYMD beginningDate = new DateYMD(s[0]);
            DateYMD finalDate = new DateYMD(s[1]);
            String name = s[2];
            String local = s[3];
            int value = Integer.valueOf(s[4]);  
            
            festivais.add(name);
            mapT.put(new Ticket(beginningDate, finalDate, name, local) , value);

        }        

        scFile.close();        
        
    }

    public HashMap<Ticket,Integer> getMap() {
        return mapT;
    }

    public void getRandomTicket(Person person) {

        double d =  Math.random();
        int luky = (int) d*mapT.size();
        
        ArrayList<Ticket> tpp = new ArrayList<>();
        String key = festivais.get(luky);
        Ticket t = null;
        System.out.println(d + " "+ mapT.size()+ " " + d*mapT.size() + " " + (int) d*mapT.size() +" " + luky +" "+ key);


        for (Map.Entry<Ticket,Integer> entry : mapT.entrySet() ) {
            if (key.equalsIgnoreCase(entry.getKey().getName())) {
                t = entry.getKey();
                break;
            }
        }

        int numT = mapT.get(t);
        boolean cond1 = numT>0;
        boolean cond2 = luky%2==0;

        if (cond1) {
            tpp.add(t);
            mapT.replace(t, mapT.get(t)-1);

            if (cond2) {
                if (cond1) {
                    tpp.add(t); 
                    mapT.replace(t, mapT.get(t)-1);

                    mapP.put(person, tpp);
                }           
            
            } else {
            mapP.put(person, tpp );            
            }
            
        }

    }

    public void listPersons() {

        for (Map.Entry<Person,ArrayList<Ticket>> entry : mapP.entrySet() ) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }

    public void listAvailableTickets() {

        for (Map.Entry<Ticket,Integer> entry : mapT.entrySet() ) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
        
    }
}
