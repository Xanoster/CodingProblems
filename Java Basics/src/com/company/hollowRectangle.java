package com.company;

import java.util.Scanner;

public class hollowRectangle {
    public static void hollowRectangle(int a,int b) {
        //a=rows b=columns
        for (int i = 1; i <=a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i == 1 || i == a || j == 1 || j == b) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
    }
        public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        hollowRectangle(a,b);
        }
    }
