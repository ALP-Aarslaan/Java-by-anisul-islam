package com.company;

import java.util.ArrayList;
import java.util.Iterator;

public class $63ArrayList {
    public static void main(String[] args) {
        /*
        array va array list:
        array static and its size fixed & array list size dynamic;
        in array we use for,for each loop but in array list we can only use
        for each loop,iterator;
        array is fast but array list comparatively slow;
        array. length/for array list array.size( );
         */
        ArrayList<Integer> num=new ArrayList<Integer>();

        //adding elements;
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(3,40);
        num.add(4,50);
        System.out.println(num);

        for(int x:num){
            System.out.print(" "+x);
        }
        System.out.println();
        System.out.println("size="+num.size());
        //using iterator
        Iterator itr=num.iterator();
        while(itr.hasNext()){
            System.out.print(" "+itr.next());
        }
        //how to remove elements
        num.remove(2);
        System.out.println();
        System.out.println("after removing:");
        System.out.println(num);
        System.out.println();
        num.removeAll(num);
        System.out.println("after removing all:"+num);
    }
}
