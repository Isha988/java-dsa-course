/*
    Ques: For a given set of Strings, print the largest string.
    Example: "apple", "mango", "banana"
    Output: "mango"
 */
package T11String;

public class L4LargestString {
    public static void main(String[] args) {
        String strings[] = {"apple", "mango", "banana"};
        System.out.println(largestString(strings));
    }

    // O(x * n) x -> size of largest string n -> length of array
    static String largestString(String[] strings){
        String largestString = strings[0];
        for(int i = 1; i < strings.length; i++){
            if(strings[i].compareTo(largestString) > 0){
                largestString = strings[i];
            }
        }

        return largestString;
    }
}
