package com.company;

import java.util.Scanner;

public class AssignmentOperator13 {
    public static void main(String[] args) {
        /*here we will learn assignment operator
        assignment operators are:
        "=,+=,-=,*=,/=,%="
        y=x+5;"y assigned x+5"
        x+=5/x=x+5;
        x-=5/x=x-5;
        x*=5/x=x*5;
        x/=5/x=x/5;
        x%=5/x=x%5;
         */
        Scanner scan=new Scanner(System.in);
        double x;
        System.out.println("enter value for x:");
        x=scan.nextDouble();
        x=x+5;
        System.out.println(x);
        double y;
        System.out.println("enter value for y:");
        y=scan.nextDouble();
        y-=5;
        System.out.println(y);
        double z;
        System.out.println("enter value for z:");
        z=scan.nextDouble();
        z/=5;
        System.out.println(z);
        double a;
        System.out.println("enter value for a:");
        a=scan.nextDouble();
        a*=5;
        System.out.println(a);
        double b;
        System.out.println("enter value for b:");
        b=scan.nextDouble();
        b%=5;
        System.out.println(b);

    }
}
