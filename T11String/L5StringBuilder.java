package T11String;

public class L5StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Apple");

        // O(26) if done using string then O(26 * n) 
        for(char ch = 'a'; ch <= 'z'; ch++){
            sb.append(ch);
        }

        System.out.println(sb);
    }
}
