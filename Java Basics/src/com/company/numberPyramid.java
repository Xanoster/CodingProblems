package com.company;

public class numberPyramid {
    public static void NumberPyramid(int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


    //Palindromic Triangle
    public static void palindrome(int a) {
        for (int i = 1; i <= a; i++) {
            //spaces
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            //descending
            for (int j = i; j >=1; j--) {
                System.out.print(j);
            }
            //ascending
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
//NumberPyramid(4);
        palindrome(4);
    }
}
