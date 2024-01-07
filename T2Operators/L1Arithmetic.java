package T2Operators;
public class L1Arithmetic {
    public static void main(String[] args) {
        // Binary
        int a = 50;
        int b = 30;

        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;
        int mod = a % b;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        // Unary
        int c = 7;
        int preInc = ++c;
        System.out.println(c);
        System.out.println(preInc);

        int d = 7;
        int postInc = d++;
        System.out.println(d);
        System.out.println(postInc);

        int e = 10;
        int preDec = --e;
        System.out.println(e);
        System.out.println(preDec);

        int f = 10;
        int postDec = f--;
        System.out.println(f);
        System.out.println(postDec);
    }
    
}