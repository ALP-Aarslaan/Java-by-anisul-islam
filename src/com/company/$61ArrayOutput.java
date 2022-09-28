package com.company;

public class $61ArrayOutput {
    public static void main(String[] args) {
        int a[][]=new int [4][];
        a[0]=new int [1];
        a[1]=new int [2];
        a[2]=new int [3];
        a[3]=new int [4];
        int row,col,k=0;
        for(row=0;row<4;row++){
            for(col=0;col<row+1;col++){
                System.out.print(" "+k);
                k++;
            }
            System.out.println();
        }


    }
}
