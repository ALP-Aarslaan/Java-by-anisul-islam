package com.company;

public class $127Polymorphism_part1 {
    public static void main(String[] args) {
        class person{
            void display(){
                System.out.println("i am a person class");
            }

        }
        class teacher extends person{
            void display(){
                System.out.println("i am a teacher class");
            }
        }
        class student extends person{
            void display(){
                System.out.println("i am a student class");
            }
        }
        person p=new person();
        teacher t=new teacher();
        student s=new student();
        p.display();
        //t.display();
        //s.display();
        p=new teacher();
        p.display();
        p=new student();
        p.display();
    }
}
