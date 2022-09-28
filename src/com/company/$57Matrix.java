package com.company;

import java.util.Scanner;

public class $57Matrix {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[2][3];
        int b[][]=new int[2][3];
        int row,col;
        System.out.println("enter elements for 1st matrix:");
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.printf("enter value for a[%d][%d]=",row,col);
                a[row][col]=scan.nextInt();
            }
        }
        System.out.println("a:");
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.print(" "+a[row][col]);
            }
            System.out.println();
        }
        System.out.println("enter elements for 2nd matrix:");
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.println("enter value for b["+row+"]["+col+"]");
                b[row][col]=scan.nextInt();
            }
        }
        System.out.println("b:");
        for(row=0;row<2;row++){
            for(col=0;col<3;col++){
                System.out.print(" "+b[row][col]);
            }
            System.out.println();
        }
    }
}
