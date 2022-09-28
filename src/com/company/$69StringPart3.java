package com.company;

public class $69StringPart3 {
    public static void main(String[] args) {
        String country="Bangladesh is my country       ";
        System.out.println(country);
        //charAt method to find a character in a string in a certain index;
        char ch=country.charAt(0);
        System.out.println("character in index 0:"+ch);
        /*
        IN ORDER TO RETURN  ASCII  value of a character we use codePointAt m
        method
         */
        int value=country.codePointAt(1);
        System.out.println("ascii value of index 1:"+value);
        /*
        indexOf method,we use to find index of a character
         */
        int pos=country.indexOf('b');
        System.out.println("index of b is:"+pos);
        //-1 means that there is no such character;
        int pos1=country.indexOf('B');
        System.out.println("index of B is:"+pos1);
        /*
        lastindexof method we use to find last time we find a character in a
        string as its last index will give this method;
         */
        int pos2=country.lastIndexOf('n');
        System.out.println("last index of n:"+pos2);
        /*
        to remove white spaces we use trim method;
         */
        String s3=country.trim();
        System.out.println(s3);
    }
}
