package com.company;

public class InvertPyramid {
    public static void InvertedPyramid(int a) {
        for(int i=1;i<=a;i++){
            for(int j=i;j<=a-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
    InvertedPyramid(5);
    }
}
