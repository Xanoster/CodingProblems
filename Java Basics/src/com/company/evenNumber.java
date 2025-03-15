package com.company;

import java.util.Scanner;

public class evenNumber {
    public static Boolean isEven(int a){
        if(a%2==0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(isEven(a)){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd ");
        }
    }
}
