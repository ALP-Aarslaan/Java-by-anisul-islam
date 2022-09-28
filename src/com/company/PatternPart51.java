package com.company;

import java.util.Scanner;

public class PatternPart51 {
    public static void main(String[] args) {
        /*
        pattern:
        1 2 3 4
        1 2 3
        1 2
        1
        trick: when we go larger to smaller we should start our row with n input
        and column with 1;
         */
        int n,row,col;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number:");
        n=scan.nextInt();
        for(row=n;row>=1;row--){
            for(col=1;col<=row;col++){
                System.out.print(" " + col);
            }
            System.out.println();
        }
    }
}
