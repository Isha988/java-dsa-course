//       *
//     * * *
//   * * * * *
// * * * * * * *
//   * * * * *
//     * * *
//       *

package T5NestedLoops;

import java.util.Scanner;

public class Q9Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= 2*lines - 1; i++){

            int space = Math.abs(lines - i);
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }

            int star = (i <= lines) ? (2 * i - 1) : (2 * (lines - Math.abs(lines - i)) - 1);
            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}