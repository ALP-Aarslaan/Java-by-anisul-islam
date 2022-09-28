package com.company;

public class $122This_keyword {
    public static void main(String[] args) {
        /*
        this keyword is widely used in java and android development.
        this keyword is related to current class object
        usages of this keyword:
        1.refer current class instance variable;
        2.it can be use to call current class constructor;
        3.it can use to call current class method;
        4.it can be passed as an argument in the method(event handling).
         */
        //1.refer current class instance variable;
        class person{
            String name;
            int age;
            String hairColour;
            person(String name,int age){
                this.name=name;
                this.age=age;
            }
            person(String name,int age,String hairColour){


                this(name, age);//1st statement must be the calle of constructor
                this.hairColour=hairColour;
            }
            void display(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
                System.out.println("hair Colour:"+hairColour);
                System.out.println("\n");
            }

        }
        person p1=new person("mohammad",22);
        p1.age=22;
        p1.name="jonayed";
        p1.display();
        person p2=new person("jonayed",22,"black");
        p2.display();
    }
}
