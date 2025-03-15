package com.company;

//it means NcR , like formula for combination
// n!/[r!(n-r)]!

import java.util.Scanner;

public class Binomial {
    public static int factorial(int a){
        int f=1;
        for(int i=1;i<=a;i++){
            f=f*i;
        }
        return f;
    }
    public static int binomial(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binomial=fact_n/(fact_r*fact_nmr);
        return binomial;
    }

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        System.out.println(binomial(n,r));
    }
}
