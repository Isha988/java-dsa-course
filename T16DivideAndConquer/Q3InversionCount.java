/*
 * Given an array of integers. Find the Inversion Count in the array.
 * Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. 
 *  If the array is already sorted then the inversion count is O. 
 *  If an array is sorted in the reverse order then the inversion count is the maximum.
 * Formally, two elements all and ali] form an inversion if ali] > all and i‹j.
 * Sample Input 1: N = 5, arr[] = {2, 4, 1, 3, 5}
 * Sample Output 1: 3, because it has 3 inversions - (2, 1), (4, 1), (4, 3).
 */
package T16DivideAndConquer;

public class Q3InversionCount {
    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};
        System.out.println(inversionCount(arr, 0, arr.length - 1));
    }

    // O(n * log(n))
    static int inversionCount(int arr[], int start, int end){
        if(start >= end){
            return 0;
        }

        int mid = start + (end - start) / 2;
        int firstHalf = inversionCount(arr, start, mid); // Left Part
        int secondHalf = inversionCount(arr, mid + 1, end); // Right Part

        int combine = merge(arr, start, mid, end);

        return firstHalf + secondHalf + combine;
    }

    // O(n)
    static int merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];
        int left = start;
        int right = mid + 1;
        int i = 0;
        int invertedPairs = 0;

        while(left <= mid && right <= end){
            if(arr[left] <= arr[right]){
                temp[i] = arr[left];
                left++;
            } else {
                invertedPairs += mid - left + 1;
                temp[i] = arr[right];
                right++;
            }

            i++;
        }

        while(left <= mid){
            temp[i++] = arr[left++];
        }

        while(right <= end){
            temp[i++] = arr[right++];
        }

        // copying merged temp into original array
        for(int j = 0; j < temp.length; j++){
            arr[start + j] = temp[j];
        }

        return invertedPairs;
    }
}
