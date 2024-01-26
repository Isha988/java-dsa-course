package T9BasicSorting;

import java.util.Arrays;
import java.util.Collections;

public class L4InbuiltSort {
    public static void main(String[] args) {
        int arr1[] = {5, 1, 8, 2, 0};
        Arrays.sort(arr1);
        printArray(arr1);

        int arr2[] = {5, 1, 3, 2, 0};
        Arrays.sort(arr2, 0, 3);
        printArray(arr2);

        Integer arr3[] = {5, 1, 8, 2, 0};
        Arrays.sort(arr3, Collections.reverseOrder());
        printArray(arr3);
    }

    static <T> void printArray(T arr[]){
        for(T num : arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void printArray(int arr[]){
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
}