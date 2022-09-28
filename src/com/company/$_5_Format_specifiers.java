package com.company;

public class Formatspecifier10 {
    public static void main(String[]args){
        boolean b = true;
        System.out.printf("the boolean value is :%b\n",b);
        char letter = 'A';
        System.out.printf("charter letter is :%c\n",letter);
        short s=1000;
        System.out.printf("the whole number is s= %d\n",s);
        int num=10;
        System.out.printf("the integer number is num:%d\n",num);
        float f=10.45F;
        System.out.printf("the floating point value f is:%.2f\n",f);//%.2f means it will print 2 digit after decimal point
        double d=10000.4567;
        System.out.printf("double type data is d:%.4f\n",d);//in c we used %lf for double type data but in java we use %f in float and double both


    }
}
