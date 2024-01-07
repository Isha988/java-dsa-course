import java.util.Scanner;

public class L6Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.next(); // input only one word
        System.out.println(firstName);

        // ! not working fine
        // due to input stream functioning
        String fullName = sc.nextLine(); // input complete sentence or para
        System.out.println(fullName);

        int num = sc.nextInt();
        System.out.println(num);

        float decimal = sc.nextFloat();
        System.out.println(decimal);

        sc.close();
    }    
}

/*
    Other functions are
    nextByte, nextLong, nextBoolean, nextDouble, nextShort.
*/
