// Keep entering number until user enter a multiple of 10 

package T4Loops;

import java.util.Scanner;

public class L11BreakQues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
        }
        
        sc.close();
    }
}
