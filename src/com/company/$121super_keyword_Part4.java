package com.company;

public class $121super_keyword_Part4 {
    public static void main(String[] args) {
        class vehicle{
            String colour;
            double weight;
            vehicle(String c,double w){
                colour=c;
                weight=w;
            }
            void details(){
                System.out.println("colour:"+colour);
                System.out.println("weight:"+weight);
            }
        }
        class car extends vehicle{
            int gear;
            car(String c,double w,int g){
                super(c,w);//super class constructor call must be in 1st line
                gear=g;
            }
            void details(){
                /*
                System.out.println("colour:"+colour);
                System.out.println("weight:"+weight);
                 */
                super.details();
                System.out.println("gear:"+gear);
            }
        }
        car c=new car("white",350,12);
        c.details();
        vehicle v=new vehicle("red",356);
        v.details();


    }
}
