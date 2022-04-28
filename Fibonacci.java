package com.company;
import java.util.*;
public class Fibonacci {

    public static int fun(int n){
        if(n==1){
            return 0;
        }
        else if(n==2||n==3){
            return 1;
        }
        else{
            return fun(n-1)+fun(n-2);
        }
    }
    public static void  main(String args[]){
        Scanner io=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= io.nextInt();
        System.out.println(n+" index in Fibonacci Series :"+fun(n));
    }

}
