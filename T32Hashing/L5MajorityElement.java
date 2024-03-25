/** 
 * Majority Element
    Given an integer array of size n, find all elements that appear more than  floor of (n/3) times.
    nums[1 = (1, 3, 2, 5, 1, 3, 1, 5, 1);
    ans: 1
    nums[ ] = (1, 2);
    ans: 1, 2
 */
package T32Hashing;

import java.util.HashMap;
import java.util.Set;

public class L5MajorityElement {
    public static void main(String[] args) {
        int[] nums = {1,3,2,5,1,3,1,1,5,1};
        // int[] nums = {1,2};
        majorityEle(nums);
    }
    
    // O(n)
    static void majorityEle(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Set<Integer> keySet = map.keySet();
        int threshold = nums.length / 3;
        for(int key : keySet){
            if(map.get(key) > threshold){
                System.out.print(key + " ");
            }
        }
    }
}