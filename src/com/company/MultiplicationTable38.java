package com.company;

import java.util.Scanner;

public class MultiplicationTable38 {
    public static void main(String[] args) {
        int m,n;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        m=scan.nextInt();
        System.out.println("enter final number:");
        n=scan.nextInt();
        for(int i=m;i<=n;i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + "x" + j + "=" + i * j);
            }
            System.out.println();
        }

    }
}
