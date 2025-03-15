package com.company;

public class hollow_rhombus {
    public static void hollowrhombus(int a){
        for(int i=1;i<=a;i++) {
            for (int j = i; j <= a; j++) {
                System.out.print(" ");
            }
            //hollow rectangle
            for(int j=1;j<=a;j++)
            if(i==1 || i<=a || j==1 || j==a){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        hollowrhombus(4);
    }
}
