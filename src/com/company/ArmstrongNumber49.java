package com.company;

import java.util.Scanner;

public class ArmstrongNumber49 {
    public static void main(String[] args) {
        int num,sum=0,r,temp=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            r=r*r*r;
            sum=sum+r;
            temp=temp/10;
        }
        if(sum==num)
            System.out.println("armstrong");
        else
            System.out.println("not armstrong");
    }
}
