package T3ConditionalStatement;

public class L1IfElse {
    public static void main(String[] args) {
        // if statement
        int time = 6;
        if(time == 6){
            System.out.println("Wake up");
        }       
        
        // if else statement
        int age = 10;

        if(age >= 18){
            System.out.println("You are an adult");
            System.out.println("You can drive");
        }else {
            System.out.println("You are a minor");
            System.out.println("You are not allowed to drive");
        }
    }
}