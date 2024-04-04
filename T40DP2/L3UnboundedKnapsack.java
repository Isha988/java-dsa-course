package T40DP2;

public class L3UnboundedKnapsack {
    public static void main(String[] args) {
        int val[] = {15,14,10,45,30};
        int wt[] = {2,5,1,3,4};
        int W = 7;
        System.out.println(knapsackTabulation(val, wt, W));
    }

    // O(n * W)
    static int knapsackTabulation(int[] val, int[] wt, int W){
        int n = val.length;
        int dp[][] = new int[n + 1][W + 1];

        // initialize dp according w(j)=0 or no of items(i)=0 then profit = 0 

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < W+1; j++){
                int v = val[i - 1];
                int w = wt[i - 1];

                if(w <= j){ // valid
                    int incProfit =  v + dp[i][j-w];
                    int excProfit = dp[i-1][j];
                    dp[i][j] = Math.max(incProfit, excProfit);
                } 
                else { // invalid
                    int excProfit = dp[i-1][j];
                    dp[i][j] = excProfit;
                }
            }
        }

        for(int i = 0; i < n +1; i++){
            for(int j = 0; j < W + 1; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        return dp[n][W];
    }
}