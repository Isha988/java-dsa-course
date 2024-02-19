/*
 * Find maximum in an ArrayList
 */
package T19ArrayList;

import java.util.ArrayList;

public class L3Maximum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding element in list
        for (int i = 1; i <= 10; i++) {
            list.add((int)(Math.random() * 100));
        }
        System.out.println(list);

        // Finding maximum
        int max = list.get(0);
        for(int i = 1; i < list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Max: " + max);
    }
}
