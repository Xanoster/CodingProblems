package com.company;

public class floyd_Triangle {
    public static void Floyd(int a) {
        int n=1;
        for (int i = 1; i <= a; i++) {
            for (int j=1; j<=i; j++) {
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Floyd(5);
    }
}
