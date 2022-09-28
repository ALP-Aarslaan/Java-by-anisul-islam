package com.company;

public class $84_Constructor {
    public static void main(String[] args) {
        /*
        we use constructor in order to give value in the meantime we create an
        object
        constructor is a special type of method and it has no return type
        constructor name must be same as class name
        using constructor we can initialize the values of an object
        when we give value in an object such as we gave 3 value in a object
        and this object will search for 3 parameterized constructor or if there
        any method which has 3 parameter
        when it matches with it then it starts work according to the constructor
        or
        method
         */
        class teacher{
            String name,gender,phone;
            teacher(String n,String g,String p){
                name=n;
                gender=g;
                phone=p;

            }
            /*
            void setInformation(String n,String g,String p){
                name=n;
                gender=g;
                phone=p;
            }
            */
            void displayInformation(){
                System.out.println("name:"+name);
                System.out.println("gender:"+gender);
                System.out.println("phone:"+phone);
                System.out.println("\n\n");
            }

        }
        teacher t1=new teacher("mohammad","male","0186146907");
        t1.displayInformation();
        teacher t2=new teacher("jonayed","male","01861469907");
        t2.displayInformation();
    }
}
