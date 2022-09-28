package com.company;

public class $102_Call_By_Value_Or_Call_By_Reference {
    public static void main(String[] args) {
        /*
        here we will learn about argument passing :
        we can pass argument 2 way
        1.call by value/pass by value
        2.call by reference /pass by reference
        in call by value original value doesn't change
        but in call by reference original value changes

         */
        //call by value
        class num{
            void display(int i){
                i=20;
            }
        }
        num n1=new num();
        int x=10;
        System.out.println("value of x before call:"+x);
        n1.display(x);
        System.out.println("value of x after call:"+x);
//call by reference
        class callByReference {
            String name;
            void change(callByReference r2){
                r2.name="mohammad";
            }

        }
        callByReference r1=new callByReference();
        r1.name="jonayed";
        System.out.println("before calling:"+r1.name);
        r1.change(r1);
        System.out.println("after calling:"+r1.name);
    }
}
