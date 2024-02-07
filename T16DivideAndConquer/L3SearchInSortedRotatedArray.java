/*
 * search an element in a given sorted and rotated array
 */
package T16DivideAndConquer;

public class L3SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int index = searchInSortedRotatedArray(arr, 0, (arr.length - 1), 5);
        System.out.println(index);
    }

    static int searchInSortedRotatedArray(int arr[], int start, int end, int target){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start) / 2;
        if(arr[mid] == target){
            return mid;
        }
        else if(arr[start] <= arr[mid]){  // mid is on line 1
            if(target >= arr[start] && target < arr[mid] ){
                return searchInSortedRotatedArray(arr, start, mid - 1, target);
            } 
            else {
                return searchInSortedRotatedArray(arr, mid + 1, end, target);
            }
        } 
        else {  // mid is on line 2
            if(target > arr[mid] && target <= end){
                return searchInSortedRotatedArray(arr, mid + 1, end, target);
            }
            else {
                return searchInSortedRotatedArray(arr, start, mid - 1, target);
            }
        }
    }
    
}