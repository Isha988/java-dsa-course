// Print given patter
// 1
// 1 2
// 1 2 3
// 1 2 3 4
package T5NestedLoops;

import java.util.Scanner;

public class L3HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}