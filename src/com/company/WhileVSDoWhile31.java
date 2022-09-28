package com.company;

public class WhileVSDoWhile31 {
    public static void main(String[] args) {
        /*
        difference between while and do while loop
         */
        int x=6;
        while(x<=5){
            System.out.println("IRAN");
            x++;
        }
        int i=6;
        do{
            System.out.println("bangladesh");
            i++;
        }while(i<=5);
    }
    /*
    while loop doesn't execute when condition doesn't satisfies
    on the other hand do while loop executes only one times even if the condition is false

     */
}
