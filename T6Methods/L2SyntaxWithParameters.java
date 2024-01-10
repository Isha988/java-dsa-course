// Syntax with parameters
/*
 * return_type function_name(type1 param1, type2 param2, ...){
 *      // body
 *      return statement;
 * } 
*/

package T6Methods;

import java.util.Scanner;

public class L2SyntaxWithParameters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
    
        int sum = sum(a, b); // actual parameter or argument
        System.out.println("Sum: " + sum);
    }

    static int sum(int num1, int num2) { // formal parameters or parameter
        int sum = num1 + num2;
        return sum;
    }
}