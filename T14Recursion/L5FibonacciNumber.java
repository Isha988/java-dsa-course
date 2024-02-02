/*
 * Print nth fibonacci number
 * Example: 1: 0, 2: 1, 3: 1, 4: 2, 5: 3, 6: 5
 * Fibonacci Series: 0 1 1 2 3 5 8 13 21 34 55 ......
 */
package T14Recursion;

import java.util.Scanner;

public class L5FibonacciNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(fibonacci(n));
    }

    static int[] fib = new int[100]; // Can be implemented using array list for space complexity improvement
    
    // O(n)
    static int fibonacci(int n){
        if(n <= 1)
            return 0;
        
        if(n == 2)
            return 1;

        if(fib[n - 1] == 0){
            fib[n - 1] = fibonacci(n - 1);
        }
        if(fib[n - 1] == 0){
            fib[n - 2] = fibonacci(n - 2);
        }

        return fib[n - 1] + fib[n - 2];
    }
}
