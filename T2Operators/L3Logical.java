package T2Operators;

public class L3Logical {
    public static void main(String[] args) {
        System.out.println("AND");
        System.out.println("T && T: " + (true && true));
        System.out.println("T && F: " + (true && false));
        System.out.println("F && T: " + (false && true));
        System.out.println("F && F: " + (false && false));

        System.out.println("\nOR");
        System.out.println("T || T: " + (true || true));
        System.out.println("T || F: " + (true || false));
        System.out.println("F || T: " + (false || true));
        System.out.println("F || F: " + (false || false));

        System.out.println("\nNOT");
        System.out.println("!T: " + (!true));
        System.out.println("!F: " + (!false));

    }
}
