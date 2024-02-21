/*
 * Reverse a given string using stack
 */
package T22Stacks1;

import java.util.Stack;

public class L5ReverseString {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println(str);
        str = reverse(str);
        System.out.println(str);
    }

    static String reverse(String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < str.length(); i++){
            stack.push(str.charAt(i));
        }

        StringBuilder reverse = new StringBuilder();
        while(!stack.isEmpty()){
            reverse.append(stack.pop());
        }  
        
        return reverse.toString();
    }
}
