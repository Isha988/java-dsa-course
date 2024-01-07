// Write a program to print the multiplication table of a number N, entered by the user
package T4Loops;

import java.util.Scanner;

public class Q3Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
    }
}
