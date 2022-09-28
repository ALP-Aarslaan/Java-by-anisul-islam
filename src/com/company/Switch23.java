package com.company;

import java.util.Scanner;

public class Switch23 {
    public static void main(String[] args) {
        //here we will learn about switch
        /*
        syntax of switch:
        switch(expression)
        case value1:
        {
        code to execute
        }
        break;
        case value2:
        {
        code to execute
        }
        break;
        case value(n):
        {
        code to execute
        }
        break;
        default:
        {
        code to execute
        }
         */
        Scanner scan=new Scanner(System.in);
        int number;
        System.out.println("enter any number:");
        number= scan.nextInt();
        switch(number){
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("NOT a digit");
        }
        //if we dont use break then it will print all the cases after the valid case
    }
}
