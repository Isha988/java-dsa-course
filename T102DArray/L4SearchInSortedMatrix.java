/**
 * Search for a key in row wise and column wise sorted matrix
 * example:
 * 10 20 30 40
 * 15 25 35 45
 * 27 29 37 48
 * 32 33 39 50 
 */

package T102DArray;

public class L4SearchInSortedMatrix {

    public static void main(String[] args) {
        int matrix[][] = {
            {10, 20, 30, 40},
            {15, 25, 35, 45},
            {27, 29, 37, 48},
            {32, 33, 39, 50}
        };
        System.out.println(searchInSortedMatrix(matrix, 2));
    }

    // O(m + n)
    static boolean searchInSortedMatrix1(int matrix[][], int x){
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0){
            int cellValue = matrix[row][col];

            if(x > cellValue){
                // move one step down/bottom
                row++;
            } else if(x < cellValue){
                // move one step left
                col--;
            } else{
                System.out.println("(" + row + " , " + col + ")");
                return true;
            }
        }
        return false;
    }

    // O(nlogn)
    static boolean searchInSortedMatrix(int matrix[][], int x){
        
        for(int i = 0; i < matrix.length && matrix[i][0] <= x; i++){
            if(matrix[i][0] == x){
                System.out.println("(" + i + " , " + 0 + ")");
                return true;
            }

            int low = 0;
            int high = matrix[i].length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if(x < matrix[i][mid]){
                    high  = mid - 1;
                } else if(x > matrix[i][mid]){
                    low = mid + 1;
                } else {
                    System.out.println("(" + i + " , " + mid + ")");
                    return true;
                }
            }
        }

        return false;
    }

    // static boolean searchInSortedMatrix(int matrix[][], int x){
    //     int rowStart = 0;
    //     int rowEnd = matrix.length - 1;
    //     int colStart = 0;
    //     int colEnd = matrix[0].length - 1;

    //     while(rowStart < rowEnd && colStart < colEnd){
    //         int rowMid = (rowStart + rowEnd) / 2;
    //         int rowMidEle = matrix[rowMid][colStart];
    //         if(rowMidEle == x){
    //             return true;
    //         } else if(x < rowMidEle){
    //             rowEnd = rowMid - 1;
    //         } else {
    //             rowStart = rowMid;
    //         }
    //         System.out.println("rowStart " + rowStart);
    //         System.out.println("rowEnd " + rowEnd);

    //         int colMid = (colStart + colEnd) / 2;
    //         int colMidEle = matrix[rowStart][colMid];
    //         if(colMidEle == x){
    //             return true;
    //         } else if(x < colMidEle){
    //             colEnd = colMid - 1;
    //         } else {
    //             colStart = colMid;
    //         }
    //         System.out.println("colStart " + colStart);
    //         System.out.println("colEnd " + colEnd);
    //     }

    //     return false;

    // }
}