/* Find the sum of sub array(continuous array) having the max sum in a given array
 * Example: 1, -2, 6, -1, 3
 * Ans: 8 = 6 + (-1) + 3 
 */

/* Kadane's Algorithm O(n)
 *  In this algo we maintain two variables curr_sum and max_sum,
 *  such that if current sum is -ve, we changed it to zero.
 */
package T8Arrays2;

public class L3MaxSubarraySum {

    public static void main(String[] args) {
        int arr[] = {1, -2, 6, -1, 3};
        System.out.println("Max Sum: " + maxSubarraySum(arr));

        // Test Case 1
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 1: " + maxSubarraySum(arr1));

        // Test Case 2
        int[] arr2 = {1, 2, 3, 4, -2, 5};
        System.out.println("Test Case 2: " + maxSubarraySum(arr2));

        // Test Case 3
        int[] arr3 = {-1, -2, -3, -4};
        System.out.println("Test Case 3: " + maxSubarraySum(arr3));

        // Test Case 4
        int[] arr4 = {7, -2, 5, -1, 6};
        System.out.println("Test Case 4: " + maxSubarraySum(arr4));

        // Test Case 5
        int[] arr5 = {3, -1, -1, 4, -1, 2, 1, -5, 4};
        System.out.println("Test Case 5: " + maxSubarraySum(arr5));
    }

    static int maxSubarraySum(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;

        for(int i = 0; i < arr.length; i++){
            currSum += arr[i];
            maxSum = Math.max(maxSum, currSum);
            if(currSum < 0)
                currSum = 0;
        }

        return maxSum;
    }
}