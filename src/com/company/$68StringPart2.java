package com.company;

public class $68StringPart2 {
    public static void main(String[] args) {
        String name="mohammad";
        String name1="jonayed";
        /*
        here we will learn about string concatenation
        using + operator
         */
        String fullname=name + " "+name1;
        System.out.println("full name is:"+fullname);
        //using concate method
        String Fullname=name.concat(" "+name1);
        System.out.println(Fullname);
        //how to convert in upper case
        //we will use touppercase method;
        String upper=Fullname.toUpperCase();
        System.out.println("name in uppercase letter:"+upper);
        //we use toLowercase to convert in lower case letter;
        String lower=Fullname.toLowerCase();
        System.out.println("name in lowercase letter:"+lower);
        //endsWith or startsWith method to see if the string starts with a certain letter:
        //we have to store it in a boolean variable
        boolean b=Fullname.startsWith("m");
        System.out.println(b);
        boolean b1=Fullname.endsWith("r");
        System.out.println(b1);
        //how to declare string array;
        String names[]={"mohammad","jonayed","sarkar"};
        for(String x:names){
            System.out.println(x);
        }
        for(int i=0;i<names.length;i++){
            System.out.println(names[i]);
        }
    }
}
