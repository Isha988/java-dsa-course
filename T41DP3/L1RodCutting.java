/*
    Given a rod of length n inches and an array of prices that 
    includes prices of all pieces of size smaller than n.
    Determine the maximum value obtainable by cutting up the rod and selling the pieces. 
    
    length[] = {1 2 3 4 5 6 7 8} 
    price[] = {1 5 8 9 10 17 17 20}
    rodLength = 8
    ans = 22
 */
package T41DP3;

public class L1RodCutting {
    public static void main(String[] args) {
        int[] len = {1,2,3,4,5,6,7,8};
        int[] price = {1,5,8,9,10,17,17,20};
        int totalLen = 8;

        System.out.println(rodCutting(len, price, totalLen));
    }

    static int rodCutting(int[] len, int[] price, int totalLen) {
        int n = len.length;
        int[][] dp = new int[n + 1][totalLen + 1];
        
        // initialize dp with all ele in 0th row and 0th column as 0
        
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < totalLen + 1; j++){
                int p = price[i - 1];
                int l = len[i - 1];
                if(l <= j) { // valid
                    int incPrice = p + dp[i][j - l];
                    int excPrice = dp[i - 1][j];

                    dp[i][j] = Math.max(incPrice, excPrice);
                } 
                else {
                    int excPrice = dp[i - 1][j];  
                    dp[i][j] = excPrice;  
                }
            }
        }

        return dp[n][totalLen];
    }
}