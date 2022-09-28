package com.company;

public class $108Setter_And_Getter_method {
    public static void main(String[] args) {
        /*
        setter and getter method to access private data;
         */
        class person{
            String name;
            int age;
            void display(){
                System.out.println("name:"+name);
                System.out.println("age:"+age);
            }
        }
        person p1=new person();
        p1.age=21;
        p1.name="mohammad";
        p1.display();

        class person1{
            private String name;
            private int age;
            public void setName(String name){
                this.name=name;
            }
            public String getName(){
                return name;
            }
            public void setAge(int age){
                this.age=age;
            }
            public int getAge(){
                return age;
            }
        }
        person1 p=new person1();
        p.setName("mohammad");
        String b=p.getName();
        System.out.println("name:"+b);
        p.setAge(22);
        int age=p.getAge();
        System.out.println("my age:"+age);
    }
}
