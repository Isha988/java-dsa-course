/*
 * Duplicate Parentheses
    Given a balanced expression, 
    find if it contains duplicate parentheses or not. 
    A set of parentheses are duplicate if the same subexpression is surrounded by multiple parentheses.
    Return a true if it contains duplicates else return false.
    example: ( ( (a + (b))) + ( c + d) )
    true
    example: ((((a) + (b)) + C + d) )
    true
    example: ((a + b) + ( c + d) )
    false
    example: (( (a + b)) + c)
    true
 */
package T23Stacks2;

import java.util.Stack;

public class L2DuplicateParentheses {
    public static void main(String[] args) {
        String pattern = "(((a+b))+c)";
        System.out.println(isDuplicate(pattern));
    }
    
    // O(n)
    static boolean isDuplicate(String pattern){
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < pattern.length(); i++){
            char chr = pattern.charAt(i);
            if(chr == ')'){
                char top = stack.peek();
                if(top == '('){
                    return true;
                }
                //pop expression inside brackets
                while(!stack.empty() && stack.peek() != '('){
                    stack.pop();
                }
                // pop '(' 
                if(!stack.empty()){
                    stack.pop();
                }
            } else {
                stack.push(chr);
            }
        }

        return false;
    }
}