/* Find the sum of sub array(continuous array) having the max sum in a given array
 * Example: 1, -2, 6, -1, 3
 * Ans: 8 = 6 + (-1) + 3 
 */

/* Prefix Sum technique O(n2)
 *  For an array arr[] of size N, 
 *  A prefix sum array is another array prefixSum[] of the same size, 
 *  such that the value of prefixSum[i] is arr[0] + arr[1] + arr[2] . . . arr[i].
 */
package T8Arrays2;

public class L2MaxSubarraySum {
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
        int prefixSum[] = prefixSum(arr);

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                int sum = (i == 0) ? prefixSum[j] : prefixSum[j] - prefixSum[i -1];
                maxSum = Math.max(maxSum, sum);
            }
        }
        
        return maxSum;
    }

    static int[] prefixSum(int[] arr){
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];

        for(int i = 1; i < arr.length; i++){
            prefix[i] = arr[i] + prefix[i - 1];
        }
        return prefix;
    }
}
