package com.company;

public class $94_Static_Block {
    static int id;
    static String name;
    static{
        id=19101019;
        name="mohammad";
    }
    static void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println();
    }

    public static void main(String[] args) {
        $94_Static_Block a1=new $94_Static_Block();
        a1.display();
        $94_Static_Block.display();
    }
}
