package com.company;
import java.util.*;
public class Prime {

    public static int fun(int n){
        int ans,f=0;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                f=1;
                break;
            }
        }
        if(f==1){
            return 0;
        }
        else{
            return 1;
        }

    }

    public static void main(String args[]){
        int a,b;
        Scanner io=new Scanner(System.in);
        System.out.println("Enter range:");
        a=io.nextInt();
        System.out.println("Prime number in given range :");
        for(int i=2;i<=a;i++){
            if(fun(i)==1) {
                System.out.println(i);
            }
        }

    }
}
