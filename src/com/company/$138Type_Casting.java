package com.company;

public class $138Type_Casting {
    public static void main(String[] args) {
        /*
        what is type casting:
        ans:converting one data type to another is called type casting
        primitive data type casting:
        its called implicit type casting;
        byte>short>int>long>float>double
        we can cast type according to this serial;
        this is why its called widening
         */
        /*int x =10;
        double y=10;
        System.out.println(y);
        /*
        if we want to go to upper form to lower form:
        double>float>long>int>short>byte
        this is called explicit type casting
         */
        //double d=10.5;
        //int e=(int)d;

        //we have to give bracket and inside it we have to give desired type to convert
        /*
        java object type casting categorized into 2 types:
        1.upcasting;
        2.downcasting;
        object type casting means putting one's class object to another class
        downcasting doesn't supported by java
        if we put any sub class variable in a super class this is called upcasting
        on the other hand if we put any super class variable in a sub class this is called
        downcasting
         */
        class person{
            void display(){
                System.out.println("super class");
            }
        }
        class teacher extends person{
            void display(){
                System.out.println("sub class");
            }
        }
        class test{
            public  void main(String[] args) {
                person p=new teacher();
                /*
                here we put sub class object in a super class object
                this is called up casting
                 */
                p.display();
                teacher t=(teacher) new person();
                /*
                we here casted super class into sub class
                but it will give run time error
                 */
                t.display();


            }
        }
    }
}
