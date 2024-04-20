/*
 * Counting Trees
    Find number of all possible BSTs with given n nodes.
    n = 3 (10, 20, 30)
    ans = 5
 */
package T43DP5;

public class L3CountBST {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(countBST(n));
        System.out.println(countBstTab(n));
    }

    static int countBST(int n){
        if(n==0 || n == 1) {
            return 1;
        }

        int totalBST = 0;
        for(int i = 0; i < n; i++){
            int leftBST = countBST(i);
            int rightBST = countBST(n-i-1);
            totalBST+= leftBST * rightBST;
        }

        return totalBST;
    } 
    
    // O(n^2)
    static int countBstTab(int n){
        int[]dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int i = 2; i < n +1; i++){
            int totalBST=0;
            for(int j = 0; j < i; j++){
                int leftBST = dp[j];
                int rightBST = dp[i-j-1];
                totalBST += leftBST * rightBST;
            }
            dp[i] = totalBST;
        }

        return dp[n];
    }
}
