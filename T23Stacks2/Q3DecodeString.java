/*
    * Question 3:
    Decode a string
    We have an encoded strings and the task is to decode it. 
    The pattern in which the strings are encoded is as follows.

    Sample Input 1: 2[cv]
    Sample Output 1 : cvcv
    Sample Input 2: 3[b2[v]]
    Sample Output 2 : bvvbvvbvv
 */

// ! wrong ans giving error
package T23Stacks2;

import java.util.Stack;

public class Q3DecodeString {
    public static void main(String[] args) {
        String encoded = "3[a]";
        System.out.println(decode(encoded));
    }

    static String decode(String encoded) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < encoded.length(); i++) {
            String chr = Character.toString(encoded.charAt(i));
            if (chr.equals("]")) {
                StringBuilder str = new StringBuilder();
                while (!stack.isEmpty() && stack.peek() != "[") {
                    String top = stack.pop();
                    str.insert(0, top);
                    System.out.println(str);
                }
                if (!stack.isEmpty())
                    stack.pop();

                if (!stack.isEmpty()) {
                    int num = Integer.parseInt(stack.pop());
                    StringBuilder partialDecoded = new StringBuilder();
                    for (int j = 0; j < num; j++) {
                        partialDecoded.append(str);
                    }
                    stack.push(partialDecoded.toString());
                }
            } else {
                stack.push(chr);
            }

            System.out.println(stack.toString());
        }

        return !stack.isEmpty() ? stack.pop() : "";
    }

}
