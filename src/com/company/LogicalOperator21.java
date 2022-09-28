package com.company;

import java.util.Scanner;

public class LogicalOperator21 {
    public static void main(String[] args) {
        /*
        here we will learn about logical operator
        logical operators are:
        "&&,||,!"
        '&&'=logical and operators works when both condition are true .
        '||'=logical or operator works when any of the condition is true
        on both sides of or operator
        '!'=logical not operators makes a true statement false and vice varsa
         */
        Scanner scan=new Scanner(System.in);
        char ch=scan.next().charAt(0);
        System.out.println("enter any letter:");
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println(ch+" is vowel");
        else
            System.out.println(ch+" is consonant");

    }
}
