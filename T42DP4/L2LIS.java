/*
  * Longest Increasing Subsequence
    arr[] = (50, 3, 10, 7, 40, 80)
    Length of LIS = 4
    */
package T42DP4;

import java.util.Arrays;
import java.util.HashSet;

public class L2LIS {
    public static void main(String[] args) {
        int[] arr = {50, 3, 10, 7, 40, 80};
        System.out.println(LIS(arr));
        System.out.println(LIS1D(arr));
    }

    // time -> O(n ^ 2) || O(n * m)  & space -> O(n ^ 2)
    static int LIS(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] arr2 = new int[set.size()];
        int k = 0;
        for(int num: set){
            arr2[k] = num;
            k++;
        }
        Arrays.sort(arr2);

        int n = arr.length;
        int m = arr2 .length;
        int[][] dp = new int[n+1][m+1];
        // initialize 0th row and 0th column with zero

        for(int i = 1; i < n+1; i++) {
            for(int j = 1; j < m+1; j++) {
                if(arr[i - 1] == arr2[j - 1]){
                    dp[i][j] = 1 + dp[i -1][j - 1]; 
                }
                else {
                    int ans1 = dp[i -1][j];
                    int ans2 = dp[i][j-1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }

        return dp[n][m];
    }

    // time -> O(n ^ 2) space -> O(n)
    static int LIS1D(int[] arr){
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int max = 1; 
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                if(arr[i] > arr[j]){
                    dp[i] = Math.max(dp[i], (dp[j] + 1));
                    max = Math.max(max, dp[i]);
                }
            }
        }
        return max;
    }
}
