// Print given patter
// * 
// * *
// * * *
// * * * *
package T5NestedLoops;

import java.util.Scanner;

public class L1StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
