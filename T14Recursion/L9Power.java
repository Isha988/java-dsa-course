/*
 * Print x ^ n
 * example 2 ^ 10 = 1024
 */
package T14Recursion;

import java.util.Scanner;

public class L9Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x");
        int x = sc.nextInt();
        System.out.println("Enter n");
        int n = sc.nextInt();
        sc.close();

        System.out.println(power(x, n));
    }

    // O(n)
    static int power(int x, int n){
        if(n <= 0)
            return 1;
        
        return x * power(x, n - 1);
    }
}
