package com.company;

import java.util.Scanner;

public class Array$findingSumAndAverage$53 {
    public static void main(String[] args) {
        /*
        here we will learn about sum and average of 5 numbers using array;
         */
        Scanner scan=new Scanner(System.in);
        double num[]=new double[5];
        System.out.println("enter 5 numbers:");
        num[0]=scan.nextDouble();
        num[1]=scan.nextDouble();
        num[2]=scan.nextDouble();
        num[3]=scan.nextDouble();
        num[4]=scan.nextDouble();
        double sum=0;
        sum=num[0]+num[1]+num[2]+num[3]+num[4];
        System.out.println("total sum :"+sum);
        double n1[]=new double[5];
        System.out.println("enter array elements:");
        for(int i=0;i<5;i++){
            n1[i]=scan.nextDouble();
        }
        double sum1=0;
        for(int i=0;i<5;i++){
            sum1=sum1+n1[i];
        }
        System.out.println("total sum:"+sum1);
        int i,n;
        double sum2=0,avg=0;
        System.out.println("enter array size:");
        n=scan.nextInt();
        double a[]=new double[n];
        System.out.println("enter array elements:");

        for (i=0;i<n;i++){
            a[i]=scan.nextDouble();
        }
        for(i=0;i<n;i++){
            sum2=sum2+a[i];
        }
        avg=sum2/a.length;
        System.out.println("average of "+n+" numbers:"+avg);

    }
}
