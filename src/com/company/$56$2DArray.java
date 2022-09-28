package com.company;

import jdk.swing.interop.SwingInterOpUtils;

public class $56$2DArray {
    public static void main(String[] args) {
        /*
        here we will learn about types of array;
        there are 2 types of array:
        1.1D array;
        2.multi dimensional array
        ----2d
        ----3d,etc
        syntax of 2 dimensional array:
        int num[][]=new int[3][2];
        or-
        int num[][]={1,1,2,3,4,5,6,6,7,8,8};
        first []=known as row;
        second[]=known as column;
        row*column=number of elements;
        initializing a 2D array:
        in order to initialize we have to insert array elements 1st in the row;

        num[0][0]=1;
        num[0][1]=2;
         */
        int num[][]=new int[2][3];
        num[0][0]=10;
        num[0][1]=20;
        num[0][2]=30;
        num[1][0]=40;
        num[1][1]=50;
        num[1][2]=60;
        //in order to print as matrix:
        for(int row=0;row<2;row++) {
            for(int col=0;col<3;col++) {
                System.out.print( " "+num[row][col]);
            }
            System.out.println();
        }
    }
}
