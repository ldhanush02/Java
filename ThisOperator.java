package com.company;

class A1{
    int a,b;
    A1(int a,int b){
        this.a=a;
        this.b=b;
    }
    void dis(){
        System.out.println("Product of two numbers is "+(a*b));
    }
}
public class ThisOperator {
    public static void main(String args[]){
        A1 obj=new A1(2,3);
        obj.dis();
    }
}
