package com.company;

import jdk.dynalink.beans.StaticClass;

public class $89_Static_variable {
    public static void main(String[] args) {
        /*
        we can use static keyword in front of a variable,a method or a block
        like:
        Static variable;
        Static method;
        Static block;
        static keyword is used for memory management.
        it makes the program more efficient by saving memory\\class is more like a structure in c;
        static variable is not related to a object,its related to class;

         */
        $89Student s1=new $89Student("mohammad",19101019);
        s1.displayInfo();
        $89Student s2=new $89Student("jonayed",19101019);
        s2.displayInfo();

    }
}
