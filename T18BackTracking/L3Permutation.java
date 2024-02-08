/*
Find & print all permutations of a String.
example: "abc"
output: abc, acb, bac, bca, cab, cba
*/
package T18BackTracking;

public class L3Permutation {
    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");
    }

    // O(n * n!)
    static void permutations(String str, String ans) {
        if (str.length() <= 0) {
            System.out.print(ans + " ");
        }
        for (int i = 0; i < str.length(); i++) {
            String newStr = str.substring(0, i) + str.substring(i + 1);
            permutations(newStr, ans + str.charAt(i));
        }
    }
}
