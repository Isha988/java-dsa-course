package T6Methods;

import java.util.Scanner;

public class L4Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
    
        int product = product(a, b); 
        System.out.println("product: " + product);
    }
    static int product(int num1, int num2){
        int product = num1 * num2;
        return product;
    } 
}