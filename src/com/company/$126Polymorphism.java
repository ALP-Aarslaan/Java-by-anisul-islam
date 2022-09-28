package com.company;

public class $126Polymorphism {
    public static void main(String[] args) {
        /*
        polymorphism: meaning many forms
        two types of polymorphism:
        1.compile time polymorphism/static binding
        2.run time polymorphism /dynamic binding
        compile time polymorphism is method overloading
        constructor overloading
        run time polymorphism is known as method overriding
        compile time polymorphism example:
        class overload{
        void add(int a,int b){
        System.out.println(a+b);
        }
        void add(double a,double b,double c){
        System.out.println(a+b+c)
        }
        void add(){
        System.out.println("nothing");
        }
        }
        there are many forms of add method this is called polymorphism
        run time polymorphism is known as method overriding
        example:
        class person{
        int age;
        String name;
        void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        }
        }
        class teacher extends person{
        String sub;
        void display(){
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("subject:"+subject);
        }
        }//this is called method overriding
        person p=new person();
        p.display();
        teacher t=new teacher();
        t.display();
        person t1=new teacher();
        t1.display();
        //we can store sub class object in a super class variable
        polymorphism is a mechanism where a parent class reference variable
        can take many forms(it can refer object from different classes)

         */
    }
}
