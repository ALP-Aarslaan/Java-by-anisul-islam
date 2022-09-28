package com.company;

public class $107Encapsulation  {
    public static void main(String[] args) {
        /*
        there are four core concept in object oriented programming:
        1.Encapsulation.
        2.Inheritance.
        3.Polymorphism.
        4.Abstraction.
        there are 4 types access modifier:
        1.protected
        2.private
        3.public
        4.default
        we use these keywords before any variable or method
        using this we control access of them by any other class
        such as:
        private int age;
        int age//this is default we dont have to use default its already given
        public int age;
        protected int age;
        encapsulation is a method of packaging variable and method in a single
        unit
        encapsulation syntax:
         class person{
         String name;//variables
         int phone;
         void eat(){
         //method
         }
         void sleep(){
         //method
         }
         }
         another type encapsulation:
         protecting data by declaring them private;
         syntax:
         class person{
         private int age;
         private String name;
         void eat(){
         //must use public method to access private variables
         example:set,get;
         }
         void sleep(){
         //must use public method to access private variables
          example:set,get;
          }
          }
          this process is called data hiding
         */
        class person{
            private String name;
            private int age;
            public String getName(){
                return name;
            }
            public void setName(String name){
                this.name=name;
            }
        }
        person p1=new person();
        p1.setName("mohammad");
        String a=p1.getName();
        System.out.println("name:"+a);
    }
}
