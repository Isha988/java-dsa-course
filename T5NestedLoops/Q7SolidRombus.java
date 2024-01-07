//          * * * * *
//       * * * * *
//     * * * * *
//   * * * * *
// * * * * *

package T5NestedLoops;

import java.util.Scanner;

public class Q7SolidRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            // print spaces
            int spaces = lines - i;
            for(int j = 1; j <= spaces; j++){
                System.out.print("  ");
            }
            
            // print stars
            for(int j = 1; j<= lines; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 
}