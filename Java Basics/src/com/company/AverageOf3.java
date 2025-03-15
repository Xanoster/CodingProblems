package com.company;

//Q1 Practice question 

import java.util.Scanner;

public class AverageOf3 {
    public static float AverageNumber(float a, float b, float c) {
        float d = (a + b + c) / 3;
        return d;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        System.out.println(AverageNumber(a, b, c));
    }
}
