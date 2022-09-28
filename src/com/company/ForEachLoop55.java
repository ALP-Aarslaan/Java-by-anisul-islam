package com.company;

public class ForEachLoop55 {
    public static void main(String[] args) {
        /*
        here we will learn about for each loop:
        its also known as enhanced for loop;
        its also used for array and collection;
        syntax;
        for(String x:name){
        array element
        }
        in for each loop we  dont need to give any stopping value to stop the
        loop
        we just have to pass the string and it will automatically insert
        string components accordingly we entered
         */
        String name[]=new String[4];
        name[0]="jonayed";
        name[1]="jonayed1";
        name[2]="mohammad";
        name[3]="sarkar";
        for(int i=0;i<4;i++){
            System.out.println(name[i]);
        }
        String n[]={"mohammad","jonayed","sarkar"};
        int i;
        for(i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
        System.out.println("size of this string:"+n.length);
        for (String x:n){
            System.out.println(x);
        }
        int num[]={1,2,3,4,5,6,7,8,9,10},sum=0;
        for(int y:num){
            System.out.println(y);
            sum=sum+y;
        }
        System.out.println("total sum:"+sum);

    }
}
