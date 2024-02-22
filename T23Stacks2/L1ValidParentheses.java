/*
 * Valid Parentheses
    Given a strings containing just the characters 'C, )', 'C, ', 'l' and 'I, determine if the input string is valid.
    An input string is valid if:
    1.0pen brackets must be closed by the same type of brackets.
    2.0pen brackets must be closed in the correct order.
    3. Every close bracket has a corresponding open bracket of the same type.
    
    Example: 
    valid: (){}[], (), ({})
    invalid: (]), )(,
 */
package T23Stacks2;

import java.util.Stack;

public class L1ValidParentheses {
    public static void main(String[] args) {
        String pattern = "]";
        System.out.println(isValid(pattern));
    }
    
    static boolean isValid(String pattern){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < pattern.length(); i++){
            char chr = pattern.charAt(i);
            // push opening brackets
            if(chr == '(' || chr == '{' || chr == '['){
                stack.push(chr);
            } else {
                // check if stack is empty before popping
                if(stack.isEmpty()){
                    return false;
                }
                // pop corresponding opening brackets
                char top = stack.pop();
                if((chr == ')' && top != '(') || 
                    (chr == '}' && top != '{') || 
                    (chr == ']' && top != '[')){
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}   