package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class $64ArrayList {
    public static void main(String[] args) {
        //clear method in array list
        ArrayList<Integer>num=new ArrayList<Integer>();
        num.add(0,1);
        num.add(1,2);
        num.add(2,3);
        num.add(3,4);
        num.add(4,5);
        num.clear();
        System.out.println("after clear:"+num);
        boolean check=num.isEmpty();
        System.out.println("array list empty:"+check);
        /*
        is empty method to see if the array list is empty;
        if it is empty or not it will return true or false as a boolean value
        we have to store the value in a boolean type variable;
         */
        ArrayList<Integer>num1=new ArrayList<Integer>();
        num1.add(1);
        num1.add(2);
        num1.add(3);
        num1.add(4);
        num1.add(5);
        boolean check1=num1.isEmpty();
        System.out.println("array list empty:"+check1);
        /*contains method ,usong it we can find if a content is there in
        that array list.
        it will return a boolean value so we have to store the contains method
        in a boolean type variable;
         */
        boolean check3=num.contains(30);
        System.out.println("is exist:"+check3);
        /*index of method,using this we can know the index of a value which
        is in the array list;
        we have to store it in a integer type variable because it will return
        an integer type value ;
         */
        int index=num1.indexOf(5);
        System.out.println("index of it:"+index);
        /*
        set method & get method
        set method:
        we use it to set a value in a certain index;
        get method:
        we can get any value from a certain index;
         */
        num1.set(2,30);
        for(int x:num1){
            System.out.println(num1);
        }
        System.out.println("after setting:"+num1);
        int x1=num1.get(1);
        System.out.println(x1);
    }
}
