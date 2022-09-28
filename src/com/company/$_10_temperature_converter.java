package com.company;

import java.util.Scanner;

public class TemperatureConverter15 {
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        float celsius,fahrenheit,valuec,valuef;
        System.out.println("enter fahrenheit value:");
        fahrenheit=scan.nextFloat();
        valuec=(5*(fahrenheit-32))/9;
        System.out.println("temperature in celsius:"+valuec);
        System.out.println("enter value for celsius:");
        celsius=scan.nextFloat();
        valuef=(float)9/5*celsius+32;
        System.out.println("temperature in fahrenheit:"+valuef);
    }
}
