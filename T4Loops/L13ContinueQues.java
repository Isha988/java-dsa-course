// Display all numbers entered by users except number of 10

package T4Loops;

import java.util.Scanner;

public class L13ContinueQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.err.print("Enter Number: ");
            int n = sc.nextInt();

            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);

        }
    }
}
