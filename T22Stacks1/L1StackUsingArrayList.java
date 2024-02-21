package T22Stacks1;

import java.util.ArrayList;

public class L1StackUsingArrayList {
    static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("Stack is empty");
        }
    }
    static class Stack<T> {
        // variables 
        private ArrayList<T> stack = new ArrayList<>();

        // operations
        // push
        public void push(T ele){
            stack.add(ele);
        }
        // pop
        public T pop(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            int lastIndex = stack.size() - 1;
            T top = stack.get(lastIndex);
            stack.remove(lastIndex);
            return top;
        }
        // peek
        public T peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            int lastIndex = stack.size() - 1;
            T top = stack.get(lastIndex);
            return top;
        }

        // isEmpty
        public boolean isEmpty(){
            return stack.size() == 0;
        }

        @Override
        public String toString(){
            return stack.toString();
        }
    }

    public static void main(String[] args) {
        // Integer stack
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(20);
        stack.push(55);
        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

        // String stack
        Stack<String> stack1 = new Stack<>();
        stack1.push("Apple");
        stack1.push("Banana");
        stack1.push("Orange");
        System.out.println(stack1);

        System.out.println(stack1.pop());
        System.out.println(stack1);

        System.out.println(stack1.peek());
        System.out.println(stack1.isEmpty());
    }
}
