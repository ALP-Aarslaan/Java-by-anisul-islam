package com.company;

import java.util.LinkedList;

public class $148_Student_list {
    public static void main(String[] args) {
        LinkedList<student> list=new LinkedList<student>();
        student s1=new student("mohammad","two",1);
        student s2=new student("jonayed","three",2);
        student s3=new student("sarkar","three",3);
        //adding student
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for(student x:list){
            System.out.println(x.name+","+x.className+","+x.id);
        }

    }

}
class student{
    String name,className;
    int id;
    student(String name,String classname,int id){
        this.className=classname;
        this.id=id;
        this.name=name;
    }

}
