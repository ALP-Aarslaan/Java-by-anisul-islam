package com.company;

public class $92_Static_method {
    void display(){
        System.out.println("i am non static method");
        display1();
    }
    static void display1(){
        //static method cant access non static method
        //like:display();
        System.out.println("i am static method");
    }

    public static void main(String[] args) {
        $92_Static_method p1=new $92_Static_method();
        p1.display();
        $92_Static_method.display1();
    }
}
