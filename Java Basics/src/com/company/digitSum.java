package com.company;

import java.util.Scanner;

public class digitSum {
    public static int sumOfDigits(int a){
        int sum=0;
        while(a>0){
            int LastDigit=a%10;
            sum+=LastDigit;
            a=a/10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(sumOfDigits(a));
    }
}
