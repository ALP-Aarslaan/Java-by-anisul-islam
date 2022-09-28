package com.company;

public class $114Method_Overriding {
    public static void main(String[] args) {
        /*
        method overriding is :
        2 methods name and parameter must be same in extended class also
        without inheritance we can not override
        we can use code again using method overriding
        its also known runtime polymorphism
         */
        class a{
            String name;
            int age;
            void display(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
            }

        }
        class b extends a{
            String qualification;
            void display(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
                System.out.println("qualification:"+qualification);
            }
        }
        b t=new b();
        t.qualification="BSC";
        t.age=21;
        t.name="Mohammad";
        t.display();
        System.out.println();
        a p=new a();
        p.age=22;
        p.name="jonayed";
        p.display();
    }
}
