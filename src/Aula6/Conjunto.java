package Aula6;

import java.util.Arrays;



public class Conjunto {
    
    private int [] conjunto ;
    
        

    public Conjunto(){
        conjunto = new int [0];
               
    }

    public int get(int index) {
       return conjunto[index]; 
    }

    public void insert(int n) {

        if (contains(n) == false) {

            int size = conjunto.length;        
            int [] newCoj = Arrays.copyOf(conjunto,++size);
            newCoj[size-1] = n;
            conjunto=newCoj;

        }
    }

    public boolean contains(int n) {
        
        boolean conf = false;

        for (int index = 0; index < conjunto.length; index++) {
            
            if (conjunto[index]==n) {
                conf = true;
            }

        }

        return conf;
    }

    public void remove(int n) {

        int size = conjunto.length;
        int [] newCoj = Arrays.copyOf(conjunto, --size);
        int removIdx = findIndex(conjunto, n);

        if (removIdx != -1) {

           for (int index = 0; index < removIdx; index++) {
                newCoj[index] = conjunto[index];
            }

            for (int index = removIdx; index < size; index++) {
                newCoj[index] = conjunto[index+1];
            } 

        }
           
        conjunto=newCoj;
   
        
    }

    private int findIndex(int [] conjunto, int target) {
        
        for (int index = 0; index < conjunto.length; index++) {
            
            if (conjunto[index]==target) {
                return index;
            } 
        }

        return -1;
    }

    public void empty() {        
        conjunto = new int [0];
        
    }

    public String toString() {
        
        String conj ="";

        for (int index = 0; index < conjunto.length; index++) {

            conj += Integer.toString(conjunto[index])+" "; 
            
        }

        return conj;
    }

    public int size() {
        return conjunto.length;
    }

    public Conjunto combine(Conjunto add) {

        Conjunto newCoj = new Conjunto();
        
        for (int index = 0; index < conjunto.length; index++) {            
            newCoj.insert(conjunto[index]);
        }

        for (int index = 0; index < add.size(); index++) {            

            boolean cond = contains(add.get(index));

            if (cond == false) {
                newCoj.insert(add.get(index)); 
            }   
        }

        return newCoj;
    }

    public Conjunto subtract(Conjunto dif) {
        
        Conjunto newCoj = new Conjunto();

        for (int index = 0; index < conjunto.length; index++) { 
            
            boolean cond = dif.contains(conjunto[index]);

            if (cond == false) {
                newCoj.insert(conjunto[index]); 
            }
            
        }

        return newCoj;

    }

    public Conjunto interset(Conjunto inter) {
        
        Conjunto newCoj = new Conjunto();

        for (int index = 0; index < conjunto.length; index++) { 
            
            boolean cond = inter.contains(conjunto[index]);

            if (cond) {
                newCoj.insert(conjunto[index]); 
            }
            
        }

        return newCoj;
    }

}
