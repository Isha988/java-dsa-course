package T18BackTracking;

public class Q3KnightTour {
    public static void main(String[] args) {
        int n = 3;
        int[][] board = new int[n][n];
        knightTour(board, 1, 0, 0);
        // printMatrix(board);
    }

    static void knightTour(int[][] board, int move, int i, int j){
        if(move == board.length * board.length + 1){
            System.out.println("reached");
            // board[i][j] = board.length * board.length - 1;
            // System.out.println("---------------------------");
            // printMatrix(board);
            // System.out.println("---------------------------");
            return;
        }

        // return if reached out of board or already visited cell
        if(i < 0 || j < 0 || i >= board.length || j >= board.length || board[i][j] != 0){
            return;
        }

        board[i][j] = move; // marked cell
        knightTour(board, move + 1, i + 2, j - 1);
        knightTour(board, move + 1, i + 2, j + 1);
        knightTour(board, move + 1, i - 2, j - 1);
        knightTour(board, move + 1, i - 2, j + 1);
        knightTour(board, move + 1, i - 1, j + 2);
        knightTour(board, move + 1, i + 1, j + 2);
        knightTour(board, move + 1, i - 1, j - 2);
        knightTour(board, move + 1, i + 1, j - 2);
        board[i][j] = 0; // unmarked cell

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
