package com.company;

import java.util.Scanner;

public class Palindrome47 {
    public static void main(String[] args) {
        int num,temp=0,sum=0,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        if(num==sum)
            System.out.println("this is palindrome");
        else
            System.out.println("not palindrome");
    }
}
