/*
    Sudoku
    Write a Function to complete a Sudoku.
 */
package T18BackTracking;

public class L6Sudoku {
    public static void main(String[] args) {
        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 0, 0 },
                { 6, 0, 0, 1, 9, 5, 0, 0, 0 },
                { 0, 9, 8, 0, 0, 0, 0, 6, 0 },
                { 8, 0, 0, 0, 6, 0, 0, 0, 3 },
                { 4, 0, 0, 8, 0, 3, 0, 0, 1 },
                { 7, 0, 0, 0, 2, 0, 0, 0, 6 },
                { 0, 6, 0, 0, 0, 0, 2, 8, 0 },
                { 0, 0, 0, 4, 1, 9, 0, 0, 5 },
                { 0, 0, 0, 0, 8, 0, 0, 7, 9 }
        };

        if (sudokuSolver(sudoku, 0, 0)) {
            // print solution
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("solution does not exist");
        }
    }

    static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // base case
        if (row == 8 && col == 8) {
            return true;
        }

        // calculating row and col of next cell
        int nextRow = row, nextCol = col + 1;
        if (col == 8) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // call sudokuSolver for next cell if current cell is already filled
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // trying to fix a digit at current cell
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudokuSolver(sudoku, nextRow, nextCol)) { // solution exist
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }

        return false;
    }

    static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // checking is row safe
        for (int j = 0; j < 9; j++) {
            if (sudoku[row][j] == digit) {
                return false;
            }
        }

        // checking is column safe
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // checking is 3 X 3 grid safe
        int rowStart = 3 * (row / 3), rowEnd = rowStart + 3;
        int colStart = 3 * (col / 3), colEnd = colStart + 3;
        for (int i = rowStart; i < rowEnd; i++) {
            for (int j = colStart; j < colEnd; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;
    }
}
