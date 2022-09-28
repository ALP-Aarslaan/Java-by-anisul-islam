package com.company;

import java.util.Scanner;

public class AreaOfTriangle14 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        float base,height,area;
        System.out.println("enter base of a triangle:");
        base=scan.nextFloat();
        System.out.println("enter height of a triangle");
        height=scan.nextFloat();
        area=(float)1/2*base*height;
        System.out.println("area of a triangle:"+area);
        //how to find area of a circle;
        float radius,pi=3.1416F,area2;
        System.out.println("enter radius of a circle:");
        radius=scan.nextFloat();
        area2=pi*radius*radius;
        System.out.println("area of a triangle:"+area2);



    }
}
