// make following pattern
// * * * * *
// *       *
// *       *
// * * * * *

package T5NestedLoops;

import java.util.Scanner;

public class Q1HollowRectangle {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int lines = sc.nextInt();
    sc.close();

    for(int i = 1; i <= lines; i++){
        // print lines + 1 stars for 1st and last line
        if(i == 1 || i == lines){
            for(int j = 1; j <= lines + 1; j++){
                System.out.print("* ");
            }
        }
        // print two stars having space in between for other lines
        else{
            System.out.print("* ");
            for(int j = 1; j < lines; j++){
                System.out.print("  ");
            }
            System.out.print("* ");
        }
        System.out.println();
    }
}
    
}