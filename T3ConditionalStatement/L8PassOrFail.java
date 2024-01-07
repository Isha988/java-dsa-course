package T3ConditionalStatement;

import java.util.Scanner;

public class L8PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int scores = sc.nextInt();
        sc.close();
        
        String result = (scores > 33) ? "pass" : "fail";
        System.out.println("You are " + result); 
    }
}