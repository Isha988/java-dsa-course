// Write a program that reads a set of integers, and then prints the sum of the even and odd integers. 
package T4Loops;

import java.util.Scanner;

public class Q1SumOfEvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        char choice = 'y';

        while(choice == 'y') {
            System.out.print("Enter Number: ");
            int num = sc.nextInt();

            if( num % 2 == 0){
                even += num;
            }else {
                odd += num;
            }

            System.out.print("Want to continue(y/n) : ");
            choice = sc.next().charAt(0);
        }
        sc.close();

        System.out.println("Even Sum: " + even + " " + "Odd Sum: " + odd);
    }
    
}