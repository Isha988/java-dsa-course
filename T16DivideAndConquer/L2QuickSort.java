/*
 * Sort a given array using merge sort
 */
package T16DivideAndConquer;

import java.util.Arrays;

public class L2QuickSort {
    public static void main(String[] args) {
        int arr[] = {6, 7, 2, 5, 9, 10, 0, -9};
        quickSort(arr, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    static void quickSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int pivotIndex = partition(arr, start, end);

        quickSort(arr, start, pivotIndex - 1);
        quickSort(arr, pivotIndex + 1, end);
    }

    static int partition(int arr[], int start, int end){
        int pivot = arr[end];
        int i = start - 1;

        for(int j = start; j <= end; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
            }
        }

        return i;
    }
}
