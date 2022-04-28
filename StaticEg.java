package com.company;

class Demo1{
    static int a=20;
    Demo1(){
        System.out.println("This demo of static Constructor");
    }
    static void dis(){
        System.out.println("This is Static method");
    }
    void show(){
        System.out.println("This is normal method");
    }
    static {
        System.out.println("This is static block");
        System.out.println("The value of a in class is "+a);
    }
}
public class StaticEg {
    public static void main(String args[]){
        Demo1 obj1=new Demo1();
        obj1.dis();
        Demo1.dis();
        obj1.show();
        System.out.println("Value of a in main is "+Demo1.a);
    }
}
