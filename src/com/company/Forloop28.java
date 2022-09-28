package com.company;

public class Forloop28 {
    public static void main(String[] args) {
        //here we will learn about for loop;
        /*
        loop allows us to execute a statement multiple times
        we use for loop when we know where to stop
         */
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " BANGLADESH");
            }
        }

        for (int j = 10; j >= 1; j--) {
            System.out.println(j);
        }
    }
}
