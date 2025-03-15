package com.company;

public class assignment {

    //question 1

    public static int countof7(int array[][]) {
        int count7 = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] == 7) {
                    count7++;
                }
            }
        }
        return count7;
    }

    //question 2

    public static int sum(int matrix[][]) {
        int sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[1][j];
        }
        return sum;
    }

    //question 3

    //transpose of matrix
    public static int[][] transpose(int matrix[][]) {

        int row = matrix.length;
        int column = matrix[0].length;

        int transpose[][] = new int[column][row];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    public static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
    int matrix[][]={{1,2,3},{4,5,6}};
    int mat[][]=transpose(matrix);
    printMatrix(mat);
    }
}
