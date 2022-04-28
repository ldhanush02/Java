package com.company;
import java.util.*;
public class Quadratic {

    public static void main(String args[]){
        int a,b,c,ans;
        Scanner io=new Scanner(System.in);
        System.out.println("Enter Value of a:");
        a=io.nextInt();
        System.out.println("Enter Value of b:");
        b=io.nextInt();
        System.out.println("Enter Value of c:");
        c=io.nextInt();
        ans=((b*b)-(4*a*c));
        if(ans>=0){
            ans=(int)Math.sqrt(ans);
            System.out.println("Roots are:");
            System.out.println((-b+ans)/2*a);
            System.out.println((-b-ans)/2*a);
        }
        else{
            System.out.println("No roots");
        }

    }
}
