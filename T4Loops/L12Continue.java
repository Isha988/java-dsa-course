package T4Loops;

public class L12Continue {
    public static void main(String[] args) {
        for(int i = 1; i <= 5; i++){
            if(i == 3){
                continue;
            }
            System.out.println(i);
        }
    }
}
