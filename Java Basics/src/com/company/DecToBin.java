package com.company;
import java.util.Scanner;
public class DecToBin {
    public static int Convert(int decimal){
        int pow=0;
        int binary=0;
        while(decimal>0){
            int rem=decimal%2;
            binary=binary+rem*(int)Math.pow(10,pow);
            pow++;
            decimal/=2;
        }
        return binary;
    }
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(Convert(a));
    }
}
