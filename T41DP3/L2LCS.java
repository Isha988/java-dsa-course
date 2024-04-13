/*
    Longest Common Subsequence
    A subsequence of a string is a new string generated from the original string with some characters (can be none)
    deleted without changing the relative order of the remaining characters.
    stri = "abcde", str2 = "ace"
    ans = 3 //"ace"
    str1 = "abedge", str2 = "abedg"
    ans = 4 //"abdg"
 */

package T41DP3;

import java.util.Arrays;

public class L2LCS {
    public static void main(String[] args) {
        String str1 = "abcde";
        int n = str1.length();
        String str2 = "ace";
        int m = str2.length();

        System.out.println(lcsRecursion(str1, str2, n, m));
        System.out.println(lcsMemoization(str1, str2, n, m));
        System.out.println(lcsTabulation(str1, str2));
    }

    // O(2 ^ (n + m))
    static int lcsRecursion(String str1, String str2, int n, int m){
        if(n == 0 || m == 0) {
            return 0;
        }

        if(str1.charAt(n - 1) == str2.charAt(m - 1)){
            return 1 + lcsRecursion(str1, str2, n -1, m-1);
        }
        else {
            int ans1 = lcsRecursion(str1, str2, n -1, m);
            int ans2 = lcsRecursion(str1, str2, n, m-1);
            return Math.max(ans1, ans2);
        }
    }


    // O(n * m)
    static int lcsMemoization(String str1, String str2, int n, int m){
        int[][] dp = new int[n + 1][m + 1];

        // initializing dp array with -1
        for(int[] arr: dp){
            Arrays.fill(arr, -1);
        }

        return lcsMemoUtil(str1, str2, n, m, dp);
    }

    static int lcsMemoUtil(String str1, String str2, int n, int m, int[][] dp){
        if(n == 0 || m == 0){
            return dp[n][m] = 0;
        }

        if(dp[n][m] != -1){
            return dp[n][m];
        }

        if(str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = 1 + lcsMemoUtil(str1, str2, n - 1, m - 1, dp);
        } 
        else {
            int ans1 = lcsMemoUtil(str1, str2, n -1, m, dp);
            int ans2 = lcsMemoUtil(str1, str2, n, m-1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    // O(n * m)
    static int lcsTabulation(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];
        // initialize row and column with zero
        
        // filling dp
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i - 1][j -1];
                }
                else {
                    int ans1 = dp[i -1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }
}
