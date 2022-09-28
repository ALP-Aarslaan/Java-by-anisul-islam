package com.company;

public class $91_Static_Part3 {
    static int count=0;//nonstatic variable
    $91_Static_Part3(){
        count++;
    }
    void totalStudent(){
        System.out.println("total student:"+count);
    }
    public static void main(String[] args) {
        $91_Static_Part3 s1=new $91_Static_Part3();
        s1.totalStudent();
        $91_Static_Part3 s2=new $91_Static_Part3();
        s2.totalStudent();
        $91_Static_Part3 s3=new $91_Static_Part3();
        s3.totalStudent();
    }
}
