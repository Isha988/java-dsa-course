package T31Heap;

import java.util.PriorityQueue;

public class L2PQForObjects {
    static class Student implements Comparable<Student> {
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        } 
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 8)); // O(log(n))
        pq.add(new Student("B", 3));
        pq.add(new Student("C", 5));
        pq.add(new Student("D", 2));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(log(n))
        }
    }
}
