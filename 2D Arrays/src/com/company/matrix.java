package com.company;

import java.util.Scanner;

public class matrix {
    public static void main(String[] args) {

        int matrix[][] = new int[3][2];
        int m = matrix.length;
        int n = matrix[0].length;
        //input
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}