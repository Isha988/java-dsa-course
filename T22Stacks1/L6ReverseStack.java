/*
 * Reverse a given stack
 */
package T22Stacks1;

import java.util.Stack;

public class L6ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack);
        reverseStack1(stack);
        System.out.println(stack);
    }

    // O(n)
    static void reverseStack(Stack<Integer> stack){
        Stack<Integer> reverse = new Stack<>();
        while (!stack.isEmpty()) {
            reverse.push(stack.pop());
        }
        stack.addAll(reverse);
    }

    // using recursion
    // O(n ^ 2)
    static void reverseStack1(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int top = stack.pop();
        reverseStack1(stack);
        pushAtBottom(stack, top);
    }

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
