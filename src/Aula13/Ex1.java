package Aula13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class Ex1 {
    
    public static void main(String[] args) throws FileNotFoundException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Escolha o nome do ficheiro de texto: ");
        String fileName = sc.nextLine();
        fileName += ".txt";
        System.out.print("Escreva o diretorio onde está o ficheiro: ");
        String pathName = sc.nextLine();
        sc.close();
        
        File file;

        if (pathName.equals("")) {
            file = new File(fileName);
        } else {
            file = new File(pathName, fileName);            
        }

        Scanner scFile = new Scanner(file, "UTF-8").useDelimiter("[\\p{Punct}\\s]+");        
        int countPalavras = 0;
        HashSet<String> set = new HashSet<>();


        while (scFile.hasNext()) {
            countPalavras++;
            set.add(scFile.next());
        }

        scFile.close();

        System.out.printf("Número Total de Palavras: %d \nNúmero de Diferentes Palavras: %d", countPalavras, set.size());

    }
}
