/*
 * Print sum of first n natural number
 * Example: 5
 * Output: 15
 */
package T14Recursion;

import java.util.Scanner;

public class L4SumOfNaturalNumber {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println(sum(n));
    }

    // O(n)
    static int sum(int n){
        if(n <= 0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
