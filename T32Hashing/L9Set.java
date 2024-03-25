package T32Hashing;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class L9Set {
    public static void main(String[] args) {
        // UnOrder
        HashSet<String> hs = new HashSet<>();
        hs.add("Delhi");
        hs.add("Bangalore");
        hs.add("Hyderabad");
        hs.add("Noida");

        System.out.println(hs);

        // Order of insertion is maintained
        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Delhi");
        lhs.add("Bangalore");
        lhs.add("Hyderabad");
        lhs.add("Noida");

        System.out.println(lhs);

        // Sorted Order
        TreeSet<String> ts = new TreeSet<>();
        ts.add("Delhi");
        ts.add("Bangalore");
        ts.add("Hyderabad");
        ts.add("Noida");

        System.out.println(ts);



    }
}