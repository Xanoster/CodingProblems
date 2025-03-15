package com.company;

public class searchSorted {
    public static boolean StaircaseSearch(int matrix[][], int key) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (row < matrix.length && column >= 0) {
            if (matrix[row][column] == key) {
                System.out.println("key found at " + row + " " + column);
                return true;
            } else if (key < matrix[row][column]) {
                column--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 0}};
        int key = 2;
        StaircaseSearch(matrix,key);
    }
}
