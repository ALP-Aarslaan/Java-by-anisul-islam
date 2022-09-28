package com.company;

public class $73_String_Builder {
    public static void main(String[] args) {
        /*
        here we eill learn about string builder method to create
        a string;

         */
        StringBuilder s=new StringBuilder("jonayed");
        System.out.println(s);
        /*
        string builder is a method to create a string and it is changeable
        here we will use append method to add or concatenate two string;
         */
        s.append(" Sarkar");
        s.append(" "+19);
        System.out.println(s);
        /*
        we can use reverse method here:
         */
        String s1="sarkar";
        StringBuilder p=new StringBuilder(s1);
        p.reverse();
        System.out.println(p);
        //delete method to delete number of index
        // we can give a staring value and end value index in delete method
        p.delete(0,2);
        System.out.println(p);
    }
}
