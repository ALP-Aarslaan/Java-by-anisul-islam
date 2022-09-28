package com.company;

public class $72_String_palindrome {
    public static void main(String[] args) {
        String a="mad";
        /*
        we cant reverse a string using reverse method but we can reverse
        a string buffer to reverse string but at first we need to use
        to string method to make the string buffer as a string;
         */
        StringBuffer sb=new StringBuffer(a);

        String b=sb.reverse().toString();
        System.out.println("after reversing:"+b);
        if(a.equals(b))
        {
            System.out.println("palindrome");
        }
        else
            System.out.println("not palindrome");

    }
}
