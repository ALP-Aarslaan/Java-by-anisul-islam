package com.company;

public class $119Super_keyword_uses_in_method {
    public static void main(String[] args) {
        //how to call overridden method of super class
        class a{
            void display(){
                System.out.println("inside a class");
            }
        }
        class b extends a {
            void display() {
                super.display();
                System.out.println("Inside b class");
            }
        }
        b ob =new b();
        ob.display();
    }
}
