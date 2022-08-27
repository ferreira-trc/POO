package Aula10;


import java.util.HashMap;
import java.util.Scanner;


public class Ex1 {
    
    public static void main(String[] args) {
        
        HashMap<String,String> dic = new HashMap<>();        
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um termo");
            System.out.print("Termo: ");
            String termo = sc.nextLine();
            System.out.println("Escreva o significado do termo");
            System.out.print("Significado: ");
            String significadoTermo = sc.nextLine(); 
            dic.put(termo, significadoTermo);     
        }     
           
         sc.close();

        for (String string : dic.keySet()) {
            System.out.printf("Termo: %s Significado: %s\n", string, dic.get(string).toString());
        }            
    }    
}        

            
            

       

       

