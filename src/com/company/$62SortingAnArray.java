package com.company;

import java.util.Arrays;

public class $62SortingAnArray {
    public static void main(String[] args) {
        int num[]={10,-3,18,5,25};
        Arrays.sort(num);
        /* we have sorted array using Arrays.sort method
        int this method we have to give correct data type in it
         */
        System.out.println("Ascending order:");
        for(int i=0;i<num.length;i++){
            System.out.print("\t"+num[i]);
        }
        System.out.println();
        System.out.println("descending order:");
        for(int i=num.length-1;i>=0;i--){
            System.out.print("\t"+num[i]);
        }
        String names[]={"mohammad","jonayed","sarkar"};
        Arrays.sort(names);
        System.out.println();
        System.out.println("ascending order:");
        for(int i=0;i<names.length;i++){
            System.out.print(" "+names[i]);
        }
        System.out.println();
        System.out.println("descending order:");
        for(int i=names.length-1;i>=0;i--){
            System.out.print(" "+names[i]);
        }


    }
}
