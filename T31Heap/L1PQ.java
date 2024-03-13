package T31Heap;

import java.util.Comparator;
import java.util.PriorityQueue;

public class L1PQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(8); // O(log(n))
        pq.add(3);
        pq.add(5);
        pq.add(2);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(log(n))
        }
    }
}