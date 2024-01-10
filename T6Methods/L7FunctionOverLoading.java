/*
 * Multiple function with same name but different parameters
 * It can be one in two ways:
 * 1. By having different numbers of parameters
 * 2. By having different types of parameters
 * 
 * Function overloading does not depend on return type of function
 */
package T6Methods;

public class L7FunctionOverLoading {
    public static void main(String[] args) {
        System.out.println(sum(5, 6));
        System.err.println(sum(5, 6, 7));

        System.out.println(mul(5, 6));
        System.out.println(mul(5.5f, 6.5f));
    }  
    
    // function overloading using different number of parameters
    static int sum(int a, int b){
        return a + b;
    }
    static int sum(int a, int b, int c){
        return a + b+ c;
    }
    // function overloading using different types of parameters
    static int mul(int a, int b){
        return a * b;
    }
    static float mul(float a, float b){
        return a * b;
    }
}
