package com.company;

import java.util.Scanner;

public class UnaryOperator16 {
    public static void main(String[]args){
        /*here we will learn about unary operator
        these are
        :
        unary plus = + it makes negative value to positive
        unary mines= "-" it makes positive value to negative
        increment operator="++" it increases value by one
        decrement operator="--" it decreases value by one
         */
        Scanner scan=new Scanner(System.in);
        int a;
        System.out.println("enter any number:");
        a=scan.nextInt();

        a=+(a);
        System.out.println("value of a:"+a);
        int b;
        System.out.println("enter any number here:");
        b=scan.nextInt();
        b=-(b);
        System.out.println("value of b:"+b);
        int c;
        System.out.println("enter any number:");
        c=scan.nextInt();
        c++;
        System.out.println("value of c is:"+c);
        int d;
        System.out.print("enter any number:");
        d=scan.nextInt();
        d--;
        System.out.println("value of d is:"+d);
        /*a++=postfix increment,it increments a by one-after it is used;
        ++a=prefix increment,it increments a by one-before it is used;
        a--=postfix decrement ,it decrements a by one-after it is used;
        --a=prefix decrement,it decrements a by one -before it is used;
         */
        int x=15,y;
        y=x++;
        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);
        y=++x;
        System.out.println("value of y:"+y);
        int a1=15;
        int z=a1--;
        System.out.println("value of a1:"+a1);
        System.out.println("value of z:"+z);
        z=--a1;
        System.out.println("value of z:"+z);

    }
}
