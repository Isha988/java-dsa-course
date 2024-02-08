package T18BackTracking;

public class L4NQueens {
    public static void main(String[] args) {
        nQueens(new int[4][4], 0);
    }

    // we are setting one row in each row
    static void nQueens(int[][] matrix, int row) {

        if(row >= matrix.length){
            System.out.println("\n Matrix");
            printMatrix(matrix);
            return;
        }

        for (int i = 0; i < matrix[0].length; i++) {
            if (isSafe(matrix, row, i)) {
                matrix[row][i] = 1;
                nQueens(matrix, row + 1);
                matrix[row][i] = 0;
            }
        }
    }

    static boolean isSafe(int[][] matrix, int row, int col) {
        return colSafe(matrix, row, col)
                && isD1Safe(matrix, row, col)
                && isD2Safe(matrix, row, col);
    }

    static boolean colSafe(int[][] matrix, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (matrix[i][col] == 1) {
                return false;
            }
        }

        return true;
    }

    // checks left diagonal
    static boolean isD1Safe(int[][] matrix, int row, int col) {
        int i = row;
        int j = col;

        while (i >= 0 && j >= 0) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i--;
            j--;
        }

        return true;
    }

    // checks right diagonal
    static boolean isD2Safe(int[][] matrix, int row, int col) {
        int i = row;
        int j = col;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == 1) {
                return false;
            }
            i--;
            j++;
        }

        return true;
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
