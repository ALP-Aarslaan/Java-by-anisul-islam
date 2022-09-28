package com.company;

public class $130_Abstraction_Practical {
    public static void main(String[] args) {
        abstract class mobileUser{
            abstract void message();
            void call(){
                System.out.println("this is call method");
            }
        }
        class jo extends mobileUser{
            void message(){
                call();
                System.out.println("i am jonayed");
            }
        }
        class mohammad extends mobileUser{
            @Override
            void message() {

                System.out.println("i am mohammad");
            }
        }
        mobileUser a;
        a=new jo();
        a.message();
        a.call();
        a=new mohammad();
        a.message();
        a.call();
        /*
        this is fully abstract class
         */
    }
}
