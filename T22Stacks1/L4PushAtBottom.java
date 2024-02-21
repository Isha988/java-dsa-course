/*
 * Push at the bottom of stack
 * stack = 3 2 1
 *         ^
 *         |
 *        top  
 * push 4
 * stack = 3 2 1 4
 */
package T22Stacks1;

import java.util.Stack;

public class L4PushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        pushAtBottom(stack, 4);
        System.out.println(stack);
    }

    // using recursion
    // time O(n)
    static void pushAtBottom(Stack<Integer> stack, int item){
        // base case
        if(stack.isEmpty()){
            stack.push(item);
            return;
        }
        int top = stack.pop();
        pushAtBottom(stack, item);
        stack.push(top);
    }
}
