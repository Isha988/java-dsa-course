import java.util.Scanner;

public class L9AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();

        sc.close();

        float area = 3.14f * radius * radius;
        
        System.out.println("Area: " + area);
    }
}