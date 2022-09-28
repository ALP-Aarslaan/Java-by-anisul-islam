package com.company;

import java.util.Scanner;

public class ConditionalOperator25 {
    public static void main(String args[]){
        //conditional operators are also known as ternary operator
        /*
        conditional or ternary operators are:
        "?,:"
        expression?(is true)expression2 will execute:or expression 2 will execute
         */
        Scanner scan=new Scanner(System.in);
        int x,y;
        System.out.println("enter two numbers:");
        x=scan.nextInt();
        y=scan.nextInt();
        int large=(x>y)?x:y;
        System.out.println("larger number between two numbers is:"+large);
    }
}
