package com.company;

public class $100_automatic_type_conversion {
    public static void main(String[] args) {
        class test{
            void add(double a,double b){
                System.out.println(a+b);
            }
            void add(int a,int b,int c){
                System.out.println(a+b+c);
            }
        }
        test a=new test();
        a.add(1,2);
        /*
        here we gave 2 integer number but there is no such parameter to receive
        2 integer
        if we run the program this program will still give value
        for this integer numbers because java automatically converts its
        types
        if there is one float and one integer java still converts to double
        according to its parameter
         */
        a.add(1.1,2.2);
        a.add(1,2,3);
        a.add(5.4F,45);

    }
}
