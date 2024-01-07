public class L12TypePromotion {
    public static void main(String[] args) {
        // char, short and byte promote to int while evaluating expression
        byte b = 10;
        //b = b * 5; // ! error: int can be converted to byte
        int mul = b * 5; 
        System.out.println(mul);  

        char a = 'a';
        char c = 'c';
        int sub = c - a;
        System.out.println(sub);

        // expression ans will promote to largest data type it contain
        char d = 'd';
        float f = 89.67f;
        long l = 789;
        float sum = d + f + l;
        System.out.println(sum);
    }
}
