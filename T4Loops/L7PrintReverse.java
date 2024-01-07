package T4Loops;

import java.util.Scanner;

public class L7PrintReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        while(num > 0){
            int digit = num % 10;
            System.out.print(digit);
            num /= 10;
        }
    }
}
