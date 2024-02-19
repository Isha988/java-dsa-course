/*
 * Swap two elements of array
 * example 1 , 2, 3, 4, 5
 * idx1 = 2 idx2 = 4
 * o/p = 1 2, 5 , 4, 3
 */
package T19ArrayList;

import java.util.ArrayList;

public class L4Swap {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding element in list
        for (int i = 1; i <= 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        swap(list, 2, 5);
        System.out.println(list);

    }

    static void swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
}
