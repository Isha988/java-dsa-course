/*
 * There are main 4 operations on array:
 * 1. Create
 * 2. Input / Insert
 * 3. Output
 * 4. Update
 */
package T7Arrays1;

import java.util.Scanner;

public class L1Operations {
    public static void main(String[] args) {
        // Create
        int marks[] = new int[50]; // create an array of size 50 having value 0 at each index
        int numbers[] = {10, 13, 4, 67}; // create an array of size 4 having given values
        char characters[] = {'a', 'f', 'd', 'k'};
        String fruits[] = {"apple", "banana", "mango"};

        // Output / Access
        System.out.println(marks[2]);
        System.out.println(numbers[1]);
        System.out.println(characters[3]);
        System.out.println(fruits[0]);

        // Input / Insert
        marks[0] = 5;
        marks[1] = 6;
        marks[2] = 7;

        Scanner sc = new Scanner(System.in);
        marks[3] = sc.nextInt();
        marks[4] = sc.nextInt();
        marks[5] = sc.nextInt();
        sc.close();

        for(int i = 0; i < 6; i++){
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // update
        marks[0] = 7;
        marks[1] = marks[1] + 7;
        for(int i = 0; i < 6; i++){
            System.out.print(marks[i] + " ");
        }

        // length property of array
        System.out.println("length of arrays");
        System.out.print(marks.length + " ");
        System.out.print(numbers.length + " ");
        System.out.print(characters.length + " ");
        System.out.print(fruits.length + " ");
    }
    
}