package Aula10;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex2 {
    
    public static void main(String[] args) {
        
        TreeMap<String,ArrayList<String>> dic = new TreeMap<>();
        ArrayList<String> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Escreva um termo");
            System.out.print("Termo: ");
            String termo = sc.nextLine();

            boolean condition = true;
            
            while (condition) {            

            System.out.println("Escreva o significado do termo");
            System.out.print("Significado: ");
            String significadoTermo = sc.nextLine();            
            
            if (significadoTermo.equals("")) {
                condition = false;
            }
           
            list.add(significadoTermo);

            }

            dic.put(termo, list);
            list.clear();

        }

        sc.close();

        for (String string : dic.keySet()) {
            System.out.printf("Termo: %s Significado: %s\n", string, dic.get(string).toString());
        }
    }
}
