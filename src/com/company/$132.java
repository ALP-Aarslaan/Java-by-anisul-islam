package com.company;

public interface $132 {
    abstract void eat();
}

class dog implements $132{
    @Override
    public void eat() {
        System.out.println("dogs can eat eggs");
    }
}
class cat implements $132{
    @Override
    public void eat() {
        System.out.println("cats are good");
    }
}
class test{
    public static void main(String[] args) {
        dog d=new dog();
        d.eat();
        cat c=new cat();
        c.eat();
    }
}
