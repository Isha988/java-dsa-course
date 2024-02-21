/*
 * Stock Span Problem
 * Span: Max. number of consecutive days for which price <= today's price
 * example: 100, 80, 60, 70, 60, 85, 100
 * o/p: 1, 1, 1, 2, 1, 5, 7
 * span = index - prev higher index   
 */
package T22Stacks1;

import java.util.Arrays;
import java.util.Stack;

public class L7StockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 85, 100};
        int[] span = stockSpan(price);
        System.out.println(Arrays.toString(span)); 
    }

    // O(n)
    static int[] stockSpan(int[] price){
        int[] span = new int[price.length];
        span[0] = 1;

        Stack<Integer> stack = new Stack<>();
        stack.push(0);

        for(int i = 1; i < price.length; i++){
            // pop all the elements smaller than equal current ele 
            while(!stack.isEmpty() && price[stack.peek()] <= price[i]){
                stack.pop();
            }
            int prevHighIndex = !stack.isEmpty() ? stack.peek() : -1;
            span[i] = i - prevHighIndex;
            stack.push(i);
        }

        return span;
    }
}
