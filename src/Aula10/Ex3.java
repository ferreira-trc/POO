package Aula10;

import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Character, String> dic = new HashMap<>();

        System.out.println("Escreva uma frase!");
        System.out.print("frase: ");
        String frase = sc.nextLine();
        sc.close();

        for (int index = 0; index < frase.length(); index++) {
            char c = frase.charAt(index);
            String i = String.format("[%s]", Integer.toString(index));

            if (dic.containsKey(c)) {
                i = dic.get(c).substring(0, dic.get(c).length()-1)+", "+Integer.toString(index)+"]";
                dic.put(c, i);
            } else {
                dic.put(c, i);
            }            
        }

        System.out.println(dic);

    }
}
