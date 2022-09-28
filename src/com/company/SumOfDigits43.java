package com.company;

import java.util.Scanner;

public class SumOfDigits43 {
    public static void main(String[] args) {
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
