/* Enter cost of 3 items from the user (using float data type) - a pencil, a pen, and an eraser; 
then output the total cost of the items back to the user as their bill. 
(Add on: You can also try adding 18% GST tax to the items in the bill as an advanced problem.) */

import java.util.Scanner;

public class Q3Bill {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    sc.close();

    float total = pen + pencil + eraser;
    float payable = total * 1.18f;

    System.out.println(payable);
}
    
}