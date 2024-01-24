/* 
* Given an integer array nums, return true if any value appears at least twice in the
* array, and return false if every element is distinct.
* example: nums = [1, 2, 3, 1]
* ans: true 
* 
* example: nums = [1, 2, 3, 4]
* Output: false  
*/

package T8Arrays2;

import java.util.HashSet;

public class Q1ContainsDuplicate {
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
    // using hashSet 
    // O(n)
    static boolean containsDuplicate(int numbers[]){
        HashSet<Integer> set = new HashSet<>(numbers.length);

        for(int n : numbers){
            if(set.contains(n)){
                return true;
            }
            set.add(n);
        }
        return false;
    }

    // brute force
    // O(n2)
    static boolean containsDuplicate1(int numbers[]){
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
