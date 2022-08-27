package Aula9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Aula5.Date;
import Aula6.Pessoa;

public class Ex1 {

    public static void main(String[] args) {
        ArrayList<Integer> c1 = new ArrayList<>();

        for (int i = 10; i <= 100; i+=10){
            c1.add(i);
        }

        System.out.println("Size: " + c1.size());

        for (int i = 0; i < c1.size(); i++){
            System.out.println("Elemento: " + c1.get(i));
        }

        ArrayList<String> c2 = new ArrayList<>();
        c2.add("Vento");
        c2.add("Calor");
        c2.add("Frio");
        c2.add("Chuva");
        c2.add("Furacão");
        System.out.println(c2);
        Collections.sort(c2);
        System.out.println(c2);
        c2.remove("Frio");
        c2.remove(0);
        System.out.println(c2);

        Set<Pessoa> c3 = new HashSet<>();

        Date d1 = new Date(11, 1, 1996);
        Date d2 = new Date(3, 2, 2000);
        Date d3 = new Date(7, 3, 1998);
        Date d4 = new Date(31, 5, 1988);
        Date d5 = new Date(24, 8, 1992);

        Pessoa p1 = new Pessoa("Tiago", 14526478, d1);
        Pessoa p2 = new Pessoa("Rafael", 12357894, d2);
        Pessoa p3 = new Pessoa("Pedro", 36452348, d3);
        Pessoa p4 = new Pessoa("João", 15947896, d4);
        Pessoa p5 = new Pessoa("Ana", 12354679, d5);

        c3.add(p1);
        c3.add(p2);
        c3.add(p3);
        c3.add(p4);
        c3.add(p5);
        c3.add(p5);

        System.out.println(c3);

        Set<Date> c4 = new TreeSet<>();

        c4.add(d1);
        c4.add(d2);
        c4.add(d3);
        c4.add(d4);
        c4.add(d5);

        System.out.println(c4);

        
    }
}