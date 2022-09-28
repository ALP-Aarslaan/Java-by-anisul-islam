package com.company;

public class $70StringPart4 {
    public static void main(String[] args) {
        String a="mohammad jonayed sarkar";
        //replace method;
        String b=a.replace('n','N');
        System.out.println(b);
        System.out.println(a);
        /*
        in split method work like : if we give space
         in split method it ignores the spaces and print all the other
         characters ,
         we slice strings in many pieces
         */
        String s[]=a.split("n");
        for(String x:s){
            System.out.print(x);
        }
    }
}
