package com.company;

public class $87_Returning_a_value_From_method {
    public static void main(String[] args) {
        /*
        here we will learn how a method returns a value
         */
        class square {
            int num(int value){
                return value*value;
            }
        }
        square number=new square();
        int a=number.num(5);
        System.out.println("square of given number:"+a);
        square num2=new square();
        System.out.println("square of given number:"+number.num(6));
    }
}
