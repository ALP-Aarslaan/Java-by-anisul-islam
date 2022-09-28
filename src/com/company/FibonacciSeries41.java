package com.company;

import java.util.Scanner;

public class FibonacciSeries41 {
    public static void main(String[] args) {
        /*
        fibonacci series are like:
        0 1 1 2 3 5 8 13 21 ........
        3rd number is summation of 1st and 2nd number
         */
        int a=0,b=1,c;
        int i,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        n=scan.nextInt();
        System.out.println(a);
        System.out.println(b);
        for (i=0;i<n;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;

        }
    }
}
