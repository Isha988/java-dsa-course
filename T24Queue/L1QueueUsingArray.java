/*
 * Implement Queue using array
 */
package T24Queue;

import java.util.Arrays;

public class L1QueueUsingArray {
    public static void main(String[] args) {   
        Queue queue = new Queue(5);
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(50);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
    }

    /*
     * This queue in many cases does not use its full capacity,
     * because of its dequeue O(1) implementation.
     * 
     * To use its full capacity we can use O(n) approach in dequeue.
     * This problem is solved by circular queue.
     */
    static class Queue {
        private int front = -1;
        private int rear = 0;
        private int[] queue;
        
        // constructor
        Queue(){
            this.queue = new int[10];
        } 

        Queue(int size){
            this.queue = new int[size];
        }

        // operations
        // Enqueue
        // O(1)
        void enqueue(int element){
            if(!isFull()){
                queue[rear] = element;
                rear++;
            } else {
                System.out.println("Queue is full");
            }
        }

        // Dequeue
        // O(1) 
        int dequeue(){
            if (!isEmpty()) {
                front++;
                int removed = queue[front];
                queue[front] = 0;
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
                return queue[front + 1];
            } else {
                System.out.println("Queue is empty");
                return -1;
            }
        }

        // IsEmpty
        boolean isEmpty(){
            return rear - front - 1 == 0;
        }

        // IsFull
        boolean isFull(){
            return rear == queue.length;
        }

        // to string
        @Override
        public String toString() {
            return Arrays.toString(queue);
        }
    }
}