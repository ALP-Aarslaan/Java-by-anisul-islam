package com.company;

public class $75_Conversion_Between_StringAndPrimitive {
    public static void main(String[] args) {
        /*
        here we will learn convert a string to primitive data type and
        conversion of primitive data type to string
         */
        int i=100;
        String s=Integer.toString(i);
        /*
        we use toString method to convert string to integer,double,float
         */
        System.out.println("s="+s);
        double a=23.56;
        String b=Double.toString(a);
        System.out.println("b="+b);
        boolean c=false;
        String e=Boolean.toString(c);
        System.out.println(e);
        /*
        conversion of string to primitive data type;
         */
        String n="32";
        int i1=Integer.parseInt(n);
        /*
        we will use parseint,parsedouble blah blah method to covert a string
        into integer;
         */
        System.out.println("i1="+i1);
        double q=Double.parseDouble(n);
        System.out.println("q="+q);
        int d=Integer.valueOf(s);
        //we can use value of method to convert;
        System.out.println("d="+d);
        double r=Double.valueOf(s);
        System.out.println("r="+r);
    }
}
