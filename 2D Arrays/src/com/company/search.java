package com.company;

import java.util.Scanner;

public class search {
    public static boolean searchInMatrix(int Matrix[][], int key) {
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                if (Matrix[i][j] == key){
                    System.out.println("i ="+i+" , "+"j ="+j);
                    return true;
                }
            }
        }
        System.out.println("Not found");
        return false;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int matrix[][]=new int[3][2];
       int m=3;
       int n=2;
       for(int i=0;i<m;i++){
           for(int j=0;j<n;j++){
               matrix[i][j]=sc.nextInt();
           }
        }
        searchInMatrix(matrix, 3);
    }
}
