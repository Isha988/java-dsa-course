/*
 * Edit Distance
    Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
    You have the following three operations permitted on a word:
    • Insert a character
    • Delete a character
    • Replace a character

    Example: 
    word1 = "intention", word2 = "execution"
    ans = 5
    intention -> inention (remove t)
    inention -> enention (replace 'i' with 'e') 
    enention -> exention (replace 'n' with 'x') 
    exention -> exection (replace 'n' with 'c') 
    exection -> execution (insert 'u')
 */
package T42DP4;

public class L3EditDistance {
    public static void main(String[] args) {
        String s1 = "intention"; 
        String s2 = "execution";
        System.out.println(editDistance(s1, s2));
    }   

    // O(n * m)
    static int editDistance(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n+1][m+1];
        // initialization
        for(int j = 0; j < m + 1; j++){
            dp[0][j] = j;
        }
        for(int i = 0; i < n + 1; i++){
            dp[i][0] = i;
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str1.charAt(i - 1) == str2.charAt(j -1)) {
                    dp[i][j] = dp[i -1][j -1];
                }
                else {
                    // dp[i][j] = 1 + min(add operation, delete operation, replace operation)
                    dp[i][j] = 1 + Math.min(dp[i][j-1], Math.min(dp[i-1][j], dp[i-1][j-1]));
                }
            }
        }

        return dp[n][m];
    }
}
