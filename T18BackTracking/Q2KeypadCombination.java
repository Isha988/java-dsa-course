/*
    Keypad Combinations
    Given a string containing digits from 2-9 inclusive, 
    print all possible letter combinations that the number could represent. 
    You can print the answer in any order.
    A mapping of digits to letters (just like on the telephone buttons) is given below. 
    Note that 1 does not map to any letters.
    static char[][] chars = {
            {'a', 'b', 'c'}, // 2
            {'d', 'e', 'f'}, // 3
            {'g', 'h', 'i'}, // 4
            {'j', 'k', 'l'}, // 5
            {'m', 'n', 'o'}, // 6
            {'p', 'q', 'r', 's'}, // 7
            {'t', 'u', 'v'}, // 8
            {'w', 'x', 'y', 'z'}, // 9
        };

    Sample Input 1: digits = "23"
    Sample Output 1: "ad", "ae", "af", "bd", "be", "bf", "ed", "ce", "cf"
    Sample Input 2: digits = "2"
    Sample Output 2: "a", "b", "c"
    Sample Input 3: digits = '*
    Sample Output 3 : '''
 */
package T18BackTracking;

public class Q2KeypadCombination {

    static char[][] chars = {
        {'a', 'b', 'c'}, // 2
        {'d', 'e', 'f'}, // 3
        {'g', 'h', 'i'}, // 4
        {'j', 'k', 'l'}, // 5
        {'m', 'n', 'o'}, // 6
        {'p', 'q', 'r', 's'}, // 7
        {'t', 'u', 'v'}, // 8
        {'w', 'x', 'y', 'z'}, // 9
    };
    public static void main(String[] args) {
        String digits = "234";
        keypadCombination(digits, "", 0);
    }

    static void keypadCombination(String digitStr, String combination, int curr){
        // base case
        if(curr == digitStr.length()){
            System.out.print(combination + " ");
            return;
        }
  
        int row = digitStr.charAt(curr) - '2'; // row number of chars matrix
        for(int j = 0; j < chars[row].length; j++){
            String newCombination = combination + chars[row][j];
            keypadCombination(digitStr, newCombination, curr + 1);
        }
        
    }
    
}