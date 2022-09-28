package com.company;

public class $118Super_keyword {
    public static void main(String[] args) {
        /*
        here we will learn about super keyword:
        "super" keyword used to refer immediate super class object
        usage of "super ":
         1.it is used to call super class instance variable;
         2.it is used to call super class method.(overridden method);
         3.it is used to call super class constructor.
        */
        class a{
            int x=10;
        }
        class b extends a{
            int x=5;
            void display(){
                System.out.println("x="+x);
                System.out.println("super class x:"+super.x);
            }
        }
        b ob=new b();
        ob.display();
        /*
        here display method will display 5 because child class variable x v
        wi be priorities;
         */
        //inorder to print super class x value:

    }
}
