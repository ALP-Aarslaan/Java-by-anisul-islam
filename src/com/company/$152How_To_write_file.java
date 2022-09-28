package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;

public class $152How_To_write_file {
    public static void main(String[] args) {
        File file1=new File("mohammad");
        String path=file1.getAbsolutePath();
        System.out.println("file path:"+path);
        String name;
        int id;
        Scanner scan=new Scanner(System.in);
        try{
            
            Formatter formatter1=new Formatter("/home/mohammad/IdeaProjects/java programming/mohammad");
            formatter1.format("%s","%s",101,"mohammad");
            formatter1.format("%s","%s",102,"jonayed");
            formatter1.close();

        }catch(FileNotFoundException f){
            System.out.println(f);
        }
    }
}
