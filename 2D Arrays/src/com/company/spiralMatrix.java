package com.company;

public class spiralMatrix {
        public static void SpiralMatrix(int matrix[][]){
           int row=0;
           int endRow= matrix.length-1;
           int column=0;
           int endColumn= matrix[0].length-1;
           while(row<=endRow && column<=endColumn){
               //top part of matrix
               for(int j=column;j<=endColumn;j++){
                   System.out.print(matrix[row][j]+" ");
               }
               //right side
               for(int i=row+1;i<=endRow;i++){
                   System.out.print(matrix[i][endColumn]+" ");
               }
               //bottom
               for(int j=endColumn-1;j>=column;j--){
                  if(row==endRow){
                       break;
                   }
                   System.out.print(matrix[endRow][j]+" ");
               }
               //left
               for(int i=endRow-1;i>=row+1;i--){
                   if(column==endColumn) {
                   break;
                   }
                   System.out.print(matrix[i][column]+" ");
               }
//               row++;
//               column++;
//               endRow--;
//               endColumn--;
        }
            System.out.println();
    }
    public static void main(String[] args) {
    int matrix[][] = {{1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 26}};
       SpiralMatrix(matrix);
    }
}
