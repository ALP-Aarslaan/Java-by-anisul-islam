package com.company;

import java.util.Scanner;

public class LogicalAnd22 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter any letter:");
        char letter=scan.next().charAt(0);
        if(letter>='A'&& letter<='Z'){
            System.out.println(letter+" is upper case letter");
        }
        else if(letter>='a'&& letter<='z'){
            System.out.println(letter+" is lowercase letter");
        }
        else
            System.out.println(letter+" is number");
    }
}
