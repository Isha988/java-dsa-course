/*
 * Print numbers from n to 1 in decreasing order
 * Ques: n = 10
 * Output: 10 9 8 7 6 5 4 3 2 1
 */
package T14Recursion;

import java.util.Scanner;

public class L1PrintNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printNumbers(n);
    }

    // O(n)
    static void printNumbers(int n){
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        printNumbers(n - 1);
    }
}