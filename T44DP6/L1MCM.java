/*
 * Matrix Chain Multiplication
 * arr = {1,3,5,6}
 * ans = 45
 * arr = {1,2,3,4,3}
 * ans = 30
 */
package T44DP6;

import java.util.Arrays;

public class L1MCM {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3};
        System.out.println(mcmRecursion(arr));
        System.out.println(mcmMemoization(arr));
        System.out.println(mcmTab(arr));
    }   

    // Recursion ==================================================================================
    static int mcmRecursion(int[] arr){
        return mcmRecUtil(arr, 1, arr.length - 1);
    }

    static int mcmRecUtil(int[] arr, int i, int j){
        if(i >= j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;

        for(int k = i; k < j; k++){
            int cost1 = mcmRecUtil(arr, i, k);
            int cost2 = mcmRecUtil(arr, k + 1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;

            min = Math.min(finalCost, min);
        }

        return min;
    }

    // Memoization ===============================================================================
    static int mcmMemoization(int[] arr){
        int n = arr.length;
        int[][] dp = new int[n][n];

        // initialize dp with -1 at each cell
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }

        return mcmMemoUtil(arr, 1, arr.length - 1, dp);
    }

    static int mcmMemoUtil(int[] arr, int i, int j, int dp[][]){
        if(i >= j) {
            return 0;
        }

        if(dp[i][j] != -1){
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;

        for(int k = i; k < j; k++){
            int cost1 = mcmRecUtil(arr, i, k);
            int cost2 = mcmRecUtil(arr, k + 1, j);
            int cost3 = arr[i-1] * arr[k] * arr[j];
            int finalCost = cost1 + cost2 + cost3;

            min = Math.min(finalCost, min);
        }

        return dp[i][j] = min;
    }

    // Tabulation ===============================================================================
    static int mcmTab(int[] arr){
        int n = arr.length;
        // dp table
        int[][] dp = new int[n][n];

        // initialization
        // for single matrix cost = 0
        for(int i = 0; i < n; i++){
            dp[i][i] = 0;
        }

        // filling table by moving diagonally
        for(int len = 2; len < n; len++){
            for(int i = 1; i <= n - len; i++){
                int j = i + len - 1;
                
                int min = Integer.MAX_VALUE;
                for(int k = i; k < j; k++){
                    int cost1 = dp[i][k];
                    int cost2 = dp[k+1][j];
                    int cost3 = arr[i-1] * arr[k] * arr[j];

                    int cost = cost1 + cost2 + cost3;
                    min = Math.min(min, cost);
                }
                dp[i][j] = min;
            }
        }

        return dp[1][n-1];
    }

}


