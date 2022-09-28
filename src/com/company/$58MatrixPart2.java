package com.company;

import java.util.Scanner;

public class $58MatrixPart2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int row,col,sum=0;
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        System.out.println("enter elements for a matrix:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.printf("a[%d][%d]=",row,col);
                a[row][col]=scan.nextInt();
            }
        }
        System.out.println("enter elements for b matrix:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.printf("b[%d][%d]=",row,col);
                b[row][col]=scan.nextInt();
            }
        }
        System.out.print("a=");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
        System.out.print("b=");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(" "+b[row][col]);
            }
            System.out.println();
        }
        System.out.println("sum of a and b matrix:");
        System.out.print("a+b=");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.print(" \t"+(a[row][col]+b[row][col]));
            }
            System.out.println();
        }
        System.out.println("c=");
        int c[][]=new int[3][3];
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                c[row][col]=a[row][col]+b[row][col];
                System.out.print(" \t"+c[row][col]);
            }
            System.out.println();
        }


    }
}
