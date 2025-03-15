package com.company;

public class rhombus {
    public static void rhombus(int a){
        for(int i=1;i<=a;i++) {
            for (int j = 1; j <= a - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= a; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        }
    public static void main(String[] args){
        rhombus(4);
    }
}
