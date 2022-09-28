package com.company;

public class $67String {
    public static void main(String[] args) {
        /*
        in java string is an object
        we can create string using String method,String Buffer and String Builder
        method;
         */
        String s1="Mohammad Jonayed Sarkar";
        String s2=new String("Mohammad Jonayed Sarkar");
        System.out.println(s1);
        System.out.println(s2);
        char s3[]={'M','o','h','a','m','m','a','d'};
        System.out.println(s3);
        /*character type array is also known as string
        we can use length method to find the length of a string
         */
        int size=s1.length();
        System.out.println("length of s1:"+size);
        /*
        to find two string equal or not:
        we can use compare operator if(s1==s2)
        but it will return not equal because in java two string means two object
        and they are reference type data and reference type data's address are
         not same


         */
        //using equals method;
        if(s1.equals(s2)){
            System.out.println("equals");
        }
        else
            System.out.println("not equal");
        //using contains method;
        if(s1.contains(s2)){
            System.out.println("equals");
        }
        else
            System.out.println("not equals");
        /*
        in order to ignore case sensitivity we can use
        equalsIgnoreCase method
         */
        String a1="mohammad jonayed";
        String a2=new String("MOHAMMAD JONAYED");
        if(a1.equalsIgnoreCase(a2))
            System.out.println("equal");
        else
            System.out.println("not equal");
        /*
        contains method ;
         */
        boolean check=a1.contains("jonayed");
        System.out.println(check);
        boolean check1=a1.contains("Arafin");
        System.out.println(check1);
        //isEmpty method;
        boolean b=s1.isEmpty();
        System.out.println(b);

    }
}
