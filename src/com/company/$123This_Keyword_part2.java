package com.company;

public class $123This_Keyword_part2 {
    public static void main(String[] args) {
        /*
        calling current class method using "this" keyword
         */
        class person{
            String name;
            int age;
            void message(){
                System.out.println("i am message method");
            }
            void display(){
                this.message();//calling message method using this keyword.
                //if we dont give this before message method compiler will automatically consider this keyword
                message();
                System.out.println("i am display method");
            }
        }
        person p1=new person();
        p1.display();
    }
}
