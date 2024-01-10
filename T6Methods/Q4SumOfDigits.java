// Write a Java method to compute the sum of the digits in an integer.
package T6Methods;

import java.util.Scanner;

public class Q4SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(sumOfDigits(num));
    }

    static int sumOfDigits(int num){
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit;

            num /= 10;
        }
        return sum;
    }
}
