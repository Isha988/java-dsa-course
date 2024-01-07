/* In a program, input three numbers: A, B, and C. 
You have to output the average of these 3 numbers. 
(Hint: Average of N numbers is the sum of those numbers divided by N) */

import java.util.Scanner;

public class Q1Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        float avg = (num1 + num2 + num3) / 3;
        System.out.println(avg);
    }
    
}