// 1
// 2  3
// 4  5  6
// 7  8  9  10
// 11 12 13 14 15

package T5NestedLoops;

import java.util.Scanner;

public class Q4FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        int count = 1;
        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}