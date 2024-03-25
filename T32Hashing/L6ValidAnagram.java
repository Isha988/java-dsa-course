/**
 * Valid Anagram
    Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, 
    typically using all the original letters exactly once.

    s = "race" t "care" 
    ans true
    S = "heart" t-"earth"
    ans true
    s = "tulip" t = "lipid"
    ans false
 */
package T32Hashing;

import java.util.HashMap;

public class L6ValidAnagram {
    public static void main(String[] args) {
        String s = "earth";
        String t = "heart";
        // String s = "tulip";
        // String t = "lipid";
        System.out.println(isAnagram(s, t));
    }

    // O(n)
    static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();

        // base case
        if (s.length() != t.length()) {
            return false;
        }

        // increasing character count while traversing string s
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // decreasing character count while traversing string t
        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) - 1);

            if (map.get(ch) == 0) {
                map.remove(ch);
            } else if (map.get(ch) < 0) {
                return false;
            }

        }

        return map.isEmpty();

    }
}