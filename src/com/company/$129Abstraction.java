package com.company;

public class $129Abstraction {
    public static void main(String[] args) {
        /*
        there are 4 core concept of object oriented programming
        1.encapsulation**
        2.inheritance**
        3.polymorphism**
        4.abstraction
        what is abstraction?
        ans:Abstraction is a process of hiding the implementation details
        and showing only the functionality to the user

        how to achieve abstraction?
        ans:there are two ways to achieve abstraction in java:
        1.abstract class(0 to 100%)
        2.interface(achieve 100% abstraction
        abstract class syntax:
        abstract class mobile{
        /code to execute
        void message(){
        /this is a non abstract method
        }
        //but abstract method has no body;
        abstract void message();
        }
        points to remember:
        1.abstract method has no body
        2.it must be end with a semicolon;
        3.must be in the abstract class
        4.it must be overridden
        5.it can never be final or static

        abstract class can have both abstract or non abstract method
        example of  abstraction:
        */
        //example of  abstraction:
        abstract class mobileUser{
            abstract void message();
        }
        class jonayed extends mobileUser{
            @Override
            void message() {
                System.out.println("HI,i am jonayed");
            }
        }
        class mohammad extends mobileUser{
            @Override
            void message() {
                System.out.println("HI,i am mohammad");
            }
        }
        mobileUser ms;
        ms=new jonayed();
        ms.message();
        ms=new mohammad();
        ms.message();

        /*
        we can not create abstract class object;
        if you extend an abstract class you have to use all its abstract method
        or you have to declare the class as abstract itself
         */
            }
        }
