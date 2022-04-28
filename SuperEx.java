package com.company;

class Pa{
    Pa(){
        System.out.println("This is Pa");
    }
    Pa(int x){
        System.out.println("This Pa constructor class and value is "+x);
    }
}
class Ca extends  Pa{
    Ca(){
        System.out.println("This is Ca");
    }
    Ca(int x){
        super(x);
        System.out.println("This Ca constructor class and value is "+x);
    }
}
public class SuperEx {
    public static void main(String args[]){
        Ca obj1=new Ca(3);
    }
}
