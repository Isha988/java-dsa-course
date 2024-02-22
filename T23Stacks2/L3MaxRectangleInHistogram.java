/*
    Max Area in Histogram
    Given an array of integers heights representing the histogram's bar height
    where the width of each bar is 1, 
    return the area of the largest rectangle in the histogram.
    heights = [2,1,5,6,2,3]
    ans = 10
 */
package T23Stacks2;

import java.util.Stack;

public class L3MaxRectangleInHistogram {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        System.out.println(maxRectangularAreaInHistogram(heights));
    }

    // O(n)
    static int maxRectangularAreaInHistogram(int[] heights){
        Stack<Integer> stack = new Stack<>();

        // calculating next smaller left array
        int[] nextSmallerLeft = new int[heights.length];
        for(int i = 0; i < heights.length; i++){
            while(!stack.isEmpty() && heights[stack.peek()] >= heights[i]){
                stack.pop();
            } 

            nextSmallerLeft[i] = !stack.isEmpty() ? stack.peek() : -1;
            stack.push(i);
        }

        // emptying stack
        while(!stack.isEmpty()){
            stack.pop();
        }

        // calculating next smaller right array
        int[] nextSmallerRight = new int[heights.length];
        for(int i = heights.length - 1; i >= 0; i--){
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                stack.pop();
            }

            nextSmallerRight[i] = !stack.isEmpty() ? stack.peek() : heights.length;
            stack.push(i);
        }

        // calculating max area
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            int area = heights[i] * (nextSmallerRight[i] - nextSmallerLeft[i] -1);
            max = Math.max(max, area); 
        }
        return max;
    }
    
}