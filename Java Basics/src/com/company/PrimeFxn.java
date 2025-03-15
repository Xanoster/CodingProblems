package com.company;

import java.util.Scanner;

public class PrimeFxn {
    public static boolean PrimeNumber(int a) {
        boolean isPrime = true;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        boolean g=PrimeNumber(a);
        if(g) {
            System.out.println("Prime");
        }
        else {
            System.out.println("Non Prime");
        }
    }
}
