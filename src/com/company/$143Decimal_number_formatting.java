package com.company;

import java.text.DecimalFormat;

public class $143Decimal_number_formatting {
    public static void main(String[] args) {
        double x=2.9875488;
        System.out.println("x:\n"+x);
        /*
        how to format decimal number:
        using printf function;
         */
        System.out.printf("x:%.2f",x);//java inherited c program way
        //using decimal format class
        DecimalFormat ob=new DecimalFormat("0.00");
        x=3.141657896;
        System.out.println("x:"+ob.format(x));
    }
}
