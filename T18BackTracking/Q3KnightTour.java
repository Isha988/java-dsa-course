package T18BackTracking;

public class Q3KnightTour {
    public static void main(String[] args) {
        int n = 8;
        int[][] board = new int[n][n];
        knightTour(board, 1, 0, 0);
        printMatrix(board);
    }

    static final int [][]knightMoves = {
        {2, 2, -2, -2, 1, 1, -1, -1}, // row moves
        {1, -1, 1, -1, 2, -2, 2, -2}, // col moves
    }; 
    static boolean knightTour(int[][] board, int move, int i, int j){
        if(move == board.length * board.length){
            // board[i][j] = board.length * board.length - 1;
            return true;
        }

        // return if reached out of board or already visited cell
        if(i < 0 || j < 0 || i >= board.length || j >= board.length || board[i][j] != 0){
            return false;
        }

        board[i][j] = move; // marked cell
        for(int k = 0; k < knightMoves[0].length; k++){
            if(knightTour(board, move + 1, i + knightMoves[0][k], j + knightMoves[1][k])){
                return true;
            };
        }
        board[i][j] = 0; // unmarked cell

        return false;
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
