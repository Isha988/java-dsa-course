/*
  * Longest Common Substring
    A substring is a contiguous sequence of characters within a string

    Example 1: 
    S1 = "ABCDE", S2 = "ABGCE"
    ans = 2 // "AB"
    
    Example 2:
    S1 = "ABCDGH", S2 = "ACDGHR"
    ans = 4 |I "CDGH"
 */
package T42DP4;

public class L1LongestCommonSubstring {
    public static void main(String[] args) {
        String s1 = "abcdgh";
        String s2 = "acdghr";
        System.out.println(longestCommonSubstring(s1, s2));
    }

    // O(n * m)
    static int longestCommonSubstring(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];

        // initialize dp 2d array by filling 0th row and 0th with zero

        int max = 0;
        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
                else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }
}
