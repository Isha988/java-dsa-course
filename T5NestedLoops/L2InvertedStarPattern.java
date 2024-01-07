// Print given patter
// * * * *
// * * *
// * *
// *
package T5NestedLoops;

import java.util.Scanner;

public class L2InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        // Both approaches are right

        // for(int i = lines; i >= 1; i--){
        //     for(int j = 1; j <= i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= lines - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
