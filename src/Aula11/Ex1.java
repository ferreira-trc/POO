package Aula11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ex1 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Escreva o nome do ficheiro.");
        System.out.print("Nome: ");
        String fileName = sc.nextLine();
        sc.close();

        File file = new File(fileName+".txt");

        TreeMap <String,TreeMap<String,Integer>> dic = new TreeMap<>();        

        try {            
             
            Scanner scFile = new Scanner(file, "UTF-8").useDelimiter("[\\p{Punct}\\s]+");            

            while (scFile.hasNext()) {   
                
                TreeMap<String,Integer> subDic;
               
                String s1 = scFile.next();

                if (scFile.hasNext() == false) {
                    break;
                }
                String s2 = scFile.next();                
                
                
                while ( s1.length() < 3) {
                    s1 = s2;
                    s2 = scFile.next();
                }               

                while ( s2.length() < 3) {                    
                    s2 = scFile.next();
                }



                if (dic.containsKey(s1)) {
                    if (dic.get(s1).containsKey(s2)) {
                        dic.get(s1).replace(s2, dic.get(s1).get(s2)+1);
                    } else {
                        dic.get(s1).put(s2, 1);
                    }
                } else {
                    
                    subDic = new TreeMap<>();
                    subDic.put(s2, 1);
                    dic.put(s1, subDic);
                    
                }                           

            }

            scFile.close();


        } catch (FileNotFoundException e) {
            System.out.println("Ficheiro não existe!");
        }

        

        for (Map.Entry<String,TreeMap<String,Integer>> entry  : dic.entrySet()) {
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
            
        
            
        
        
        

        


    }
}