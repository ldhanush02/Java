package com.company;
import java.util.*;
public class Adam {

    public static int fun(int n){
        int ans=0;
        while(n!=0){
            ans=(ans*10)+(n%10);
            n=n/10;
        }
        return ans;

    }

    public  static  void main(String args[]){
        Scanner io=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=io.nextInt();
        int n1=n*n,rev,rev1;
        rev=fun(n);
        rev=rev*rev;
        rev1=fun(rev);
        if(rev1==n1){
            System.out.println("It is a Adam number");
        }
        else{
            System.out.println("It is not a Adam number");
        }

    }

}
