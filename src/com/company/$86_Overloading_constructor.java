package com.company;

public class $86_Overloading_constructor {
    public static void main(String[] args) {
        /*
        here we will learn about overloading constructor
        if we take multiple constructor must be in same name and store same
        type data this is called overloading constructor
        */
        class info{
            String name;
            int code;
            float mark;

            info(String n,int c,float m){
                name=n;
                code=c;
                mark=m;
            }
            info(){
                System.out.println("no information:");
            }
            info(String n,int c){
                name=n;
                code=c;

            }
            void displayInfo(){
                System.out.println("name:"+name);
                System.out.println("code:"+code);
                System.out.println("mark:"+mark);
                System.out.println("\n");
            }
        }
        info a1=new info();
        a1.displayInfo();
        info a2=new info("mohammad",19101019,87.89F);
        a2.displayInfo();
        info a3=new info("jonayed",19101019);
        a3.displayInfo();
    }
}
