package T32Hashing;

import java.util.HashMap;
import java.util.Set;

public class L1Hashmap {
    public static void main(String[] args) {
        // Create
        HashMap<String, Integer> map = new HashMap<>(); // Keys are stored in random order

        // Insert - O(1)
        map.put("India", 125);
        map.put("China", 150);
        map.put("USA", 50);
        map.put("Russia", 100);

        System.out.println(map);

        // Get - O(1)
        System.out.println(map.get("India")); // null if key doesn't exist

        // Contains Key - O(1) - boolean function
        System.out.println(map.containsKey("USA"));
        System.out.println(map.containsKey("Bhutan"));

        // remove - O(1)
        System.out.println(map.remove("China"));

        System.out.println(map);

        // size
        System.out.println(map.size());

        // is empty
        System.out.println(map.isEmpty());

        // iteration over hash map
        Set<String> keys = map.keySet();
        System.out.println(keys);

        for (String key : keys) {
            System.out.println(key + " = " + map.get(key));
        }

        // clear function
        map.clear(); // make map empty
        System.out.println(map);
    }
}
