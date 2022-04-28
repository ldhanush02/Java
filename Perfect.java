package com.company;
import java.util.*;
public class Perfect {

    public static  void  main(String args[]){
        Scanner io=new Scanner(System.in);
        System.out.println("Enter number:");
        int n= io.nextInt();
        int ans=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                ans=ans+i;
            }
        }
        if(ans==n){
            System.out.println("It is a perfect number");
        }
        else{
            System.out.println("It is not a perfect number");
        }
    }
}
