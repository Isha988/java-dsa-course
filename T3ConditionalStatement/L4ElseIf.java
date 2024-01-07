package T3ConditionalStatement;

public class L4ElseIf {
    public static void main(String[] args) {
        int age = 3;
        
        if(age >= 18)
            System.out.println("Adult");
        else if(age >= 13)
            System.out.println("Teen");
        else
            System.out.println("Child");
    }
}