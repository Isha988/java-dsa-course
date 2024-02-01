// Check if a string is palindrome
package T11String;

import java.util.Scanner;

public class L2Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();
        
        System.out.println(isPalindrome1(str) ? "Palindrome" : "Not Palindrome");
    }

    static boolean isPalindrome(String str){
        String rev = "";
        for(int i = 0; i < str.length(); i++){
            rev = str.charAt(i) + rev;
        }

        return str.equals(rev);
    }

    static boolean isPalindrome1(String str){
        int len = str.length();
        for(int i = 0; i < len/2; i++){
            if(str.charAt(i) != str.charAt(len - i -1)){
                return false;
            }
        }

        return true;
    }
}
