package com.company;

import java.util.Scanner;

public class ReverseNumber44 {
    public static void main(String[] args) {
        /*
        here we will learn about how to reverse a number
        like:
        1234 will take as input
        output will be 4321
         */
        int number,sum=0,temp=0,reverse;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        number=scan.nextInt();
        temp=number;
        while(temp!=0){
            reverse=temp%10;
            sum=sum*10+reverse;
            temp=temp/10;
        }
        System.out.println("reverse of "+number+"  is:"+sum);
    }
}
