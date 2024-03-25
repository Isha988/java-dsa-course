package T32Hashing;

import java.util.HashSet;

public class L7HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        
        // add O(1)
        set.add(45);
        set.add(89);
        set.add(34);
        set.add(45);

        System.out.println(set);

        // contains O(1)
        System.out.println(set.contains(89));
        System.out.println(set.contains(23));

        // remove O(1)
        System.out.println(set.remove(45));
        System.out.println(set.remove(90));
        System.out.println(set);

        // size
        System.out.println(set.size());

        // clear
        set.clear();
        System.out.println(set);

        // isEmpty
        System.out.println(set.isEmpty());
    }
}