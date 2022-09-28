package com.company;

import java.util.Scanner;

public class $105Recursive_method {
    public static void main(String[] args) {
        class factorial{
            int fact(int n){
                if(n==1)
                    return 1;
                else
                    return n*fact(n-1);
            }

        }
        Scanner scan=new Scanner(System.in);
        factorial n=new factorial();
        int result= n.fact(5);
        System.out.println("factorial is:"+result);
    }
}
