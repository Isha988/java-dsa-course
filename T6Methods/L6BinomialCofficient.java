// nCr = n! / (r! (n-r)!)
package T6Methods;

import java.util.Scanner;

public class L6BinomialCofficient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        sc.close();

        System.out.println("Factorial = " + binomial(n, r));
    }

    static int binomial(int n, int r){
       return fact(n) / (fact(r) * fact(n-r));
    }   

    static int fact(int num){
        int fact = 1;
        for(int i = 2; i <= num; i++){
            fact *= i;
        }
        return fact;
    }   
}