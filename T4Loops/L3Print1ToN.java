package T4Loops;

import java.util.Scanner;

public class L3Print1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int counter = 1;        
        while(counter <= n){
            System.out.print(counter + " ");
            counter++;
        }
    }
}
