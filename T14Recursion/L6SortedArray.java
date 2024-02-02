/*
 * Check if an array is sorted in ascending order or not
 * Example: A = 1 2 3 4 5 6 -> true
 * A = 5 4 3 2 1 -> false
 */
package T14Recursion;

public class L6SortedArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 0};
        System.out.println(isSorted(arr, 0));
    }

    // O(n)
    static boolean isSorted(int[] arr, int start){
        if(start == arr.length - 1){
            return true;
        }

        return arr[start] < arr[start + 1] && isSorted(arr, start + 1); 
    }
}
