package com.company;

public class $83_Parameterized_Method {
    public static void main(String[] args) {
        /*
        parameterized method is like function
        it will receive some parameter;syntax of it is given below;
         */
        class teacher{
            String name,gender,number;
            void setInfromation(String n,String m,String p){
                name=n;
                gender=m;
                number=p;
            }
            void displayInformation(){
                System.out.println("name:"+name);
                System.out.println("gender:"+gender);
                System.out.println("number:"+number);
                System.out.println("\n\n");
            }
        }
        teacher t1=new teacher();
        t1.setInfromation("mohammad JOnayed","male","01861469907");
        t1.displayInformation();
        teacher t2=new teacher();
        t2.setInfromation("jonayed","male","018787654");
        t2.displayInformation();
    }
}
