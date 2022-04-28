package com.company;

public class VLA {
    public static void main(String...a){
        int sum=0;
        for(int i=0 ; i<a.length ;i++){
            sum=sum+Integer.parseInt(a[i]);
        }
        System.out.println("Sum of all the elements in array is "+sum);

    }
}
