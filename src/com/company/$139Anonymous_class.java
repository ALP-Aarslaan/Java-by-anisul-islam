package com.company;

public class $139Anonymous_class {
    public static void main(String[] args) {
        /*
        anonymous class has no name
        we use it because ,if we want to override any interface or method of class
        anonymous class syntax:
         */
        class person{
            void display(){
                System.out.println("i am jonayed");
            }

        }
        person p=new person(){
            @Override
            void display() {
                System.out.println("i am mohammad");
            }
        };
        p.display();
        /*
        we changed the value of a class overriding a class using anonymous class
         */

    }
}
