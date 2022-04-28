package com.company;

class Parent{
    Parent(){
        System.out.println("This is a class constructor");
    }
    void dis(){
        System.out.println("In an Base and super class for childA");
    }
}
class ChildA extends Parent{
    void dis(){
        System.out.println("In a child and derived , subclass of Parent");
    }

}

public class SingleInheritance {
    public static void main(String args[]){
        Parent p1=new Parent();
        p1.dis();
        ChildA ch=new ChildA();
        ch.dis();
    }

}
