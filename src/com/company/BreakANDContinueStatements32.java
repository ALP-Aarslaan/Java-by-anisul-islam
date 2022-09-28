package com.company;

public class BreakANDContinueStatements32 {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i=i+2){
            if(i==10){
                break;
            }
            System.out.println(i);

        }
        /*
        continue statement works when the condition matches
        then it doesn't print the statement it returns the control to loop
        and prints next statement until the loop condition satisfies
         */
        for(int j=1;j<=100;j++){
            if(j==10){
                continue;
            }
            System.out.println(j);
        }
    }
}
