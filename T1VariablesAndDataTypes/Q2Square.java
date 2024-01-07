/*
In a program, input the side of a square; then, you have to output the area of the square.
(Hint: The area of a square is calculated as (side x side)).
*/

import java.util.Scanner;

public class Q2Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int side = sc.nextInt();
        sc.close();

        int area = side * side;
        System.out.println(area);
    }
}
