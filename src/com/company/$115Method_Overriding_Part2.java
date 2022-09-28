package com.company;

public class $115Method_Overriding_Part2 {
    public static void main(String[] args) {
        /*
        we can not override static method
        if we declare a method as final we cant use this method in another class
        */
        //example below:
        /*class a{
            String name;
            int age;
            final void display(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
            }
        }
        class b extends a{
            String sub;
            void display(){

            }

        }
        */
       // can we override main method
        /*
        as there is a static keyword in main method so we cant override main method

         */
    }
}
