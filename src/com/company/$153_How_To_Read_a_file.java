package com.company;

import java.io.File;
import java.util.Scanner;

public class $153_How_To_Read_a_file {
    public static void main(String[] args) {
        try{
            File file1=new File("teacher.txt");
            System.out.println(file1.getAbsolutePath());
            Scanner scan=new Scanner(file1);
            while(scan.hasNext()){
                String id=scan.next();
                String name=scan.next();
                System.out.println("ID:"+id+",Name:"+name);
            }
            scan.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
