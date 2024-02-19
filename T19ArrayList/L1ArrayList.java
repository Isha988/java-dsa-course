package T19ArrayList;

import java.util.ArrayList;

public class L1ArrayList {
    public static void main(String[] args) {
        // declaration
        ArrayList<Integer> list = new ArrayList<>();

        // Operations
        // 1. Add an element O(1)
        list.add(5);
        for (int i = 1; i < 10; i++) {
            list.add(i);
        }
        System.out.println(list);

        // 2. Get an element O(1)
        int a = list.get(2);
        System.out.println(a);

        // 3. Remove an element O(n)
        list.remove(2);
        System.out.println(list);

        // 4. add element at a index O(n)
        list.add(2, 10);
        System.out.println(list);

        // 5. set an element at a index O(1)
        list.set(3, 50);
        System.out.println(list);

        // 6. contains element O(n)
        System.out.println(list.contains(5));

        // Size method
        // O(1)
        int size = list.size();
        System.out.println("size: " + size);

    }
}
