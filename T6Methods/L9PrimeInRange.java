package T6Methods;

import java.util.Scanner;

public class L9PrimeInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        PrimeInRange(start, end);
    }

    static void PrimeInRange(int start, int end){
        for(int i = Math.max(start, 2); i <= end; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
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
