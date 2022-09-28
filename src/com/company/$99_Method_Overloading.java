package com.company;

public class $99_Method_Overloading {
    public static void main(String[] args) {
        /*
        here we will learn about method overloading
        if we give same type variable or same type parameter in multiple method
        it will give error;this case is called polymorphism"BOHOROPITA"
        method names can be same but their parameter must be different
        these methods must be in same class
         */
        class test{
            void add(int a,int b){
                System.out.println(a+b);
            }
            void add(double a,double b){
                System.out.println(a+b);
            }
            void add(int a,int b,int c){
                System.out.println(a+b+c);
            }
            void add(){
                System.out.println("nothing to display");
            }

        }
        test a=new test();
        a.add();
        a.add(5,10);
        a.add(4.5,4.6);
        a.add(5,10,20);
        //this is called method overloading
    }

}
