package com.company;

import java.util.HashSet;

public class $150Hash_Set {
    public static void main(String[] args) {
        /*
        list can have duplicate element,but set don't;


         */
        HashSet<String> fruits=new HashSet<String>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("banana");
        System.out.println(fruits);
        System.out.println("size:"+fruits.size());
        fruits.remove("apple");
        System.out.println(fruits);
        fruits.clear();
        System.out.println(fruits);
        boolean b=fruits.isEmpty();
        System.out.println(b);

    }
}
