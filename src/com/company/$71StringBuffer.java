package com.company;

public class $71StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("MOhammad");
        System.out.println(sb);
        /*
        in string buffer we can change out original string;
         */
        //using append method we can add string or any data type with a string
        sb.append(" Sarkar");
        sb.append(25);
        System.out.println(sb);
        // we can use reverse method to reverse the string;
        sb.reverse();
        System.out.println(sb);
        //delete method to delete character from one index to another index; of a string.
        sb.delete(0,8);
        System.out.println(sb);
        /*
        using setLength method we can give any index number in this method
        and it will print all the characters from zero index to that given index
         */
        sb.setLength(9);
        System.out.println(sb);
    }
}
