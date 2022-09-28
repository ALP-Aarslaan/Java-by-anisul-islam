package com.company;

import java.util.Random;

public class $80_Random_number {
    public static void main(String[] args) {
        Random rand=new Random();
        /*
        in order to generate random number we have to use random method and nextInt
        method ,in nextint method we have to give a boundary
        and this method will create random number zero to the boundary;
         */
        int randomnum=rand.nextInt(3);
        System.out.println("random number:"+randomnum);
        int r=((int)Math.random()*10);
        System.out.println(r);
    }
}
