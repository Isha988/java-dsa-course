/*
 * Print reverse of an ArrayList
 */
package T19ArrayList;

import java.util.ArrayList;

public class L2Reverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding element in list
        for (int i = 1; i <= 10; i++) {
            list.add(i);
        }

        // Printing list in reverse
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }
    }
}
