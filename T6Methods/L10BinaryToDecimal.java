package T6Methods;

import java.util.Scanner;

public class L10BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        sc.close();
        System.out.println(binaryToDecimal(binary));

    }

    static int binaryToDecimal(int binary){
        int multiplier = 1;
        int decimal = 0;

        while(binary != 0){
            int digit = binary % 10;
            if(digit != 0 && digit != 1){
                throw new Error(
                "Given number is not a binary number \n Binary number can only have 0 and 1"
                );
            }
            decimal += digit * multiplier;
            multiplier *= 2;
            binary /= 10;
        }

        return decimal;
    }
}
