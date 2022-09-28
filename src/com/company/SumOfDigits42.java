package com.company;

import java.util.Scanner;

public class SumOfDigits42 {
    public static void main(String[] args) {
        /*
         sum of digits is like: 2343
         2+3+4+3=12
         12 is sum of these digits of this number
         */
        int number,rem,temp=0,sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        number=scan.nextInt();
        temp=number;
        while(temp!=0){
            rem=temp%10;
            sum=sum+rem;
            temp=temp/10;
        }
        System.out.println("sum of digits:"+sum);


    }
}
