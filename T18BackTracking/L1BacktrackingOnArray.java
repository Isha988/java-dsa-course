/*
 * Set the value(index + 1) at each index of array while going up the call stack
 * and while coming down the call stack, decrease the value by 2   
 */
package T18BackTracking;

import java.util.Arrays;

public class L1BacktrackingOnArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        changeArray(arr, 0);
        System.out.println(Arrays.toString(arr));
    }

    // O(n)
    static void changeArray(int arr[], int i){
        if(i >= arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        arr[i] = i + 1;
        changeArray(arr, i + 1); // function call step
        arr[i] -= 2; // backtracking step
    }
}
