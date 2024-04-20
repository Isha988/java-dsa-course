/*
    * Wildcard Matching
    Given a text and a wildcard pattern, implement wildcard pattern matching algorithm,
    that finds if wildcard pattern is matched with text. 
    The matching should cover the entire text (not partial text). 
    The wildcard pattern can include the characters '?' and '*'
        • '?' - matches any single character
        • '*' - Matches any sequence of characters (including the empty sequence)

    Text = "baaabab"
    Pattern = "*****ba*****ab"
    output : true
    
    Text = "baaabab"
    Pattern = "a*ab"
    output : false
 */
package T43DP5;

public class L1WildcardMatching {
    public static void main(String[] args) {
        String str = "baaabab";
        String pattern = "*****ba*****ab";
        System.out.println(wildcardMatching(str, pattern));
    }

    static boolean wildcardMatching(String str, String pattern){
        int n = str.length();
        int m = pattern.length();

        boolean[][] dp = new boolean[n + 1][m + 1];
        // initialization
        /*  
            case1: pattern = '', i.e => j = 0 
             -> if str = '', i.e = 0 -> true
             -> else false  
        */
        dp[0][0] = true;

        /*
            case2: str ='', i.e => i = 0 
            -> if pattern[j - 1] = '*' -> dp[0][j - 1]
            -> else false
        */
        for(int j = 1; j < m + 1; j++){
            if(pattern.charAt(j-1) == '*'){
                dp[0][j] = dp[0][j-1];
            } else {
                dp[0][j] = false;
            }
        }

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++){
                if(str.charAt(i - 1) == pattern.charAt(j - 1) || pattern.charAt(j -1) == '?') {
                    dp[i][j] = dp[i-1][j-1];
                } 
                else if(pattern.charAt(j - 1) == '*') {
                    // replace * with '' (ignore star) || match * with char 
                    dp[i][j] = dp[i][j -1] || dp[i-1][j]; 
                }
                else {
                    dp[i][j] = false;
                }
            }
        }

        return dp[n][m];
    }
}
