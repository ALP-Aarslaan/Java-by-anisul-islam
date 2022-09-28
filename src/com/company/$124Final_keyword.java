package com.company;

public class $124Final_keyword {
    public static void main(String[] args) {
        /*
        using final keyword will restrict the user.
        we can use final keyword as:
        final variable;
        final method;
        final class;
         */
        class university{
            final String name="UNIVERSITY OF ASIA PACIFIC";
            final int fee;
            //static final int fee;
            /*
            blank final variable we use this to declare variable
            in future;
            in order to initialize we have to use a instructor
            */
            /*
            if we use static keyword before blank final variable
            we have to create a static block
             */
            university(){
                fee=850000;
            }
            /*static {
                fee=85000;
            }

             */

            void display(){
                System.out.println("name:"+name);
                System.out.println("fees:"+fee);
            }
        }
        university u1=new university();
        u1.display();
        /*
        if we use final keyword before a variable we cant change the variable
        value which is already given
        */

    }
}
