package com.company;

import java.util.LinkedList;

public class $147Linked_List_part2 {
    public static void main(String[] args) {
        LinkedList<String>country=new LinkedList<String>();
        //LinkedList<String>country=new LinkedList<String>();
        country.add("bangladesh");
        country.add("india");
        country.add("pakistan");
        country.add(3,"IRAN");
        country.addFirst("Australia");
        country.addLast("japan");
        country.remove("india");
        country.removeFirst();
        country.removeLast();
        System.out.println("1st country name:"+country.getFirst());
        System.out.println("Last country name:"+country.getLast());
        country.clear();
        for(String x:country){
            System.out.println(x);
        }
        System.out.println("SIze of this linked list:"+country.size());


    }
}
