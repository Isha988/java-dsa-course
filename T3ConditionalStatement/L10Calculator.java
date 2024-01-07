package T3ConditionalStatement;

import java.util.Scanner;

public class L10Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter operand 1");
        int num1 = sc.nextInt();
        System.out.println("Enter operand 2");
        int num2 = sc.nextInt();
        System.out.println("Enter operator");
        char operator = sc.next().charAt(0);
        sc.close();

        switch (operator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            
            case '-':
                System.out.println(num1 - num2);
                break;
            
            case '*':
                System.out.println(num1 * num2);
                break;
            
            case '/':
                System.out.println(num1 / num2);
                break;
             
            case '%':
                System.out.println(num1 % num2);
                break;
                
            default:
                System.out.println("Please use a operator from  + , -, *, /, %");
                break;
        }
    }
}