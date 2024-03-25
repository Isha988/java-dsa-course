/**
 * Count Distinct Element in a given array
 * eg: nums = {4,3,2,5,6,7,3,4,2,1}
 * ans = 7
 */
package T32Hashing;

import java.util.HashSet;

public class L10CountDistinctElement {
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,6,7,3,4,2,1};
        System.out.println(countDistinct(nums));
    }
    
    // O(n)
    static int countDistinct(int[] nums){
        HashSet<Integer> set = new HashSet<>();

        for(int num: nums){
            set.add(num);
        }

        return set.size();
    }
}