package com.company;

import java.util.Scanner;

public class Reverse45 {
    public static void main(String[] args) {
        int num,sum=0,temp=0,r;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any number:");
        num=scan.nextInt();
        temp=num;
        while(temp!=0){
            r=temp%10;
            sum=sum*10+r;
            temp=temp/10;
        }
        System.out.println("reverse of " + num+ ":"+sum);
    }
}
