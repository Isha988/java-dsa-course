package T32Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class L8HashSetIteration {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(45);
        set.add(89);
        set.add(34);
        set.add(45);

        // 1. Using Iterators
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        // 2. Using for each loop
        System.out.println();
        for(int num: set){
            System.out.print(num + " ");
        }

    }
}