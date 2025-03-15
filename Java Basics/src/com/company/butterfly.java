package com.company;

public class butterfly {
    public static void butterfly(int a) {
        for (int i = 1; i <= a; i++) {
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (a - i); j++) {
                System.out.print(" ");
            }
            //stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
     for (int i = a; i >=1; i--) {
        //stars
        for (int j = 1; j <=i; j++) {
            System.out.print("*");
        }
        //spaces
        for (int j = 1; j <= 2 * (a - i); j++) {
            System.out.print(" ");
        }
        //stars
        for (int j = 1; j <= i; j++) {
            System.out.print("*");

        }
        System.out.println();
    }
}
    public static void main(String[] args) {
        butterfly(4);
    }
}
