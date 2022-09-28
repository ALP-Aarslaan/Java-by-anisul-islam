package com.company;

import java.util.Scanner;

public class BitWiseOperator26 {
    public static void main(String[] args) {
        /*
        here we will learn about bitwise operator
        bitwise operator are:
        "&(and),|(or),^(xor),>>(right shift),<<(left shift),~(not)"
        they works like binary operation
        right shift means:
        we are multiplying number 2 times like(N*2)
        left shift means:
        we are dividing number by 2 like(N/2)
        per 1 shift its left or right means we are either  multiplying numbers with 2
        or dividing numbers by 2
         */
        int a,b,c,d,e,r,l;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter a number:");
        a=scan.nextInt();
        System.out.println("enter another number:");
        b=scan.nextInt();
        c=a&b;
        d=a|b;
        e=a^b;
        System.out.println("value of a&b="+c);
        System.out.println("value of a|b="+d);
        System.out.println("value of a^b="+e);
        r=a>>3;
        l=a<<3;
        System.out.println("right shift of a is :"+r);
        System.out.println("left shift of a is:"+l);


    }
}
