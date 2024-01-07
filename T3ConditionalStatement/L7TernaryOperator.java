package T3ConditionalStatement;

public class L7TernaryOperator {
    public static void main(String[] args) {
        int num = 10;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(num + " is " + type);
    }
}