package Aula10;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class Ex4 {

    
    public static void main(String[] args) throws IOException{

        
        TreeSet<String> list1 = listWords();
        TreeSet<String> list2 = sFinalListWords();
        TreeSet<String> list3 = listWordsLet();
        print();
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(list3);

       

    }

    public static void print() throws IOException{

        Scanner input = new Scanner(new FileReader("words.txt"));

        while (input.hasNext()) {
            String word = input.next();
            System.out.println(word);
        }
        System.out.println();
    }

    public static TreeSet<String> listWords() throws IOException{

        Scanner input = new Scanner(new FileReader("words.txt"));
        TreeSet<String> list = new TreeSet<>();

        while (input.hasNext()) {
            String word = input.next();

            if (word.length()>2) {
                list.add(word);
            }        
        }

        return list;
    }

    public static TreeSet<String> sFinalListWords() throws IOException{

        Scanner input = new Scanner(new FileReader("words.txt"));
        TreeSet<String> list = new TreeSet<>();

        while (input.hasNext()) {
            String word = input.next();

            boolean cond = word.charAt(word.length()-1) == 's';

            if (cond) {
                list.add(word);
            }        
        }

        return list;
    }

    public static TreeSet<String> listWordsLet() throws IOException{

        Scanner input = new Scanner(new FileReader("words.txt"));
        TreeSet<String> list = new TreeSet<>();

        while (input.hasNext()) {

            String word = input.next();
            char [] c = word.toCharArray();

            boolean cond = true;

            for (int index = 0; index < c.length; index++) {

                boolean b = Character.isAlphabetic(c[index]) == false;

                if (b) {
                    cond = false;
                    break;
                }
            }

            if (cond) {
                list.add(word);
            }        
        }

        return list;
    }
}
