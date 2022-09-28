package com.company;

import java.util.Scanner;

public class $101_Debugging_In_Java {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n,i,sum=0;
        System.out.println("enter size:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            sum=sum+i;
        }
        System.out.println("total sum is:"+sum);
    }
}
