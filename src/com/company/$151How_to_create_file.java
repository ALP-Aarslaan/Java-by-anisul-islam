package com.company;

import java.io.File;

public class $151How_to_create_file {
    public static void main(String[] args) {
        /*

         */
        File a=new File("Person");
        a.mkdir();//directory will be created;
        String b=a.getAbsolutePath();
        System.out.println("directory path:"+b);
        System.out.println(a.getName());
        /*
        if(a.delete()){
            System.out.println(a.getName()+"is deleted");
        }

         */
        File file1=new File("/home/mohammad/IdeaProjects/java programming/Person/student.txt");
        File file2=new File("/home/mohammad/IdeaProjects/java programming/Person/teacher.txt");

        try{
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("files are created");

        }catch(Exception e){
            System.out.println(e);
        }
        if(file1.exists()){
            System.out.println("File exists");
        }
        file2.delete();
        if(file2.exists()){
            System.out.println("File 2 exists");

        }
        else
            System.out.println("file2 not exists");

    }
}
