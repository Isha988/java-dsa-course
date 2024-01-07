//       *
//     * *
//   * * *
// * * * * 
package T5NestedLoops;

import java.util.Scanner;

public class Q2HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            // loop to print spaces
            for(int j = 1; j <= lines - i; j++){
                System.out.print("  ");
            }

            // loop to print start
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}