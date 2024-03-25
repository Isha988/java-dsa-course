package T32Hashing;

import java.util.TreeMap;

public class L4TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();  // Keys are stored in sorted order
                                                         // get, put, remove have O(log(n)) complexity                       

        map.put("Lee", 50); // O(log(n)
        map.put("Neo", 67);
        map.put("John", 30);

        System.out.println(map);
    }
    
}