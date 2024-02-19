package T19ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class L5Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // adding element in list
        for (int i = 1; i <= 10; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);

        // ascending order
        Collections.sort(list);
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}
