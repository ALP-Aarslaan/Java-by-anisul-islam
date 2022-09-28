package com.company;

import java.util.Scanner;

public class ControlStatements18 {
    public static void main(String[] args) {
        /*
        there are 3 types of control statements:
        1.selection control statements
                -if
                -else if
                -else
        2.iteration or looping
                -for loop
                -while loop
                -do while loop
                -for each loop
        3.jump
                -break
                -continue
                -return
         */
        /*
         syntax of if:
        if(condition){
            code to be executed;
            }
         */
        int num;
        System.out.println("enter any number:");
        Scanner scan=new Scanner(System.in);
        num=scan.nextInt();
        if(num>0){
            System.out.println("this is a positive number");
        }
        /*
        syntax of if else:
        if else(condition){
        code to executed;
        }
         */
        else if(num<0){
            System.out.println("this is a negative number");
        }
        /*
        syntax of else:
        else"here you no need to give any condition it works expect if and if else
         condition"{
         code to execute
         }
         */
        else
            System.out.println("zero");

    }
}
