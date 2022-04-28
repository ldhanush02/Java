package com.company;
import java.util.*;
public class Main {

    public static int fun(int r,int l){
        int ans=1;
        while(l>0){
            ans=ans*r;
            l=l-1;
        }

        return ans;
    }

    public static void main(String[] args) {
	// write your code here
        Scanner io= new Scanner(System.in);
        int n,r,ans=0,temp;
        System.out.println("Enter number:");
        n=io.nextInt();
        temp=n;
        int length = String.valueOf(n).length();
        while(n!=0){
            r=n%10;
            ans=ans+fun(r,length);
            n=n/10;
        }
        if(ans==temp){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not a Armstrong number");
        }

    }
}
