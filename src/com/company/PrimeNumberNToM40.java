package com.company;

import java.util.Scanner;

public class PrimeNumberNToM40 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int i,j,n,m,count=0,totalprime=0;
        System.out.println("enter initial number:");
        m=scan.nextInt();
        System.out.println("enter final number:");
        n=scan.nextInt();
        for(i=m;i<=n;i++){
            for(j=2;j<=i-1;j++){
                if(i%j==0)
                    count++;
            }
            if(count==0) {
                totalprime++;
                System.out.println(i);
            }
                count = 0;

        }
        System.out.println("total prime number "+m+"to"+n+":"+totalprime);

    }
}
