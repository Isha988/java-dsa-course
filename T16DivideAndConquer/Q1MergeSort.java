/*
 * Apply Merge sort to sort an array of Strings. 
 * (Assume that all the characters in all the Strings are in lowercase).
 * Sample Input 1: arr = {"sun", "earth", "mars", "mercury"}
 * Sample Output 1: arr = { "earth", "mars", "mercury", "sun" }
 */
package T16DivideAndConquer;

import java.util.Arrays;

public class Q1MergeSort {
    public static void main(String[] args) {
        String[] arr = {"sun", "earth", "mars", "mercury"};
        mergeSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    // O(nLog(n) * l) // l length of largest string. 
    static void mergeSort(String[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+ 1, end);

        merge(arr, start, mid, end);
    }

    static void merge(String[] arr, int start, int mid, int end){
        String[] temp = new String[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while(i <= mid && j <= end){
            if(arr[i].compareTo(arr[j]) <= 1){
                temp[k++] = arr[i++];
            }
            else{
                temp[k++] = arr[j++];
            }
        }

        while(i <= mid){
            temp[k++] = arr[i++];
        }

        while(j <= end){
            temp[k++] = arr[j++];
        }

        for(int index = 0; index < temp.length; index++){
            arr[index + start] = temp[index];
        }
    }
}
