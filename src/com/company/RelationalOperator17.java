package com.company;

import java.util.Scanner;

public class RelationalOperator17 {
    public static void main(String args[]){
        //here we will learn about relational operator:
        /*
        relational operators are used to create relation between two variable
        or statements
        these are:
        ">,>=,<,<=,==,!="
        their outcomes would be true or false
         */
        int num;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        num=scan.nextInt();
        boolean result=num>=5;
        System.out.println(result);
        boolean result1=num<=5;
        System.out.println(result1);
        boolean result2=num==5;
        System.out.println(result2);
        boolean result3=num!=5;
        System.out.println(result3);

    }
}
