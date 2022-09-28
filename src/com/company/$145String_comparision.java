package com.company;

public class $145String_comparision {
    public static void main(String[] args) {
        String pass1="a2345";
        String pass2="A2345";
        System.out.println(pass1==pass2);
        String pass3=new String("Mohammad");
        String pass4=new String("mohammad");
        System.out.println(pass3==pass4);
        System.out.println(pass1.equalsIgnoreCase(pass2));
        System.out.println(pass3.equalsIgnoreCase(pass4));


    }
}
