package com.company;

public class $85_Types_Of_Constructor {
    public static void main(String[] args) {
        /*
        there are two types constructor:
        1.default Constructor;
        2.parameterized constructor;
         */
        class student{
            String name;
            int roll;
            float mark;
            student(){ //this is a default constructor
                System.out.println("no value");
            }
            student(String n,int r,float m){
                name=n;
                roll=r;
                mark=m;
            }

            void setInformation(String n,int r,float m){
                name=n;
                roll=r;
                mark=m;

        }

            void displayInformation(){
                System.out.println("name:"+name);
                System.out.println("roll:"+roll);
                System.out.println("mark:"+mark);
                System.out.println();
            }
        }
        student s1=new student("mohammad",19101019,89.4F);
        s1.displayInformation();
        student s2=new student("jonayed",19101019,88.67F);
        s1.displayInformation();
        student s3=new student();
        s3.displayInformation();
        /*
       as we saw when we run the program s3 object returns null value because
       it has no value in default constructor ;
       s3 object works accordingly as the default constructor because there
       is no parameter in it as well as also no parameter in default constructor
         */
    }
}
