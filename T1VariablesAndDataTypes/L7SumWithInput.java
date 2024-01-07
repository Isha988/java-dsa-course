import java.util.Scanner;

public class L7SumWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        int sum = num1 + num2;
        System.out.println("Sum: " + sum);
    }
}