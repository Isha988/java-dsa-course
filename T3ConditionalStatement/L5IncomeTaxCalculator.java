package T3ConditionalStatement;

import java.util.Scanner;

public class L5IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you annual income:");
        int income = sc.nextInt();
        sc.close();   

        if(income < 500000)
            System.err.println("You need not to pay income tax");
        else if(income < 1000000)
            System.out.println("You need to pay: Rs. " + (20 * income / 100));
        else
            System.out.println("You need to pay: Rs. " + (30 * income / 100));
    }
    
}