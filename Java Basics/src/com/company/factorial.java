package com.company;
import java.util.*;
public class factorial {
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f*=i;
        }
        return (f);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int f=factorial(a);
        System.out.println(f);
    }
}