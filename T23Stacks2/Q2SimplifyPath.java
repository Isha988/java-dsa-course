/*
    Question 2:
    Simplify Path
    We hava an absolute path for a file (Unix-style), simplify it. Note that absolute path always begin with ' (root directory ), a dot in path represent current directory and double dot represents
    parent directory.
    Sample Input 1 : /apnacollege/ Sample Output 1 : /apnacollege
    Sample Input 1: /a/..
    Sample Output 1 : /
 */
package T23Stacks2;

import java.util.Stack;

public class Q2SimplifyPath {
    public static void main(String[] args) {
        // String path = "/home/";
        String path = "/a/..";
        //String path = "/../";
        //String path = "/home/..";
        System.out.println(simplifyPath(path));
    }

    static String simplifyPath(String path){
        String[] arr = path.split("/");
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            } else if (!arr[i].equals(".") && !arr[i].equals("")){
                stack.push(arr[i]);
            }
        }

        String simplified = "";
        if(stack.isEmpty()){
            simplified = "/";
        }
        while(!stack.isEmpty()){
            String top = stack.pop();
            simplified = "/" + top + simplified;
        }

        return simplified;
    }
}
