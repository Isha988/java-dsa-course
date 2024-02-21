package T22Stacks1;

public class L2StackUsingLL {
    static class EmptyStackException extends RuntimeException {
        public EmptyStackException() {
            super("Stack is empty");
        }
    }

    static class Node<T>{
        T value;
        Node<T> next = null;

        public Node(T value, Node<T> next){
            this.value = value;
            this.next = next;
        }
    }

    static class Stack<T> {
        // variables 
        private Node<T> stack = null;

        // operations
        // push
        public void push(T ele){
            stack = new Node<>(ele, stack);
        }
        // pop
        public T pop(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            T top = stack.value;
            stack = stack.next;
            return top;
        }
        // peek
        public T peek(){
            if(isEmpty()){
                throw new EmptyStackException();
            }
            return stack.value;
        }

        // isEmpty
        public boolean isEmpty(){
            return stack == null;
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
