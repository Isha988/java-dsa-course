/*
 * Write a method named isEven that accepts an int argument. 
 * The method should return true if the argument is even, or false otherwise. 
 * Also write a program to test your method.
 */
package T6Methods;

import java.util.Scanner;

public class Q2IsEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(isEven(num));
        test();
    }

    static boolean isEven(int num){
        return num % 2 == 0;
    }

    static void test(){
        if(!isEven(10) || isEven(5)){
            throw new Error("Test Failed");
        }
        System.out.println("Test passed");
    }
}
