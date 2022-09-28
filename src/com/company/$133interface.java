package com.company;

public interface $133interface {
    abstract void play();
}
interface b{
    void play();
}
class c implements $133interface,b{
    @Override
    public void play() {
        System.out.println("hello i am c");
    }
}
class run{
    public static void main(String[] args) {
        c ob=new c();
        ob.play();
    }
    }

