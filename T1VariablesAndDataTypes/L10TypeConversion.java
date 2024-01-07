public class L10TypeConversion {
    public static void main(String[] args) {
        int a = 890;
        long b = a; // int to long
        float c = b; // long to float
        
        // long d = c;  // ! error on float to long even if long is of 8bytes and float is of 4Bytes
        // It is due to value range that float store is greater than long
        

    }
}
