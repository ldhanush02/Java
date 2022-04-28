package com.company;

class A{
    int add(int a,int b){
        return (a+b);
    }
    int add(int a,int b,int c){
        return (a+b+c);
    }
}
public class MethodOverloading {
    public static void main(String args[]){
        A obj1=new A();
       System.out.println( obj1.add(2,3));
       System.out.println( obj1.add(2,5,1));


    }
}
