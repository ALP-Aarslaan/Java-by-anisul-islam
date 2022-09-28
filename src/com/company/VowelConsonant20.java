package com.company;

import java.util.Scanner;

public class VowelConsonant20 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        char letter;
        System.out.println("enter any letter:");
        letter=scan.next().charAt(0);//we used charAt method to take a single letter
        if(letter=='a'||letter=='e'||letter=='i'||letter=='0'||letter=='0'){
            System.out.println(letter +" is vowel");
        }
        else
            System.out.println(letter +" is consonant");


    }
}
