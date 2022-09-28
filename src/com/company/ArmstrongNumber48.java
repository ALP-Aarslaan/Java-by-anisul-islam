package com.company;

import java.util.Scanner;

public class ArmstrongNumber48 {
    public static void main(String[]args){
        /*
        if sum of every digit's cube of a number is = to the main number
        is known as ARMSTRONG number , like:
        153=1^3+5^3+3^3
        153=1+125+27
        153=153
         */
        int num,sum=0,temp=0,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            r=r*r*r;
            sum=sum+r;
            temp=temp/10;
        }
        System.out.println("total sum of digits="+sum);
        if(num==sum){
            System.out.println(sum+ " is an ARMSTRONG number ");
        }
        else
            System.out.println("NOT ARMSTRONG");
    }
}
