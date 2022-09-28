package com.company;

import java.util.ArrayList;

public class $65ArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer>num1=new ArrayList<Integer>();
        ArrayList<Integer>num2=new ArrayList<Integer>();
        ArrayList<Integer>num3=new ArrayList<Integer>();
        num1.add(0,1);
        num1.add(1,2);
        num1.add(2,3);
        num1.add(3,4);
        System.out.println("number 1 :"+num1);
        num2.add(0,5);
        num2.add(1,6);
        num2.add(2,7);
        num2.add(3,8);
        System.out.println("number 2:"+num2);
//using addAll method we can add a array list to another array list;
        num3.addAll(num1);
        System.out.println("number 3:"+num3);
        /*
        using equal method we can find out if two array list equal or not,
        it returns a boolean value so we have to store it in a boolean
        variable;
         */
        boolean result=num1.equals(num3);
        System.out.println("number 1 = number 3:"+result);
        boolean result1=num2.equals(num3);
        System.out.println("number 2 = number 3:"+result1);
    }
}
