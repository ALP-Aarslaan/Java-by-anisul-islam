package com.company;

import java.util.Scanner;

public class $76_Binary_Octal_Hexadecimal_TO_Decimal {
    public static void main(String[] args) {
        String binary="1010";
        Integer decimal=Integer.parseInt(binary,2);
        System.out.println("decimal="+decimal);
        /*here we used Integer.parseint(string and int redix)method to covert
        its also a wrapper class ,in radix point we need to give the base of
         this number system;
        */
        Scanner scan=new Scanner(System.in);
        String octal;
        System.out.println("enter an octal number:");
        octal=scan.next();
        Integer decimal1=Integer.parseInt(octal,8);
        System.out.println("octal to decimal="+decimal1);
        String hex;
        System.out.println("enter any hexadecimal number:");
        hex=scan.next();
        Integer decimal2=Integer.parseInt(hex,16);
        System.out.println("hexadecimal to decimal="+decimal2);


    }
}
