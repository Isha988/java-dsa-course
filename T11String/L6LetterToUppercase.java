/*
 *  For a given String convert each the first letter of each word to uppercase.
 *  Example: "hi, i am isha"
 *  Output: "Hi, I Am Isha"
 */
package T11String;

public class L6LetterToUppercase {
    public static void main(String[] args) {
        String str = "hi, i am isha";
        System.out.println(letterToUppercase1(str));
    }

    static String letterToUppercase(String str){
        StringBuilder sb = new StringBuilder(str);
        
        int i = 0;
        while(i < sb.length()){
            char ch = sb.charAt(i);
            if('a' <= ch && ch <= 'z'){
                ch = Character.toUpperCase(ch);
                // ch -= 32;
            }
            sb.setCharAt(i, ch);

            int nextWord = sb.indexOf(" ", i) + 1;
            i =  nextWord != 0 ? nextWord : sb.length();
        }

        return sb.toString();
    }

    // O(length of string) = O(n)
    static String letterToUppercase1(String str){
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for(int i = 1; i < str.length(); i++){
            if(str.charAt(i) == ' ' && i < str.length() - 1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

}
