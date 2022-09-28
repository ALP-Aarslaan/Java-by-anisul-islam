package com.company;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class $78_Date {
    public static void main(String[] args) {
        /*
        here will learn about how to add current  date in our java program;
         */
        Date date=new Date();
        System.out.println(date);
        //next way of printing date
        DateFormat dateformat=new SimpleDateFormat("dd/MM/YYYY");
        String cdate=dateformat.format(date);
        System.out.println("current date:"+cdate);

    }
}
