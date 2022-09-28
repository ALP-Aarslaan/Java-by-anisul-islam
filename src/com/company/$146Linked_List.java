package com.company;

import java.util.LinkedList;

public class $146Linked_List {
    public static void main(String[] args) {
        /*
        array list:
        1.array list class uses a dynamic array for
        storing the elements
        2.array list is better for sorting and accessing
        data.
        3.slow for manipulating data

        linked list:
        1.linked list class uses doubly linked list to
        store the elements
        2.manipulating of data is fast here(deleting and inserting data)
        3.can contain duplicate elements;
         */
        LinkedList<String>country=new LinkedList<String>();
        country.add("bangladesh");
        country.add("india");
        country.add("pakistan");
        System.out.println(country);
    }
}
