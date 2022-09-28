package com.company;

import java.util.Scanner;

public class Pattern50 {
    public static void main(String[] args) {
        /*
        here we will learn pattern in order to improve out nested loop concept
        1
        12
        123
         */
        int line;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter how many lines you want:");
        line=scan.nextInt();
        for(int row=1;row<=line;row++){
            for(int col=1;col<=row;col++){
                System.out.print(""+col);
            }
            System.out.println();
        }

    }
}
