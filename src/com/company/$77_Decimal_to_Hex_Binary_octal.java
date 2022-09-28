package com.company;

import java.util.Scanner;

public class $77_Decimal_to_Hex_Binary_octal {
    public static void main(String[] args) {
        int decimal=15;
        String binary=Integer.toBinaryString(decimal);
        System.out.println("decimal to binary:"+binary);
        Scanner scan=new Scanner(System.in);
        int decimal1;
        System.out.println("enter decimal number:");
        decimal1=scan.nextInt();
        String octal=Integer.toOctalString(decimal1);
        System.out.println("decimal to octal:"+octal);
        int decimal2;
        System.out.println("enter a decimal number:");
        decimal2=scan.nextInt();
        String hex=Integer.toHexString(decimal2);
        System.out.println("decimal to hexadecimal:"+hex);
        String binary1;
        /*
        in this part we are converting binary to hexadecimal
        binary to octal
         */
        System.out.println("enter a binary number:");
        binary1=scan.next();
        Integer octal1=Integer.parseInt(binary1,8);
        System.out.println("binary to octal:"+octal1);
        Integer hex1=Integer.parseInt(binary1,16);
        System.out.println("binary to hexadecimal:"+hex1);
    }
}
