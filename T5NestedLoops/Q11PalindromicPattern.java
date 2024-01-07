//         1 
//       2 1 2
//     3 2 1 2 3
//   4 3 2 1 2 3 4
// 5 4 3 2 1 2 3 4 5

package T5NestedLoops;

import java.util.Scanner;

public class Q11PalindromicPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            // print space
            int space = lines - i;
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }

            // print reverse count 
            for(int j = i; j >= 1; j--){
                System.out.print(j + " ");
            }

            // print count
            for(int j = 2; j <= i; j++){
                System.out.print(j + " ");
            }

            System.out.println();
        }
    } 
}