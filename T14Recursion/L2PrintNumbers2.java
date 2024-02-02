/*
 * Print numbers from 1 to n in increasing order
 * Ques: n = 10
 * Output: 1 2 3 4 5 6 7 8 9 10
 */
package T14Recursion;

import java.util.Scanner;

public class L2PrintNumbers2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printNumbers(n);
    }

    // O(n)
    static void printNumbers(int n){
        if(n < 1) {
            return;
        }
        printNumbers(n - 1);
        System.out.print(n + " ");
    } 
}
