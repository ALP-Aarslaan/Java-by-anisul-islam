package com.company;

import java.util.Scanner;

public class sum33 {
    public static void main(String[] args) {
        int i,sum=0;
        for(i=1;i<=10;i++){
            sum=sum+i;
        }
        System.out.println("total sum is:"+sum);

        int m,n,sum1=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter initial number m:");
        m=scan.nextInt();
        System.out.println("enter last number n:");
        n=scan.nextInt();
        for(i=m;i<=n;i++)
        {
            sum1=sum1+i;
        }
        System.out.println("sum of series:"+sum1);
        int x,y,sum3=0;
        System.out.println("enter value for x:");
        x=scan.nextInt();
        System.out.println("enter value for y:");
        y=scan.nextInt();
        for(i=x;i<=y;i++){
            if(i%2==0)
            sum3=sum3+i;
        }
        System.out.println("sum of even numbers:"+sum3);
        int sum4=0;
        for(i=x;i<=y;i++){
            if(i%2!=0){
                sum4=sum4+i;
            }
        }
        System.out.println("sum of odd numbers:"+sum4);
    }
}
