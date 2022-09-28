package com.company;

import java.util.Scanner;

public class PrimeNumber39 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,i,count=0;
        System.out.println("enter any number:");
        n=scan.nextInt();
        for(i=2;i<n;i++){
            if(n%i==0)
                count++;
        }
        if(count==0)
            System.out.println(n+" is prime number");
        else
            System.out.println(n+" is not prime number");

    }
}
