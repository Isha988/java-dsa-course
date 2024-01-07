package T4Loops;
// Write a program to find the factorial of any number entered by the user
import java.util.Scanner;

public class Q2Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        double fact = 1;
        for(int i = num; i > 1; i--){
            fact *= i;
        }

        System.out.println("Factorial of Num: " + fact);

    }
}
