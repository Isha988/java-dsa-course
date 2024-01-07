//      1           _ _ _ _ 1 _ _ _ _    
//     2 2          _ _ _ 2 _ 2 _ _ _
//    3 3 3         _ _ 3 _ 3 _ 3 _ _
//   4 4 4 4        _ 4 _ 4 _ 4 _ 4 _
//  5 5 5 5 5       5 _ 5 _ 5 _ 5 _ 5 

package T5NestedLoops;

import java.util.Scanner;

public class Q10NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            int space = lines - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for(int j = 1; j<= i; j++){
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
