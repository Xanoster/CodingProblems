package com.company;

public class swap {
    public static void main(String args[]){
        int a=4;int b=1;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a+" and "+b);
    }
}
