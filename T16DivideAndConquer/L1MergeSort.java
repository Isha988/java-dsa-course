/*
 * Sort a given array using merge sort
 */
package T16DivideAndConquer;

import java.util.Arrays;

public class L1MergeSort {
    public static void main(String[] args) {
        int arr[] = {6, 7, 2, 5, 9, 10, 0, -9};
        mergeSort(arr, 0, (arr.length - 1));
        System.out.println(Arrays.toString(arr));
    }

    // O(n * log(n))
    static void mergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid); // Left Part
        mergeSort(arr, mid + 1, end); // Right Part

        merge(arr, start, mid, end);
    }

    // O(n)
    static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int i = 0;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                left++;
            } else {
                temp[i] = arr[right];
                right++;
            }

            i++;
        }

        while(left <= mid){
            temp[i] = arr[left];
            left++;
            i++;
        }

        while(right <= end){
            temp[i] = arr[right];
            right++;
            i++;
        }

        // copying merged temp into original array
        for(int j = 0; j < temp.length; j++){
            arr[start + j] = temp[j];
        }
    }
}
