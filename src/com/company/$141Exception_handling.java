package com.company;

public class $141Exception_handling {
    public static void main(String[] args) {
        try {
           // int x = 10;
            //int y = 0;
            //int result = x / y;
            //System.out.println("result:" + result);
            int a[]=new int[4];
            a[4]=10;
        }
        /*
        we have to give super class exception after sub class exception
        otherwise it won't work

        catch(ArithmeticException e){
            System.out.println("exception:"+e);
        }
        catch (ArrayIndexOutOfBoundsException a){
            System.out.println("exception:"+a);
        }

         */
        catch(Exception x){//this line is for all kind of exception might come
            System.out.println("exception:"+x);
        }


    {
        System.out.println("last line of the program");
    }

    }

}
