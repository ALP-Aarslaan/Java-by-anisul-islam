package com.company;

import java.util.Scanner;

public class Series34 {
    public static void main(String args[]){
        int i,n,sum=0;
        Scanner scan=new Scanner(System.in);

        System.out.println("enter any number for n:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("sum of series:"+sum);
        int sum1=0;
        for(i=1;i<=n;i=i+2){
            System.out.println(i);
            sum1=sum1+i;
        }
        System.out.println("sum of series:"+sum1);
        double j,sum2=0;
        for(j=1.5;j<=n;j++){
            System.out.println(j);
            sum2=sum2+j;
        }
        System.out.println("total sum of series :"+sum2);
        int y,sum3=0,p;
        for(y=1;y<=n;y++){
            System.out.println(Math.pow(y,2));
            p= (int) Math.pow(y,2);
            sum3=sum3+p;
        }
        System.out.println("sum of series:"+sum3);

    }
}
