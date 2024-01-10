/*
 * Write a Java program to check if a number is a palindrome in Java? 
 * (121 is a palindrome, 321 is not)
 */
package T6Methods;

import java.util.Scanner;

public class Q3IsPalindrome {
    // implemented it for string so that it can also handle case like 010.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str){
        String rev = "";
        int len = str.length();
        for(int i = 0; i < len; i++){
            rev = str.charAt(i) + rev;
        }
        return str.equals(rev);
    }
}
