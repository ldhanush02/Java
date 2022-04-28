package com.company;
class A2{
    A2(int a,int b){
        System.out.println("Sum of two numbers is "+(a+b));
    }
    A2(int a,int b,int c){
        System.out.println(("Sum of three numbers is "+(a+b+c)));
    }
}
public class ConstructorOverLoading {

    public static void main(String args[]){
        A2 obj1=new A2(1,3);
        A2 obj2=new A2(1,6,9);
    }
}
