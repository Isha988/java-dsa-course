/*
    Grid ways
    Find number of ways to reach from (0,0) to (N-1, M-1) in a NxM Grid.
    Allowed moves - right or down.
 */
package T18BackTracking;

public class L5GridWays {
    public static void main(String[] args) {
        int row = 3, col = 3;
        int ways = gridWays(row, col, 0, 0);
        System.out.println(ways);
    }

    // O(2 ^ (n + m))
    static int gridWays(int row, int col, int i, int j) {

        // reached out of grid
        if (i >= row || j >= col) {
            return 0;
        }

        // reached ( n-1, m-1 )
        if (i == row - 1 && j == col - 1) {
            return 1;
        }

        int count = 0;
        count += gridWays(row, col, i, j + 1); // move right
        count += gridWays(row, col, i + 1, j); // move down

        return count;
    }

    // O(n)
    // can use
    // ways = (row + col - 2)! / [ (row - 1)! * (col - 1)! ]

}