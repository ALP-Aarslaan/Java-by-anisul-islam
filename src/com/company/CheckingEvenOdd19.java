package com.company;

import java.util.Scanner;

public class CheckingEvenOdd19 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("enter any number:");
        num=scan.nextInt();
        if(num%2==0) {
            System.out.println("this is a even number:" + num);
        }
            else if(num%2!=0){
                System.out.println("this is a odd number:"+num);
            }


    }
}
