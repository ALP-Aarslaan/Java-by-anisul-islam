package com.company;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;

public class $79_time {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println("time now:"+time);
        //another method to print time:
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("hh:mm:ss");
        String a=time.format(formatter);
        System.out.println("local time:"+a);

    }
}
