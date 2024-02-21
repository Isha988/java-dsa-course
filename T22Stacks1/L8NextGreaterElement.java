/*
 * Next Greater Element
* The next greater element of some element x in an array 
* is the first greater element that is to the right of x in the same array.
* arr = [6, 8, 0, 1, 3]
* next Greater = [8, -1, 1, 3, -1]
 */
package T22Stacks1;

import java.util.Arrays;
import java.util.Stack;

public class L8NextGreaterElement {
    public static void main(String[] args) {
        int[] elements = {6, 8, 0, 1, 3};
        int[] greaterElement = nextGreaterElement(elements);
        System.out.println(Arrays.toString(greaterElement));
    }
    
    //O(n)
    static int[] nextGreaterElement(int[] elements){
        int[] greaterElement = new int[elements.length];
        Stack<Integer> stack = new Stack<>();

        for(int i = elements.length - 1; i >= 0; i--){
            // pop all smaller or equal elements from stack
            while(!stack.isEmpty() && stack.peek() <= elements[i]){
                stack.pop();
            }

            greaterElement[i] = !stack.empty() ? stack.peek() : -1;
            stack.push(elements[i]);
        }

        return greaterElement;
    }

}