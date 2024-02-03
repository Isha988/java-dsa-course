/*
 * Print x ^ n
 * example 2 ^ 10 = 1024
 */
package T14Recursion;

import java.util.Scanner;

public class L10PowerOptimized {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();

        System.out.println(powerOptimized(x, n));
    }

    // O(log(n))
    static int powerOptimized(int x, int n){
        if(n <= 0)
            return 1;
        int halfPow = powerOptimized(x, n / 2);
        int halfPowSq = halfPow * halfPow;

        if(n % 2 != 0){
            halfPowSq *= x;
        }

        return halfPowSq;
    }
}
