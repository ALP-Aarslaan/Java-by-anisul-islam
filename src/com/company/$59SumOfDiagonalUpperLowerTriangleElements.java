package com.company;

import java.util.Scanner;

public class $59SumOfDiagonalUpperLowerTriangleElements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][3];
        int row,col,sum=0;
        System.out.println("enter elements of a matrix:");
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                System.out.printf("a[%d][%d]=",row,col);
                a[row][col]=scan.nextInt();
            }
        }
        //sum of diagonal elements:
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                if(row==col) {
                    sum = sum + a[row][col];
                }
            }
        }
        int sum1=0,sum2=0;
        //sum of upper triangular elements:
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                if(row<col) {
                    sum1 = sum1 + a[row][col];
                }
            }
        }
        //sum of lower triangular elements:
        for(row=0;row<3;row++){
            for(col=0;col<3;col++){
                if(row>col) {
                    sum2 = sum2 + a[row][col];
                }
            }
        }
        System.out.println("sum of diagonal elements:"+sum);
        System.out.println("sum of upper triangular elements:"+sum1);
        System.out.println("sum of lower triangular elements:"+sum2);
    }
}
