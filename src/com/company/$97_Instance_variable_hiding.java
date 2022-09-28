package com.company;

public class $97_Instance_variable_hiding {
    public static void main(String[] args) {
        /*
        if we give same instance variable name and local variable name
        in a class java will give prioritized to local variable
        like:
        class box{
        double id;
        String name;
        }
        box(double id,String name)
        {
        id=id;
        name=name;
        }
        if we do this way instance variable will hide under local variable because
        of prioritizing of java
        to solve is collision we have to use another keyword "this"
         */
        class box{//initialization of class
            double height;
            double width;
            double depth;
            box(double height,double width,double depth){
                //initialization of constructor
                this.height=height;
                this.depth=depth;
                this.width=width;
            }
            void display(){
                double vol=height*width*depth;
                System.out.println("volume:"+vol);
            }

        }
        box b1=new box(10,10,10);
        b1.display();
        box b2=new box(20,30,10);
        b2.display();
    }
}
