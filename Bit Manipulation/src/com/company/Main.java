package com.company;

public class Main {
public static void oddOrEven(int n){
    int bitmask=1;
    if((n & bitmask)==0){
        System.out.println("Number is even");
    }
    else{
        System.out.println("Number is odd");
    }
}
    public static void main(String[] args) {
        oddOrEven(1);
        oddOrEven(2);
        oddOrEven(3);
        oddOrEven(4);
    }
}
