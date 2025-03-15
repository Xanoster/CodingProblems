package com.company;

import java.util.Scanner;

public class PrimeRange {
    public static boolean Prime(int a){
        boolean isPrime=true;
        for(int i=2;i<a;i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
    public static void PrimesRange(int a) {
        for (int i = 2; i <= a; i++) {
            if(Prime(i)){
                System.out.println(i+" ");
            }
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        PrimesRange(a);
    }
}
