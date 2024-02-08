/*
Find & print all subsets of a given string
example: "abc"
output: a, b, c, ab, be, ac, abc, ""
 */
package T18BackTracking;

public class L2FindSubsets {
    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0);
        System.out.println();
        findSubsets1(str, "" , 0);
    }

    // O(2 ^ n)
    static StringBuilder subset = new StringBuilder();
    static void findSubsets(String str, int index){
        if(index >= str.length()){
            return;
        }

        for(int i = index; i < str.length(); i++){
            subset.append(str.charAt(i));
            System.err.print(subset.toString() + " ");
            findSubsets(str, i + 1);
            subset.setLength(subset.length() - 1);
        }
    }

    // O(2 ^ n)
    static void findSubsets1(String str, String ans, int index){
        if(index >= str.length()){
            System.out.print(ans + " ");
            return;
        }
            // yes choice of current character
            findSubsets1(str, ans + str.charAt(index), index + 1);

            // no choice of current character
            findSubsets1(str, ans, index + 1);
    }
}
