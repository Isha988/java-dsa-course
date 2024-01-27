/*
 * Question: Print out the sum of the numbers in the second row of the "nums" array.
    Example:
    Input - int[][] nums = { {1,4,9}, {11,4,3},{2,2,3} };
    Output - 18
 */
package T102DArray;

public class Q2SumOf2ndRow {
    public static void main(String[] args) {
        int[][] nums = { {1,4,9}, {11,4,3},{2,2,3} };
        System.out.println(sumOf2ndRow(nums));
    }

    static int sumOf2ndRow(int nums[][]){
        int sum = 0;
        for(int j = 0; j < nums[1].length; j++){
            sum += nums[1][j];
        }
        return sum;
    }
}
