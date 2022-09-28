package com.company;

public class Array52 {
    public static void main(String[]args){
        /*
        we will learn about array in java
        array is collection of variable of same data type;
        how to declare an array:
        data type[]array name;
        int[]name;
        String[]names;
        in order to create array we have to use new operator
        non primitive data types like array string we have to use new operator
        because the are not built in data type like integer float,double,
        byte etc etc
        in order to create:
        array name= new data type[size of array];
        like:
        number=new int[10];


         */
        int []number;
        number=new int[10];
        /*
        or we can create array and declare in one line;
        int []number=new int[10]
         */
        int[] num=new int[5];
        //or we can create like this int num[]=new int[10];
        /*
        how to initialize an array;
        num[0],
        num[1],
        num[2],
        --num[4]
        they are called array index and array doesn't store negative value;
         */
        int num1[]=new int[5];
        num1[0]=1;
        num1[1]=2;
        num1[2]=3;
        num1[3]=4;
        num1[4]=5;
        int size;
        size=num1.length;

        System.out.println("array size:"+size);
        int sum= num1[0]+num1[1]+num1[2]+num1[3]+num1[4];
        System.out.println("total sum of this array:"+sum);
        /*
        how to declare multiple array
        int num1[]=new int[10], num2[]=new int[5];

         */
        int n[]=new int[5],n1 []=new int[4];



    }
}
