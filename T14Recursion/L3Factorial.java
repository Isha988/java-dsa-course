/*
 * Print factorial of a number n
 * Example: 5
 * Output: 120
 */
package T14Recursion;

import java.util.Scanner;

public class L3Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(factorial(n));
    }

    // O(n)
    static int factorial(int n){
        if(n <= 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
}
