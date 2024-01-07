// *         *  <- 1* 4space 1*  
// * *     * *  <- 2* 2space 2*
// * * * * * *  <- 3* 0space 3*
// * * * * * *  <- 3* 0space 3*
// * *     * *  <- 2* 2space 2*
// *         *  <- 1* 4space 1*

package T5NestedLoops;

import java.util.Scanner;

public class Q6ButterFly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = sc.nextInt();
        sc.close();
        
        // Method 1
        for(int i = 1; i <= lines; i++){
            // print stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            // print spaces
            for(int j = 1; j <= 2*lines - 2*i; j++){
                System.out.print("  ");
            }

            // print stars
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 1; i <= lines; i++){
            // print stars
            for(int j = 1; j <= lines - i + 1; j++){
                System.out.print("* ");
            }

            // print spaces
            for(int j = 1; j <= 2*(i - 1); j++){
                System.out.print("  ");
            }

            // print stars
            for(int j = 1; j <= lines - i + 1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Method 2
        int star = 1; 
        int space = 2*lines - 2;

        for(int i = 1; i <= 2*lines; i++){
            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            }
            for(int j = 1; j<= space; j++){
                System.out.print("  ");
            }
            for(int j = 1; j <= star; j++){
                System.out.print("* ");
            }

            if(i < lines){
                star++;
                space -=2;
            }
            else if(i > lines){
                star--;
                space += 2;
            }
            System.out.println();
        }
    }
}