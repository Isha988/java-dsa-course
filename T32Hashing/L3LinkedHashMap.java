package T32Hashing;

import java.util.LinkedHashMap;

public class L3LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>(); // Keys are stored in insertion order

        map.put("Lee", 50);
        map.put("Neo", 67);
        map.put("John", 30);

        System.out.println(map);
    }
}
