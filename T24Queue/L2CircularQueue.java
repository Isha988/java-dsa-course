package T24Queue;

import java.util.Arrays;

public class L2CircularQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(3);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(50);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
    }
    
    static class Queue {
        private int front = 0;
        private int rear = 0;
        private int[] queue;
        
        // constructor
        Queue(){
            this.queue = new int[11];
        } 

        Queue(int size){
            this.queue = new int[size + 1];
        }

        // operations
        // Enqueue
        // O(1)
        void enqueue(int element){
            if(!isFull()){
                queue[rear] = element;
                rear = (rear+1) % queue.length;
            } else {
                System.out.println("Queue is full");
            }
        }

        // Dequeue
        // O(1) 
        int dequeue(){
            if (!isEmpty()) {
                int removed = queue[front];
                queue[front] = 0;
                front = (front + 1) % queue.length;
                return removed;    
            } else {
                System.out.println("Queue is empty");
                return -1;
            }
        }

        // peek
        // O(1)
        int peek(){
            if(!isEmpty()){
                return queue[front];
            } else {
                System.out.println("Queue is empty");
                return -1;
            }
        }

        // IsEmpty
        boolean isEmpty(){
            return rear == front;
        }

        // IsFull
        boolean isFull(){
            return (rear + 1) % queue.length == front;
        }

        // to string
        @Override
        public String toString() {
            return Arrays.toString(queue);
        }
    }
}