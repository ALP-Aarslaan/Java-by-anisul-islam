package com.company;

public class $112Instance_Of_Operator {
    public static void main(String[] args) {
        /*
        instance means object;
        by using instanceof operator use we can find out
        if an object is under a class or not
        "instanceof" operator returns a boolean value true or false.
         */
        class animal{

        }
        class person extends animal{

        }
        class teacher extends person{

        }
        animal a=new animal();
        person p=new person();
        teacher t=new teacher();
        System.out.println(a instanceof animal);
        System.out.println(p instanceof animal);
        System.out.println(t instanceof person);
        System.out.println(t instanceof animal);
        System.out.println(p instanceof teacher);
    }
}
