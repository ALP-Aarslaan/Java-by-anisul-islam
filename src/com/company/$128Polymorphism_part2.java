package com.company;

public class $128Polymorphism_part2 {
    public static void main(String[] args) {
        class shape{
            double area(){
                System.out.println("area for shape:");
            return 0;
            }
        }
        class rectangle extends shape{
            double length,width;
            rectangle(double length,double width){
                this.length=length;
                this.width=width;
            }
            double area(){
                System.out.println("area for rectangle:");
                return length*width;
            }
        }
        class triangle extends shape{
            double base,height;
            triangle(double base,double height){
                this.base=base;
                this.height=height;
            }
            double area(){
                System.out.println("area for triangle:");
                return 0.5*base*height;
            }
        }
        shape s=new shape();
        rectangle r=new rectangle(10,20);
        triangle t=new triangle(10,20);
        double b=s.area();
        System.out.println("area:"+b);
        System.out.println(r.area());
        System.out.println(t.area());
        shape s1=new shape();
        shape s2=new rectangle(20,10);
        shape s3=new triangle(20,10);
        System.out.println();
        System.out.println(s1.area());
        System.out.println(s2.area());
        System.out.println(s3.area());
        //using array
        shape sh[]=new shape[3];
        sh[0]=new shape();
        sh[1]=new triangle(10,20);
        sh[2]=new rectangle(10,20);
        System.out.println();
        System.out.println(sh[0].area());
        System.out.println(sh[1].area());
        System.out.println(sh[2].area());
        System.out.println("\n\n");
        for(int i=0;i<3;i++){
            System.out.println(sh[i].area());
        }

    }
}
