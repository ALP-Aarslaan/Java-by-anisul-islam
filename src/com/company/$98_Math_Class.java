package com.company;

public class $98_Math_Class {
    public static void main(String[] args) {
        double a=Math.abs(-9.5);
        System.out.println(a);
        System.out.println(Math.abs(-89));
        System.out.println(Math.sqrt(25));
        System.out.println(Math.pow(2,3));
        System.out.println(Math.PI);
        System.out.println(Math.log(2));
        System.out.println(Math.exp(1));
        System.out.println(Math.max(2,5));
        System.out.println(Math.min(-2,32));
        System.out.println(Math.min(12.8,-12.8));
        System.out.println(Math.ceil(87.6));
        System.out.println(Math.floor(87.6));
        System.out.println(Math.round(87.3));
        /*
        if we use round method and if number's decimal point is equal .5 or above
        then it will return its ceiling
        else
        it will return its floor
         */
        System.out.println(Math.ceil(5));
        System.out.println(Math.floor(6));

    }
}
