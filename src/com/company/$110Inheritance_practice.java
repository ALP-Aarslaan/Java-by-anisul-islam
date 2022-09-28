package com.company;

public class $110Inheritance_practice {
    public static void main(String[] args) {
        class person{
            String name;
            int age;
            void display1(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
            }

        }
        class teacher extends person{
            String subject;
            void display2(){
                display1();
                System.out.println("subject:"+subject);
                //System.out.println("name:"+name);
                //System.out.println("age:"+age);
            }
        }
        teacher t1=new teacher();
        t1.name="mohammad";
        t1.age=22;
        t1.subject="cse";
        t1.display2();
        System.out.println();
        person p1=new person();
        p1.name="jonayed";
        p1.age=22;
        p1.display1();
    }
}
