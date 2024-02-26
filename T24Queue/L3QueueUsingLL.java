package T24Queue;

/**
 * L3QueueUsingLL
 */
public class L3QueueUsingLL {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(50);
        System.out.println(queue);
        queue.dequeue();
        System.out.println(queue);
        System.out.println(queue.peek());
    }

    static class Node {
        int val;
        Node next = null;

        Node(int val, Node next){
            this.val = val;
            this.next = next;
        }
    }
    static class Queue {
        
        Node front = null;
        Node rear = null;

        // isEmpty
        boolean isEmpty(){
            return front == null;
        }

        // enqueue
        void enqueue(int element){
            Node newNode = new Node(element, null);

            if(isEmpty()){
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        // dequeue
        int dequeue(){
            if(!isEmpty()){
                int removed = front.val;
                front = front.next;
                // queue get empty
                if(front == null){
                    rear = null;
                }
                return removed;
            } else {
                System.out.println("queue is empty");
                return -1;
            }
        }

        // peek
        int peek(){
            if(!isEmpty()){
                return front.val;
            } else {
                System.out.println("queue is empty");
                return -1;
            }
        }
    }
}