/*
    * String Conversion
    Convert String1 to String2 with only insertion & deletion.
    Print number of deletions & insertions.
    str1 = "pear" str2 = "sea"
    ans = insert = 1, delete = 2 
 */
package T42DP4;

public class L4StringConversion {
    public static void main(String[] args) {
        String s1 = "pear";
        String s2 = "sea";
        stringConversion(s1, s2);
    }

    // (n * m)
    static void stringConversion(String str1, String str2){
        int lcs = lcs(str1, str2);
        System.out.println("Insert = " + (str2.length() - lcs));
        System.out.println("Delete = " + (str1.length() - lcs));
    }

    static int lcs(String str1, String str2){
        int n = str1.length();
        int m = str2.length();

        int[][] dp = new int[n + 1][m + 1];
        // Initialize Oth row and Oth col with zero

        for(int i = 1; i < n + 1; i++){
            for(int j = 1; j < m + 1; j++) {
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }

        return dp[n][m];
    }
}
