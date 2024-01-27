/*
 Question: Write a program to Find Transpose of a Matrix.
    What is Transpose?
    Transpose of a matrix is the process of swapping the rows to columns. For a 2×3 matrix,
    Matrix
    a11 a12 a13
    a21 a22 a23

    Transposed Matrix 
    a11 a21
    a12 a22
    a13 a23
 */
package T10TwoDArray;

public class Q3Transpose {
    public static void main(String[] args) {
        int matrix[][] = new int[2][3];

        int count = 1;
        for(int i = 0; i < matrix.length; i++){
           for(int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = count++;
           }
        }
        System.out.println("Original");
        printMatrix(matrix);

        int[][] transpose = transpose(matrix);
        System.out.println("Transpose");
        printMatrix(transpose);

    }

    static int[][] transpose(int[][] matrix){
        int transpose[][] = new int[matrix[0].length][matrix.length];

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }

        return transpose;
    }

    static void printMatrix(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j<matrix[i].length; j++){
                 System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
         }
    }
}
