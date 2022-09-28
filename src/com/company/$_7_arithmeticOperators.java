package com.company;

import java.util.Scanner;

public class ArithmeticOperator12 {
    public static void main(String[]args){
        /* there are many types of operator in java.Such as:
        1.arithmetic operator
        2.assignment operator
        3.relational operator
        4.logical operator
        5.conditional operator
        6.unary operator
        7.bitwise operator
        8.special operator
        here we will learn about arithmetic operator
        there are 5 arithmetic operators
        "+,-,*,/,%"
        "2+2=4;
        "2-2=0;"
        "2*2=4;"
        "2/2=1;"
        "2%2=0;"
         */
        //Scanner scan=new Scanner(System.in);
        Scanner scan=new Scanner(System.in);
        int num1,num2,sum,sub,mul;
                double div,mod;
        System.out.println("enter 1st number:");
         num1 = scan.nextInt();
        System.out.println("enter 2nd number:");
         num2=scan.nextInt();
         sum=num1+num2;
        System.out.printf("total sum is:%d\n",sum);
        sub=num1-num2;
        System.out.println("subtraction is:"+sub);
        mul=num1*num2;
        System.out.println("multiplication is:"+mul);
        div=(double)num1/(double)num2;
        System.out.println("division is :"+div);
        mod=(double)num1%(double)num2;
        System.out.println("modulus is:"+mod);

    }
}
