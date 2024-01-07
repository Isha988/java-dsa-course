// 1 2 3 4 5 
// 1 2 3 4
// 1 2 3
// 1 2
// 1
package T5NestedLoops;

import java.util.Scanner;

public class Q3InvertedHalfPyramidNumber {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int lines = sc.nextInt();
            sc.close();

            for(int i = 1 ; i <= lines; i++){
                for(int j = 1; j <= lines - i + 1; j++){
                    System.out.print(j + " ");
                }
                System.out.println();
            }
    }
    
}