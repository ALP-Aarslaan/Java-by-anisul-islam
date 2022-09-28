package com.company;

public class $81_intro_OOP_class_object {
    public static void main(String[] args) {
        /*
        class is a store house of many objects;
        like animal class : memel,coldblooded,birds these are different
        object of animal class
        there are many classification of object oriented programming
        these are:
        1.class.
        2.inheritance.
        3.abstraction.
        4.polymorphism.
        5.access modifier.
        6.interface.
        7.encapsulation.
        8.abstract class
        class:class is a template from which individual objects are created
        syntax:
        class className{
        \\variables
        \\methods
        }
        class fruitclass{
        banana,apple
        }
         */
        //here we will learn about class:
        class Teacher {
            String name, gender;
            long phone;
        }

        Teacher t1;//here we declared object;
        t1=new Teacher();
        t1.name="mohammad";
        t1.gender="male";
        t1.phone=1861469907;
        System.out.println("name of the teacher:"+t1.name);
        System.out.println("gender of this teacher:"+t1.gender);
        System.out.println("phone number:"+t1.phone);
    }

    }

