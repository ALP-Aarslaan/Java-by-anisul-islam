package com.company;

public class $74_Wrapper_Class {
    public static void  main(String args[]){
        /*
        we so far know that java is a object oriented programming language
        using wrapper class we can convert the primitive data type to a object
        and object to a primitive data type
        Wrapper class are:| primitive data types:
        Boolean;          |boolean;
        Character;        |char;
        Byte;             |byte;
        Short;            |short;
        Integer;          |int;
        Long;             |long;
        Float;            |float;
        Double;           |double;
        autoboxing:converting primitive data type to object;
        unboxing:converting object to primitive data type;
         */
        //autoboxing:primitive to object;
        int x=30;
        Integer y=Integer.valueOf(x);//we used valueOf method here
        System.out.println("y="+y);
        Integer z=x;
        /*Integer.valueOf(x) is automatically written by java
        and its called autoboxing;
        */
        System.out.println("z="+z);
        /*
        now will see unboxing:object to primitive;
         */
        Double d=new Double(23.45);
        System.out.println("d="+d);
        //to convert in primitive form;
         double e=d.doubleValue();
        System.out.println("e="+e);
        //easiest way to unboxing:
        double f=d;
        System.out.println("f="+f);

    }
}
