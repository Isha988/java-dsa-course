// Check if a number is prime or not

package T4Loops;

import java.util.Scanner;

public class L14CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        if(num < 2 || (num != 2 && num % 2 == 0) ){
            System.out.println(num + " is not a prime number");
            return;
        }

        int i;
        for(i = 2; i <  num; i++ ){ // can use i <= sqrt(num)
            if(num % i == 0){
                System.out.println(num +  " is not a prime number");
                break;
            }
        }

        if(i == num) {
            System.out.println(num + " is a prime number");
        }
    }
}
