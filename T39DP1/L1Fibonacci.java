package T39DP1;

public class L1Fibonacci {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(fibUsingRecursion(n));
        System.out.println(fibUsingMemoization(n, new int[n + 1]));
        System.out.println(fibUsingTabulation(n));
    }
    
    // O(2 ^ n)
    static int fibUsingRecursion(int n){
        if(n == 0 || n == 1){
            return n;
        }

        return fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
    }

    // O(n)
    static int fibUsingMemoization(int n, int[] fib){
        if(n == 0 || n == 1){
            return n;
        }
        if(fib[n] != 0) {
            return fib[n];
        }
        fib[n] = fibUsingRecursion(n - 1) + fibUsingRecursion(n - 2);
        return fib[n];
    }

    // O(n)
    static int fibUsingTabulation(int n){
        int[] dp = new int[n+1];
        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n];
    }
}

