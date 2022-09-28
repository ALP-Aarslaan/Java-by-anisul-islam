package com.company;

import java.util.Scanner;

public class FindingMaximumMinimumArray54 {
    public static void main(String[] args) {
        int n,i;
        double num[]=new double[5],min,max;
        n=num.length;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter array elements:");
        for(i=0;i<n;i++){
            num[i]=scan.nextDouble();
        }
        min=num[0];
        max=num[0];
        for(i=0;i<num.length;i++){
            if(min>num[i])
                min=num[i];
        }
        System.out.println("the minimum number is:"+min);
        for(i=0;i<n;i++){
            if(max<num[i])
                max=num[i];
        }
        System.out.println("the maximum number is:"+max);

    }
}
