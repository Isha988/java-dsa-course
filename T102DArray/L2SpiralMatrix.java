package T102DArray;

public class L2SpiralMatrix {
    public static void main(String[] args) {
        // declaring a matrix of 4 X 5
        int matrix[][] = new int[3][4];

        // initializing matrix;
        int count = 1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = count++;
            }
        }

        spiralMatrix(matrix);
    }

    static void spiralMatrix(int[][] matrix){
        int startRow = 0;
        int endRow = matrix.length  - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        // j for col and i for row
        while (startRow <= endRow && startCol <= endCol) {
            // print top boundary
            for(int j = startCol; j<= endCol; j++){
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // print right boundary
            for(int i = startRow; i <= endRow; i++){
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // print bottom boundary
            if(startRow <= endRow){
                for(int j = endCol; j >= startCol; j--){
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // print left boundary
            if(startCol <= endCol){
                for(int i = endRow; i >= startRow; i--){
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }

        }
    }
    
}