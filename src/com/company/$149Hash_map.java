package com.company;

import java.util.HashMap;

public class $149Hash_map {
    public static void main(String[] args) {
        /*
        hash map:

         */
        //put,get;
        HashMap<Integer,String>customer=new HashMap<Integer, String>();
        customer.put(101,"mohammad");
        customer.put(102,"jonayed");
        customer.put(103,"sarkar");
        System.out.println(customer.get(102));
        System.out.println(customer.get(101));
        System.out.println(customer.get(103));
    }
}
