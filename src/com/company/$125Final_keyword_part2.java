package com.company;

public class $125Final_keyword_part2 {
    public static void main(String[] args) {
        /*
        here we will learn about final method and
         */
        /*
        if we use final keyword before  class then we cant override it
         */
         class university{
            final void display(){
                System.out.println("university info");
            }
        }
        class student extends university{
            //here is display method inherited but cant be overridden because of final keyword
            void display2() {
                //super.display();
                System.out.println("student info");
            }
        }
        student s1=new student();
        s1.display();
        s1.display2();
        /*
        1.can we inherit final method?
        ans:yes we can but we cant override it;
        2.what is blank final variable?
        ans:its a variable where we use final keyword before declaring it and
        its value is initialized latter on;
        3.how can we initialize blank final variable?
        ans:using a constructor we can initialize blank final variable
        4.what is static final variable?
        ans:if we use static keyword before blank final variable then it
        becomes static blank final variable,like:static final int age;
        5.how can we initialize static final variable?
        ans:using static block;
         */

    }
}
