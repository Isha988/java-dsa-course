/*
 * Catalan's Number
    CO = 1
    C1 = 1
    C2 = CO.C1 + C1.CO = 2
    C3 = CO.C2 + C1.C1 + C2.CO = 5
    C4 =                        = 14
*/
package T43DP5;

import java.util.Arrays;

public class L2Catalan {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(catalanRecursion(n));
        System.out.println(catalanMemo(n));
        System.out.println(catalanTab(n));
    }

    // O()
    static int catalanRecursion(int n){
        if(n == 0 || n == 1) {
            return 1;
        }

        int Cn = 0;
        for(int i = 0; i < n; i++){
            Cn += catalanRecursion(i) * catalanRecursion(n - i - 1);
        }

        return Cn;
    }

    // O(n^2)
    static int catalanMemo(int n){
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        return catalanMemoUtil(n, dp);
    }

    static int catalanMemoUtil(int n, int[] dp){
        if(n == 0 || n == 1){
            return dp[n] = 1;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int cn = 0;
        for(int i = 0; i < n; i++){
            cn += catalanMemoUtil(i, dp) * catalanMemoUtil(n - i -1, dp);
        }

        return dp[n] = cn;
    }

    // O(n^2)
    static int catalanTab(int n){
        int[] dp = new int[n + 1];
        dp[0] = dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            int cn = 0;
            for (int j = 0; j < i; j++) {
                cn += dp[j] * dp[i-j-1];
            }
            dp[i] = cn;
        }

        return dp[n];
    }
}
