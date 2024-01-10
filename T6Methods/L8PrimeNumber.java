package T6Methods;

import java.util.Scanner;

public class L8PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        System.out.println(isPrime(num));
    }

    static boolean isPrime(int num){
        if(num == 2){
            return true;
        }

        for(int i = 2; i<= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
}
