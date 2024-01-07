// Write a Java program to get a number from the user and print whether it is positive or negative.

package T3ConditionalStatement;

import java.util.Scanner;

public class Q1PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        
        if(num < 0)
            System.out.println("Negative Value");
        else 
            System.out.println("Positive value");
    }
}