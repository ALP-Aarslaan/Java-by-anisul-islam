package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class $66SortingAnArrayList {
    public static void main(String[] args) {
        /*
        here we will learn about array list sorting

         */
        ArrayList<Integer>num=new ArrayList<>();
        num.add(0,1);
        num.add(1,12);
        num.add(2,3);
        num.add(3,6);
        num.add(4,-2);
        System.out.println("before sorting:");
        for(int x:num){
            System.out.println(x);
        }
        /*
        we will use collection.sort method to sort an array list;
         */
        Collections.sort(num);
        System.out.println("after sorting in ascending order:"+num);
        /*in order to see in descending order
        we have to use again Collection.sort(num,Collection.reverseOrder());
         */
        Collections.sort(num,Collections.reverseOrder());
        System.out.println("after sorting in descending:"+num);
    }
}
