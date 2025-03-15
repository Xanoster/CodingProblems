package com.company;

import java.util.*;
public class functionParameter {
    public static int CalculateSum(int a, int b) { //formal parameters

        return (a+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = CalculateSum(a, b); //arguments a & b or actual parameters
        System.out.println(sum);
    }
}
