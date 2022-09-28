package com.company;

public class $137Access_modifier {
    public static void main(String[] args) {
        /*
        modifiers are 2 types:
        1.access modifier;
        -private
        -protected
        -public
        -default
        2.non access modifier:
        -static
        -abstract
        -volatile
        etc

         */
        //private access modifier:
        class a {
            /*
            if we use "private" in a class before a method or constructor
            then we cant use these method in another class
             */
            public void display() {
                System.out.println("hi");
            }
        }
            class b{
              /*
              if we use "protected" keyword in a class we can access this
              inside a or within a package but not in another package
              if we goto another package and wanted to use the protected class
              then we have to inherit the protected class in another word
              we have to extend
               */
              protected void display(){
                  System.out.println("i am");
              }
            }
            class c{
            /*
            if we use public then we can use it from anywhere
             */
            }
            class d{
            /*
            if we use default member we can use it only in this package not in another
            package;
             */
            }




        a on=new a();
        on.display();

        }
    }