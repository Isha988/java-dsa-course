package T6Methods;

import java.util.Scanner;

public class Q1AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        sc.close();

        System.out.println(AvgOfThree(num1, num2, num3));
    }

    static int AvgOfThree(int num1, int num2, int num3){
        return (num1 + num2 + num3) / 3;
    }
}
