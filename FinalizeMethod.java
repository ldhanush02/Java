package com.company;
class Demo{
    Demo(int a,int b){
        System.out.println("Product is "+(a*b));
        System.out.println("This is constructor for Demo Class ");
    }
    protected void finalize(){
        System.out.println("This is finalize method in Demo class");
    }
}

public class FinalizeMethod {
    public static void main(String args[]){
        Demo obj1=new Demo(2,3);
        obj1=null;
        System.gc();
        Demo obj2=new Demo(4,5);
        obj2=obj1;
        System.gc();
        new Demo(3,5);
        System.gc();

    }
}
