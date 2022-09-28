package com.company;

public class $103Variable_length_argument {
    public static void main(String[] args) {
        /*
        in java if we create a method that takes 2 integer and give its sum
        but if we give 3 integers as arguments then this method won't work
        we have to create another argument and this method making each time
        is very time consuming
        to solve this problem we have to use variable length argument
        syntax of variable length argument:
        class name{
        void display(data type...parameter name){
        //code to execute
        }
         */
        class add{
            void display(int...num){
                int sum=0;
                for(int x:num){
                    sum=sum+x;
                }
                System.out.println("total sum:"+sum);
            }
        }
        add n=new add();
        n.display(10,10,10,10,10);
    }
}
