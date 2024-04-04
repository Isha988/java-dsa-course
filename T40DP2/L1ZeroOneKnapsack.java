package T40DP2;

import java.util.Arrays;

public class L1ZeroOneKnapsack {
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(knapsack(val, wt, val.length, W));

        int[][] dp = new int[val.length + 1][W + 1];
        for(int[] arr : dp){
            Arrays.fill(arr, -1);
        }
        System.out.println(knapsackMemoization(val, wt, val.length, W, dp));
        System.out.println(knapsackTabulation(val, wt, W));
    }

    // O(2 ^ n)
    static int knapsack(int val[], int wt[], int n, int W){
        if(W==0 || n == 0){
            return 0;
        }

        if(wt[n - 1] <= W){ // valid 
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, n - 1, W - wt[n-1]);
            // exclude
            int ans2 = knapsack(val, wt, n-1, W);
            
            return Math.max(ans1, ans2);
        } else {
            // exclude 
            return knapsack(val, wt, n - 1, W);
        }
    }

    // O(n * W)
    static int knapsackMemoization(int val[], int wt[], int n, int W, int[][] dp){
        if(W==0 || n == 0){
            return 0;
        }

        if(dp[n][W] != -1){
            return dp[n][W];
        }

        if(wt[n - 1] <= W){ // valid 
            // include
            int ans1 = val[n - 1] + knapsack(val, wt, n - 1, W - wt[n-1]);
            // exclude
            int ans2 = knapsack(val, wt, n-1, W);
            
            dp[n][W] = Math.max(ans1, ans2);
            return dp[n][W];
        } else {
            // exclude 
            dp[n][W] = knapsack(val, wt, n - 1, W);
            return dp[n][W];
        }
    }

    // O(n * W)
    static int knapsackTabulation(int[] val, int[] wt, int W){
        int n = val.length;
        int[][] dp = new int[n + 1][W + 1];
        // initialize dp according w(j)=0 or no of items(i)=0 then profit = 0 
        
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < W + 1; j++){
                int v = val[i - 1]; // ith term value
                int w = wt[i - 1]; // ith tern weight

                if(w <= j){ // valid
                    int incProfit =  v + dp[i-1][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } 
                else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        return dp[n][W];
    }
}