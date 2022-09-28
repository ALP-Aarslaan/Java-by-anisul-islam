package com.company;

public class $131problem_solving {
    public static void main(String[] args) {
        abstract class shape{
            double base,height;
            shape(double base,double height){
                this.base=base;
                this.height=height;
            }
            abstract void area();
        }
        class rectangle extends shape{
            rectangle(double height,double base)
            {
                super(base, height);
                //this.base=base;
                //this.height=height;

            }

            @Override
            void area() {
                double result=base*height;
                System.out.println("rectangle area:"+result);
            }
        }
        class triangle extends shape{
            triangle(double height,double base){
                super(base,height);
                //this.height=height;
                //this.base=base;
            }
            @Override
            void area() {
                double result=0.5*base*height;
                System.out.println("area of triangle:"+result);
            }
        }
        class circle extends shape{
            circle(double base){
                super(base,base);
                //this.base=base;
            }

            @Override
            void area() {
                double result=Math.PI*(base*base);
                System.out.println("area of circle:"+result);
            }
        }
        shape s1;
        s1=new triangle(5,5);
        s1.area();
        s1=new rectangle(5,5);
        s1.area();
        s1=new circle(5);
        s1.area();

    }
}
