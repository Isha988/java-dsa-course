/*
Given an array nums of size n, return the majority element.

The majority element is the element that appears more than Ln / 21 times. 
You may assume that the majority element always exists in the array.

Sample Input 1 : nums = 3,2,3
Sample Output 1: 3
Sample Input 2: nums = [2,2,1,1, 1,2,2]
Sample Output 2: 2

Constraints (extra Conditions):
• n == nums.length
• 1 <=n <=5*104
• -109 <= nums i <= 109
 */
package T16DivideAndConquer;

public class Q2MajorityElement {
    public static void main(String[] args) {
        int arr[] = {2,2,1,1,1,2,2};
        // int arr[] = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }

    // O(n)
    // Boyer Moore Voting Algorithm
    static int majorityElement(int[] arr){
        int count = 1;
        int winner = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == winner){
                count++;
            }
            else if(count == 0){ 
                winner = arr[i];
                count = 1;
            } 
            else{
                count--;
            }
        }
        return count == 0 ? -1 : winner;
    }
}
