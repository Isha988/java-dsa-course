package T7Arrays1;

import java.util.Scanner;

public class L2ArrayAsArgument {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array");
        int length = sc.nextInt();
        System.out.println("Enter elements of array");
        int arr[] = new int[length];
        for(int i = 0; i<length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        updateAndPrint(arr);
    }
    
    static void updateAndPrint(int arr[]){
        int len = arr.length;
        for(int i = 0; i < len; i++){
            arr[i] += 5;
            System.out.print(arr[i] + " ");
        }
    }
}