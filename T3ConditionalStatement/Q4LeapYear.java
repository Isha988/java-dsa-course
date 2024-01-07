// Write a Java program that takes a year from the user and prints whether that year is a leap year or not.

package T3ConditionalStatement;

import java.util.Scanner;

public class Q4LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        sc.close();
        
        if(year % 400 == 0)
            System.out.println("Leap year");
        else if(year % 100 !=0 && year % 4 == 0)
            System.out.println("Leap Year");
        else 
            System.out.println("Not a leap year");
    }
}