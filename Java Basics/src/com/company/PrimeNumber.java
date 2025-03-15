package com.company;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

       boolean isPrime=true;
        for(int i=2;i<Math.sqrt(a);i++){
            if(a%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime==true){
            System.out.println("prime");
        }
        else{
            System.out.println("Composite");
        }

        //Another method


            int temp = 0;
            for (int i = 2; i < Math.sqrt(a); i++) {
                if (a % i == 0) {
                    temp = temp + 1;
                }
            }
            if (temp > 0) {
                System.out.println("Composite");
            } else {
                System.out.println("Prime");
            }
        }
    }

