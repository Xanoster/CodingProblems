public class sudoku {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit) {
        //column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }

        }
        //row
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }
        //grid
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean sudokuSolver(int sudoku[][], int row, int col) {
        //base case
        if (row == 9) {
            return true;
        }
        //reached end of row
        if (col == 9) {
            return sudokuSolver(sudoku, row + 1, 0);
        }
        //if cell is already filled, skip to next cell
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, row, col + 1);
        }
        //try all possible digits
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                //recursive call
                if (sudokuSolver(sudoku, row, col + 1)) {
                    return true;
                }
                //if recursive call returns false, backtrack
                sudoku[row][col] = 0;
            }
        }
        //no possible solution found
        return false;
    }

    public static void main(String[] args) {
        int sudoku[][] = {
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            // print the solved sudoku board
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
