// Print given patter
// A
// B C
// D E F
// G H I J
package T5NestedLoops;

import java.util.Scanner;

public class L4CharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();

        char ch = 'A';

        for(int i = 1; i <= lines; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}
