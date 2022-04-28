package com.company;
class outer{
    void show(){
        System.out.println("This is show method of outer class");
    }
    class inner{
        void show(){
            System.out.println("This is show method of inner class");
        }
    }
}

public class InnerClass {
    public static void main(String args[]){
        outer obj1=new outer();
        obj1.show();
        outer.inner obj2=obj1.new inner();
        obj2.show();
    }
}
