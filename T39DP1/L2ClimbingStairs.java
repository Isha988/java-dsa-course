/*
 * Count ways to reach the nth stair. The person can climb either 1 stair or 2 stairs at a time.
 */
package T39DP1;

public class L2ClimbingStairs {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(ways(n));
        System.out.println(waysUsingMemoization(n, new int[n + 1]));    
        System.out.println(waysUsingTabulation(n));
    }

    //O(2 ^ n)
    static int ways(int n){
        if(n < 0) return 0;
        if(n == 0) return 1;

        return ways(n - 1) + ways(n - 2);
    }

    //O(n)
    static int waysUsingMemoization(int n , int[] way){
        if(n < 0) return 0;
        if(n == 0) return 1;
        
        if(way[n] == 0) {
            way[n] = waysUsingMemoization(n-1, way) + waysUsingMemoization(n-2, way);
        }
        
        return way[n];
    }

    // O(n)
    static int waysUsingTabulation(int n){
        int way[] = new int[n + 1];
        way[0] = 1;

        for(int i = 1; i <= n; i++){
            way[i] = way[i - 1] + (i - 2 < 0  ? 0 : way[i - 2]);
        }

        return way[n];
    }
}