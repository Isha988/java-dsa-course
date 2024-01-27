package T10TwoDArray;

public class L3DiagonalSum {
    public static void main(String[] args) {
         int n = 3;
         int matrix[][] = new int[n][n];

         // initializing and outputting matrix;
         int count = 1;
         for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                 matrix[i][j] = count++;
                 System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
 
        System.out.println("Sum: " + diagonalSum1(matrix));
    }

    // O(n)
    static int diagonalSum(int matrix[][]){
        int sum = 0;

        // 1. Adding elements of primary diagonal
        for(int i = 0; i < matrix.length; i++){
            sum += matrix[i][i];
        }

        // 2. Adding elements of secondary diagonal
        for( int i = 0, j = matrix.length - 1; i < matrix.length && j >= 0; i++, j--){
            sum += matrix[i][j];
        }

        // 3. Subtracting common middle element
        if(matrix.length % 2 != 0){
            int mid = matrix.length / 2;
            sum -= matrix[mid][mid];
        }

        return sum;
    }

    static int diagonalSum1(int[][] matrix){
        int sum = 0;
        for(int i = 0; i < matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];

            // secondary diagonal
            if(i != matrix.length-1-i){
                sum += matrix[i][matrix.length-1-i];
            }
        }
        return sum;
    }
    
}