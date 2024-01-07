// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1

package T5NestedLoops;

import java.util.Scanner;

public class Q5ZeroOneTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        boolean num = true;
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(num + " ");
                num = !num;
            }
            System.out.println();
        }
    }
    
}