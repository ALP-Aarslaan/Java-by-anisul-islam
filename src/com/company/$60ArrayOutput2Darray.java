package com.company;

import java.util.Scanner;

public class $60ArrayOutput2Darray {
    public static void main(String[] args) {
        int a[][]=new int[4][5];
        Scanner scan=new Scanner(System.in);
        int row,col,k=0;
        for(row=0;row<4;row++){
            for(col=0;col<5;col++){
                a[row][col]=k;
                k++;
            }
        }
        System.out.print("a=");
        for(row=0;row<4;row++){
            for(col=0;col<5;col++){
                System.out.print("\t"+a[row][col]);
            }
            System.out.println();
        }



    }
}
