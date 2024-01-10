package T6Methods;

import java.util.Scanner;

public class L11DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal = sc.nextInt();
        sc.close();
        System.out.println(decimalToBinary(decimal));
    }

    static long decimalToBinary(int decimal){
        long binary = 0;
        int multiplier = 1;
        while (decimal != 0) {
            int digit = decimal % 2;
            binary += digit * multiplier;
            multiplier *= 10;
            decimal /= 2;
        }

        return binary;
    }
}
