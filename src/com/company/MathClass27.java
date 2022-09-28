package com.company;

public class MathClass27 {
    public static void main(String[] args) {
        /*
        here we will learn about math class:
        to learn more goto google and search math class and go to oracle's web
        in order to use math class we have to type:"Math."then all the class will
        shown
         */
        int x=2;
        int y=3;
        int result1,result2;
        result1 = Math.max(x,y);
        System.out.println("maximum number is:"+result1);
        result2=Math.min(x,y);
        System.out.println("minimum number is:"+result2);
        int a=-10;
        int absolute;
        absolute=Math.abs(a);
        System.out.println("absolute value is:"+absolute);
        double power=Math.pow(x,y);
        System.out.println("power :"+power);
        float  c= 8.8F;
        System.out.println("round of 8.8="+Math.round(c));
        //work of pi;
        System.out.println("value of PI:"+Math.PI);



    }
}
