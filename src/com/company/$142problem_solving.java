package com.company;

import java.util.Scanner;

public class $142problem_solving {
    public static void main(String[] args) {
        int count=0;
       do {
           try {
               Scanner scan = new Scanner(System.in);
               System.out.println("please enter number 1:");
               int num1;
               num1 = scan.nextInt();
               System.out.println("please enter number 2:");
               int num2;
               num2 = scan.nextInt();
               int result = num1 / num2;
               count++;
               System.out.println("result:" + num1 + "/" + num2 + ":" + result);

           }
           catch (Exception e) {
               System.out.println("exception:" + e);
               System.out.println("please enter integer");
           }
       }while(count==1);
    }
}
