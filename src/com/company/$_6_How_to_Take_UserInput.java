package com.company;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class HowToTakeUserInput11 {
    public static void main(String[]args){
        //we will take input from user
        Scanner input = new Scanner(System.in);
        int num1;
        System.out.println("enter any number:");
        num1= input.nextInt();
       // int num=120;
       // System.out.println(num);

        System.out.printf("the number is %d\n",num1);



    }
}

