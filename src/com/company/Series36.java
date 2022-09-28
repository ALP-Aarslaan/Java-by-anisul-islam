package com.company;

import java.util.Scanner;

public class Series36 {
    public static void main(String args[]){
        //here we will find out about multiplicative series
        int i,n,sum=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter value for n:");
        n=scan.nextInt();
        for(i=1;i<=n;i++){
            System.out.println(i);
            sum=sum*i;
        }
        System.out.println("total multiplication : "+sum);
        int j,sum1=1;
        for(j=1;j<=n;j++){
            if(j%2!=0) {
                System.out.println(j);
                sum1 = sum1 * j;
            }
        }
        System.out.println("total multiplication:"+sum1);
    }

}
