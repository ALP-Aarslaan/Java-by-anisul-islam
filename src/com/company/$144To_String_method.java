package com.company;

public class $144To_String_method {
    public static void main(String[] args) {
        class person{
            String name;
            int age;
            person(String name,int age){
                this.name=name;
                this.age=age;
            }
            public String toString(){
                return "name:"+name+"\n age:"+age;
            }
        }
        person p1=new person("mohammad",22);
        person p2=new person("jonayed",21);
        System.out.println(p1);
        System.out.println(p2);
    }
}
