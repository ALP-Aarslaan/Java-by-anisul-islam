package com.company;

public class $111Inherit_private_member {
    public static void main(String[] args) {
        class person{
            private String name;
            private int age;
            public void setName(String name){
                this.name=name;
            }
            public String getName() {
                return name;
            }
               public void setAge(int age){
                this.age=age;
               }
               public int getAge(){
                return age;
               }
        }
        class teacher extends person{
            /*
            honestly speaking we  cant inherit private variable form a class
            in order to inherit we have to use setter and getter method
             */
            private String sub;

            public void setSub(String sub) {
                this.sub = sub;
            }
            public String getSub() {
                return sub;
            }
            void display(){
                System.out.println("name:"+getName());
                System.out.println("age:"+getAge());
                System.out.println("subject:"+getSub());
            }

        }
        person p1=new person();
        teacher t1=new teacher();
        t1.setName("mohammad");
        t1.setAge(22);
        t1.setSub("CSE");
        System.out.println("name:"+t1.getName());
        System.out.println("age:"+t1.getAge());
        System.out.println("subject:"+t1.getSub());
        System.out.println();
        t1.display();
    }
}
