/*
 * Given n non -negative integers representing an elevation map 
 * where the width of each bar is 1, 
 * compute how much water it can trap after raining.
 * 
 * example: heights = [4,0,2,6,3,2,5]
 *       #     
 *       # - - #
 * # - - # - - #
 * # - - # # - #
 * # - # # # # #
 * # - # # # # #
 * 4 0 2 6 3 2 5
 * water trapped = 11 units
 */
package T8Arrays2;

public class L4TrappingRainwater {
    public static void main(String[] args) {
        int heights[] = {4,0,2,6,3,2,5};
        System.out.println(trappingWater(heights) + " Units");

        // Test Case 1: General case
        int heights1[] = {4, 0, 2, 6, 3, 2, 5};
        System.out.println("Test Case 1: " + trappingWater(heights1) + " Units");

        // Test Case 2: All heights are the same
        int heights2[] = {3, 3, 3, 3, 3};
        System.out.println("Test Case 2: " + trappingWater(heights2) + " Units");

        // Test Case 3: All heights are in increasing order
        int heights3[] = {1, 2, 3, 4, 5};
        System.out.println("Test Case 3: " + trappingWater(heights3) + " Units");

        // Test Case 4: All heights are in decreasing order
        int heights4[] = {5, 4, 3, 2, 1};
        System.out.println("Test Case 4: " + trappingWater(heights4) + " Units");

        // Test Case 5: Random heights with some trapped water
        int heights5[] = {3, 0, 2, 5, 4, 3, 2, 4, 3, 4};
        System.out.println("Test Case 5: " + trappingWater(heights5) + " Units");
    }

    // approach using auxillary array 
    // O(n) time complexity O(n) space complexity
    static int trappingWater(int heights[]){
        int len = heights.length;
        int left_max[] = new int[len];
        int right_max[] = new int[len];

        // calculating left max boundary of each bar
        left_max[0] = heights[0];
        for(int i = 1; i < len; i++){
            left_max[i] = Math.max(left_max[i - 1], heights[i]);
        }

        // calculating right max boundary of each bar
        right_max[len -1] = heights[len - 1];
        for(int i = len - 2; i >= 0; i--){
            right_max[i] = Math.max(right_max[i + 1], heights[i]);
        }

        // calculating water trapped on each bar
        int water_trapped = 0;
        for(int i = 0; i < len; i++){
            int water = (Math.min(left_max[i], right_max[i]) - heights[i]);
            if (water > 0){
                water_trapped += water;
            }
        }

        return water_trapped;
    }
}
