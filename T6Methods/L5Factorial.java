package T6Methods;

import java.util.Scanner;

public class L5Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println("Factorial = " + factorial(num));
    }

    static int factorial(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= i; 
        }
        return fact;
    }
}