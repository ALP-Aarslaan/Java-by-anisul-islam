package com.company;

public class $120Super_Keyword_Uses_in_constructor {
    public static void main(String[] args) {
        class a{
            a(){
                System.out.println("a's constructor");
            }
        }
        class b extends a{
            b(){
                super();
                System.out.println("b's constructor");
            }

        }
        b ob=new b();
        /*
        in this case we all know that constructor works like a chain
        here super class will executed 1st then it will execute subclasses;
        if we dont extends super class then it will not work according to
        super class constructor it will work as sub class constructor.
        if we use super();
        constructor in b class then it will print the same;
         */
    }
}
