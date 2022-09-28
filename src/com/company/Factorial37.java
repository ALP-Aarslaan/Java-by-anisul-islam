package com.company;

import java.util.Scanner;

public class Factorial37 {
    public static void main(String[] args) {
        int i,n,fact=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        n=scan.nextInt();
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println(("factorial of "+n)+":"+fact);
    }
}
