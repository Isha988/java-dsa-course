//         * * * * *
//       *       *
//     *       *
//   *       *
// * * * * *

package T5NestedLoops;

import java.util.Scanner;

public class Q8HollowRombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            int space = lines - i;
            for(int j = 1; j <= space; j++){
                System.out.print("  ");
            }

            if(i == 1 || i == lines){
                for(int j = 1; j <= lines; j++){
                    System.out.print("* ");
                }
            }
            else{
                System.err.print("* ");
                for(int j = 1; j <= lines - 2; j++){
                    System.out.print("  ");
                }
                System.err.print("* ");
            }

            System.out.println();
        }
    }
}