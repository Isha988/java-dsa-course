package T11String;

import java.util.Scanner;

public class L1String {
    public static void main(String[] args) {
        char arr[] = {'a', 'b', 'c', 'd'};

        // Declare a string
        String str = "abcd";
        String str1 = new String("xyz");

        // String input and output
        Scanner sc = new Scanner(System.in);

        String word;
        word = sc.next();
        System.out.println(word);

        String sentence;
        sentence = sc.nextLine();
        System.out.println(sentence);

        // sc.close();

        // string length function
        String fruits = "Apple, Mango";
        System.out.println(fruits.length());

        // string concatenation (Adding two string)
        String firstName = "Isha";
        String lastName = "Kapoor";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // char At
        System.out.println(fullName.charAt(1));

    }
}
